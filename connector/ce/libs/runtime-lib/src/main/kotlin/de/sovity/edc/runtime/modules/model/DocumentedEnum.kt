/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.model

/**
 * Enums that implement this interface can be directly used to specify the available values for a [ConfigProp].
 */
interface DocumentedEnum {
    val documentation: String
    val name: String

    fun isSelectedOption(rawValue: String?): Boolean = name == (rawValue ?: "").uppercase()
        .replace(" ", "_")
        .replace("-", "_")
        .replace(".", "_")

    val nameKebabCase get() = name.lowercase().replace("_", "-")
}
