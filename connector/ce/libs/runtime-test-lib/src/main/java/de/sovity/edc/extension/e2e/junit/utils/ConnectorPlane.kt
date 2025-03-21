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

enum class ConnectorPlane {
    CONTROL_PLANE,
    DATA_PLANE;

    companion object {
        fun fromParameterContextOrNull(parameterContext: ParameterContext): ConnectorPlane? {
            val isControlPlane = parameterContext.parameter.getDeclaredAnnotation(ControlPlane::class.java) != null
            val isDataPlane = parameterContext.parameter.getDeclaredAnnotation(DataPlane::class.java) != null

            return when {
                isDataPlane && !isControlPlane -> DATA_PLANE
                !isDataPlane && isControlPlane -> CONTROL_PLANE
                isDataPlane && isControlPlane -> error("Parameter cannot be annotated with both ControlPlane and DataPlane")
                else -> null
            }
        }
    }
}
