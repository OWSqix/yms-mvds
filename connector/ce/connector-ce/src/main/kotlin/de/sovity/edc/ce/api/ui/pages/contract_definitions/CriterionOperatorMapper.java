/*
 *  Copyright (c) 2024 sovity GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 */
package de.sovity.edc.ce.api.ui.pages.contract_definitions;


import de.sovity.edc.ce.api.ui.model.UiCriterionOperator;
import de.sovity.edc.ce.api.utils.MapUtils;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.RequiredArgsConstructor;

import java.util.Map;

import static java.util.Objects.requireNonNull;

@RequiredArgsConstructor
@Service
public class CriterionOperatorMapper {
    /**
     * @see org.eclipse.edc.connector.controlplane.defaults.storage.CriterionToPredicateConverterImpl
     */
    private final Map<UiCriterionOperator, String> mappings = Map.of(
        UiCriterionOperator.EQ, "=",
        UiCriterionOperator.LIKE, "like",
        UiCriterionOperator.IN, "in"
    );

    private final Map<String, UiCriterionOperator> reverseMappings = MapUtils.reverse(mappings);

    public String getCriterionOperator(UiCriterionOperator operator) {
        String result = mappings.get(operator);
        return requireNonNull(result, () -> "Unhandled %s: %s".formatted(
            UiCriterionOperator.class.getName(), operator));
    }

    public UiCriterionOperator getUiCriterionOperator(String operator) {
        UiCriterionOperator result = reverseMappings.get(operator == null ? null : operator.toLowerCase());
        return requireNonNull(result, () -> "Could not find %s for: %s".formatted(
            UiCriterionOperator.class.getName(), operator));
    }
}
