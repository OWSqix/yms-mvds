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
import {Observable} from 'rxjs';
import {map} from 'rxjs/operators';
import {EdcApiService} from './api/edc-api.service';
import {AssetBuilder} from './asset-builder';
import {UiAssetMapped} from './models/ui-asset-mapped';

/**
 * Wrapped AssetService with AssetPropertyMapper
 */
@Injectable({
  providedIn: 'root',
})
export class AssetService {
  constructor(
    private assetBuilder: AssetBuilder,
    private edcApiService: EdcApiService,
  ) {}

  fetchAssets(): Observable<UiAssetMapped[]> {
    return this.edcApiService
      .getAssetPage()
      .pipe(
        map((assetPage) =>
          assetPage.assets.map((asset) => this.assetBuilder.buildAsset(asset)),
        ),
      );
  }
}
