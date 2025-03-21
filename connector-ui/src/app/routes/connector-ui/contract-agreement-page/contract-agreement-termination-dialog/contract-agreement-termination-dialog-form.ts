/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Injectable} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {
  ContractAgreementTerminationDialogFormModel,
  ContractAgreementTransferDialogFormValue,
} from './contract-agreement-termination-dialog-form-model';

/**
 * Handles AngularForms for ContractAgreementTerminationDialog
 */
@Injectable()
export class ContractAgreementTerminationDialogForm {
  all = this.buildFormGroup();

  /**
   * Quick access to full value
   */
  get value(): ContractAgreementTransferDialogFormValue {
    return this.all.value;
  }

  constructor(private formBuilder: FormBuilder) {}

  buildFormGroup(): FormGroup<ContractAgreementTerminationDialogFormModel> {
    const formGroup = this.formBuilder.nonNullable.group({
      shortReason: ['Terminated by user', Validators.required],
      detailedReason: ['', [Validators.required, Validators.maxLength(1000)]],
    });
    formGroup.controls.shortReason.disable();
    return formGroup;
  }
}
