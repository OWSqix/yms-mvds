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
@Schema(description = "Required data for starting a Contract Agreement\'s Transfer Process")
public class InitiateCustomTransferRequest {
    @Schema(description = "Contract Agreement ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractAgreementId;
    @Schema(description = "Partial TransferProcessRequestJsonLd JSON-LD. Fields participantId, connectorEndpoint, " + "assetId and contractId can be omitted, they will be overridden with information from the contract.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String transferProcessRequestJsonLd;


    public static class InitiateCustomTransferRequestBuilder {
        private String contractAgreementId;
        private String transferProcessRequestJsonLd;

        InitiateCustomTransferRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder contractAgreementId(final String contractAgreementId) {
            this.contractAgreementId = contractAgreementId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder transferProcessRequestJsonLd(final String transferProcessRequestJsonLd) {
            this.transferProcessRequestJsonLd = transferProcessRequestJsonLd;
            return this;
        }

        public InitiateCustomTransferRequest build() {
            return new InitiateCustomTransferRequest(this.contractAgreementId, this.transferProcessRequestJsonLd);
        }

        @Override
        public String toString() {
            return "InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder(contractAgreementId=" + this.contractAgreementId + ", transferProcessRequestJsonLd=" + this.transferProcessRequestJsonLd + ")";
        }
    }

    public static InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder builder() {
        return new InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder();
    }

    public InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder toBuilder() {
        return new InitiateCustomTransferRequest.InitiateCustomTransferRequestBuilder().contractAgreementId(this.contractAgreementId).transferProcessRequestJsonLd(this.transferProcessRequestJsonLd);
    }

    public String getContractAgreementId() {
        return this.contractAgreementId;
    }

    public String getTransferProcessRequestJsonLd() {
        return this.transferProcessRequestJsonLd;
    }

    public void setContractAgreementId(final String contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    public void setTransferProcessRequestJsonLd(final String transferProcessRequestJsonLd) {
        this.transferProcessRequestJsonLd = transferProcessRequestJsonLd;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InitiateCustomTransferRequest)) return false;
        final InitiateCustomTransferRequest other = (InitiateCustomTransferRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractAgreementId = this.getContractAgreementId();
        final Object other$contractAgreementId = other.getContractAgreementId();
        if (this$contractAgreementId == null ? other$contractAgreementId != null : !this$contractAgreementId.equals(other$contractAgreementId)) return false;
        final Object this$transferProcessRequestJsonLd = this.getTransferProcessRequestJsonLd();
        final Object other$transferProcessRequestJsonLd = other.getTransferProcessRequestJsonLd();
        if (this$transferProcessRequestJsonLd == null ? other$transferProcessRequestJsonLd != null : !this$transferProcessRequestJsonLd.equals(other$transferProcessRequestJsonLd)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InitiateCustomTransferRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractAgreementId = this.getContractAgreementId();
        result = result * PRIME + ($contractAgreementId == null ? 43 : $contractAgreementId.hashCode());
        final Object $transferProcessRequestJsonLd = this.getTransferProcessRequestJsonLd();
        result = result * PRIME + ($transferProcessRequestJsonLd == null ? 43 : $transferProcessRequestJsonLd.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "InitiateCustomTransferRequest(contractAgreementId=" + this.getContractAgreementId() + ", transferProcessRequestJsonLd=" + this.getTransferProcessRequestJsonLd() + ")";
    }

    public InitiateCustomTransferRequest(final String contractAgreementId, final String transferProcessRequestJsonLd) {
        this.contractAgreementId = contractAgreementId;
        this.transferProcessRequestJsonLd = transferProcessRequestJsonLd;
    }

    public InitiateCustomTransferRequest() {
    }
}
