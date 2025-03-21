/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules

import org.eclipse.edc.spi.system.configuration.Config

object RuntimeUtils {
    fun isProduction(config: Config): Boolean =
        config.getString(RuntimeConfigProps.SOVITY_ENVIRONMENT.property)?.lowercase() == "production"
}

fun Config.getEnvironment(): String? = RuntimeConfigProps.SOVITY_ENVIRONMENT.getStringOrNull(this)

fun Config.isProduction(): Boolean = RuntimeUtils.isProduction(this)
