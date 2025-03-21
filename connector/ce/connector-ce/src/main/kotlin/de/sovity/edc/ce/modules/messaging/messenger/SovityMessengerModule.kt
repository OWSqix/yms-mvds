/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.messaging.messenger

import de.sovity.edc.runtime.modules.model.EdcModule

object SovityMessengerModule {
    fun instance() = EdcModule(
        name = "messaging",
        documentation = "Easy custom EDC-to-EDC messaging"
    ).apply {
        serviceExtensions(SovityMessengerExtension::class.java)
    }
}
