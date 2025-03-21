/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {UiAssetMapped} from '../../../../core/services/models/ui-asset-mapped';

export interface AssetCreateDialogResult {
  /**
   * Updated asset list for the asset page
   */
  refreshedList: UiAssetMapped[];

  /**
   * The updated / created asset
   */
  asset: UiAssetMapped;
}
