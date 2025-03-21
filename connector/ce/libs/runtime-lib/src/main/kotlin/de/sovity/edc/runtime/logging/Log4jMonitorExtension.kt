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

import org.eclipse.edc.runtime.metamodel.annotation.Extension
import org.eclipse.edc.spi.monitor.Monitor
import org.eclipse.edc.spi.system.MonitorExtension

/**
 * Monitor Extensions are the only extension loaded via the Service Locator API for our EDC
 */
@Extension("Log4J Logger Monitor")
class Log4jMonitorExtension : MonitorExtension {
    override fun getMonitor(): Monitor = Log4jMonitor()
}
