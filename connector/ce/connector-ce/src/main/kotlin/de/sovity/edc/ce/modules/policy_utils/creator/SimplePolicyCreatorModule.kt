/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.policy_utils.creator

import de.sovity.edc.runtime.modules.model.EdcModule

object SimplePolicyCreatorModule {
    fun instance() = EdcModule(
        name = "simple-policy-creator",
        documentation = "Helps you extend the EDC with custom policies that support most operators"
    ).apply {
        serviceExtensions(SimplePolicyCreatorExtension::class.java)
    }
}
