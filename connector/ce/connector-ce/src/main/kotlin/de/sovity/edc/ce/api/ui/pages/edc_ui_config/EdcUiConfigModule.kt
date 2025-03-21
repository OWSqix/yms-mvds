/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.edc_ui_config

import de.sovity.edc.runtime.modules.model.EdcModule

object EdcUiConfigModule {
    fun instance() = EdcModule(
        name = "edc-ui-config",
        documentation = "Api endpoint that passes configuration to the EDC UI."
    ).apply {
        serviceExtensions(
            EdcUiConfigExtension::class.java
        )
    }
}
