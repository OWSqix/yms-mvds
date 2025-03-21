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
import {ContractAgreementCardMapped} from '../../../routes/connector-ui/contract-agreement-page/contract-agreement-cards/contract-agreement-card-mapped';

@Component({
  selector: 'transfer-history-mini-list',
  templateUrl: 'transfer-history-mini-list.component.html',
})
export class TransferHistoryMiniListComponent {
  @Input()
  contractAgreement!: ContractAgreementCardMapped;

  @HostBinding('class.flex')
  @HostBinding('class.flex-col')
  @HostBinding('class.space-y-[10px]')
  cls = true;
}
