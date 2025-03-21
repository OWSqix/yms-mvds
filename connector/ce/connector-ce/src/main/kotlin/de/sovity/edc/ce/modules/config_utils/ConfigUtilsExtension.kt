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

import de.sovity.edc.runtime.config.ConfigUtils
import org.eclipse.edc.runtime.metamodel.annotation.Provides
import org.eclipse.edc.spi.system.ServiceExtension
import org.eclipse.edc.spi.system.ServiceExtensionContext

@Provides(ConfigUtils::class)
class ConfigUtilsExtension : ServiceExtension {
    override fun initialize(context: ServiceExtensionContext) {
        context.registerService(ConfigUtils::class.java, ConfigUtilsImpl(context.config))
    }
}
