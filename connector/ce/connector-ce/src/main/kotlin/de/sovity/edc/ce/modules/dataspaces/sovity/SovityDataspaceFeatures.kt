/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.dataspaces.sovity

import de.sovity.edc.ce.modules.dataspaces.sovity.iam.DapsModules
import de.sovity.edc.ce.modules.dataspaces.sovity.iam.IamMockModule
import de.sovity.edc.ce.modules.dataspaces.sovity.policies.SovityPoliciesModule
import de.sovity.edc.ce.modules.messaging.contract_termination.ContractTerminationModule
import de.sovity.edc.runtime.modules.model.EdcModule

object SovityDataspaceFeatures {
    fun controlPlaneWithMockIam() = EdcModule(
        name = "sovity-dataspace-cp-with-mock-iam",
        documentation = "Dataspace-specific control-plane features for sovity dataspaces with iam-mock"
    ).apply {
        module(IamMockModule.instance())
        controlPlaneFeatures()
    }

    fun controlPlaneWithDaps() = EdcModule(
        name = "sovity-dataspace-cp-with-daps",
        documentation = "Dataspace-specific control-plane features for sovity dataspaces with DAPS"
    ).apply {
        module(DapsModules.sovityDaps())
        controlPlaneFeatures()
    }

    fun controlPlaneWithDapsOmejdn() = EdcModule(
        name = "sovity-dataspace-cp-with-daps-omejdn",
        documentation = "Dataspace-specific control-plane features for sovity dataspaces with DAPS Omejdn"
    ).apply {
        module(DapsModules.sovityDapsOmejdn())
        controlPlaneFeatures()
    }

    private fun EdcModule.controlPlaneFeatures() {
        modules(
            SovityPoliciesModule.instance(),
            ContractTerminationModule.instance()
        )
    }
}
