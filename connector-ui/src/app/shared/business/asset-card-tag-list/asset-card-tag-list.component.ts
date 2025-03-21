/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {Component, HostBinding, Input} from '@angular/core';

@Component({
  selector: 'asset-card-tag-list',
  templateUrl: './asset-card-tag-list.component.html',
})
export class AssetCardTagListComponent {
  @HostBinding('class.block') cls = true;
  @Input() numberOfKeywordsDisplayed: number = 3;
  @Input() keywords: string[] | undefined;
  @Input() version: string | undefined;
}
