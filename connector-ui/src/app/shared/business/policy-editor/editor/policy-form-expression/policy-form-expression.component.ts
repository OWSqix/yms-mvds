/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, Input, TrackByFunction} from '@angular/core';
import {TreeNode} from '../../model/tree';
import {ExpressionFormHandler} from '../expression-form-handler';
import {ExpressionFormValue} from '../expression-form-value';

@Component({
  selector: 'policy-form-expression',
  templateUrl: './policy-form-expression.component.html',
})
export class PolicyFormExpressionComponent {
  @Input()
  treeNode!: TreeNode<ExpressionFormValue>;

  trackByFn: TrackByFunction<TreeNode<ExpressionFormValue>> = (_, it) => it.id;

  get expr(): ExpressionFormValue {
    return this.treeNode.value;
  }

  constructor(public expressionFormHandler: ExpressionFormHandler) {}
}
