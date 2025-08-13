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

@Component({
  selector: 'edit-asset-form-group',
  templateUrl: './edit-asset-form-group.component.html',
  styleUrls: ['./edit-asset-form-group.component.scss'],
})
export class EditAssetFormGroupComponent {
  @Input() myTitle!: string;
  @Input() description!: string;
}
