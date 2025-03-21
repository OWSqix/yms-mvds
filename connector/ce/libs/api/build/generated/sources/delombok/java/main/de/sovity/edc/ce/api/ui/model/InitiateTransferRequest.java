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
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "For type PARAMS_ONLY: Required data for starting a Transfer Process")
public class InitiateTransferRequest {
    @Schema(description = "Contract Agreement ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractAgreementId;
    @Schema(description = "Transfer Type. Used to select a compatible DataPlane. " + "Examples are \'HttpData-PUSH\', \'HttpData-PULL\'. " + "Not to be confused with the \'type\' of the data source, or the \'type\' of the data sink found in the \'properties\'", requiredMode = Schema.RequiredMode.REQUIRED)
    private String transferType;
    @Schema(description = "Data Sink / Data Address", requiredMode = Schema.RequiredMode.REQUIRED)
    private Map<String, String> dataSinkProperties;
    @Schema(description = "Additional transfer process properties. These are not passed to the consumer EDC", requiredMode = Schema.RequiredMode.REQUIRED)
    private Map<String, String> transferProcessProperties;


    public static class InitiateTransferRequestBuilder {
        private String contractAgreementId;
        private String transferType;
        private Map<String, String> dataSinkProperties;
        private Map<String, String> transferProcessProperties;

        InitiateTransferRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public InitiateTransferRequest.InitiateTransferRequestBuilder contractAgreementId(final String contractAgreementId) {
            this.contractAgreementId = contractAgreementId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public InitiateTransferRequest.InitiateTransferRequestBuilder transferType(final String transferType) {
            this.transferType = transferType;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public InitiateTransferRequest.InitiateTransferRequestBuilder dataSinkProperties(final Map<String, String> dataSinkProperties) {
            this.dataSinkProperties = dataSinkProperties;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public InitiateTransferRequest.InitiateTransferRequestBuilder transferProcessProperties(final Map<String, String> transferProcessProperties) {
            this.transferProcessProperties = transferProcessProperties;
            return this;
        }

        public InitiateTransferRequest build() {
            return new InitiateTransferRequest(this.contractAgreementId, this.transferType, this.dataSinkProperties, this.transferProcessProperties);
        }

        @Override
        public String toString() {
            return "InitiateTransferRequest.InitiateTransferRequestBuilder(contractAgreementId=" + this.contractAgreementId + ", transferType=" + this.transferType + ", dataSinkProperties=" + this.dataSinkProperties + ", transferProcessProperties=" + this.transferProcessProperties + ")";
        }
    }

    public static InitiateTransferRequest.InitiateTransferRequestBuilder builder() {
        return new InitiateTransferRequest.InitiateTransferRequestBuilder();
    }

    public InitiateTransferRequest.InitiateTransferRequestBuilder toBuilder() {
        return new InitiateTransferRequest.InitiateTransferRequestBuilder().contractAgreementId(this.contractAgreementId).transferType(this.transferType).dataSinkProperties(this.dataSinkProperties).transferProcessProperties(this.transferProcessProperties);
    }

    public String getContractAgreementId() {
        return this.contractAgreementId;
    }

    public String getTransferType() {
        return this.transferType;
    }

    public Map<String, String> getDataSinkProperties() {
        return this.dataSinkProperties;
    }

    public Map<String, String> getTransferProcessProperties() {
        return this.transferProcessProperties;
    }

    public void setContractAgreementId(final String contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    public void setTransferType(final String transferType) {
        this.transferType = transferType;
    }

    public void setDataSinkProperties(final Map<String, String> dataSinkProperties) {
        this.dataSinkProperties = dataSinkProperties;
    }

    public void setTransferProcessProperties(final Map<String, String> transferProcessProperties) {
        this.transferProcessProperties = transferProcessProperties;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InitiateTransferRequest)) return false;
        final InitiateTransferRequest other = (InitiateTransferRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractAgreementId = this.getContractAgreementId();
        final Object other$contractAgreementId = other.getContractAgreementId();
        if (this$contractAgreementId == null ? other$contractAgreementId != null : !this$contractAgreementId.equals(other$contractAgreementId)) return false;
        final Object this$transferType = this.getTransferType();
        final Object other$transferType = other.getTransferType();
        if (this$transferType == null ? other$transferType != null : !this$transferType.equals(other$transferType)) return false;
        final Object this$dataSinkProperties = this.getDataSinkProperties();
        final Object other$dataSinkProperties = other.getDataSinkProperties();
        if (this$dataSinkProperties == null ? other$dataSinkProperties != null : !this$dataSinkProperties.equals(other$dataSinkProperties)) return false;
        final Object this$transferProcessProperties = this.getTransferProcessProperties();
        final Object other$transferProcessProperties = other.getTransferProcessProperties();
        if (this$transferProcessProperties == null ? other$transferProcessProperties != null : !this$transferProcessProperties.equals(other$transferProcessProperties)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InitiateTransferRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractAgreementId = this.getContractAgreementId();
        result = result * PRIME + ($contractAgreementId == null ? 43 : $contractAgreementId.hashCode());
        final Object $transferType = this.getTransferType();
        result = result * PRIME + ($transferType == null ? 43 : $transferType.hashCode());
        final Object $dataSinkProperties = this.getDataSinkProperties();
        result = result * PRIME + ($dataSinkProperties == null ? 43 : $dataSinkProperties.hashCode());
        final Object $transferProcessProperties = this.getTransferProcessProperties();
        result = result * PRIME + ($transferProcessProperties == null ? 43 : $transferProcessProperties.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "InitiateTransferRequest(contractAgreementId=" + this.getContractAgreementId() + ", transferType=" + this.getTransferType() + ", dataSinkProperties=" + this.getDataSinkProperties() + ", transferProcessProperties=" + this.getTransferProcessProperties() + ")";
    }

    public InitiateTransferRequest(final String contractAgreementId, final String transferType, final Map<String, String> dataSinkProperties, final Map<String, String> transferProcessProperties) {
        this.contractAgreementId = contractAgreementId;
        this.transferType = transferType;
        this.dataSinkProperties = dataSinkProperties;
        this.transferProcessProperties = transferProcessProperties;
    }

    public InitiateTransferRequest() {
    }
}
