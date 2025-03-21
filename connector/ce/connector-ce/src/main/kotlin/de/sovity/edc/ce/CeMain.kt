/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce

import de.sovity.edc.runtime.modules.runtime.InitialConfigFactory
import de.sovity.edc.runtime.modules.runtime.SovityEdcRuntime
import org.eclipse.edc.boot.system.ExtensionLoader

/**
 * Production main entry point
 */
fun main(args: Array<String>) {
    val rootModule = CeRootModule.root()
    val initialConfig = InitialConfigFactory.initialConfigFromEnv()

    // monitor is actually loaded via the Java Service Locator API in prod
    // so our module system cannot switch between monitor extensions
    val monitor = ExtensionLoader.loadMonitor(*args)

    val runtime = SovityEdcRuntime(rootModule, initialConfig, monitor)
    Runtime.getRuntime().addShutdownHook(Thread { runtime.shutdown() })
    runtime.boot()
}
