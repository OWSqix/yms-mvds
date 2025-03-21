/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Injectable} from '@angular/core';
import {AppConfig} from './app-config';
import {AppConfigProperties} from './app-config-properties';
import {getProfileOrFallback} from './profiles/get-profile-or-fallback';

@Injectable()
export class AppConfigBuilder {
  /**
   * Build {@link AppConfig} from ENV Vars
   *
   * @param vars env vars
   */
  buildAppConfig(vars: Record<string, string | null>): AppConfig {
    const {profile, profileConfig} = getProfileOrFallback(
      vars[AppConfigProperties.activeProfile],
    );

    return {
      // profile and theme
      profile,
      ...profileConfig,

      // EDC Backend Endpoints
      managementApiKey:
        vars[AppConfigProperties.managementApiKey] ?? 'no-api-key-configured',
      managementApiUrl:
        vars[AppConfigProperties.managementApiUrl] ??
        'https://no-backend-api-url-configured',
      logoutUrl:
        vars[AppConfigProperties.logoutUrl] ??
        'https://no-logout-url-configured',
      shownManagementApiUrl:
        vars[AppConfigProperties.shownManagementApiUrl] ??
        vars[AppConfigProperties.managementApiUrl] ??
        'https://no-backend-api-url-configured',

      // Other EDC Backend Endpoints
      catalogUrls: vars[AppConfigProperties.catalogUrls] ?? '',
      useFakeBackend: vars[AppConfigProperties.useFakeBackend] === 'true',

      // Enterprise Edition
      showEeBasicMarketing:
        vars[AppConfigProperties.showEeBasicMarketing] === 'true',

      // versions
      buildDate: vars[AppConfigProperties.buildDate] ?? 'unknown',
      buildVersion: vars[AppConfigProperties.buildVersion] ?? 'unknown',
    };
  }
}
