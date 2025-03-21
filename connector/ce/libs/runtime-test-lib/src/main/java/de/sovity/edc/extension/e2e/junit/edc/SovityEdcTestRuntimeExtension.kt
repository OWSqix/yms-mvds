/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.junit.edc

import de.sovity.edc.extension.e2e.utils.DebugUtils
import de.sovity.edc.runtime.modules.model.ConfigPropRef
import de.sovity.edc.runtime.modules.model.EdcModule
import org.eclipse.edc.spi.system.configuration.ConfigFactory
import org.junit.jupiter.api.extension.AfterAllCallback
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver
import java.time.Duration
import java.util.concurrent.Executors
import java.util.function.Consumer

/**
 * JUnit Extension: Start one [SovityEdcTestRuntime]
 */
class SovityEdcTestRuntimeExtension(
    val rootModule: EdcModule,
    val config: Map<ConfigPropRef, String>,
    val installEdcMocks: Consumer<SovityEdcTestRuntime> = Consumer {},
    val runtimeNameForLogging: String = "edc",
) : BeforeAllCallback, AfterAllCallback, ParameterResolver {
    private val executorService = Executors.newSingleThreadExecutor()
    private lateinit var runtime: SovityEdcTestRuntime

    override fun beforeAll(extensionContext: ExtensionContext) {
        val initialConfig = ConfigFactory.fromMap(config.mapKeys { it.key.property })
        runtime = SovityEdcTestRuntime(runtimeNameForLogging, rootModule, initialConfig)
        installEdcMocks.accept(runtime)
        val timeout = if (DebugUtils.isDebug) Duration.ofHours(10) else Duration.ofSeconds(20)
        TimeoutUtils.runDeferred(timeout) {
            runtime.boot()
        }
    }

    override fun afterAll(extensionContext: ExtensionContext?) {
        runtime.shutdown()
        executorService.shutdown()
    }

    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext?): Boolean {
        var type = parameterContext.parameter.parameterizedType
        return type is Class<*> && runtime.hasService(type)
    }

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext?): Any? {
        var type = parameterContext.parameter.parameterizedType
        require(type is Class<*>)
        return runtime.getService(type)
    }
}
