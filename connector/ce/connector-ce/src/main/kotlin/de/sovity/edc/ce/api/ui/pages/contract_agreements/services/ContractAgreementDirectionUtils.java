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

import de.sovity.edc.ce.api.ui.model.ContractAgreementDirection;
import lombok.experimental.UtilityClass;
import org.eclipse.edc.connector.controlplane.contract.spi.types.negotiation.ContractNegotiation;

@UtilityClass
public class ContractAgreementDirectionUtils {

    public static ContractAgreementDirection fromType(ContractNegotiation.Type type) {
        return switch (type) {
            case PROVIDER -> ContractAgreementDirection.PROVIDING;
            case CONSUMER -> ContractAgreementDirection.CONSUMING;
        };
    }
}
