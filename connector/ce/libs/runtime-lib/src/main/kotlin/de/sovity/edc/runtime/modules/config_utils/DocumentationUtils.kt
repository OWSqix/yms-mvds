/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.config_utils

import de.sovity.edc.runtime.modules.model.ConfigPropEnumValue

object DocumentationUtils {
    /**
     * Formats the available options for a configuration property
     */
    fun documentAlternatives(description: String, choices: List<ConfigPropEnumValue>): String {
        val choicesEnumerated = choices.joinToString("\n") {
            " * `${it.value}`: ${it.documentation}"
        }

        return "${description.removeSuffix(".")}. Available options:\n\n$choicesEnumerated"
    }
}

