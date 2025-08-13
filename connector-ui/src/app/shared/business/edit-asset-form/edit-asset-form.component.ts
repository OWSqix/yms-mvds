/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, EventEmitter, Input, Output} from '@angular/core';
import {ActiveFeatureSet} from 'src/app/core/config/active-feature-set';
import {ValidationMessages} from 'src/app/core/validators/validation-messages';
import {ExpressionFormHandler} from '../policy-editor/editor/expression-form-handler';
import {EditAssetForm} from './form/edit-asset-form';
import {DATA_SOURCE_HTTP_METHODS} from './form/http-methods';

@Component({
  selector: 'edit-asset-form',
  templateUrl: './edit-asset-form.component.html',
  styleUrls: ['./edit-asset-form.component.scss'],
})
export class EditAssetFormComponent {
  @Input() isLoading!: boolean;
  @Output() submitClicked = new EventEmitter();

  methods = DATA_SOURCE_HTTP_METHODS;

  constructor(
    public form: EditAssetForm,
    public validationMessages: ValidationMessages,
    public expressionFormHandler: ExpressionFormHandler,
    public activeFeatureSet: ActiveFeatureSet,
  ) {}

  multipleDataSourceOptionsAvailable(): boolean {
    return this.form.mode === 'EDIT' || this.activeFeatureSet.hasMdsFields();
  }
}
