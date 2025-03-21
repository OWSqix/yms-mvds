/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {UiAssetMapped} from 'src/app/core/services/models/ui-asset-mapped';
import {DataOffer} from '../../../core/services/models/data-offer';
import {ContractAgreementCardMapped} from '../../../routes/connector-ui/contract-agreement-page/contract-agreement-cards/contract-agreement-card-mapped';
import {PropertyGridGroup} from '../../common/property-grid-group/property-grid-group';

export interface AssetDetailDialogData {
  type: 'asset-details' | 'data-offer' | 'contract-agreement';
  propertyGridGroups: PropertyGridGroup[];
  asset: UiAssetMapped;
  dataOffer?: DataOffer;
  consumingLimitsExceeded?: boolean;
  contractAgreement?: ContractAgreementCardMapped;
  showDeleteButton?: boolean;
  showEditButton?: boolean;
  onAssetEditClick?: OnAssetEditClickFn;
  refreshCallback?: () => void;
}

export type OnAssetEditClickFn = (
  asset: UiAssetMapped,
  /**
   * Required so that after the editing the detail dialog can be updated again
   */
  afterEditCb: (updatedDialogData: AssetDetailDialogData) => void,
) => void;
