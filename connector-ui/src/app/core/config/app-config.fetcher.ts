/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import urlJoin from 'url-join';
import {validUrlPattern} from '../validators/url-validator';
import {AppConfigProperties} from './app-config-properties';
import {AppConfigMerger} from './app-config.merger';

export class AppConfigFetcher {
  constructor(private appConfigMerger: AppConfigMerger) {}

  /**
   * Fetches app-configuration.json, applies {@link AppConfigProperties.configJson},
   * fetches another config from {@link AppConfigProperties.configUrl}, and
   * merges the results.
   */
  async fetchEffectiveConfig(
    configUrl: string,
    apiKey: string | null,
  ): Promise<Record<string, string | null>> {
    let config = await this.fetchConfigJson(configUrl, apiKey);
    config = this.appConfigMerger.applyEmbeddedConfig(configUrl, config);

    const additionalConfigUrl = this.buildAdditionConfigUrl(config);
    if (additionalConfigUrl) {
      apiKey = config[AppConfigProperties.managementApiKey] ?? apiKey;
      const additionalConfig = await this.fetchEffectiveConfig(
        additionalConfigUrl,
        apiKey,
      );
      config = this.appConfigMerger.mergeConfigs(
        configUrl,
        config,
        additionalConfigUrl,
        additionalConfig,
      );
    }

    return config;
  }

  private fetchConfigJson(
    path: string,
    apiKey: string | null,
  ): Promise<Record<string, string | null>> {
    const headers = apiKey ? {'X-API-KEY': apiKey} : undefined;
    
    // 경로가 상대 경로인 경우 window.location.origin과 결합
    const absolutePath = path.startsWith('/') 
      ? window.location.origin + path 
      : path;
    
    return fetch(absolutePath, {headers})
      .then((response) => response.json())
      .catch((err) => {
        console.error(
          `Could not fetch app-configuration.json from ${absolutePath}`,
          err,
        );
        return {};
      });
  }

  private buildAdditionConfigUrl(
    config: Record<string, string | null>,
  ): string | null {
    const relativeUrl =
      config[AppConfigProperties.configUrl] ?? '/edc-ui-config';
    if (!relativeUrl || relativeUrl === 'false') {
      return null;
    }

    // Absolute URL
    if (validUrlPattern.test(relativeUrl)) {
      return relativeUrl;
    }

    // Relative URL
    const managementApiUrl = config[AppConfigProperties.managementApiUrl];

    if (!managementApiUrl) {
      console.error(
        `Invalid value for ${AppConfigProperties.configUrl} and ${AppConfigProperties.managementApiUrl}. Could not build Additional Config URL:`,
        relativeUrl,
        managementApiUrl,
      );
      return null;
    }

    return urlJoin(managementApiUrl, relativeUrl);
  }
}
