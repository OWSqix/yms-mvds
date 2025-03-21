/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {
  Component,
  EventEmitter,
  HostBinding,
  Input,
  Output,
} from '@angular/core';
import {UiAssetMapped} from '../../../../core/services/models/ui-asset-mapped';

@Component({
  selector: 'asset-cards',
  templateUrl: './asset-cards.component.html',
})
export class AssetCardsComponent {
  @HostBinding('class.flex')
  @HostBinding('class.flex-wrap')
  @HostBinding('class.gap-[10px]')
  cls = true;

  @Input()
  assets: UiAssetMapped[] = [];

  @Output()
  assetClick = new EventEmitter<UiAssetMapped>();
}
