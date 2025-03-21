/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Pipe, PipeTransform} from '@angular/core';
import {DataCategorySelectItem} from '../data-category-select/data-category-select-item';
import {DataSubcategorySelectItem} from './data-subcategory-select-item';
import {DataSubcategorySelectItemService} from './data-subcategory-select-item.service';

@Pipe({
  name: 'dataSubcategoryItems',
})
export class DataSubcategoryItemsPipe implements PipeTransform {
  constructor(private items: DataSubcategorySelectItemService) {}

  transform(
    dataCategory: DataCategorySelectItem | null,
  ): DataSubcategorySelectItem[] {
    return this.items.findByDataCategory(dataCategory);
  }
}
