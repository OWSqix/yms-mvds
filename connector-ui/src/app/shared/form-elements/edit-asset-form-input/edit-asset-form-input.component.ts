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
import {FormControl} from '@angular/forms';
import {ValidationMessages} from 'src/app/core/validators/validation-messages';

@Component({
  selector: 'edit-asset-form-input',
  templateUrl: './edit-asset-form-input.component.html',
})
export class EditAssetFormInputComponent {
  @Input() ctrl!: FormControl<string>;
  @Input() fieldId = 'missing-id-' + Math.random().toString(36).substring(7);
  @Input() label!: string;
  @Input() placeholder: string = '...';
  @Input() tooltip: string = '';
  @Input() hint: string = '';
  @Input() hideHint: boolean = false;
  @Input() contentTypeHint: boolean = false;

  constructor(public validationMessages: ValidationMessages) {}
}
