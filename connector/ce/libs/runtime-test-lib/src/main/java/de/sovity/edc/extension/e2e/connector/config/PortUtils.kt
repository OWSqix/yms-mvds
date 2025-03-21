/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.connector.config

import org.eclipse.edc.util.io.Ports
import java.io.IOException
import java.net.ServerSocket
import java.util.Random

object PortUtils {
    private val RANDOM = Random()

    @JvmStatic
    @Synchronized
    fun getFreePortRange(size: Int): Int {
        // pick a random port in a reasonable range
        var firstPort = RANDOM.nextInt(10_000, 50_000)

        var currentPort = firstPort
        do {
            if (canUsePort(currentPort)) {
                currentPort++
            } else {
                firstPort = currentPort++
            }
        } while (currentPort <= firstPort + size)

        return firstPort
    }

    private fun canUsePort(port: Int): Boolean {
        require(port > 0 && port < Ports.MAX_TCP_PORT) { "Lower bound must be > 0 and < " + Ports.MAX_TCP_PORT + " and be < upperBound" }

        try {
            ServerSocket(port).use { serverSocket ->
                serverSocket.setReuseAddress(true)
                return true
            }
        } catch (@Suppress("SwallowedException") e: IOException) {
            return false
        }
    }
}
