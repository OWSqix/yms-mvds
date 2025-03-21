/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {ConnectorLimits} from '@sovity.de/edc-client';
import {contractAgreementPage} from './contract-agreement-fake-service';

export const connectorLimits = (): ConnectorLimits => ({
  numActiveConsumingContractAgreements:
    contractAgreementPage().contractAgreements.filter(
      (it) =>
        it.direction === 'CONSUMING' && it.terminationStatus === 'ONGOING',
    ).length,
  maxActiveConsumingContractAgreements: 1,
});
