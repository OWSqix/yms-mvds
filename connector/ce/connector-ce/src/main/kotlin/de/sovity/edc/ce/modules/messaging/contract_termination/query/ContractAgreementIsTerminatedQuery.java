/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.messaging.contract_termination.query;

import de.sovity.edc.ce.db.jooq.Tables;
import lombok.val;
import org.jooq.DSLContext;

public class ContractAgreementIsTerminatedQuery {

    public boolean isTerminated(DSLContext dsl, String contractAgreementId) {

        val t = Tables.SOVITY_CONTRACT_TERMINATION;

        return dsl.fetchExists(
            dsl.select()
                .from(t)
                .where(t.CONTRACT_AGREEMENT_ID.eq(contractAgreementId))
        );
    }
}
