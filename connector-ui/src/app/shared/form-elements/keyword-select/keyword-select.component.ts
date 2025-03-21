/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {COMMA, ENTER, SEMICOLON} from '@angular/cdk/keycodes';
import {Component, Input} from '@angular/core';
import {FormControl} from '@angular/forms';
import {MatChipInputEvent} from '@angular/material/chips';
import {removeOnce} from 'src/app/core/utils/array-utils';

@Component({
  selector: 'keyword-select',
  templateUrl: 'keyword-select.component.html',
})
export class KeywordSelectComponent {
  separatorKeysCodes: number[] = [ENTER, COMMA, SEMICOLON];

  @Input()
  label!: string;

  @Input()
  control!: FormControl<string[]>;

  remove(keyword: string) {
    this.control.setValue(removeOnce(this.control.value, keyword));
  }

  add(event: MatChipInputEvent): void {
    const keywords = (event.value || '')
      .split(/[,;]/)
      .map((it) => it.trim())
      .filter((it) => it);
    if (keywords.length) {
      this.control.setValue([...this.control.value, ...keywords]);
    }
    event.chipInput.clear();
  }
}
