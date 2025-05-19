/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {StaticProvider} from '@angular/core';
import {APP_CONFIG, AppConfig} from './app-config';
import {AppConfigBuilder} from './app-config.builder';
import {AppConfigFetcher} from './app-config.fetcher';
import {AppConfigMerger} from './app-config.merger';

export async function loadAppConfig(): Promise<AppConfig> {
  const merger = new AppConfigMerger();
  const builder = new AppConfigBuilder();
  const fetcher = new AppConfigFetcher(merger);
  try {
    const config = await fetcher.fetchEffectiveConfig('/assets/config/app-configuration.json', null);
    return builder.buildAppConfig(config);
  } catch (error) {
    console.error('Failed to load configuration, using defaults', error);
    // 기본 설정 값을 제공하여 앱이 계속 실행되도록 함
    return builder.buildAppConfig({
      EDC_UI_CONNECTOR_ENDPOINT: '/api/dsp',
      EDC_UI_MANAGEMENT_API_URL: '/api/management',
      EDC_UI_USE_FAKE_BACKEND: 'false'
    });
  }
}

export const provideAppConfig = (appConfig: AppConfig): StaticProvider => ({
  provide: APP_CONFIG,
  useValue: appConfig,
});
