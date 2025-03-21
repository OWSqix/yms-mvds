/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.auth

import de.sovity.edc.ce.config.CeConfigProps
import de.sovity.edc.ce.dependency_bundles.CeDependencyBundles
import de.sovity.edc.runtime.modules.model.ConfigPropCategory
import de.sovity.edc.runtime.modules.model.EdcModule

object ApiKeyAuthModule {
    fun instance() = EdcModule(
        name = "management-iam-api-key",
        documentation = "Legacy API Key Auth for the Management API"
    ).apply {
        dependencyBundle(CeDependencyBundles.managementApiAuthApiKey)

        property(
            ConfigPropCategory.IMPORTANT,
            CeConfigProps.EDC_API_AUTH_KEY
        ) {
            requiredInProd()
            defaultValueOutsideProd("ApiKeyDefaultValue")
            warnIfUnset = true
        }
    }
}
