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
import de.sovity.edc.ce.config.CeVaultEntries
import de.sovity.edc.runtime.modules.model.ConfigPropCategory
import de.sovity.edc.runtime.modules.model.EdcModule

object DataPlaneEdrTokenConfig {
    fun instance() = EdcModule(
        "data-plane-edr-token-config",
        """
            The vault entries will be used to create tokens for the EDRs.

            Used in Core EDC by: `org.eclipse.edc.connector.dataplane.framework.iam.DefaultDataPlaneAccessTokenServiceImpl`

            Used in Tractus-X by: `org.eclipse.tractusx.edc.dataplane.tokenrefresh.core.DataPlaneTokenRefreshServiceImpl`
        """.trimIndent()
    ).apply {
        vaultEntry(CeVaultEntries.TRANSFER_PROXY_PUBLIC)
        vaultEntry(CeVaultEntries.TRANSFER_PROXY_PRIVATE)
        property(
            ConfigPropCategory.OVERRIDES,
            CeConfigProps.EDC_TRANSFER_PROXY_TOKEN_VERIFIER_PUBLICKEY_ALIAS
        ) {
            defaultValue(CeVaultEntries.TRANSFER_PROXY_PUBLIC.key)
        }
        property(
            ConfigPropCategory.OVERRIDES,
            CeConfigProps.EDC_TRANSFER_PROXY_TOKEN_SIGNER_PRIVATEKEY_ALIAS
        ) {
            defaultValue(CeVaultEntries.TRANSFER_PROXY_PRIVATE.key)
        }
    }
}
