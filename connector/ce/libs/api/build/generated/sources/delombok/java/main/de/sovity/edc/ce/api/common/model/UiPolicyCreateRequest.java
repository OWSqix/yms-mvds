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
@Deprecated
@Schema(description = "[Deprecated] Conjunction of constraints (simplified UiPolicyExpression)", deprecated = true)
public class UiPolicyCreateRequest {
    @Schema(description = "Conjunction of required constraints", deprecated = true)
    private List<UiPolicyConstraint> constraints;


    public static class UiPolicyCreateRequestBuilder {
        private List<UiPolicyConstraint> constraints;

        UiPolicyCreateRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiPolicyCreateRequest.UiPolicyCreateRequestBuilder constraints(final List<UiPolicyConstraint> constraints) {
            this.constraints = constraints;
            return this;
        }

        public UiPolicyCreateRequest build() {
            return new UiPolicyCreateRequest(this.constraints);
        }

        @Override
        public String toString() {
            return "UiPolicyCreateRequest.UiPolicyCreateRequestBuilder(constraints=" + this.constraints + ")";
        }
    }

    public static UiPolicyCreateRequest.UiPolicyCreateRequestBuilder builder() {
        return new UiPolicyCreateRequest.UiPolicyCreateRequestBuilder();
    }

    public UiPolicyCreateRequest.UiPolicyCreateRequestBuilder toBuilder() {
        return new UiPolicyCreateRequest.UiPolicyCreateRequestBuilder().constraints(this.constraints);
    }

    public List<UiPolicyConstraint> getConstraints() {
        return this.constraints;
    }

    public void setConstraints(final List<UiPolicyConstraint> constraints) {
        this.constraints = constraints;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiPolicyCreateRequest)) return false;
        final UiPolicyCreateRequest other = (UiPolicyCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$constraints = this.getConstraints();
        final Object other$constraints = other.getConstraints();
        if (this$constraints == null ? other$constraints != null : !this$constraints.equals(other$constraints)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiPolicyCreateRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $constraints = this.getConstraints();
        result = result * PRIME + ($constraints == null ? 43 : $constraints.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiPolicyCreateRequest(constraints=" + this.getConstraints() + ")";
    }

    public UiPolicyCreateRequest(final List<UiPolicyConstraint> constraints) {
        this.constraints = constraints;
    }

    public UiPolicyCreateRequest() {
    }
}
