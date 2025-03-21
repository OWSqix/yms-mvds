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
import de.sovity.edc.ce.api.common.model.UiPolicy;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Policy Definition as required for the Policy Definition Page")
public class PolicyDefinitionDto {
    @Schema(description = "Policy Definition ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String policyDefinitionId;
    @Schema(description = "Policy Contents", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiPolicy policy;


    public static class PolicyDefinitionDtoBuilder {
        private String policyDefinitionId;
        private UiPolicy policy;

        PolicyDefinitionDtoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionDto.PolicyDefinitionDtoBuilder policyDefinitionId(final String policyDefinitionId) {
            this.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionDto.PolicyDefinitionDtoBuilder policy(final UiPolicy policy) {
            this.policy = policy;
            return this;
        }

        public PolicyDefinitionDto build() {
            return new PolicyDefinitionDto(this.policyDefinitionId, this.policy);
        }

        @Override
        public String toString() {
            return "PolicyDefinitionDto.PolicyDefinitionDtoBuilder(policyDefinitionId=" + this.policyDefinitionId + ", policy=" + this.policy + ")";
        }
    }

    public static PolicyDefinitionDto.PolicyDefinitionDtoBuilder builder() {
        return new PolicyDefinitionDto.PolicyDefinitionDtoBuilder();
    }

    public PolicyDefinitionDto.PolicyDefinitionDtoBuilder toBuilder() {
        return new PolicyDefinitionDto.PolicyDefinitionDtoBuilder().policyDefinitionId(this.policyDefinitionId).policy(this.policy);
    }

    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    public UiPolicy getPolicy() {
        return this.policy;
    }

    public void setPolicyDefinitionId(final String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public void setPolicy(final UiPolicy policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolicyDefinitionDto)) return false;
        final PolicyDefinitionDto other = (PolicyDefinitionDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$policyDefinitionId = this.getPolicyDefinitionId();
        final Object other$policyDefinitionId = other.getPolicyDefinitionId();
        if (this$policyDefinitionId == null ? other$policyDefinitionId != null : !this$policyDefinitionId.equals(other$policyDefinitionId)) return false;
        final Object this$policy = this.getPolicy();
        final Object other$policy = other.getPolicy();
        if (this$policy == null ? other$policy != null : !this$policy.equals(other$policy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PolicyDefinitionDto;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $policyDefinitionId = this.getPolicyDefinitionId();
        result = result * PRIME + ($policyDefinitionId == null ? 43 : $policyDefinitionId.hashCode());
        final Object $policy = this.getPolicy();
        result = result * PRIME + ($policy == null ? 43 : $policy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PolicyDefinitionDto(policyDefinitionId=" + this.getPolicyDefinitionId() + ", policy=" + this.getPolicy() + ")";
    }

    public PolicyDefinitionDto(final String policyDefinitionId, final UiPolicy policy) {
        this.policyDefinitionId = policyDefinitionId;
        this.policy = policy;
    }

    public PolicyDefinitionDto() {
    }
}
