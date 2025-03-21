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
import de.sovity.edc.ce.api.common.model.UiAsset;
import de.sovity.edc.ce.api.common.model.UiPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Contract Agreement for Contract Agreement Page")
public class ContractAgreementCard {
    @Schema(description = "Contract Agreement ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractAgreementId;
    @Schema(description = "Contract Negotiation ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractNegotiationId;
    @Schema(description = "Incoming vs Outgoing", requiredMode = Schema.RequiredMode.REQUIRED)
    private ContractAgreementDirection direction;
    @Schema(description = "Other Connector\'s Endpoint", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyAddress;
    @Schema(description = "Other Connector\'s ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyId;
    @Schema(description = "Contract Agreements Signing Date", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime contractSigningDate;
    @Schema(description = "Asset details", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiAsset asset;
    @Schema(description = "Contract Policy", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiPolicy contractPolicy;
    @Schema(description = "Contract Agreement\'s Transfer Processes", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ContractAgreementTransferProcess> transferProcesses;
    @Schema(description = "Contract Agreement\'s Termination Status", requiredMode = Schema.RequiredMode.REQUIRED)
    private ContractTerminationStatus terminationStatus;
    @Schema(description = "Contract Agreement\'s Metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private ContractAgreementTerminationInfo terminationInformation;


    public static class ContractAgreementCardBuilder {
        private String contractAgreementId;
        private String contractNegotiationId;
        private ContractAgreementDirection direction;
        private String counterPartyAddress;
        private String counterPartyId;
        private OffsetDateTime contractSigningDate;
        private UiAsset asset;
        private UiPolicy contractPolicy;
        private List<ContractAgreementTransferProcess> transferProcesses;
        private ContractTerminationStatus terminationStatus;
        private ContractAgreementTerminationInfo terminationInformation;

        ContractAgreementCardBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder contractAgreementId(final String contractAgreementId) {
            this.contractAgreementId = contractAgreementId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder contractNegotiationId(final String contractNegotiationId) {
            this.contractNegotiationId = contractNegotiationId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder direction(final ContractAgreementDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder counterPartyAddress(final String counterPartyAddress) {
            this.counterPartyAddress = counterPartyAddress;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder counterPartyId(final String counterPartyId) {
            this.counterPartyId = counterPartyId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder contractSigningDate(final OffsetDateTime contractSigningDate) {
            this.contractSigningDate = contractSigningDate;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder asset(final UiAsset asset) {
            this.asset = asset;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder contractPolicy(final UiPolicy contractPolicy) {
            this.contractPolicy = contractPolicy;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder transferProcesses(final List<ContractAgreementTransferProcess> transferProcesses) {
            this.transferProcesses = transferProcesses;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder terminationStatus(final ContractTerminationStatus terminationStatus) {
            this.terminationStatus = terminationStatus;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementCard.ContractAgreementCardBuilder terminationInformation(final ContractAgreementTerminationInfo terminationInformation) {
            this.terminationInformation = terminationInformation;
            return this;
        }

        public ContractAgreementCard build() {
            return new ContractAgreementCard(this.contractAgreementId, this.contractNegotiationId, this.direction, this.counterPartyAddress, this.counterPartyId, this.contractSigningDate, this.asset, this.contractPolicy, this.transferProcesses, this.terminationStatus, this.terminationInformation);
        }

        @Override
        public String toString() {
            return "ContractAgreementCard.ContractAgreementCardBuilder(contractAgreementId=" + this.contractAgreementId + ", contractNegotiationId=" + this.contractNegotiationId + ", direction=" + this.direction + ", counterPartyAddress=" + this.counterPartyAddress + ", counterPartyId=" + this.counterPartyId + ", contractSigningDate=" + this.contractSigningDate + ", asset=" + this.asset + ", contractPolicy=" + this.contractPolicy + ", transferProcesses=" + this.transferProcesses + ", terminationStatus=" + this.terminationStatus + ", terminationInformation=" + this.terminationInformation + ")";
        }
    }

    public static ContractAgreementCard.ContractAgreementCardBuilder builder() {
        return new ContractAgreementCard.ContractAgreementCardBuilder();
    }

    public ContractAgreementCard.ContractAgreementCardBuilder toBuilder() {
        return new ContractAgreementCard.ContractAgreementCardBuilder().contractAgreementId(this.contractAgreementId).contractNegotiationId(this.contractNegotiationId).direction(this.direction).counterPartyAddress(this.counterPartyAddress).counterPartyId(this.counterPartyId).contractSigningDate(this.contractSigningDate).asset(this.asset).contractPolicy(this.contractPolicy).transferProcesses(this.transferProcesses).terminationStatus(this.terminationStatus).terminationInformation(this.terminationInformation);
    }

    public String getContractAgreementId() {
        return this.contractAgreementId;
    }

    public String getContractNegotiationId() {
        return this.contractNegotiationId;
    }

    public ContractAgreementDirection getDirection() {
        return this.direction;
    }

    public String getCounterPartyAddress() {
        return this.counterPartyAddress;
    }

    public String getCounterPartyId() {
        return this.counterPartyId;
    }

    public OffsetDateTime getContractSigningDate() {
        return this.contractSigningDate;
    }

    public UiAsset getAsset() {
        return this.asset;
    }

    public UiPolicy getContractPolicy() {
        return this.contractPolicy;
    }

    public List<ContractAgreementTransferProcess> getTransferProcesses() {
        return this.transferProcesses;
    }

    public ContractTerminationStatus getTerminationStatus() {
        return this.terminationStatus;
    }

    public ContractAgreementTerminationInfo getTerminationInformation() {
        return this.terminationInformation;
    }

    public void setContractAgreementId(final String contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    public void setContractNegotiationId(final String contractNegotiationId) {
        this.contractNegotiationId = contractNegotiationId;
    }

    public void setDirection(final ContractAgreementDirection direction) {
        this.direction = direction;
    }

    public void setCounterPartyAddress(final String counterPartyAddress) {
        this.counterPartyAddress = counterPartyAddress;
    }

    public void setCounterPartyId(final String counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    public void setContractSigningDate(final OffsetDateTime contractSigningDate) {
        this.contractSigningDate = contractSigningDate;
    }

    public void setAsset(final UiAsset asset) {
        this.asset = asset;
    }

    public void setContractPolicy(final UiPolicy contractPolicy) {
        this.contractPolicy = contractPolicy;
    }

    public void setTransferProcesses(final List<ContractAgreementTransferProcess> transferProcesses) {
        this.transferProcesses = transferProcesses;
    }

    public void setTerminationStatus(final ContractTerminationStatus terminationStatus) {
        this.terminationStatus = terminationStatus;
    }

    public void setTerminationInformation(final ContractAgreementTerminationInfo terminationInformation) {
        this.terminationInformation = terminationInformation;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractAgreementCard)) return false;
        final ContractAgreementCard other = (ContractAgreementCard) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractAgreementId = this.getContractAgreementId();
        final Object other$contractAgreementId = other.getContractAgreementId();
        if (this$contractAgreementId == null ? other$contractAgreementId != null : !this$contractAgreementId.equals(other$contractAgreementId)) return false;
        final Object this$contractNegotiationId = this.getContractNegotiationId();
        final Object other$contractNegotiationId = other.getContractNegotiationId();
        if (this$contractNegotiationId == null ? other$contractNegotiationId != null : !this$contractNegotiationId.equals(other$contractNegotiationId)) return false;
        final Object this$direction = this.getDirection();
        final Object other$direction = other.getDirection();
        if (this$direction == null ? other$direction != null : !this$direction.equals(other$direction)) return false;
        final Object this$counterPartyAddress = this.getCounterPartyAddress();
        final Object other$counterPartyAddress = other.getCounterPartyAddress();
        if (this$counterPartyAddress == null ? other$counterPartyAddress != null : !this$counterPartyAddress.equals(other$counterPartyAddress)) return false;
        final Object this$counterPartyId = this.getCounterPartyId();
        final Object other$counterPartyId = other.getCounterPartyId();
        if (this$counterPartyId == null ? other$counterPartyId != null : !this$counterPartyId.equals(other$counterPartyId)) return false;
        final Object this$contractSigningDate = this.getContractSigningDate();
        final Object other$contractSigningDate = other.getContractSigningDate();
        if (this$contractSigningDate == null ? other$contractSigningDate != null : !this$contractSigningDate.equals(other$contractSigningDate)) return false;
        final Object this$asset = this.getAsset();
        final Object other$asset = other.getAsset();
        if (this$asset == null ? other$asset != null : !this$asset.equals(other$asset)) return false;
        final Object this$contractPolicy = this.getContractPolicy();
        final Object other$contractPolicy = other.getContractPolicy();
        if (this$contractPolicy == null ? other$contractPolicy != null : !this$contractPolicy.equals(other$contractPolicy)) return false;
        final Object this$transferProcesses = this.getTransferProcesses();
        final Object other$transferProcesses = other.getTransferProcesses();
        if (this$transferProcesses == null ? other$transferProcesses != null : !this$transferProcesses.equals(other$transferProcesses)) return false;
        final Object this$terminationStatus = this.getTerminationStatus();
        final Object other$terminationStatus = other.getTerminationStatus();
        if (this$terminationStatus == null ? other$terminationStatus != null : !this$terminationStatus.equals(other$terminationStatus)) return false;
        final Object this$terminationInformation = this.getTerminationInformation();
        final Object other$terminationInformation = other.getTerminationInformation();
        if (this$terminationInformation == null ? other$terminationInformation != null : !this$terminationInformation.equals(other$terminationInformation)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractAgreementCard;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractAgreementId = this.getContractAgreementId();
        result = result * PRIME + ($contractAgreementId == null ? 43 : $contractAgreementId.hashCode());
        final Object $contractNegotiationId = this.getContractNegotiationId();
        result = result * PRIME + ($contractNegotiationId == null ? 43 : $contractNegotiationId.hashCode());
        final Object $direction = this.getDirection();
        result = result * PRIME + ($direction == null ? 43 : $direction.hashCode());
        final Object $counterPartyAddress = this.getCounterPartyAddress();
        result = result * PRIME + ($counterPartyAddress == null ? 43 : $counterPartyAddress.hashCode());
        final Object $counterPartyId = this.getCounterPartyId();
        result = result * PRIME + ($counterPartyId == null ? 43 : $counterPartyId.hashCode());
        final Object $contractSigningDate = this.getContractSigningDate();
        result = result * PRIME + ($contractSigningDate == null ? 43 : $contractSigningDate.hashCode());
        final Object $asset = this.getAsset();
        result = result * PRIME + ($asset == null ? 43 : $asset.hashCode());
        final Object $contractPolicy = this.getContractPolicy();
        result = result * PRIME + ($contractPolicy == null ? 43 : $contractPolicy.hashCode());
        final Object $transferProcesses = this.getTransferProcesses();
        result = result * PRIME + ($transferProcesses == null ? 43 : $transferProcesses.hashCode());
        final Object $terminationStatus = this.getTerminationStatus();
        result = result * PRIME + ($terminationStatus == null ? 43 : $terminationStatus.hashCode());
        final Object $terminationInformation = this.getTerminationInformation();
        result = result * PRIME + ($terminationInformation == null ? 43 : $terminationInformation.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractAgreementCard(contractAgreementId=" + this.getContractAgreementId() + ", contractNegotiationId=" + this.getContractNegotiationId() + ", direction=" + this.getDirection() + ", counterPartyAddress=" + this.getCounterPartyAddress() + ", counterPartyId=" + this.getCounterPartyId() + ", contractSigningDate=" + this.getContractSigningDate() + ", asset=" + this.getAsset() + ", contractPolicy=" + this.getContractPolicy() + ", transferProcesses=" + this.getTransferProcesses() + ", terminationStatus=" + this.getTerminationStatus() + ", terminationInformation=" + this.getTerminationInformation() + ")";
    }

    public ContractAgreementCard(final String contractAgreementId, final String contractNegotiationId, final ContractAgreementDirection direction, final String counterPartyAddress, final String counterPartyId, final OffsetDateTime contractSigningDate, final UiAsset asset, final UiPolicy contractPolicy, final List<ContractAgreementTransferProcess> transferProcesses, final ContractTerminationStatus terminationStatus, final ContractAgreementTerminationInfo terminationInformation) {
        this.contractAgreementId = contractAgreementId;
        this.contractNegotiationId = contractNegotiationId;
        this.direction = direction;
        this.counterPartyAddress = counterPartyAddress;
        this.counterPartyId = counterPartyId;
        this.contractSigningDate = contractSigningDate;
        this.asset = asset;
        this.contractPolicy = contractPolicy;
        this.transferProcesses = transferProcesses;
        this.terminationStatus = terminationStatus;
        this.terminationInformation = terminationInformation;
    }

    public ContractAgreementCard() {
    }
}
