/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, HostBinding, Input} from '@angular/core';
import {PolicyVerbConfig} from '../../model/policy-verbs';
import {TreeNode} from '../../model/tree';
import {ExpressionFormHandler} from '../expression-form-handler';
import {ExpressionFormValue} from '../expression-form-value';

@Component({
  selector: 'policy-form-expression-constraint',
  templateUrl: './policy-form-expression-constraint.component.html',
})
export class PolicyFormExpressionConstraintComponent {
  @HostBinding('class.flex')
  @HostBinding('class.gap-4')
  cls = true;

  @Input()
  treeNode!: TreeNode<ExpressionFormValue>;

  get expr(): ExpressionFormValue {
    return this.treeNode.value;
  }

  get verb(): PolicyVerbConfig {
    return this.expr.verb!;
  }

  constructor(public expressionFormHandler: ExpressionFormHandler) {}
}
