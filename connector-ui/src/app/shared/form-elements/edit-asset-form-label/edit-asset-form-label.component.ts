/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, Input} from '@angular/core';
import {AbstractControl, Validators} from '@angular/forms';

@Component({
  selector: 'edit-asset-form-label',
  templateUrl: './edit-asset-form-label.component.html',
})
export class EditAssetFormLabelComponent {
  @Input() label!: string;
  @Input() htmlFor?: string;
  @Input() ctrl?: AbstractControl<any>;

  isRequired(): boolean {
    return this.ctrl?.hasValidator(Validators.required) || false;
  }
}
