/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.config_utils

import de.sovity.edc.runtime.modules.model.EdcModule

object ConfigUtilsModule {
    fun instance() = EdcModule("sovity-edc-ee-config-utils", "Provides instance of ConfigUtils for the EE").apply {
        serviceExtensions(ConfigUtilsExtension::class.java)
    }
}
