/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.vault.inmemory

import de.sovity.edc.ce.config.CeConfigProps
import de.sovity.edc.runtime.modules.model.ConfigPropCategory
import de.sovity.edc.runtime.modules.model.EdcModule

object InMemoryVaultModule {
    fun instance() = EdcModule(
        "vault-in-memory",
        "In-memory vault that can be initialized via env vars"
    ).apply {
        serviceExtensions(InMemoryVaultExtension::class.java)
        property(
            ConfigPropCategory.IMPORTANT,
            CeConfigProps.SOVITY_VAULT_IN_MEMORY_INIT_WILDCARD
        )
    }
}
