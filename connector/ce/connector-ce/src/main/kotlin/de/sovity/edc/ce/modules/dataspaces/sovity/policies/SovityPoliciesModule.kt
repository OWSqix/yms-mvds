/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.modules.dataspaces.sovity.policies

import de.sovity.edc.ce.modules.dataspaces.sovity.policies.evaluation_time.EvaluationTimePolicyExtension
import de.sovity.edc.ce.modules.dataspaces.sovity.policies.referring_connector.ReferringConnectorPolicyExtension
import de.sovity.edc.runtime.modules.model.EdcModule

object SovityPoliciesModule {
    fun instance() = EdcModule(
        name = "sovity-policies",
        documentation = "Policies for sovity dataspaces"
    ).apply {
        serviceExtensions(
            // Policies
            EvaluationTimePolicyExtension::class.java,
            ReferringConnectorPolicyExtension::class.java,
        )
    }
}
