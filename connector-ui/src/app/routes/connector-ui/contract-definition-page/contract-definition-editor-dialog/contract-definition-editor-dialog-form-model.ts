/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {FormControl, ɵFormGroupValue} from '@angular/forms';
import {PolicyDefinitionDto} from '@sovity.de/edc-client';
import {UiAssetMapped} from '../../../../core/services/models/ui-asset-mapped';

/**
 * Form Value Type
 */
export type ContractDefinitionEditorDialogFormValue =
  ɵFormGroupValue<ContractDefinitionEditorDialogFormModel>;

/**
 * Form Group Template Type
 */
export interface ContractDefinitionEditorDialogFormModel {
  id: FormControl<string>;
  accessPolicy: FormControl<PolicyDefinitionDto | null>;
  contractPolicy: FormControl<PolicyDefinitionDto | null>;
  assets: FormControl<UiAssetMapped[]>;
}
