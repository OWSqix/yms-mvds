/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.extension.e2e.utils

object Resources {

    @JvmStatic
    fun loadResourceAsString(name: String): String {
        val bytes = Resources::class.java.getResourceAsStream(name)?.readAllBytes()

        require(bytes != null) {
            "Failed to load the resource $name"
        }

        return String(bytes)
    }

}
