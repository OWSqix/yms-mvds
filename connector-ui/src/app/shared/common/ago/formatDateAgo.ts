/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {formatDistanceToNow} from 'date-fns';
import {de, enUS} from 'date-fns/locale';
import {DateInput} from './date-input';

/**
 * Formats date as "{n} {timeUnit} ago" or "in {n} {timeUnit}s".
 * @param dateOrString date
 * @param locale locale (optional)
 */
export function formatDateAgo(
  dateOrString?: DateInput | null,
  locale?: string,
): string {
  if (!dateOrString) {
    return 'never';
  }

  const date: Date =
    typeof dateOrString === 'string' ? new Date(dateOrString) : dateOrString;

  if (isNaN(date.getTime())) {
    return dateOrString.toString();
  }

  const localeDateNfs = locale === 'de' ? de : enUS;
  return formatDistanceToNow(date, {addSuffix: true, locale: localeDateNfs});
}
