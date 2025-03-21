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
import {PolicyExpressionMapped} from '../../model/policy-expression-mapped';

@Component({
  selector: 'policy-expression',
  templateUrl: './policy-expression.component.html',
})
export class PolicyExpressionComponent {
  @HostBinding('class.flex')
  @HostBinding('class.flex-col')
  @HostBinding('class.justify-stretch')
  cls = true;

  @Input()
  expression!: PolicyExpressionMapped;
}
