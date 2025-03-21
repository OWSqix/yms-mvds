/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.config

import de.sovity.edc.runtime.modules.model.VaultEntry

@Suppress("MaxLineLength")
object CeVaultEntries {
    @JvmStatic
    val DAPS_PRIV = VaultEntry(
        key = "daps-priv",
        exampleValue = "[PKCS 8](https://en.wikipedia.org/wiki/PKCS_8) in PEM/Base64 format",
        documentation = "DAPS C2C IAM Private Key"
    )

    @JvmStatic
    val DAPS_CERT = VaultEntry(
        key = "daps-cert",
        exampleValue = "PEM/Base64 format `-----BEGIN CERTIFICATE-----`",
        documentation = "DAPS C2C IAM Certificate"
    )

    @JvmStatic
    val STS_CLIENT_SECRET = VaultEntry(
        key = "sts-client-secret",
        exampleValue = "random characters and letters",
        documentation = "The client secret for the IAM STS OAuth client"
    )

    @JvmStatic
    val TRANSFER_PROXY_PUBLIC = VaultEntry(
        // For backward compatibility this is kept at the old name
        // It is used for the EDR tokens nowadays
        key = "transfer-proxy-public",
        exampleValue = "PEM/Base64 format `-----BEGIN CERTIFICATE-----`",
        documentation = "EDR Token Generation Keypair (Certificate)"
    )

    @JvmStatic
    val TRANSFER_PROXY_PRIVATE = VaultEntry(
        // For backward compatibility this is kept at the old name
        // It is used for the EDR tokens nowadays
        key = "transfer-proxy-private",
        exampleValue = "PKCS 8 in PEM/Base64 format",
        documentation = "EDR Token Generation Keypair (Private Key)"
    )
}
