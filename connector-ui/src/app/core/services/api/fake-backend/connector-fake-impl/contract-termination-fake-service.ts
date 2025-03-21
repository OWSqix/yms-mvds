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
  ContractAgreementCard,
  IdResponseDto,
  TerminateContractAgreementRequest,
} from '@sovity.de/edc-client';
import {updateAgreement} from './contract-agreement-fake-service';

export const initiateContractTermination = (
  request: TerminateContractAgreementRequest,
): IdResponseDto => {
  let response: IdResponseDto = {
    id: request.contractAgreementId,
    lastUpdatedDate: new Date(),
  };

  updateAgreement(
    request.contractAgreementId,
    (agremeent: ContractAgreementCard) => ({
      terminationStatus: 'TERMINATED',
      terminationInformation: {
        terminatedAt: new Date(),
        terminatedBy: 'SELF',
        reason: request.contractTerminationRequest?.reason ?? '',
        detail: request.contractTerminationRequest?.detail ?? '',
      },
    }),
  );
  return response;
};
