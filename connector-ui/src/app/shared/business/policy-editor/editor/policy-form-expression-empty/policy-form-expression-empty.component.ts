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
import {TreeNode} from '../../model/tree';
import {ExpressionFormValue} from '../expression-form-value';

@Component({
  selector: 'policy-form-expression-empty',
  templateUrl: './policy-form-expression-empty.component.html',
})
export class PolicyFormExpressionEmptyComponent {
  @HostBinding('class.flex')
  @HostBinding('class.h-[4rem]')
  @HostBinding('class.items-center')
  cls = true;

  @Input()
  treeNode!: TreeNode<ExpressionFormValue>;
}
