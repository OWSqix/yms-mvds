/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {InjectionToken, Provider} from '@angular/core';
import {KeysOfType} from '../utils/type-utils';
import {APP_CONFIG, AppConfig} from './app-config';

/**
 * Provide individual {@link AppConfig} properties for better Angular Component APIs.
 *
 * @param token injection token
 * @param key property in {@link AppConfig}
 * @return {@link Provider}
 */
export const provideAppConfigProperty = <T>(
  token: InjectionToken<T>,
  key: KeysOfType<AppConfig, T>,
): Provider => ({
  provide: token,
  useFactory: (s: AppConfig) => s[key],
  deps: [APP_CONFIG],
});
