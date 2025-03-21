/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce

import de.sovity.edc.ce.config.CeConfigProps
import de.sovity.edc.ce.config.CeDataspace
import de.sovity.edc.ce.modules.auth.ApiKeyAuthModule
import de.sovity.edc.extension.e2e.junit.IntegrationTest2xCpDpExtension
import de.sovity.edc.runtime.modules.RuntimeConfigProps
import org.junit.jupiter.api.extension.RegisterExtension
import java.util.UUID.randomUUID

/**
 * This test is the CE because it is referenced from documentation
 */
class ApiWrapperDemoTestIamMockCpDp : ApiWrapperDemoTestBase() {
    companion object {
        @RegisterExtension
        val connectors = IntegrationTest2xCpDpExtension(
            rootModule = CeRootModule.root(),
            providerControlPlaneConfig = mapOf(
                RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeControlPlaneModules.standalone().name,
                RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",
                CeConfigProps.SOVITY_BASE_PATH to "/control",

                // Mock IAM
                CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,
                CeConfigProps.EDC_PARTICIPANT_ID to "provider",

                // Management API
                CeConfigProps.SOVITY_MANAGEMENT_API_IAM_KIND to ApiKeyAuthModule.instance().name,
                CeConfigProps.EDC_API_AUTH_KEY to randomUUID().toString(),
            ),
            providerDataPlaneConfig = { cpConfig, cpConfigUtils ->
                mapOf(
                    RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                    CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeDataPlaneModules.standalone().name,
                    RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",
                    CeConfigProps.SOVITY_BASE_PATH to "/data",

                    // Mock IAM
                    CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,

                    // Data Plane Registration
                    CeConfigProps.SOVITY_INTERNAL_CP_FIRST_PORT to RuntimeConfigProps.SOVITY_FIRST_PORT
                        .getStringOrThrow(cpConfig),
                    CeConfigProps.SOVITY_INTERNAL_CP_BASE_PATH to "/control",
                    CeConfigProps.SOVITY_INTERNAL_CP_MANAGEMENT_API_KEY to cpConfigUtils.managementApiKey!!
                )
            },
            consumerControlPlaneConfig = mapOf(
                RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeControlPlaneModules.standalone().name,
                RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",
                CeConfigProps.SOVITY_BASE_PATH to "/control",

                // Mock IAM
                CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,
                CeConfigProps.EDC_PARTICIPANT_ID to "consumer",

                // Management API
                CeConfigProps.SOVITY_MANAGEMENT_API_IAM_KIND to ApiKeyAuthModule.instance().name,
                CeConfigProps.EDC_API_AUTH_KEY to randomUUID().toString(),
            ),
            consumerDataPlaneConfig = { cpConfig, cpConfigUtils ->
                mapOf(
                    RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                    CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeDataPlaneModules.standalone().name,
                    RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",
                    CeConfigProps.SOVITY_BASE_PATH to "/data",

                    // Mock IAM
                    CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,

                    // Data Plane Registration
                    CeConfigProps.SOVITY_INTERNAL_CP_FIRST_PORT to RuntimeConfigProps.SOVITY_FIRST_PORT
                        .getStringOrThrow(cpConfig),
                    CeConfigProps.SOVITY_INTERNAL_CP_BASE_PATH to "/control",
                    CeConfigProps.SOVITY_INTERNAL_CP_MANAGEMENT_API_KEY to cpConfigUtils.managementApiKey!!,
                )
            },
        )
    }
}
