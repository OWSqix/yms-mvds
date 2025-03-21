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
@Schema(description = "Data for creating a Contract Definition")
public class ContractDefinitionRequest {
    @Schema(description = "Contract Definition ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractDefinitionId;
    @Schema(description = "Contract Policy ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractPolicyId;
    @Schema(description = "Access Policy ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String accessPolicyId;
    @Schema(description = "List of Criteria for the contract", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<UiCriterion> assetSelector;


    public static class ContractDefinitionRequestBuilder {
        private String contractDefinitionId;
        private String contractPolicyId;
        private String accessPolicyId;
        private List<UiCriterion> assetSelector;

        ContractDefinitionRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionRequest.ContractDefinitionRequestBuilder contractDefinitionId(final String contractDefinitionId) {
            this.contractDefinitionId = contractDefinitionId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionRequest.ContractDefinitionRequestBuilder contractPolicyId(final String contractPolicyId) {
            this.contractPolicyId = contractPolicyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionRequest.ContractDefinitionRequestBuilder accessPolicyId(final String accessPolicyId) {
            this.accessPolicyId = accessPolicyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionRequest.ContractDefinitionRequestBuilder assetSelector(final List<UiCriterion> assetSelector) {
            this.assetSelector = assetSelector;
            return this;
        }

        public ContractDefinitionRequest build() {
            return new ContractDefinitionRequest(this.contractDefinitionId, this.contractPolicyId, this.accessPolicyId, this.assetSelector);
        }

        @Override
        public String toString() {
            return "ContractDefinitionRequest.ContractDefinitionRequestBuilder(contractDefinitionId=" + this.contractDefinitionId + ", contractPolicyId=" + this.contractPolicyId + ", accessPolicyId=" + this.accessPolicyId + ", assetSelector=" + this.assetSelector + ")";
        }
    }

    public static ContractDefinitionRequest.ContractDefinitionRequestBuilder builder() {
        return new ContractDefinitionRequest.ContractDefinitionRequestBuilder();
    }

    public ContractDefinitionRequest.ContractDefinitionRequestBuilder toBuilder() {
        return new ContractDefinitionRequest.ContractDefinitionRequestBuilder().contractDefinitionId(this.contractDefinitionId).contractPolicyId(this.contractPolicyId).accessPolicyId(this.accessPolicyId).assetSelector(this.assetSelector);
    }

    public String getContractDefinitionId() {
        return this.contractDefinitionId;
    }

    public String getContractPolicyId() {
        return this.contractPolicyId;
    }

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    public List<UiCriterion> getAssetSelector() {
        return this.assetSelector;
    }

    public void setContractDefinitionId(final String contractDefinitionId) {
        this.contractDefinitionId = contractDefinitionId;
    }

    public void setContractPolicyId(final String contractPolicyId) {
        this.contractPolicyId = contractPolicyId;
    }

    public void setAccessPolicyId(final String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    public void setAssetSelector(final List<UiCriterion> assetSelector) {
        this.assetSelector = assetSelector;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractDefinitionRequest)) return false;
        final ContractDefinitionRequest other = (ContractDefinitionRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractDefinitionId = this.getContractDefinitionId();
        final Object other$contractDefinitionId = other.getContractDefinitionId();
        if (this$contractDefinitionId == null ? other$contractDefinitionId != null : !this$contractDefinitionId.equals(other$contractDefinitionId)) return false;
        final Object this$contractPolicyId = this.getContractPolicyId();
        final Object other$contractPolicyId = other.getContractPolicyId();
        if (this$contractPolicyId == null ? other$contractPolicyId != null : !this$contractPolicyId.equals(other$contractPolicyId)) return false;
        final Object this$accessPolicyId = this.getAccessPolicyId();
        final Object other$accessPolicyId = other.getAccessPolicyId();
        if (this$accessPolicyId == null ? other$accessPolicyId != null : !this$accessPolicyId.equals(other$accessPolicyId)) return false;
        final Object this$assetSelector = this.getAssetSelector();
        final Object other$assetSelector = other.getAssetSelector();
        if (this$assetSelector == null ? other$assetSelector != null : !this$assetSelector.equals(other$assetSelector)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractDefinitionRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractDefinitionId = this.getContractDefinitionId();
        result = result * PRIME + ($contractDefinitionId == null ? 43 : $contractDefinitionId.hashCode());
        final Object $contractPolicyId = this.getContractPolicyId();
        result = result * PRIME + ($contractPolicyId == null ? 43 : $contractPolicyId.hashCode());
        final Object $accessPolicyId = this.getAccessPolicyId();
        result = result * PRIME + ($accessPolicyId == null ? 43 : $accessPolicyId.hashCode());
        final Object $assetSelector = this.getAssetSelector();
        result = result * PRIME + ($assetSelector == null ? 43 : $assetSelector.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractDefinitionRequest(contractDefinitionId=" + this.getContractDefinitionId() + ", contractPolicyId=" + this.getContractPolicyId() + ", accessPolicyId=" + this.getAccessPolicyId() + ", assetSelector=" + this.getAssetSelector() + ")";
    }

    public ContractDefinitionRequest(final String contractDefinitionId, final String contractPolicyId, final String accessPolicyId, final List<UiCriterion> assetSelector) {
        this.contractDefinitionId = contractDefinitionId;
        this.contractPolicyId = contractPolicyId;
        this.accessPolicyId = accessPolicyId;
        this.assetSelector = assetSelector;
    }

    public ContractDefinitionRequest() {
    }
}
