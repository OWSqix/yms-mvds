/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {ContractAgreementPage} from '@sovity.de/edc-client';
import {ContractAgreementCardMapped} from '../contract-agreement-cards/contract-agreement-card-mapped';

export type ContractAgreementPageData = Omit<
  ContractAgreementPage,
  'contractAgreements'
> & {
  contractAgreements: ContractAgreementCardMapped[];
  consumingContractAgreements: ContractAgreementCardMapped[];
  providingContractAgreements: ContractAgreementCardMapped[];
  numTotalContractAgreements: number;
};
