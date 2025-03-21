/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, HostBinding, Input, TrackByFunction} from '@angular/core';
import {TreeNode} from '../../model/tree';
import {ExpressionFormValue} from '../expression-form-value';

@Component({
  selector: 'policy-form-expression-multi',
  templateUrl: './policy-form-expression-multi.component.html',
})
export class PolicyFormExpressionMultiComponent {
  @HostBinding('class.flex')
  @HostBinding('class.flex-col')
  @HostBinding('class.justify-stretch')
  cls = true;

  @Input()
  treeNode!: TreeNode<ExpressionFormValue>;

  trackByFn: TrackByFunction<TreeNode<ExpressionFormValue>> = (_, it) => it.id;

  get expr(): ExpressionFormValue {
    return this.treeNode.value;
  }
}
