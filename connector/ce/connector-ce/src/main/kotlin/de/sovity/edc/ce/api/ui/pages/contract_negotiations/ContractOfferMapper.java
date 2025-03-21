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
import de.sovity.edc.ce.libs.mappers.PolicyMapper;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.connector.controlplane.contract.spi.types.offer.ContractOffer;


@RequiredArgsConstructor
@Service
public class ContractOfferMapper {
    private final PolicyMapper policyMapper;

    public ContractOffer buildContractOffer(ContractNegotiationRequest contractRequest) {
        var policy = policyMapper.buildPolicy(contractRequest.getPolicyJsonLd());

        // Required or Eclipse EDC Validation in DSP panics
        // despite assetId being a field on the ContractOffer
        // despite the catalog not putting it out while policies aren't asset specific
        policy = policy.toBuilder()
            .target(contractRequest.getAssetId())
            .assigner(contractRequest.getCounterPartyId())
            .build();

        return ContractOffer.Builder.newInstance()
            .id(contractRequest.getContractOfferId())
            .policy(policy)
            .assetId(contractRequest.getAssetId())
            .build();
    }
}
