/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.evaluation.utils

import de.sovity.edc.runtime.modules.model.ConfigProp

/**
 * Queue of [ConfigProp]s to be evaluated.
 *
 * Each [ConfigProp] can be in one of three states: not visited, visited, visited & completed.
 */
class ConfigPropQueue {
    private val allConfigProps = mutableListOf<ConfigProp>()
    private val allProperties = mutableSetOf<String>()

    private val visited = mutableSetOf<String>()
    private val notVisited = mutableSetOf<String>()

    private val completed = mutableSetOf<String>()

    fun addAll(configProps: List<ConfigProp>) {
        val newProperties = configProps.map { it.property }

        // We have a check de-duplicating multiple configPropDefs (for properties is used in multiple modules)
        // If a property has been evaluated before all properties were collected, that's a problem.
        // This should only happen when mixing module activation flag properties with real configuration properties.
        val alreadyVisited = newProperties.intersect(visited)
        require(alreadyVisited.isEmpty()) {
            @Suppress("MaxLineLength")
            "Properties ${alreadyVisited.joinToString { "'$it'" }} have already been visited and are now being added again. This can happen if a property used for module decisions is also used in a child module. Whether the solution is to fix this *aLgOrItHm* or to 'not do what you tried to do' is up to you. Allowing for re-adding of properties that are 'completed' would be feasible but you'd have to add a check that the re-evaluated property did not end up producing another value and thus causing a conflict."
        }

        allProperties.addAll(newProperties)
        allConfigProps.addAll(configProps)
        notVisited.addAll(newProperties)
    }

    fun hasNext(): Boolean = notVisited.isNotEmpty()

    fun nextProperty(): String =
        notVisited.first()

    fun visit(property: String): List<ConfigProp> {
        requireExists(property)
        requireNotVisited(property)
        notVisited.remove(property)
        visited.add(property)
        return allConfigProps.filter { it.property == property }
    }

    fun isCompleted(property: String): Boolean {
        requireExists(property)
        return completed.contains(property)
    }

    fun isVisited(property: String): Boolean {
        requireExists(property)
        return visited.contains(property)
    }

    fun complete(property: String) {
        requireExists(property)
        completed.add(property)
    }

    private fun requireNotVisited(property: String) {
        require(notVisited.contains(property)) {
            "Property '$property' already visited."
        }
    }

    private fun requireExists(property: String) {
        require(allProperties.contains(property)) {
            "Property '$property' not defined at this moment."
        }
    }
}
