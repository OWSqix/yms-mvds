/*
 * Copyright 2025 sovity GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     sovity - init and continued development
 */
package de.sovity.edc.ce.api.ui.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Contract Definition Criterion as supported by the UI")
public class UiCriterion {
    @Schema(description = "Left Operand", requiredMode = Schema.RequiredMode.REQUIRED)
    private String operandLeft;
    @Schema(description = "Operator", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiCriterionOperator operator;
    @Schema(description = "Right Operand", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiCriterionLiteral operandRight;


    public static class UiCriterionBuilder {
        private String operandLeft;
        private UiCriterionOperator operator;
        private UiCriterionLiteral operandRight;

        UiCriterionBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiCriterion.UiCriterionBuilder operandLeft(final String operandLeft) {
            this.operandLeft = operandLeft;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiCriterion.UiCriterionBuilder operator(final UiCriterionOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiCriterion.UiCriterionBuilder operandRight(final UiCriterionLiteral operandRight) {
            this.operandRight = operandRight;
            return this;
        }

        public UiCriterion build() {
            return new UiCriterion(this.operandLeft, this.operator, this.operandRight);
        }

        @Override
        public String toString() {
            return "UiCriterion.UiCriterionBuilder(operandLeft=" + this.operandLeft + ", operator=" + this.operator + ", operandRight=" + this.operandRight + ")";
        }
    }

    public static UiCriterion.UiCriterionBuilder builder() {
        return new UiCriterion.UiCriterionBuilder();
    }

    public UiCriterion.UiCriterionBuilder toBuilder() {
        return new UiCriterion.UiCriterionBuilder().operandLeft(this.operandLeft).operator(this.operator).operandRight(this.operandRight);
    }

    public String getOperandLeft() {
        return this.operandLeft;
    }

    public UiCriterionOperator getOperator() {
        return this.operator;
    }

    public UiCriterionLiteral getOperandRight() {
        return this.operandRight;
    }

    public void setOperandLeft(final String operandLeft) {
        this.operandLeft = operandLeft;
    }

    public void setOperator(final UiCriterionOperator operator) {
        this.operator = operator;
    }

    public void setOperandRight(final UiCriterionLiteral operandRight) {
        this.operandRight = operandRight;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiCriterion)) return false;
        final UiCriterion other = (UiCriterion) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$operandLeft = this.getOperandLeft();
        final Object other$operandLeft = other.getOperandLeft();
        if (this$operandLeft == null ? other$operandLeft != null : !this$operandLeft.equals(other$operandLeft)) return false;
        final Object this$operator = this.getOperator();
        final Object other$operator = other.getOperator();
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) return false;
        final Object this$operandRight = this.getOperandRight();
        final Object other$operandRight = other.getOperandRight();
        if (this$operandRight == null ? other$operandRight != null : !this$operandRight.equals(other$operandRight)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiCriterion;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $operandLeft = this.getOperandLeft();
        result = result * PRIME + ($operandLeft == null ? 43 : $operandLeft.hashCode());
        final Object $operator = this.getOperator();
        result = result * PRIME + ($operator == null ? 43 : $operator.hashCode());
        final Object $operandRight = this.getOperandRight();
        result = result * PRIME + ($operandRight == null ? 43 : $operandRight.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiCriterion(operandLeft=" + this.getOperandLeft() + ", operator=" + this.getOperator() + ", operandRight=" + this.getOperandRight() + ")";
    }

    public UiCriterion(final String operandLeft, final UiCriterionOperator operator, final UiCriterionLiteral operandRight) {
        this.operandLeft = operandLeft;
        this.operator = operator;
        this.operandRight = operandRight;
    }

    public UiCriterion() {
    }
}
