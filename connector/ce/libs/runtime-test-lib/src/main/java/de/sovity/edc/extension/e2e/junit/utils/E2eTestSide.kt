/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.junit.utils

import org.junit.jupiter.api.extension.ParameterContext

enum class E2eTestSide {
    PROVIDER,
    CONSUMER;

    companion object {
        fun fromParameterContextOrNull(parameterContext: ParameterContext): E2eTestSide? {
            val isProvider = parameterContext.parameter.getDeclaredAnnotation(Provider::class.java) != null
            val isConsumer = parameterContext.parameter.getDeclaredAnnotation(Consumer::class.java) != null

            return when {
                isConsumer && !isProvider -> CONSUMER
                !isConsumer && isProvider -> PROVIDER
                isConsumer && isProvider -> error("Parameter cannot be annotated with both Consumer and Provider")
                else -> null
            }
        }
    }
}
