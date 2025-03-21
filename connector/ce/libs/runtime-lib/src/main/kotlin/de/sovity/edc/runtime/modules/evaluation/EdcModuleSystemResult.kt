/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.runtime.modules.evaluation

import de.sovity.edc.runtime.modules.dependency_bundles.ServiceClassRegistry
import de.sovity.edc.runtime.modules.model.EdcModule
import org.eclipse.edc.spi.system.configuration.Config

class EdcModuleSystemResult(
    val activeModules: List<EdcModule>,
    val evaluatedConfig: Config
) {
    val serviceClasses = ServiceClassRegistry(activeModules.map { it.getServices() })
}
