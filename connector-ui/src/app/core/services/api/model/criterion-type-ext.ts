/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {UiCriterionOperator} from '@sovity.de/edc-client';

export const CRITERION_OPERATOR_SYMBOLS: Record<UiCriterionOperator, string> = {
  EQ: '=',
  IN: 'in',
  LIKE: 'like',
};
