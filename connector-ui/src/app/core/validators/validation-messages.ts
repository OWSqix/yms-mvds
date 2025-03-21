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

@Injectable({providedIn: 'root'})
export class ValidationMessages {
  invalidEmailMessage = 'Must be a valid E-Mail address.';
  invalidUrlMessage = 'Must be valid URL, e.g. https://example.com';
  invalidJsonMessage = 'Must be valid JSON';
  invalidWhitespacesOrColonsMessage = 'Must not contain whitespaces or colons.';
  invalidPrefix = (field: string, prefix: string): string =>
    `${field} must start with "${prefix}".`;
  invalidDateRangeMessage = 'Need valid date range.';
  idExistsErrorMessage = 'ID already exists.';
  invalidQueryParam = "Must not contain '=' or '&' characters.";
}
