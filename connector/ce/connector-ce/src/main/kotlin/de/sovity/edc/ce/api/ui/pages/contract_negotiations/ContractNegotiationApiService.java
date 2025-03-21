/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.contract_negotiations;

import de.sovity.edc.ce.api.ui.model.ContractNegotiationRequest;
import de.sovity.edc.ce.api.ui.model.UiContractNegotiation;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.connector.controlplane.contract.spi.types.agreement.ContractAgreement;
import org.eclipse.edc.connector.controlplane.contract.spi.types.negotiation.ContractNegotiation;
import org.eclipse.edc.connector.controlplane.services.spi.contractnegotiation.ContractNegotiationService;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

import static de.sovity.edc.ce.api.utils.EdcDateUtils.utcMillisToOffsetDateTime;


@RequiredArgsConstructor
@Service
public class ContractNegotiationApiService {
    private final ContractNegotiationService contractNegotiationService;
    private final ContractNegotiationBuilder contractNegotiationBuilder;
    private final ContractNegotiationStateService contractNegotiationStateService;

    @NotNull
    public UiContractNegotiation initiateContractNegotiation(ContractNegotiationRequest request) {
        var contractRequest = contractNegotiationBuilder.buildContractNegotiation(request);
        var contractNegotiation = contractNegotiationService.initiateNegotiation(contractRequest);
        return buildContractNegotiation(contractNegotiation);
    }

    @NotNull
    public UiContractNegotiation getContractNegotiation(String contractNegotiationId) {
        var contractNegotiation = contractNegotiationService.findbyId(contractNegotiationId);
        return buildContractNegotiation(contractNegotiation);
    }

    @NotNull
    private UiContractNegotiation buildContractNegotiation(ContractNegotiation contractNegotiation) {
        var status = contractNegotiationStateService.buildContractNegotiationState(contractNegotiation.getState());
        String agreementId = Optional.of(contractNegotiation)
            .map(ContractNegotiation::getContractAgreement)
            .map(ContractAgreement::getId)
            .orElse(null);
        return new UiContractNegotiation(
            contractNegotiation.getId(),
            utcMillisToOffsetDateTime(contractNegotiation.getCreatedAt()),
            agreementId,
            status
        );
    }
}
