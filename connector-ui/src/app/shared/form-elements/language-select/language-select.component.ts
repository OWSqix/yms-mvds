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
import {LanguageSelectItem} from './language-select-item';
import {LanguageSelectItemService} from './language-select-item.service';

@Component({
  selector: 'language-select',
  templateUrl: 'language-select.component.html',
})
export class LanguageSelectComponent {
  @Input()
  label: string | null = null;

  @Input()
  control!: FormControl<LanguageSelectItem | null>;

  constructor(public items: LanguageSelectItemService) {}
}
