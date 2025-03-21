/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.logging

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.eclipse.edc.spi.monitor.Monitor
import java.util.function.Supplier

/**
 * Directly use Log4J so we don't need any custom Java Logging API stuff that requires Java Application Args
 */
class Log4jMonitor : Monitor {
    private val logger = LogManager.getLogger(Log4jMonitor::class.java.getName())

    override fun severe(supplier: Supplier<String?>, vararg errors: Throwable?) {
        this.log(supplier, Level.ERROR, *errors)
    }

    override fun severe(data: MutableMap<String, Any?>) {
        data.forEach { (key, value) -> logger.log(Level.ERROR, key, value) }
    }

    override fun warning(supplier: Supplier<String?>, vararg errors: Throwable?) {
        this.log(supplier, Level.WARN, *errors)
    }

    override fun info(supplier: Supplier<String?>, vararg errors: Throwable?) {
        this.log(supplier, Level.INFO, *errors)
    }

    override fun debug(supplier: Supplier<String?>, vararg errors: Throwable?) {
        this.log(supplier, Level.DEBUG, *errors)
    }

    private fun log(supplier: Supplier<String?>, level: Level, vararg errors: Throwable?) {
        if (!logger.isEnabled(level)) {
            return
        }
        errors.ifEmpty { logger.log(level, supplier.get()) }
        errors.forEach { logger.log(level, supplier.get(), it) }
    }
}
