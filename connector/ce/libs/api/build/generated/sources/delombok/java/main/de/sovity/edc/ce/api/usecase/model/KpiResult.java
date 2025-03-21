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
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "EDC-status-defining KPIs")
public class KpiResult {
    @Schema(description = "Counts of assets", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer assetsCount;
    @Schema(description = "Counts of policies", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer policiesCount;
    @Schema(description = "Counts of contract definitions", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer contractDefinitionsCount;
    @Schema(description = "Counts of contract agreements", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer contractAgreementsCount;
    @Schema(description = "Counts of incoming and outgoing TransferProcesses and status", requiredMode = Schema.RequiredMode.REQUIRED)
    private TransferProcessStatesDto transferProcessDto;


    public static class KpiResultBuilder {
        private Integer assetsCount;
        private Integer policiesCount;
        private Integer contractDefinitionsCount;
        private Integer contractAgreementsCount;
        private TransferProcessStatesDto transferProcessDto;

        KpiResultBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public KpiResult.KpiResultBuilder assetsCount(final Integer assetsCount) {
            this.assetsCount = assetsCount;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public KpiResult.KpiResultBuilder policiesCount(final Integer policiesCount) {
            this.policiesCount = policiesCount;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public KpiResult.KpiResultBuilder contractDefinitionsCount(final Integer contractDefinitionsCount) {
            this.contractDefinitionsCount = contractDefinitionsCount;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public KpiResult.KpiResultBuilder contractAgreementsCount(final Integer contractAgreementsCount) {
            this.contractAgreementsCount = contractAgreementsCount;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public KpiResult.KpiResultBuilder transferProcessDto(final TransferProcessStatesDto transferProcessDto) {
            this.transferProcessDto = transferProcessDto;
            return this;
        }

        public KpiResult build() {
            return new KpiResult(this.assetsCount, this.policiesCount, this.contractDefinitionsCount, this.contractAgreementsCount, this.transferProcessDto);
        }

        @Override
        public String toString() {
            return "KpiResult.KpiResultBuilder(assetsCount=" + this.assetsCount + ", policiesCount=" + this.policiesCount + ", contractDefinitionsCount=" + this.contractDefinitionsCount + ", contractAgreementsCount=" + this.contractAgreementsCount + ", transferProcessDto=" + this.transferProcessDto + ")";
        }
    }

    public static KpiResult.KpiResultBuilder builder() {
        return new KpiResult.KpiResultBuilder();
    }

    public KpiResult.KpiResultBuilder toBuilder() {
        return new KpiResult.KpiResultBuilder().assetsCount(this.assetsCount).policiesCount(this.policiesCount).contractDefinitionsCount(this.contractDefinitionsCount).contractAgreementsCount(this.contractAgreementsCount).transferProcessDto(this.transferProcessDto);
    }

    public Integer getAssetsCount() {
        return this.assetsCount;
    }

    public Integer getPoliciesCount() {
        return this.policiesCount;
    }

    public Integer getContractDefinitionsCount() {
        return this.contractDefinitionsCount;
    }

    public Integer getContractAgreementsCount() {
        return this.contractAgreementsCount;
    }

    public TransferProcessStatesDto getTransferProcessDto() {
        return this.transferProcessDto;
    }

    public void setAssetsCount(final Integer assetsCount) {
        this.assetsCount = assetsCount;
    }

    public void setPoliciesCount(final Integer policiesCount) {
        this.policiesCount = policiesCount;
    }

    public void setContractDefinitionsCount(final Integer contractDefinitionsCount) {
        this.contractDefinitionsCount = contractDefinitionsCount;
    }

    public void setContractAgreementsCount(final Integer contractAgreementsCount) {
        this.contractAgreementsCount = contractAgreementsCount;
    }

    public void setTransferProcessDto(final TransferProcessStatesDto transferProcessDto) {
        this.transferProcessDto = transferProcessDto;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KpiResult)) return false;
        final KpiResult other = (KpiResult) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$assetsCount = this.getAssetsCount();
        final Object other$assetsCount = other.getAssetsCount();
        if (this$assetsCount == null ? other$assetsCount != null : !this$assetsCount.equals(other$assetsCount)) return false;
        final Object this$policiesCount = this.getPoliciesCount();
        final Object other$policiesCount = other.getPoliciesCount();
        if (this$policiesCount == null ? other$policiesCount != null : !this$policiesCount.equals(other$policiesCount)) return false;
        final Object this$contractDefinitionsCount = this.getContractDefinitionsCount();
        final Object other$contractDefinitionsCount = other.getContractDefinitionsCount();
        if (this$contractDefinitionsCount == null ? other$contractDefinitionsCount != null : !this$contractDefinitionsCount.equals(other$contractDefinitionsCount)) return false;
        final Object this$contractAgreementsCount = this.getContractAgreementsCount();
        final Object other$contractAgreementsCount = other.getContractAgreementsCount();
        if (this$contractAgreementsCount == null ? other$contractAgreementsCount != null : !this$contractAgreementsCount.equals(other$contractAgreementsCount)) return false;
        final Object this$transferProcessDto = this.getTransferProcessDto();
        final Object other$transferProcessDto = other.getTransferProcessDto();
        if (this$transferProcessDto == null ? other$transferProcessDto != null : !this$transferProcessDto.equals(other$transferProcessDto)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KpiResult;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $assetsCount = this.getAssetsCount();
        result = result * PRIME + ($assetsCount == null ? 43 : $assetsCount.hashCode());
        final Object $policiesCount = this.getPoliciesCount();
        result = result * PRIME + ($policiesCount == null ? 43 : $policiesCount.hashCode());
        final Object $contractDefinitionsCount = this.getContractDefinitionsCount();
        result = result * PRIME + ($contractDefinitionsCount == null ? 43 : $contractDefinitionsCount.hashCode());
        final Object $contractAgreementsCount = this.getContractAgreementsCount();
        result = result * PRIME + ($contractAgreementsCount == null ? 43 : $contractAgreementsCount.hashCode());
        final Object $transferProcessDto = this.getTransferProcessDto();
        result = result * PRIME + ($transferProcessDto == null ? 43 : $transferProcessDto.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "KpiResult(assetsCount=" + this.getAssetsCount() + ", policiesCount=" + this.getPoliciesCount() + ", contractDefinitionsCount=" + this.getContractDefinitionsCount() + ", contractAgreementsCount=" + this.getContractAgreementsCount() + ", transferProcessDto=" + this.getTransferProcessDto() + ")";
    }

    public KpiResult(final Integer assetsCount, final Integer policiesCount, final Integer contractDefinitionsCount, final Integer contractAgreementsCount, final TransferProcessStatesDto transferProcessDto) {
        this.assetsCount = assetsCount;
        this.policiesCount = policiesCount;
        this.contractDefinitionsCount = contractDefinitionsCount;
        this.contractAgreementsCount = contractAgreementsCount;
        this.transferProcessDto = transferProcessDto;
    }

    public KpiResult() {
    }
}
