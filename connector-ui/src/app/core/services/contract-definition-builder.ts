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
import {
  ContractDefinitionRequest,
  UiCriterionLiteralType,
} from '@sovity.de/edc-client';
import {ContractDefinitionEditorDialogFormValue} from '../../routes/connector-ui/contract-definition-page/contract-definition-editor-dialog/contract-definition-editor-dialog-form-model';
import {AssetProperty} from './models/asset-properties';

@Injectable({
  providedIn: 'root',
})
export class ContractDefinitionBuilder {
  /**
   * Build {@link ContractDefinitionDto} from {@link ContractDefinitionEditorDialogFormValue}
   *
   * @param formValue form value
   * @return contract definition dto
   */
  buildContractDefinition(
    formValue: ContractDefinitionEditorDialogFormValue,
  ): ContractDefinitionRequest {
    return {
      contractDefinitionId: formValue.id ?? '',
      accessPolicyId: formValue.accessPolicy!.policyDefinitionId,
      contractPolicyId: formValue.contractPolicy!.policyDefinitionId,
      assetSelector: [
        {
          operandLeft: AssetProperty.id,
          operator: 'IN',
          operandRight: {
            type: UiCriterionLiteralType.ValueList,
            valueList: formValue.assets!.map((it) => it.assetId),
          },
        },
      ],
    };
  }
}
