/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.dependency_bundles

/**
 * Service classes manually added, e.g. additional extensions to be added to our EDC
 */
class ServiceClassList {
    /**
     * An implementation can implement multiple service classes.
     * However, each implementation is always explicitly registered for each service class.
     *
     * E.g. if you have a ServiceExtension (ServiceExtension extends SystemExtension),
     *  - you'd add it as ServiceExtension
     *  - it would not automatically be added as SystemExtension
     *  - it would thus not automatically be loaded as SystemExtension
     */
    private val customServiceClasses = mutableMapOf<Class<out Any>, MutableSet<Class<out Any>>>()

    fun <T : Any> addService(
        serviceClass: Class<T>,
        implementationClass: Class<out T>
    ) {
        require(serviceClass.isAssignableFrom(implementationClass)) {
            "Class $implementationClass does not implement $serviceClass"
        }

        customServiceClasses.computeIfAbsent(serviceClass) { mutableSetOf() }.add(implementationClass)
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> getServices(serviceClass: Class<T>): Set<Class<out T>> {
        val classes = customServiceClasses[serviceClass]?.toSet() ?: emptySet()
        return classes as Set<Class<out T>>
    }

    fun addAll(serviceClassList: ServiceClassList) {
        serviceClassList.customServiceClasses.forEach { (serviceClass, implementations) ->
            val set = customServiceClasses.computeIfAbsent(serviceClass) { mutableSetOf() }
            set.addAll(implementations)
        }
    }
}
