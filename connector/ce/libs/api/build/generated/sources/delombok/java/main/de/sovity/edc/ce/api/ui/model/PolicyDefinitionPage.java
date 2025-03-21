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
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "All data for the policy definition page as required by the UI", requiredMode = Schema.RequiredMode.REQUIRED)
public class PolicyDefinitionPage {
    @Schema(description = "Policy Definition Entries", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<PolicyDefinitionDto> policies;


    public static class PolicyDefinitionPageBuilder {
        private List<PolicyDefinitionDto> policies;

        PolicyDefinitionPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public PolicyDefinitionPage.PolicyDefinitionPageBuilder policies(final List<PolicyDefinitionDto> policies) {
            this.policies = policies;
            return this;
        }

        public PolicyDefinitionPage build() {
            return new PolicyDefinitionPage(this.policies);
        }

        @Override
        public String toString() {
            return "PolicyDefinitionPage.PolicyDefinitionPageBuilder(policies=" + this.policies + ")";
        }
    }

    public static PolicyDefinitionPage.PolicyDefinitionPageBuilder builder() {
        return new PolicyDefinitionPage.PolicyDefinitionPageBuilder();
    }

    public PolicyDefinitionPage.PolicyDefinitionPageBuilder toBuilder() {
        return new PolicyDefinitionPage.PolicyDefinitionPageBuilder().policies(this.policies);
    }

    public List<PolicyDefinitionDto> getPolicies() {
        return this.policies;
    }

    public void setPolicies(final List<PolicyDefinitionDto> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PolicyDefinitionPage)) return false;
        final PolicyDefinitionPage other = (PolicyDefinitionPage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$policies = this.getPolicies();
        final Object other$policies = other.getPolicies();
        if (this$policies == null ? other$policies != null : !this$policies.equals(other$policies)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PolicyDefinitionPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $policies = this.getPolicies();
        result = result * PRIME + ($policies == null ? 43 : $policies.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PolicyDefinitionPage(policies=" + this.getPolicies() + ")";
    }

    public PolicyDefinitionPage(final List<PolicyDefinitionDto> policies) {
        this.policies = policies;
    }

    public PolicyDefinitionPage() {
    }
}
