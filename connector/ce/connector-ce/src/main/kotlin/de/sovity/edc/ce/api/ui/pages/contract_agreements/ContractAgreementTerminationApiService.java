/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.contract_agreements;

import de.sovity.edc.ce.api.ui.model.ContractTerminationRequest;
import de.sovity.edc.ce.api.ui.model.IdResponseDto;
import de.sovity.edc.ce.modules.messaging.contract_termination.ContractAgreementTerminationService;
import de.sovity.edc.ce.modules.messaging.contract_termination.ContractTerminationParam;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.eclipse.edc.spi.EdcException;
import org.jooq.DSLContext;

import static de.sovity.edc.ce.api.utils.ValidatorUtils.validate;

@RequiredArgsConstructor
@Service
public class ContractAgreementTerminationApiService {

    private final ContractAgreementTerminationService contractAgreementTerminationService;

    public IdResponseDto terminate(
        DSLContext dsl,
        String contractAgreementId,
        ContractTerminationRequest contractTerminationRequest
    ) {
        validate(contractTerminationRequest);

        try {
            val terminatedAt = contractAgreementTerminationService.terminateAgreementOrThrow(
                dsl,
                new ContractTerminationParam(
                    contractAgreementId,
                    contractTerminationRequest.getDetail(),
                    contractTerminationRequest.getReason()));

            return IdResponseDto.builder()
                .id(contractAgreementId)
                .lastUpdatedDate(terminatedAt)
                .build();

        } catch (RuntimeException e) {
            throw new EdcException("Failed to terminate the agreement %s".formatted(contractAgreementId) + " : " + e.getMessage(), e);
        }
    }
}
