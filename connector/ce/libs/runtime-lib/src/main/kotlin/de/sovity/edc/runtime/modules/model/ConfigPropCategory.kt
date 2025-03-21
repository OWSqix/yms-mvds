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
 * Only for Documentation Generation
 */
enum class ConfigPropCategory(val documentationName: String, val order: Int) {
    IMPORTANT("Important Config", 0),
    OPTIONAL("Optional Config", 1),
    OVERRIDES("Overrides / Ignore", 2),
    UNKNOWN("Unknown", 9999)
}
