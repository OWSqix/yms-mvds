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
import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Transfer History Entry for Transfer History Page")
public class TransferHistoryEntry {
    @Schema(description = "Transfer Process ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String transferProcessId;
    @Schema(description = "Created Date", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime createdDate;
    @Schema(description = "Last Change Date", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime lastUpdatedDate;
    @Schema(description = "Transfer History State", requiredMode = Schema.RequiredMode.REQUIRED)
    private TransferProcessState state;
    @Schema(description = "Contract Agreement ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractAgreementId;
    @Schema(description = "Incoming vs Outgoing", requiredMode = Schema.RequiredMode.REQUIRED)
    private ContractAgreementDirection direction;
    @Schema(description = "Other Connector\'s Endpoint", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyConnectorEndpoint;
    @Schema(description = "Other Connector\'s Participant ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String counterPartyParticipantId;
    @Schema(description = "Asset Name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String assetName;
    @Schema(description = "Asset ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String assetId;
    @Schema(description = "Error Message")
    private String errorMessage;


    public static class TransferHistoryEntryBuilder {
        private String transferProcessId;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastUpdatedDate;
        private TransferProcessState state;
        private String contractAgreementId;
        private ContractAgreementDirection direction;
        private String counterPartyConnectorEndpoint;
        private String counterPartyParticipantId;
        private String assetName;
        private String assetId;
        private String errorMessage;

        TransferHistoryEntryBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder transferProcessId(final String transferProcessId) {
            this.transferProcessId = transferProcessId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder createdDate(final OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder lastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder state(final TransferProcessState state) {
            this.state = state;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder contractAgreementId(final String contractAgreementId) {
            this.contractAgreementId = contractAgreementId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder direction(final ContractAgreementDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder counterPartyConnectorEndpoint(final String counterPartyConnectorEndpoint) {
            this.counterPartyConnectorEndpoint = counterPartyConnectorEndpoint;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder counterPartyParticipantId(final String counterPartyParticipantId) {
            this.counterPartyParticipantId = counterPartyParticipantId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder assetName(final String assetName) {
            this.assetName = assetName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder assetId(final String assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryEntry.TransferHistoryEntryBuilder errorMessage(final String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public TransferHistoryEntry build() {
            return new TransferHistoryEntry(this.transferProcessId, this.createdDate, this.lastUpdatedDate, this.state, this.contractAgreementId, this.direction, this.counterPartyConnectorEndpoint, this.counterPartyParticipantId, this.assetName, this.assetId, this.errorMessage);
        }

        @Override
        public String toString() {
            return "TransferHistoryEntry.TransferHistoryEntryBuilder(transferProcessId=" + this.transferProcessId + ", createdDate=" + this.createdDate + ", lastUpdatedDate=" + this.lastUpdatedDate + ", state=" + this.state + ", contractAgreementId=" + this.contractAgreementId + ", direction=" + this.direction + ", counterPartyConnectorEndpoint=" + this.counterPartyConnectorEndpoint + ", counterPartyParticipantId=" + this.counterPartyParticipantId + ", assetName=" + this.assetName + ", assetId=" + this.assetId + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    public static TransferHistoryEntry.TransferHistoryEntryBuilder builder() {
        return new TransferHistoryEntry.TransferHistoryEntryBuilder();
    }

    public TransferHistoryEntry.TransferHistoryEntryBuilder toBuilder() {
        return new TransferHistoryEntry.TransferHistoryEntryBuilder().transferProcessId(this.transferProcessId).createdDate(this.createdDate).lastUpdatedDate(this.lastUpdatedDate).state(this.state).contractAgreementId(this.contractAgreementId).direction(this.direction).counterPartyConnectorEndpoint(this.counterPartyConnectorEndpoint).counterPartyParticipantId(this.counterPartyParticipantId).assetName(this.assetName).assetId(this.assetId).errorMessage(this.errorMessage);
    }

    public String getTransferProcessId() {
        return this.transferProcessId;
    }

    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    public OffsetDateTime getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public TransferProcessState getState() {
        return this.state;
    }

    public String getContractAgreementId() {
        return this.contractAgreementId;
    }

    public ContractAgreementDirection getDirection() {
        return this.direction;
    }

    public String getCounterPartyConnectorEndpoint() {
        return this.counterPartyConnectorEndpoint;
    }

    public String getCounterPartyParticipantId() {
        return this.counterPartyParticipantId;
    }

    public String getAssetName() {
        return this.assetName;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setTransferProcessId(final String transferProcessId) {
        this.transferProcessId = transferProcessId;
    }

    public void setCreatedDate(final OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void setState(final TransferProcessState state) {
        this.state = state;
    }

    public void setContractAgreementId(final String contractAgreementId) {
        this.contractAgreementId = contractAgreementId;
    }

    public void setDirection(final ContractAgreementDirection direction) {
        this.direction = direction;
    }

    public void setCounterPartyConnectorEndpoint(final String counterPartyConnectorEndpoint) {
        this.counterPartyConnectorEndpoint = counterPartyConnectorEndpoint;
    }

    public void setCounterPartyParticipantId(final String counterPartyParticipantId) {
        this.counterPartyParticipantId = counterPartyParticipantId;
    }

    public void setAssetName(final String assetName) {
        this.assetName = assetName;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransferHistoryEntry)) return false;
        final TransferHistoryEntry other = (TransferHistoryEntry) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$transferProcessId = this.getTransferProcessId();
        final Object other$transferProcessId = other.getTransferProcessId();
        if (this$transferProcessId == null ? other$transferProcessId != null : !this$transferProcessId.equals(other$transferProcessId)) return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate)) return false;
        final Object this$lastUpdatedDate = this.getLastUpdatedDate();
        final Object other$lastUpdatedDate = other.getLastUpdatedDate();
        if (this$lastUpdatedDate == null ? other$lastUpdatedDate != null : !this$lastUpdatedDate.equals(other$lastUpdatedDate)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$contractAgreementId = this.getContractAgreementId();
        final Object other$contractAgreementId = other.getContractAgreementId();
        if (this$contractAgreementId == null ? other$contractAgreementId != null : !this$contractAgreementId.equals(other$contractAgreementId)) return false;
        final Object this$direction = this.getDirection();
        final Object other$direction = other.getDirection();
        if (this$direction == null ? other$direction != null : !this$direction.equals(other$direction)) return false;
        final Object this$counterPartyConnectorEndpoint = this.getCounterPartyConnectorEndpoint();
        final Object other$counterPartyConnectorEndpoint = other.getCounterPartyConnectorEndpoint();
        if (this$counterPartyConnectorEndpoint == null ? other$counterPartyConnectorEndpoint != null : !this$counterPartyConnectorEndpoint.equals(other$counterPartyConnectorEndpoint)) return false;
        final Object this$counterPartyParticipantId = this.getCounterPartyParticipantId();
        final Object other$counterPartyParticipantId = other.getCounterPartyParticipantId();
        if (this$counterPartyParticipantId == null ? other$counterPartyParticipantId != null : !this$counterPartyParticipantId.equals(other$counterPartyParticipantId)) return false;
        final Object this$assetName = this.getAssetName();
        final Object other$assetName = other.getAssetName();
        if (this$assetName == null ? other$assetName != null : !this$assetName.equals(other$assetName)) return false;
        final Object this$assetId = this.getAssetId();
        final Object other$assetId = other.getAssetId();
        if (this$assetId == null ? other$assetId != null : !this$assetId.equals(other$assetId)) return false;
        final Object this$errorMessage = this.getErrorMessage();
        final Object other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransferHistoryEntry;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $transferProcessId = this.getTransferProcessId();
        result = result * PRIME + ($transferProcessId == null ? 43 : $transferProcessId.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $lastUpdatedDate = this.getLastUpdatedDate();
        result = result * PRIME + ($lastUpdatedDate == null ? 43 : $lastUpdatedDate.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $contractAgreementId = this.getContractAgreementId();
        result = result * PRIME + ($contractAgreementId == null ? 43 : $contractAgreementId.hashCode());
        final Object $direction = this.getDirection();
        result = result * PRIME + ($direction == null ? 43 : $direction.hashCode());
        final Object $counterPartyConnectorEndpoint = this.getCounterPartyConnectorEndpoint();
        result = result * PRIME + ($counterPartyConnectorEndpoint == null ? 43 : $counterPartyConnectorEndpoint.hashCode());
        final Object $counterPartyParticipantId = this.getCounterPartyParticipantId();
        result = result * PRIME + ($counterPartyParticipantId == null ? 43 : $counterPartyParticipantId.hashCode());
        final Object $assetName = this.getAssetName();
        result = result * PRIME + ($assetName == null ? 43 : $assetName.hashCode());
        final Object $assetId = this.getAssetId();
        result = result * PRIME + ($assetId == null ? 43 : $assetId.hashCode());
        final Object $errorMessage = this.getErrorMessage();
        result = result * PRIME + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TransferHistoryEntry(transferProcessId=" + this.getTransferProcessId() + ", createdDate=" + this.getCreatedDate() + ", lastUpdatedDate=" + this.getLastUpdatedDate() + ", state=" + this.getState() + ", contractAgreementId=" + this.getContractAgreementId() + ", direction=" + this.getDirection() + ", counterPartyConnectorEndpoint=" + this.getCounterPartyConnectorEndpoint() + ", counterPartyParticipantId=" + this.getCounterPartyParticipantId() + ", assetName=" + this.getAssetName() + ", assetId=" + this.getAssetId() + ", errorMessage=" + this.getErrorMessage() + ")";
    }

    public TransferHistoryEntry(final String transferProcessId, final OffsetDateTime createdDate, final OffsetDateTime lastUpdatedDate, final TransferProcessState state, final String contractAgreementId, final ContractAgreementDirection direction, final String counterPartyConnectorEndpoint, final String counterPartyParticipantId, final String assetName, final String assetId, final String errorMessage) {
        this.transferProcessId = transferProcessId;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.state = state;
        this.contractAgreementId = contractAgreementId;
        this.direction = direction;
        this.counterPartyConnectorEndpoint = counterPartyConnectorEndpoint;
        this.counterPartyParticipantId = counterPartyParticipantId;
        this.assetName = assetName;
        this.assetId = assetId;
        this.errorMessage = errorMessage;
    }

    public TransferHistoryEntry() {
    }
}
