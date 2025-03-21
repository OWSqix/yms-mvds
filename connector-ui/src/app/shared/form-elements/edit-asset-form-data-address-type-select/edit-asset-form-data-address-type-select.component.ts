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
import {DataAddressType} from '../data-address-type-select/data-address-type';

@Component({
  selector: 'edit-asset-form-data-address-type-select',
  templateUrl: 'edit-asset-form-data-address-type-select.component.html',
})
export class EditAssetFormDataAddressTypeSelectComponent {
  @Input()
  label!: string;

  @Input()
  control!: FormControl<DataAddressType | null>;

  items = [
    {
      id: 'Http',
      label: 'REST-API Endpoint',
    },
    {
      id: 'Custom-Data-Address-Json',
      label: `Custom Datasource-Create Config (JSON)`,
    },
  ];
}
