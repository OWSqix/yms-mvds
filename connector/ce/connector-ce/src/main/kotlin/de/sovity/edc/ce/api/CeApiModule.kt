/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api

import de.sovity.edc.runtime.modules.model.EdcModule

object CeApiModule {
    fun instance() = EdcModule(
        name = "sovity-ce-api",
        documentation = "sovity Community Edition EDC API Wrapper"
    ).apply {
        serviceExtensions(
            CeApiExtension::class.java
        )
    }
}
