/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.test_utils

import de.sovity.edc.ce.dependency_bundles.CeDependencyBundles
import de.sovity.edc.ce.modules.config_utils.ConfigUtilsModule
import de.sovity.edc.runtime.modules.model.EdcModule

object TestBackendModule {
    fun instance() = EdcModule(
        name = "e2e-test-backend",
        documentation = "EDC Test Backend"
    ).apply {
        dependencyBundle(CeDependencyBundles.testBackend)
        modules(ConfigUtilsModule.instance())
        serviceExtensions(TestBackendExtension::class.java)
    }
}
