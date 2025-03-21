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
@Schema(description = "Contract Definition List Entry for Contract Definition Page")
public class ContractDefinitionEntry {
    @Schema(description = "Contract Definition ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractDefinitionId;
    @Schema(description = "Access Policy ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String accessPolicyId;
    @Schema(description = "Contract Policy ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractPolicyId;
    @Schema(description = "Criteria for the contract", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<UiCriterion> assetSelector;


    public static class ContractDefinitionEntryBuilder {
        private String contractDefinitionId;
        private String accessPolicyId;
        private String contractPolicyId;
        private List<UiCriterion> assetSelector;

        ContractDefinitionEntryBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionEntry.ContractDefinitionEntryBuilder contractDefinitionId(final String contractDefinitionId) {
            this.contractDefinitionId = contractDefinitionId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionEntry.ContractDefinitionEntryBuilder accessPolicyId(final String accessPolicyId) {
            this.accessPolicyId = accessPolicyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionEntry.ContractDefinitionEntryBuilder contractPolicyId(final String contractPolicyId) {
            this.contractPolicyId = contractPolicyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionEntry.ContractDefinitionEntryBuilder assetSelector(final List<UiCriterion> assetSelector) {
            this.assetSelector = assetSelector;
            return this;
        }

        public ContractDefinitionEntry build() {
            return new ContractDefinitionEntry(this.contractDefinitionId, this.accessPolicyId, this.contractPolicyId, this.assetSelector);
        }

        @Override
        public String toString() {
            return "ContractDefinitionEntry.ContractDefinitionEntryBuilder(contractDefinitionId=" + this.contractDefinitionId + ", accessPolicyId=" + this.accessPolicyId + ", contractPolicyId=" + this.contractPolicyId + ", assetSelector=" + this.assetSelector + ")";
        }
    }

    public static ContractDefinitionEntry.ContractDefinitionEntryBuilder builder() {
        return new ContractDefinitionEntry.ContractDefinitionEntryBuilder();
    }

    public ContractDefinitionEntry.ContractDefinitionEntryBuilder toBuilder() {
        return new ContractDefinitionEntry.ContractDefinitionEntryBuilder().contractDefinitionId(this.contractDefinitionId).accessPolicyId(this.accessPolicyId).contractPolicyId(this.contractPolicyId).assetSelector(this.assetSelector);
    }

    public String getContractDefinitionId() {
        return this.contractDefinitionId;
    }

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    public String getContractPolicyId() {
        return this.contractPolicyId;
    }

    public List<UiCriterion> getAssetSelector() {
        return this.assetSelector;
    }

    public void setContractDefinitionId(final String contractDefinitionId) {
        this.contractDefinitionId = contractDefinitionId;
    }

    public void setAccessPolicyId(final String accessPolicyId) {
        this.accessPolicyId = accessPolicyId;
    }

    public void setContractPolicyId(final String contractPolicyId) {
        this.contractPolicyId = contractPolicyId;
    }

    public void setAssetSelector(final List<UiCriterion> assetSelector) {
        this.assetSelector = assetSelector;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractDefinitionEntry)) return false;
        final ContractDefinitionEntry other = (ContractDefinitionEntry) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractDefinitionId = this.getContractDefinitionId();
        final Object other$contractDefinitionId = other.getContractDefinitionId();
        if (this$contractDefinitionId == null ? other$contractDefinitionId != null : !this$contractDefinitionId.equals(other$contractDefinitionId)) return false;
        final Object this$accessPolicyId = this.getAccessPolicyId();
        final Object other$accessPolicyId = other.getAccessPolicyId();
        if (this$accessPolicyId == null ? other$accessPolicyId != null : !this$accessPolicyId.equals(other$accessPolicyId)) return false;
        final Object this$contractPolicyId = this.getContractPolicyId();
        final Object other$contractPolicyId = other.getContractPolicyId();
        if (this$contractPolicyId == null ? other$contractPolicyId != null : !this$contractPolicyId.equals(other$contractPolicyId)) return false;
        final Object this$assetSelector = this.getAssetSelector();
        final Object other$assetSelector = other.getAssetSelector();
        if (this$assetSelector == null ? other$assetSelector != null : !this$assetSelector.equals(other$assetSelector)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractDefinitionEntry;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractDefinitionId = this.getContractDefinitionId();
        result = result * PRIME + ($contractDefinitionId == null ? 43 : $contractDefinitionId.hashCode());
        final Object $accessPolicyId = this.getAccessPolicyId();
        result = result * PRIME + ($accessPolicyId == null ? 43 : $accessPolicyId.hashCode());
        final Object $contractPolicyId = this.getContractPolicyId();
        result = result * PRIME + ($contractPolicyId == null ? 43 : $contractPolicyId.hashCode());
        final Object $assetSelector = this.getAssetSelector();
        result = result * PRIME + ($assetSelector == null ? 43 : $assetSelector.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractDefinitionEntry(contractDefinitionId=" + this.getContractDefinitionId() + ", accessPolicyId=" + this.getAccessPolicyId() + ", contractPolicyId=" + this.getContractPolicyId() + ", assetSelector=" + this.getAssetSelector() + ")";
    }

    public ContractDefinitionEntry(final String contractDefinitionId, final String accessPolicyId, final String contractPolicyId, final List<UiCriterion> assetSelector) {
        this.contractDefinitionId = contractDefinitionId;
        this.accessPolicyId = accessPolicyId;
        this.contractPolicyId = contractPolicyId;
        this.assetSelector = assetSelector;
    }

    public ContractDefinitionEntry() {
    }
}
