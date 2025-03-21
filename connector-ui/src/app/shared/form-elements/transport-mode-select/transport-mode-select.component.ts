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
import {TRANSPORT_MODE_SELECT_DATA} from './transport-mode-select-data';
import {TransportModeSelectItem} from './transport-mode-select-item';

@Component({
  selector: 'transport-mode-select',
  templateUrl: 'transport-mode-select.component.html',
})
export class TransportModeSelectComponent {
  @Input()
  label!: string;

  @Input()
  control!: FormControl<TransportModeSelectItem | null>;

  items = TRANSPORT_MODE_SELECT_DATA;
}
