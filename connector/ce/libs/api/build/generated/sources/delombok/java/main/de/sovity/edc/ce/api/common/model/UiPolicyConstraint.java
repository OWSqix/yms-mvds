/*
 * Copyright 2025 sovity GmbH
 * Copyright 2023 Fraunhofer-Institut für Software- und Systemtechnik ISST
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
 *     Fraunhofer ISST - initial implementation of an unified workflow for creating data offerings
 */
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "ODRL AtomicConstraint as supported by the sovity product landscape. For example \'a EQ b\', \'c IN [d, e, f]\'")
public class UiPolicyConstraint {
    @Schema(description = "Left side of the expression.", requiredMode = RequiredMode.REQUIRED)
    private String left;
    @Schema(description = "Operator, e.g. EQ", requiredMode = RequiredMode.REQUIRED)
    private OperatorDto operator;
    @Schema(description = "Right side of the expression", requiredMode = RequiredMode.REQUIRED)
    private UiPolicyLiteral right;


    public static class UiPolicyConstraintBuilder {
        private String left;
        private OperatorDto operator;
        private UiPolicyLiteral right;

        UiPolicyConstraintBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyConstraint.UiPolicyConstraintBuilder left(final String left) {
            this.left = left;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyConstraint.UiPolicyConstraintBuilder operator(final OperatorDto operator) {
            this.operator = operator;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyConstraint.UiPolicyConstraintBuilder right(final UiPolicyLiteral right) {
            this.right = right;
            return this;
        }

        public UiPolicyConstraint build() {
            return new UiPolicyConstraint(this.left, this.operator, this.right);
        }

        @Override
        public String toString() {
            return "UiPolicyConstraint.UiPolicyConstraintBuilder(left=" + this.left + ", operator=" + this.operator + ", right=" + this.right + ")";
        }
    }

    public static UiPolicyConstraint.UiPolicyConstraintBuilder builder() {
        return new UiPolicyConstraint.UiPolicyConstraintBuilder();
    }

    public UiPolicyConstraint.UiPolicyConstraintBuilder toBuilder() {
        return new UiPolicyConstraint.UiPolicyConstraintBuilder().left(this.left).operator(this.operator).right(this.right);
    }

    public String getLeft() {
        return this.left;
    }

    public OperatorDto getOperator() {
        return this.operator;
    }

    public UiPolicyLiteral getRight() {
        return this.right;
    }

    public void setLeft(final String left) {
        this.left = left;
    }

    public void setOperator(final OperatorDto operator) {
        this.operator = operator;
    }

    public void setRight(final UiPolicyLiteral right) {
        this.right = right;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiPolicyConstraint)) return false;
        final UiPolicyConstraint other = (UiPolicyConstraint) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$left = this.getLeft();
        final Object other$left = other.getLeft();
        if (this$left == null ? other$left != null : !this$left.equals(other$left)) return false;
        final Object this$operator = this.getOperator();
        final Object other$operator = other.getOperator();
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) return false;
        final Object this$right = this.getRight();
        final Object other$right = other.getRight();
        if (this$right == null ? other$right != null : !this$right.equals(other$right)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiPolicyConstraint;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $left = this.getLeft();
        result = result * PRIME + ($left == null ? 43 : $left.hashCode());
        final Object $operator = this.getOperator();
        result = result * PRIME + ($operator == null ? 43 : $operator.hashCode());
        final Object $right = this.getRight();
        result = result * PRIME + ($right == null ? 43 : $right.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiPolicyConstraint(left=" + this.getLeft() + ", operator=" + this.getOperator() + ", right=" + this.getRight() + ")";
    }

    public UiPolicyConstraint(final String left, final OperatorDto operator, final UiPolicyLiteral right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public UiPolicyConstraint() {
    }
}
