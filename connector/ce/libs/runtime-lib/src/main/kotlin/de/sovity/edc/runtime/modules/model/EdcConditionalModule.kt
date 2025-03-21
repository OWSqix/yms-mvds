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

import org.eclipse.edc.spi.system.configuration.Config

class EdcConditionalModule(
    val condition: DocumentedFn<Config, Boolean>,
    val module: EdcModule,

    /**
     * Might differ from the module documentation in cases where we use a [DocumentedEnum]-backed config property
     * that activates multiple modules, e.g. sovity.dataspace.kind=catena-x
     */
    val documentation: String,
)
