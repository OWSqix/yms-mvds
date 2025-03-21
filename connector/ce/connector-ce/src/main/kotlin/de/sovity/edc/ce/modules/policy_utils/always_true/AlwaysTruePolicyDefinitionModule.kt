/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.policy_utils.always_true

import de.sovity.edc.runtime.modules.model.EdcModule

object AlwaysTruePolicyDefinitionModule {
    fun instance() = EdcModule(
        name = "always-true-policy-definition",
        documentation = "Adds the policy definition 'always-true' to the EDC."
    ).apply {
        serviceExtensions(AlwaysTruePolicyDefinitionExtension::class.java)
    }
}
