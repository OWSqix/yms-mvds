/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
export interface AvailableLanguage {
  code: string;
  name: string;
}

export const supportedLanguages: AvailableLanguage[] = [
  {code: 'en', name: 'English'},
  {code: 'de', name: 'Deutsch'},
  {code: 'ko', name: 'Korean'},
];

export const isLanguageSupported = (value: unknown): value is string =>
  supportedLanguages.map((it) => it.code).includes(value as string);
