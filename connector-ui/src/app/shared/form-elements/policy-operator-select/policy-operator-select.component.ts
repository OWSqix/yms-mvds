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
import {UntypedFormControl} from '@angular/forms';
import {TranslateService} from '@ngx-translate/core';
import {PolicyOperatorConfig} from '../../business/policy-editor/model/policy-operators';

@Component({
  selector: 'policy-operator-select',
  templateUrl: 'policy-operator-select.component.html',
})
export class PolicyOperatorSelectComponent {
  @Input()
  operators: PolicyOperatorConfig[] = [];

  @Input()
  control!: UntypedFormControl;

  @HostBinding('class.flex')
  @HostBinding('class.flex-row')
  cls = true;

  constructor(public translationService: TranslateService) {}

  label = this.translationService.instant('general.operator');
}
