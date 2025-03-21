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
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "ODRL constraint as supported by the sovity product landscape")
public class UiPolicyExpression {
    @Schema(description = "Expression type", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiPolicyExpressionType type;
    @Schema(description = "Only for types AND, OR, XONE. List of sub-expressions " + "to be evaluated according to the expressionType.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<UiPolicyExpression> expressions;
    @Schema(description = "Only for type CONSTRAINT. A single constraint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private UiPolicyConstraint constraint;

    public static UiPolicyExpression empty() {
        return UiPolicyExpression.builder().type(UiPolicyExpressionType.EMPTY).build();
    }

    public static UiPolicyExpression constraint(UiPolicyConstraint constraint) {
        return UiPolicyExpression.builder().type(UiPolicyExpressionType.CONSTRAINT).constraint(constraint).build();
    }

    public static UiPolicyExpression and(List<UiPolicyExpression> expressions) {
        return UiPolicyExpression.builder().type(UiPolicyExpressionType.AND).expressions(expressions).build();
    }

    public static UiPolicyExpression or(List<UiPolicyExpression> expressions) {
        return UiPolicyExpression.builder().type(UiPolicyExpressionType.OR).expressions(expressions).build();
    }

    public static UiPolicyExpression xone(List<UiPolicyExpression> expressions) {
        return UiPolicyExpression.builder().type(UiPolicyExpressionType.XONE).expressions(expressions).build();
    }


    public static class UiPolicyExpressionBuilder {
        private UiPolicyExpressionType type;
        private List<UiPolicyExpression> expressions;
        private UiPolicyConstraint constraint;

        UiPolicyExpressionBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyExpression.UiPolicyExpressionBuilder type(final UiPolicyExpressionType type) {
            this.type = type;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyExpression.UiPolicyExpressionBuilder expressions(final List<UiPolicyExpression> expressions) {
            this.expressions = expressions;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyExpression.UiPolicyExpressionBuilder constraint(final UiPolicyConstraint constraint) {
            this.constraint = constraint;
            return this;
        }

        public UiPolicyExpression build() {
            return new UiPolicyExpression(this.type, this.expressions, this.constraint);
        }

        @Override
        public String toString() {
            return "UiPolicyExpression.UiPolicyExpressionBuilder(type=" + this.type + ", expressions=" + this.expressions + ", constraint=" + this.constraint + ")";
        }
    }

    public static UiPolicyExpression.UiPolicyExpressionBuilder builder() {
        return new UiPolicyExpression.UiPolicyExpressionBuilder();
    }

    public UiPolicyExpression.UiPolicyExpressionBuilder toBuilder() {
        return new UiPolicyExpression.UiPolicyExpressionBuilder().type(this.type).expressions(this.expressions).constraint(this.constraint);
    }

    public UiPolicyExpressionType getType() {
        return this.type;
    }

    public List<UiPolicyExpression> getExpressions() {
        return this.expressions;
    }

    public UiPolicyConstraint getConstraint() {
        return this.constraint;
    }

    public void setType(final UiPolicyExpressionType type) {
        this.type = type;
    }

    public void setExpressions(final List<UiPolicyExpression> expressions) {
        this.expressions = expressions;
    }

    public void setConstraint(final UiPolicyConstraint constraint) {
        this.constraint = constraint;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiPolicyExpression)) return false;
        final UiPolicyExpression other = (UiPolicyExpression) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$expressions = this.getExpressions();
        final Object other$expressions = other.getExpressions();
        if (this$expressions == null ? other$expressions != null : !this$expressions.equals(other$expressions)) return false;
        final Object this$constraint = this.getConstraint();
        final Object other$constraint = other.getConstraint();
        if (this$constraint == null ? other$constraint != null : !this$constraint.equals(other$constraint)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiPolicyExpression;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $expressions = this.getExpressions();
        result = result * PRIME + ($expressions == null ? 43 : $expressions.hashCode());
        final Object $constraint = this.getConstraint();
        result = result * PRIME + ($constraint == null ? 43 : $constraint.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiPolicyExpression(type=" + this.getType() + ", expressions=" + this.getExpressions() + ", constraint=" + this.getConstraint() + ")";
    }

    public UiPolicyExpression(final UiPolicyExpressionType type, final List<UiPolicyExpression> expressions, final UiPolicyConstraint constraint) {
        this.type = type;
        this.expressions = expressions;
        this.constraint = constraint;
    }

    public UiPolicyExpression() {
    }
}
