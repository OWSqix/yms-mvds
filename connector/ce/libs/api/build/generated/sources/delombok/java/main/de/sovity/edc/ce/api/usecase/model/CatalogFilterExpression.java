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
package de.sovity.edc.ce.api.usecase.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import de.sovity.edc.utils.jsonld.vocab.Prop;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Generic expression for filtering the data offers in the catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
public class CatalogFilterExpression {
    @Schema(description = "Asset property name", requiredMode = Schema.RequiredMode.REQUIRED, example = Prop.Edc.ASSET_ID)
    private String operandLeft;
    @Schema(description = "Operator", requiredMode = Schema.RequiredMode.REQUIRED)
    private CatalogFilterExpressionOperator operator;
    @Schema(description = "Right Operand", requiredMode = Schema.RequiredMode.REQUIRED)
    private CatalogFilterExpressionLiteral operandRight;


    public static class CatalogFilterExpressionBuilder {
        private String operandLeft;
        private CatalogFilterExpressionOperator operator;
        private CatalogFilterExpressionLiteral operandRight;

        CatalogFilterExpressionBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpression.CatalogFilterExpressionBuilder operandLeft(final String operandLeft) {
            this.operandLeft = operandLeft;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpression.CatalogFilterExpressionBuilder operator(final CatalogFilterExpressionOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public CatalogFilterExpression.CatalogFilterExpressionBuilder operandRight(final CatalogFilterExpressionLiteral operandRight) {
            this.operandRight = operandRight;
            return this;
        }

        public CatalogFilterExpression build() {
            return new CatalogFilterExpression(this.operandLeft, this.operator, this.operandRight);
        }

        @Override
        public String toString() {
            return "CatalogFilterExpression.CatalogFilterExpressionBuilder(operandLeft=" + this.operandLeft + ", operator=" + this.operator + ", operandRight=" + this.operandRight + ")";
        }
    }

    public static CatalogFilterExpression.CatalogFilterExpressionBuilder builder() {
        return new CatalogFilterExpression.CatalogFilterExpressionBuilder();
    }

    public CatalogFilterExpression.CatalogFilterExpressionBuilder toBuilder() {
        return new CatalogFilterExpression.CatalogFilterExpressionBuilder().operandLeft(this.operandLeft).operator(this.operator).operandRight(this.operandRight);
    }

    public String getOperandLeft() {
        return this.operandLeft;
    }

    public CatalogFilterExpressionOperator getOperator() {
        return this.operator;
    }

    public CatalogFilterExpressionLiteral getOperandRight() {
        return this.operandRight;
    }

    public void setOperandLeft(final String operandLeft) {
        this.operandLeft = operandLeft;
    }

    public void setOperator(final CatalogFilterExpressionOperator operator) {
        this.operator = operator;
    }

    public void setOperandRight(final CatalogFilterExpressionLiteral operandRight) {
        this.operandRight = operandRight;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CatalogFilterExpression)) return false;
        final CatalogFilterExpression other = (CatalogFilterExpression) o;
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
        return other instanceof CatalogFilterExpression;
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
        return "CatalogFilterExpression(operandLeft=" + this.getOperandLeft() + ", operator=" + this.getOperator() + ", operandRight=" + this.getOperandRight() + ")";
    }

    public CatalogFilterExpression(final String operandLeft, final CatalogFilterExpressionOperator operator, final CatalogFilterExpressionLiteral operandRight) {
        this.operandLeft = operandLeft;
        this.operator = operator;
        this.operandRight = operandRight;
    }

    public CatalogFilterExpression() {
    }
}
