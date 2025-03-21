/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.vault.hashicorp

import de.sovity.edc.ce.config.CeConfigProps
import de.sovity.edc.ce.dependency_bundles.CeDependencyBundles
import de.sovity.edc.runtime.modules.model.ConfigPropCategory
import de.sovity.edc.runtime.modules.model.EdcModule

object HashicorpVaultModule {
    fun instance() = EdcModule(
        name = "vault-hashicorp",
        documentation = "Hashicorp-specific implementation of the EDC vault"
    ).apply {
        dependencyBundle(CeDependencyBundles.hashicorpVault)

        property(ConfigPropCategory.IMPORTANT, CeConfigProps.EDC_VAULT_HASHICORP_URL) {
            required()
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_HEALTH_CHECK_ENABLED) {
            defaultValue("true")
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_API_HEALTH_CHECK_PATH) {
            defaultValue("/v1/sys/health")
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_HEALTH_CHECK_STANDBY_OK) {
            defaultValue("false")
        }
        property(ConfigPropCategory.IMPORTANT, CeConfigProps.EDC_VAULT_HASHICORP_TOKEN) {
            required()
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_TOKEN_SCHEDULED_RENEW_ENABLED) {
            defaultValue("true")
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_TOKEN_TTL) {
            defaultValue("300")
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_TOKEN_RENEW_BUFFER) {
            defaultValue("30")
        }
        property(ConfigPropCategory.OPTIONAL, CeConfigProps.EDC_VAULT_HASHICORP_API_SECRET_PATH) {
            defaultValue("/v1/secret")
        }
    }
}
