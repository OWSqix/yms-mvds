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
import de.sovity.edc.extension.e2e.junit.IntegrationTest2xExtension
import de.sovity.edc.runtime.modules.RuntimeConfigProps
import org.junit.jupiter.api.extension.RegisterExtension
import java.util.UUID.randomUUID

/**
 * This test is the CE because it is referenced from documentation
 */
class ApiWrapperDemoTestIamMock : ApiWrapperDemoTestBase() {
    companion object {
        @RegisterExtension
        private val EXTENSION = IntegrationTest2xExtension(
            CeRootModule.root(),
            mapOf(
                RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeControlPlaneModules.withIntegratedDataPlane().name,
                RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",

                // Mock IAM
                CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,
                CeConfigProps.EDC_PARTICIPANT_ID to "provider",

                // Management API
                CeConfigProps.SOVITY_MANAGEMENT_API_IAM_KIND to ApiKeyAuthModule.instance().name,
                CeConfigProps.EDC_API_AUTH_KEY to randomUUID().toString(),
            ),
            mapOf(
                RuntimeConfigProps.SOVITY_ENVIRONMENT to "UNIT_TEST",
                CeConfigProps.SOVITY_DEPLOYMENT_KIND to CeControlPlaneModules.withIntegratedDataPlane().name,
                RuntimeConfigProps.SOVITY_FIRST_PORT to "auto",

                // Mock IAM
                CeConfigProps.SOVITY_DATASPACE_KIND to CeDataspace.SOVITY_MOCK_IAM.nameKebabCase,
                CeConfigProps.EDC_PARTICIPANT_ID to "consumer",

                // Management API
                CeConfigProps.SOVITY_MANAGEMENT_API_IAM_KIND to ApiKeyAuthModule.instance().name,
                CeConfigProps.EDC_API_AUTH_KEY to randomUUID().toString(),
            )
        )
    }
}
