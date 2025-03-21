/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.usecase.services;

import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.policy.engine.spi.PolicyEngine;

import java.util.List;
import java.util.Map;

import static de.sovity.edc.ce.api.utils.FieldAccessUtils.accessField;

@RequiredArgsConstructor
@Service
public class SupportedPolicyApiService {
    private final PolicyEngine policyEngine;

    public List<String> getSupportedFunctions() {
        Map<String, List<Object>> constraintFunctions = accessField(policyEngine, "constraintFunctions");
        return constraintFunctions.values().stream().flatMap(List::stream)
            .map(it -> (String) accessField(it, "key"))
            .distinct()
            .sorted()
            .toList();
    }
}
