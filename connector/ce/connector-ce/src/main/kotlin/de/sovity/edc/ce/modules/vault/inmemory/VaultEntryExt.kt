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
import de.sovity.edc.runtime.modules.model.ConfigPropRef
import de.sovity.edc.runtime.modules.model.VaultEntry

/**
 * You can use this in tests to safely provide vault secrets via config
 */
fun VaultEntry.toConfigPropRef() = ConfigPropRef(
    property = CeConfigProps.SOVITY_VAULT_IN_MEMORY_INIT_WILDCARD.property.removeSuffix("*") + key,
    defaultDocumentation = "Config key for filling the in-memory vault's key '$key'."
)
