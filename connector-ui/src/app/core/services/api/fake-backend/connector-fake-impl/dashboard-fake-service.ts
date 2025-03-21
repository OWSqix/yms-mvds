/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
import {DashboardPage} from '@sovity.de/edc-client';

export const dashboardPage = (): DashboardPage => ({
  numAssets: 4,
  numContractAgreementsConsuming: 10,
  numContractAgreementsProviding: 123,
  numPolicies: 4,
  numContractDefinitions: 4,
  transferProcessesConsuming: {
    numTotal: 8,
    numOk: 5,
    numRunning: 1,
    numError: 2,
  },
  transferProcessesProviding: {
    numTotal: 2,
    numOk: 2,
    numError: 0,
    numRunning: 0,
  },
  connectorParticipantId: 'MDSL1234XX.C1234XX',
  connectorTitle: 'Ymatics Sample Connector',
  connectorDescription: 'Example Connector with Fake Backend',
  connectorMaintainerName: 'Ymatics. Co',
  connectorMaintainerUrl: 'https://ymatics.com',
  connectorCuratorName: 'Ymatics x KOTI',
  connectorCuratorUrl: 'https://ymatics.com',
  connectorEndpoint: 'https://edc.fake-backend/api/dsp',
  connectorCxDidConfig: {
    myDid: 'your-did-long-number:1234567890:idk',
    bdrsUrl: 'https://bdrs.fake-backend',
    dimUrl: 'https://dim.fake-backend',
    trustedVcIssuer: 'https://trusted-vc-issuer.fake-backend',
    walletTokenUrl: 'https://wallet-token.fake-backend',
  },
  connectorDapsConfig: {
    tokenUrl: 'https://daps.fake-backend/token',
    jwksUrl: 'https://daps.fake-backend/jwks.json',
  },
});
