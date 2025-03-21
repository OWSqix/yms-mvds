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
 *     Fraunhofer ISST - contributions to the Eclipse EDC 0.2.0 migration
 */
package de.sovity.edc.ce.api.ui.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Contract Negotiation Information")
public class UiContractNegotiation {
    @Schema(description = "Contract Negotiation Id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractNegotiationId;
    @Schema(description = "Contract Negotiation Creation Time", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime createdAt;
    @Schema(description = "Contract Agreement Id")
    private String contractAgreementId;
    @Schema(description = "State of the Contract Negotiation state machine", requiredMode = Schema.RequiredMode.REQUIRED)
    private ContractNegotiationState state;


    public static class UiContractNegotiationBuilder {
        private String contractNegotiationId;
        private OffsetDateTime createdAt;
        private String contractAgreementId;
        private ContractNegotiationState state;

        UiContractNegotiationBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiContractNegotiation.UiContractNegotiationBuilder contractNegotiationId(final String contractNegotiationId) {
            this.contractNegotiationId = contractNegotiationId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiContractNegotiation.UiContractNegotiationBuilder createdAt(final OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiContractNegotiation.UiContractNegotiationBuilder contractAgreementId(final String contractAgreementId) {
            this.contractAgreementId = contractAgreementId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiContractNegotiation.UiContractNegotiationBuilder state(final ContractNegotiationState state) {
            this.state = state;
            return this;
        }

        public UiContractNegotiation build() {
            return new UiContractNegotiation(this.contractNegotiationId, this.createdAt, this.contractAgreementId, this.state);
        }

        @Override
        public String toString() {
            return "UiContractNegotiation.UiContractNegotiationBuilder(contractNegotiationId=" + this.contractNegotiationId + ", createdAt=" + this.createdAt + ", contractAgreementId=" + this.contractAgreementId + ", state=" + this.state + ")";
        }
    }

    public static UiContractNegotiation.UiContractNegotiationBuilder builder() {
        return new UiContractNegotiation.UiContractNegotiationBuilder();
    }

    public UiContractNegotiation.UiContractNegotiationBuilder toBuilder() {
        return new UiContractNegotiation.UiContractNegotiationBuilder().contractNegotiationId(this.contractNegotiationId).createdAt(this.createdAt).contractAgreementId(this.contractAgreementId).state(this.state);
    }

    public String getContractNegotiationId() {
        return this.contractNegotiationId;
    }

    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getContractAgreementId() {
        return this.contractAgreementId;
    }

    public ContractNegotiationState getState() {
        return this.state;
    }

    public void setContractNegotiationId(final String contractNegotiationId) {
        this.contractNegotiationId = contractNegotiationId;
    }

    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setContractAgreementId(final String contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    public void setState(final ContractNegotiationState state) {
        this.state = state;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiContractNegotiation)) return false;
        final UiContractNegotiation other = (UiContractNegotiation) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractNegotiationId = this.getContractNegotiationId();
        final Object other$contractNegotiationId = other.getContractNegotiationId();
        if (this$contractNegotiationId == null ? other$contractNegotiationId != null : !this$contractNegotiationId.equals(other$contractNegotiationId)) return false;
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        if (this$createdAt == null ? other$createdAt != null : !this$createdAt.equals(other$createdAt)) return false;
        final Object this$contractAgreementId = this.getContractAgreementId();
        final Object other$contractAgreementId = other.getContractAgreementId();
        if (this$contractAgreementId == null ? other$contractAgreementId != null : !this$contractAgreementId.equals(other$contractAgreementId)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiContractNegotiation;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractNegotiationId = this.getContractNegotiationId();
        result = result * PRIME + ($contractNegotiationId == null ? 43 : $contractNegotiationId.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * PRIME + ($createdAt == null ? 43 : $createdAt.hashCode());
        final Object $contractAgreementId = this.getContractAgreementId();
        result = result * PRIME + ($contractAgreementId == null ? 43 : $contractAgreementId.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiContractNegotiation(contractNegotiationId=" + this.getContractNegotiationId() + ", createdAt=" + this.getCreatedAt() + ", contractAgreementId=" + this.getContractAgreementId() + ", state=" + this.getState() + ")";
    }

    public UiContractNegotiation(final String contractNegotiationId, final OffsetDateTime createdAt, final String contractAgreementId, final ContractNegotiationState state) {
        this.contractNegotiationId = contractNegotiationId;
        this.createdAt = createdAt;
        this.contractAgreementId = contractAgreementId;
        this.state = state;
    }

    public UiContractNegotiation() {
    }
}
