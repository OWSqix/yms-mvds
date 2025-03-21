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

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolutionException
import org.junit.jupiter.api.extension.ParameterResolver

/**
 * A fancy [Map] of `S` and [InstancesForJunitTest].
 *
 * @param S Enum for "Provider, Consumer, ProviderDp, ConsumerDp, etc."
 */
class InstancesForEachConnector<S>(
    private val sides: List<S>,
    private val getSideOrNull: (parameter: ParameterContext, extension: ExtensionContext?) -> S?
) : ParameterResolver {
    private val instances = sides.associateWith { InstancesForJunitTest() }

    fun <T> all(clazz: Class<T>): List<T> = sides
        .map { forSide(it) }
        .filter { it.has(clazz) }
        .map { it.get(clazz) }

    fun forSide(side: S): InstancesForJunitTest = instances[side]
        ?: error("No instances for side $side found")

    override fun supportsParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext?
    ): Boolean {
        val side = getSideOrNull(parameterContext, extensionContext)
        if (side == null) {
            return false
        }
        return forSide(side).supportsParameter(parameterContext, extensionContext)
    }

    override fun resolveParameter(
        parameterContext: ParameterContext,
        extensionContext: ExtensionContext?
    ): Any? {
        val side = getSideOrNull(parameterContext, extensionContext)
        if (side == null) {
            throw ParameterResolutionException("No side found for parameter ${parameterContext.parameter}")
        }
        return forSide(side).resolveParameter(parameterContext, extensionContext)
    }
}
