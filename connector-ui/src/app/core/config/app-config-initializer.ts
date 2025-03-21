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
  return fetcher
    .fetchEffectiveConfig('/assets/config/app-configuration.json', null)
    .then((json) => builder.buildAppConfig(json));
}

export const provideAppConfig = (appConfig: AppConfig): StaticProvider => ({
  provide: APP_CONFIG,
  useValue: appConfig,
});
