/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {PolicyMultiExpressionConfig} from '../model/policy-multi-expressions';
import {PolicyOperatorConfig} from '../model/policy-operators';
import {PolicyVerbConfig} from '../model/policy-verbs';

export interface ExpressionFormValue {
  type: 'CONSTRAINT' | 'MULTI' | 'EMPTY';

  multiExpression?: PolicyMultiExpressionConfig;
  verb?: PolicyVerbConfig;
  supportedOperators?: PolicyOperatorConfig[];
}
