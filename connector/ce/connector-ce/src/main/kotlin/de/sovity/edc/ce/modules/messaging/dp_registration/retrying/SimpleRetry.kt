/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.messaging.dp_registration.retrying

import java.time.Duration

object SimpleRetry {
    fun <T> retry(
        maxAttempts: Int,
        delay: Duration,
        block: () -> T
    ): T {
        require(maxAttempts > 0) { "maxAttempts should be greater than 0" }
        var lastException: Throwable? = null
        repeat(maxAttempts) {
            try {
                return block()
            } catch (e: InterruptedException) {
                throw e
            } catch (e: Exception) {
                lastException?.let { e.addSuppressed(it) }
                lastException = e
                Thread.sleep(delay.toMillis())
            }
        }
        throw lastException!!
    }
}
