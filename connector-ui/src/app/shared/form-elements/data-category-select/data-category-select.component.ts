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
import {DATA_CATEGORY_SELECT_DATA} from './data-category-select-data';
import {DataCategorySelectItem} from './data-category-select-item';

@Component({
  selector: 'data-category-select',
  templateUrl: 'data-category-select.component.html',
})
export class DataCategorySelectComponent {
  @Input()
  label!: string;

  @Input()
  control!: FormControl<DataCategorySelectItem | null>;

  items = DATA_CATEGORY_SELECT_DATA;
}
