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
import {LANGUAGE_SELECT_DATA} from './language-select-data';
import {LanguageSelectItem} from './language-select-item';

/**
 * Access list of available LanguageSelectItems
 */
@Injectable({providedIn: 'root'})
export class LanguageSelectItemService {
  /**
   * Partition LanguageSelectItems into highlighted and other.
   * Usability: See important options first and close to each other.
   */
  highlightItemIds = [
    'https://w3id.org/idsa/code/MULTI_LINGUAL',
    'https://w3id.org/idsa/code/DE',
    'https://w3id.org/idsa/code/EN',
  ];
  highlightItems: LanguageSelectItem[];
  otherItems: LanguageSelectItem[];
  itemsByKeyword: Map<string, LanguageSelectItem>;

  constructor() {
    this.highlightItems = this.buildHighlightItems();
    this.otherItems = this.buildOtherItems();
    this.itemsByKeyword = this.buildItemLookupMap();
  }

  /**
   * Find LanguageSelectItem by id
   * @param id language select item id
   */
  findById(id: string): LanguageSelectItem {
    let item = this.itemsByKeyword.get(id);
    if (!item) {
      item = {id, label: id};
    }
    return item;
  }

  english(): LanguageSelectItem {
    return this.findById('https://w3id.org/idsa/code/EN');
  }

  private buildHighlightItems(): LanguageSelectItem[] {
    return LANGUAGE_SELECT_DATA.filter((it) =>
      this.highlightItemIds.includes(it.id),
    );
  }

  private buildOtherItems(): LanguageSelectItem[] {
    return LANGUAGE_SELECT_DATA.filter(
      (it) => !this.highlightItemIds.includes(it.id),
    );
  }

  private buildItemLookupMap(): Map<string, LanguageSelectItem> {
    const map = new Map<string, LanguageSelectItem>();
    LANGUAGE_SELECT_DATA.forEach((it) => {
      map.set(it.id, it);
      if (it.idShort) {
        map.set(it.idShort, it);
      }
      if (it.sameAs) {
        map.set(it.sameAs, it);
      }
    });
    return map;
  }
}
