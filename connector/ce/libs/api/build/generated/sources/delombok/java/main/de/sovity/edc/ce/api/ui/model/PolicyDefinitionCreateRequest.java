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
package de.sovity.edc.ce.api.ui.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import de.sovity.edc.ce.api.common.model.UiPolicyCreateRequest;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Deprecated
@Schema(description = "[Deprecated] Create a Policy Definition. Use PolicyDefinitionCreateDto", deprecated = true)
public class PolicyDefinitionCreateRequest {
    @Schema(description = "Policy Definition ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String policyDefinitionId;
    @Schema(description = "[Deprecated] Conjunction of constraints (simplified UiPolicyExpression)", requiredMode = Schema.RequiredMode.REQUIRED, deprecated = true)
    private UiPolicyCreateRequest policy;


    public static class PolicyDefinitionCreateRequestBuilder {
        private String policyDefinitionId;
        private UiPolicyCreateRequest policy;

        PolicyDefinitionCreateRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder policyDefinitionId(final String policyDefinitionId) {
            this.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder policy(final UiPolicyCreateRequest policy) {
            this.policy = policy;
            return this;
        }

        public PolicyDefinitionCreateRequest build() {
            return new PolicyDefinitionCreateRequest(this.policyDefinitionId, this.policy);
        }

        @Override
        public String toString() {
            return "PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder(policyDefinitionId=" + this.policyDefinitionId + ", policy=" + this.policy + ")";
        }
    }

    public static PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder builder() {
        return new PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder();
    }

    public PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder toBuilder() {
        return new PolicyDefinitionCreateRequest.PolicyDefinitionCreateRequestBuilder().policyDefinitionId(this.policyDefinitionId).policy(this.policy);
    }

    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    public UiPolicyCreateRequest getPolicy() {
        return this.policy;
    }

    public void setPolicyDefinitionId(final String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public void setPolicy(final UiPolicyCreateRequest policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolicyDefinitionCreateRequest)) return false;
        final PolicyDefinitionCreateRequest other = (PolicyDefinitionCreateRequest) o;
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
        return other instanceof PolicyDefinitionCreateRequest;
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
        return "PolicyDefinitionCreateRequest(policyDefinitionId=" + this.getPolicyDefinitionId() + ", policy=" + this.getPolicy() + ")";
    }

    public PolicyDefinitionCreateRequest(final String policyDefinitionId, final UiPolicyCreateRequest policy) {
        this.policyDefinitionId = policyDefinitionId;
        this.policy = policy;
    }

    public PolicyDefinitionCreateRequest() {
    }
}
