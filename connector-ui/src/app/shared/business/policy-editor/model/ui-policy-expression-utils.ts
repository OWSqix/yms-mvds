/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {
  OperatorDto,
  UiPolicyExpression,
  UiPolicyExpressionType,
} from '@sovity.de/edc-client';

export const constraint = (
  left: string,
  operator: OperatorDto,
  value: string,
): UiPolicyExpression => ({
  type: 'CONSTRAINT',
  constraint: {
    left,
    operator,
    right: {type: 'STRING', value},
  },
});

export const constraintList = (
  left: string,
  operator: OperatorDto,
  valueList: string[],
): UiPolicyExpression => ({
  type: 'CONSTRAINT',
  constraint: {
    left,
    operator,
    right: {type: 'STRING_LIST', valueList},
  },
});

export const multi = (
  type: Exclude<UiPolicyExpressionType, 'EMPTY' | 'CONSTRAINT'>,
  ...expressions: UiPolicyExpression[]
): UiPolicyExpression => ({
  type,
  expressions,
});
