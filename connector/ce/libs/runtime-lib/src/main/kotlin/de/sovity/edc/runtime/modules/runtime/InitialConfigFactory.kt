/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.runtime

import org.eclipse.edc.spi.system.configuration.Config
import org.eclipse.edc.spi.system.configuration.ConfigFactory

/**
 * Build a [Config] on EDC Boot. This ignores [org.eclipse.edc.spi.system.ConfigurationExtension]s. Which is currently
 * a weakness of our config parsing.
 */
object InitialConfigFactory {
    fun initialConfigFromEnv(overrides: Map<String, String> = emptyMap()): Config {
        // ConfigurationExtensions are ignored so config-providing extensions are disabled and would have to be
        // manually added here
        return listOf(
            ConfigFactory.fromEnvironment(System.getenv()),
            ConfigFactory.fromProperties(System.getProperties()),
            ConfigFactory.fromMap(overrides)
        ).reduce { a, b -> a.merge(b) }
    }
}
