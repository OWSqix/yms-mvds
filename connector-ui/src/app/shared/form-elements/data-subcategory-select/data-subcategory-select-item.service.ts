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
import {associateBy, groupedBy} from 'src/app/core/utils/map-utils';
import {DataCategorySelectItem} from '../data-category-select/data-category-select-item';
import {DATA_SUBCATEGORY_SELECT_DATA} from './data-subcategory-select-data';
import {DataSubcategorySelectItem} from './data-subcategory-select-item';

/**
 * Access list of available DataSubcategorySelectItems
 */
@Injectable({providedIn: 'root'})
export class DataSubcategorySelectItemService {
  itemsById = associateBy(DATA_SUBCATEGORY_SELECT_DATA, (it) => it.id);
  itemsByDataCategory = groupedBy(
    DATA_SUBCATEGORY_SELECT_DATA,
    (it) => it.dataCategoryId,
  );

  /**
   * Find DataSubcategorySelectItem by id
   * @param id language select item id
   */
  findById(id: string): DataSubcategorySelectItem {
    const item = this.itemsById.get(id);
    if (item != null) {
      return item;
    }
    return {
      id,
      dataCategoryId: '',
      label: id,
    };
  }

  /**
   * Find DataCategorySelectItems by (parent) data category
   */
  findByDataCategory(
    dataCategory: DataCategorySelectItem | null,
  ): DataSubcategorySelectItem[] {
    return dataCategory
      ? this.itemsByDataCategory.get(dataCategory?.id) ?? []
      : [];
  }
}
