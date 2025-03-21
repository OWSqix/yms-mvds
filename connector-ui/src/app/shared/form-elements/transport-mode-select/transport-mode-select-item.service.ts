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
import {associateBy} from 'src/app/core/utils/map-utils';
import {TRANSPORT_MODE_SELECT_DATA} from './transport-mode-select-data';
import {TransportModeSelectItem} from './transport-mode-select-item';

/**
 * Access list of available TransportModeSelectItems
 */
@Injectable({providedIn: 'root'})
export class TransportModeSelectItemService {
  itemsById = associateBy(TRANSPORT_MODE_SELECT_DATA, (it) => it.id);

  /**
   * Find TransportModeSelectItem by id
   * @param id language select item id
   */
  findById(id: string): TransportModeSelectItem {
    const item = this.itemsById.get(id);
    if (item != null) {
      return item;
    }
    return {
      id,
      label: id,
    };
  }
}
