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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Data for initiating a Contract Negotiation")
public class ContractNegotiationRequest {
    @Schema(description = "Counter Party Id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyId;
    @Schema(description = "Counter Party Address", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyAddress;
    @Schema(description = "Contract Offer Dto ", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractOfferId;
    @Schema(description = "Policy JsonLd", requiredMode = Schema.RequiredMode.REQUIRED)
    private String policyJsonLd;
    @Schema(description = "Asset ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String assetId;


    public static class ContractNegotiationRequestBuilder {
        private String counterPartyId;
        private String counterPartyAddress;
        private String contractOfferId;
        private String policyJsonLd;
        private String assetId;

        ContractNegotiationRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractNegotiationRequest.ContractNegotiationRequestBuilder counterPartyId(final String counterPartyId) {
            this.counterPartyId = counterPartyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractNegotiationRequest.ContractNegotiationRequestBuilder counterPartyAddress(final String counterPartyAddress) {
            this.counterPartyAddress = counterPartyAddress;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractNegotiationRequest.ContractNegotiationRequestBuilder contractOfferId(final String contractOfferId) {
            this.contractOfferId = contractOfferId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractNegotiationRequest.ContractNegotiationRequestBuilder policyJsonLd(final String policyJsonLd) {
            this.policyJsonLd = policyJsonLd;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractNegotiationRequest.ContractNegotiationRequestBuilder assetId(final String assetId) {
            this.assetId = assetId;
            return this;
        }

        public ContractNegotiationRequest build() {
            return new ContractNegotiationRequest(this.counterPartyId, this.counterPartyAddress, this.contractOfferId, this.policyJsonLd, this.assetId);
        }

        @Override
        public String toString() {
            return "ContractNegotiationRequest.ContractNegotiationRequestBuilder(counterPartyId=" + this.counterPartyId + ", counterPartyAddress=" + this.counterPartyAddress + ", contractOfferId=" + this.contractOfferId + ", policyJsonLd=" + this.policyJsonLd + ", assetId=" + this.assetId + ")";
        }
    }

    public static ContractNegotiationRequest.ContractNegotiationRequestBuilder builder() {
        return new ContractNegotiationRequest.ContractNegotiationRequestBuilder();
    }

    public ContractNegotiationRequest.ContractNegotiationRequestBuilder toBuilder() {
        return new ContractNegotiationRequest.ContractNegotiationRequestBuilder().counterPartyId(this.counterPartyId).counterPartyAddress(this.counterPartyAddress).contractOfferId(this.contractOfferId).policyJsonLd(this.policyJsonLd).assetId(this.assetId);
    }

    public String getCounterPartyId() {
        return this.counterPartyId;
    }

    public String getCounterPartyAddress() {
        return this.counterPartyAddress;
    }

    public String getContractOfferId() {
        return this.contractOfferId;
    }

    public String getPolicyJsonLd() {
        return this.policyJsonLd;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public void setCounterPartyId(final String counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    public void setCounterPartyAddress(final String counterPartyAddress) {
        this.counterPartyAddress = counterPartyAddress;
    }

    public void setContractOfferId(final String contractOfferId) {
        this.contractOfferId = contractOfferId;
    }

    public void setPolicyJsonLd(final String policyJsonLd) {
        this.policyJsonLd = policyJsonLd;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractNegotiationRequest)) return false;
        final ContractNegotiationRequest other = (ContractNegotiationRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$counterPartyId = this.getCounterPartyId();
        final Object other$counterPartyId = other.getCounterPartyId();
        if (this$counterPartyId == null ? other$counterPartyId != null : !this$counterPartyId.equals(other$counterPartyId)) return false;
        final Object this$counterPartyAddress = this.getCounterPartyAddress();
        final Object other$counterPartyAddress = other.getCounterPartyAddress();
        if (this$counterPartyAddress == null ? other$counterPartyAddress != null : !this$counterPartyAddress.equals(other$counterPartyAddress)) return false;
        final Object this$contractOfferId = this.getContractOfferId();
        final Object other$contractOfferId = other.getContractOfferId();
        if (this$contractOfferId == null ? other$contractOfferId != null : !this$contractOfferId.equals(other$contractOfferId)) return false;
        final Object this$policyJsonLd = this.getPolicyJsonLd();
        final Object other$policyJsonLd = other.getPolicyJsonLd();
        if (this$policyJsonLd == null ? other$policyJsonLd != null : !this$policyJsonLd.equals(other$policyJsonLd)) return false;
        final Object this$assetId = this.getAssetId();
        final Object other$assetId = other.getAssetId();
        if (this$assetId == null ? other$assetId != null : !this$assetId.equals(other$assetId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractNegotiationRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $counterPartyId = this.getCounterPartyId();
        result = result * PRIME + ($counterPartyId == null ? 43 : $counterPartyId.hashCode());
        final Object $counterPartyAddress = this.getCounterPartyAddress();
        result = result * PRIME + ($counterPartyAddress == null ? 43 : $counterPartyAddress.hashCode());
        final Object $contractOfferId = this.getContractOfferId();
        result = result * PRIME + ($contractOfferId == null ? 43 : $contractOfferId.hashCode());
        final Object $policyJsonLd = this.getPolicyJsonLd();
        result = result * PRIME + ($policyJsonLd == null ? 43 : $policyJsonLd.hashCode());
        final Object $assetId = this.getAssetId();
        result = result * PRIME + ($assetId == null ? 43 : $assetId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractNegotiationRequest(counterPartyId=" + this.getCounterPartyId() + ", counterPartyAddress=" + this.getCounterPartyAddress() + ", contractOfferId=" + this.getContractOfferId() + ", policyJsonLd=" + this.getPolicyJsonLd() + ", assetId=" + this.getAssetId() + ")";
    }

    public ContractNegotiationRequest(final String counterPartyId, final String counterPartyAddress, final String contractOfferId, final String policyJsonLd, final String assetId) {
        this.counterPartyId = counterPartyId;
        this.counterPartyAddress = counterPartyAddress;
        this.contractOfferId = contractOfferId;
        this.policyJsonLd = policyJsonLd;
        this.assetId = assetId;
    }

    public ContractNegotiationRequest() {
    }
}
