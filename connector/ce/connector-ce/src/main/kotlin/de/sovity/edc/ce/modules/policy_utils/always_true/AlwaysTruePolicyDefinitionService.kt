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

import org.eclipse.edc.connector.controlplane.policy.spi.PolicyDefinition
import org.eclipse.edc.connector.controlplane.services.spi.policydefinition.PolicyDefinitionService
import org.eclipse.edc.policy.model.Action
import org.eclipse.edc.policy.model.Permission
import org.eclipse.edc.policy.model.Policy

/**
 * Creates policy definition "always-true".
 */
class AlwaysTruePolicyDefinitionService(private val policyDefinitionService: PolicyDefinitionService) {
    /**
     * Checks if policy definition "always-true" exists
     *
     * @return if exists
     */
    fun exists(): Boolean =
        policyDefinitionService.findById(AlwaysTruePolicyConstants.POLICY_DEFINITION_ID) != null

    /**
     * Creates policy definition "always-true".
     */
    fun create() {
        val alwaysTruePermission = Permission.Builder.newInstance()
            .action(Action.Builder.newInstance().type("USE").build())
            .build()
        val policy = Policy.Builder.newInstance()
            .permission(alwaysTruePermission)
            .build()
        val policyDefinition = PolicyDefinition.Builder.newInstance()
            .id(AlwaysTruePolicyConstants.POLICY_DEFINITION_ID)
            .policy(policy)
            .build()
        policyDefinitionService.create(policyDefinition)
    }
}
