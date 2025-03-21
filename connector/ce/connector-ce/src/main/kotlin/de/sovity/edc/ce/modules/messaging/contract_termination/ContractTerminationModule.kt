/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.messaging.contract_termination

import de.sovity.edc.runtime.modules.model.EdcModule

object ContractTerminationModule {
    fun instance() = EdcModule(
        name = "contract-termination",
        documentation = "Contract Termination for sovity dataspaces"
    ).apply {
        serviceExtensions(ContractTerminationExtension::class.java)
    }
}
