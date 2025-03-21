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
import org.eclipse.edc.boot.vault.InMemoryVault
import org.eclipse.edc.runtime.metamodel.annotation.BaseExtension
import org.eclipse.edc.runtime.metamodel.annotation.Extension
import org.eclipse.edc.runtime.metamodel.annotation.Provider
import org.eclipse.edc.spi.security.Vault
import org.eclipse.edc.spi.system.ServiceExtension
import org.eclipse.edc.spi.system.ServiceExtensionContext

@BaseExtension
@Extension(value = "InMemoryVaultExtension")
class InMemoryVaultExtension : ServiceExtension {
    override fun name(): String = InMemoryVaultExtension::class.java.name

    @Provider
    fun vault(context: ServiceExtensionContext): Vault {
        val monitor = context.monitor
        val config = context.config
        val vault = InMemoryVault(monitor)

        // Initialize the vault via env
        val prefix = CeConfigProps.SOVITY_VAULT_IN_MEMORY_INIT_WILDCARD.property.removeSuffix("*")
        val entries = config.entries
            .filter { it.key.startsWith(prefix) }
            .map { it.key.removePrefix(prefix) to it.value }

        entries.forEach { (key, value) ->
            monitor.info("Initializing In-Memory Vault with $key: (omitted, length ${key.length})")
            vault.storeSecret(key, value)
        }

        return vault
    }
}
