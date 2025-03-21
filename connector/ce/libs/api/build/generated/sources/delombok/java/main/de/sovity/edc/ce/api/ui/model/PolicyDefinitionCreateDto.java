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
import de.sovity.edc.ce.api.common.model.UiPolicyExpression;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Create a Policy Definition")
public class PolicyDefinitionCreateDto {
    @Schema(description = "Policy Definition ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String policyDefinitionId;
    @Schema(description = "Policy Expression", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiPolicyExpression expression;


    public static class PolicyDefinitionCreateDtoBuilder {
        private String policyDefinitionId;
        private UiPolicyExpression expression;

        PolicyDefinitionCreateDtoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder policyDefinitionId(final String policyDefinitionId) {
            this.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder expression(final UiPolicyExpression expression) {
            this.expression = expression;
            return this;
        }

        public PolicyDefinitionCreateDto build() {
            return new PolicyDefinitionCreateDto(this.policyDefinitionId, this.expression);
        }

        @Override
        public String toString() {
            return "PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder(policyDefinitionId=" + this.policyDefinitionId + ", expression=" + this.expression + ")";
        }
    }

    public static PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder builder() {
        return new PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder();
    }

    public PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder toBuilder() {
        return new PolicyDefinitionCreateDto.PolicyDefinitionCreateDtoBuilder().policyDefinitionId(this.policyDefinitionId).expression(this.expression);
    }

    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    public UiPolicyExpression getExpression() {
        return this.expression;
    }

    public void setPolicyDefinitionId(final String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public void setExpression(final UiPolicyExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolicyDefinitionCreateDto)) return false;
        final PolicyDefinitionCreateDto other = (PolicyDefinitionCreateDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$policyDefinitionId = this.getPolicyDefinitionId();
        final Object other$policyDefinitionId = other.getPolicyDefinitionId();
        if (this$policyDefinitionId == null ? other$policyDefinitionId != null : !this$policyDefinitionId.equals(other$policyDefinitionId)) return false;
        final Object this$expression = this.getExpression();
        final Object other$expression = other.getExpression();
        if (this$expression == null ? other$expression != null : !this$expression.equals(other$expression)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PolicyDefinitionCreateDto;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $policyDefinitionId = this.getPolicyDefinitionId();
        result = result * PRIME + ($policyDefinitionId == null ? 43 : $policyDefinitionId.hashCode());
        final Object $expression = this.getExpression();
        result = result * PRIME + ($expression == null ? 43 : $expression.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PolicyDefinitionCreateDto(policyDefinitionId=" + this.getPolicyDefinitionId() + ", expression=" + this.getExpression() + ")";
    }

    public PolicyDefinitionCreateDto(final String policyDefinitionId, final UiPolicyExpression expression) {
        this.policyDefinitionId = policyDefinitionId;
        this.expression = expression;
    }

    public PolicyDefinitionCreateDto() {
    }
}
