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


import de.sovity.edc.ce.api.ui.model.UiCriterion;
import de.sovity.edc.runtime.simple_di.Service;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.eclipse.edc.spi.query.Criterion;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class CriterionMapper {
    private final CriterionOperatorMapper criterionOperatorMapper;
    private final CriterionLiteralMapper criterionLiteralMapper;

    public List<UiCriterion> buildUiCriteria(@NonNull List<Criterion> criteria) {
        return criteria.stream().filter(Objects::nonNull).map(this::buildUiCriterion).toList();
    }

    public UiCriterion buildUiCriterion(Criterion criterion) {
        var operandLeft = String.valueOf(criterion.getOperandLeft());
        var operator = criterionOperatorMapper.getUiCriterionOperator(criterion.getOperator());
        var operandRight = criterionLiteralMapper.buildUiCriterionLiteral(criterion.getOperandRight());

        return new UiCriterion(operandLeft, operator, operandRight);
    }

    public List<Criterion> buildCriteria(@NonNull List<UiCriterion> criteria) {
        return criteria.stream().filter(Objects::nonNull).map(this::buildCriterion).toList();
    }

    public Criterion buildCriterion(@NonNull UiCriterion criterionDto) {
        var operandLeft = criterionDto.getOperandLeft();
        var operator = criterionOperatorMapper.getCriterionOperator(criterionDto.getOperator());
        var operandRight = criterionLiteralMapper.getValue(criterionDto.getOperandRight());

        return new Criterion(operandLeft, operator, operandRight);
    }
}
