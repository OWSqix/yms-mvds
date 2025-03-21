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
 * Documented expression / function
 *
 * Used to ensure each requiredFn or defaultValueFn has a human readable
 * documentation string
 */
data class DocumentedFn<A, B>(
    /**
     * Documentation in Markdown
     *
     * Required to explain what the function does in our generated docs
     */
    val documentation: String,

    /**
     * The function
     */
    val fn: (a: A) -> B
)
