/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.contract_agreements.services;

import de.sovity.edc.ce.api.ui.pages.dashboard.services.SelfDescriptionService;
import de.sovity.edc.ce.api.utils.ServiceException;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.connector.controlplane.contract.spi.types.negotiation.ContractNegotiation;
import org.eclipse.edc.connector.controlplane.services.spi.contractnegotiation.ContractNegotiationService;
import org.eclipse.edc.spi.EdcException;
import org.eclipse.edc.spi.query.Criterion;
import org.eclipse.edc.spi.query.QuerySpec;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContractNegotiationUtils {

    private final ContractNegotiationService contractNegotiationService;
    private final SelfDescriptionService selfDescriptionService;

    public ContractNegotiation findByContractAgreementIdOrThrow(String contractAgreementId) {
        var querySpec = QuerySpec.Builder.newInstance()
            .filter(List.of(new Criterion("contractAgreement.id", "=", contractAgreementId)))
            .build();
        return contractNegotiationService.query(querySpec).orElseThrow(ServiceException::new)
            .findFirst()
            .orElseThrow(() -> new EdcException("Could not fetch contractNegotiation for " +
                "contractAgreement"));
    }

    /**
     * Return's the asset provider's connector endpoint
     *
     * @param negotiation negotiation
     * @return participant ID
     */
    public String getProviderConnectorEndpoint(ContractNegotiation negotiation) {
        if (negotiation.getType() == ContractNegotiation.Type.PROVIDER) {
            return selfDescriptionService.getConnectorEndpoint();
        }

        return negotiation.getCounterPartyAddress();
    }

    /**
     * Return's the asset provider's participant ID
     *
     * @param negotiation negotiation
     * @return participant ID
     */
    public String getProviderParticipantId(ContractNegotiation negotiation) {
        if (negotiation.getType() == ContractNegotiation.Type.PROVIDER) {
            return selfDescriptionService.getParticipantId();
        }

        return negotiation.getCounterPartyId();
    }
}
