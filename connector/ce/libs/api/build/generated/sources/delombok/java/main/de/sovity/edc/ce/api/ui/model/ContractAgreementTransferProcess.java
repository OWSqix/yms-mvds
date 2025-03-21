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
@Schema(description = "A Contract Agreement\'s Transfer Process")
public class ContractAgreementTransferProcess {
    @Schema(description = "Transfer Process ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String transferProcessId;
    @Schema(description = "Last Change Date", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime lastUpdatedDate;
    @Schema(description = "Current State", requiredMode = Schema.RequiredMode.REQUIRED)
    private TransferProcessState state;
    @Schema(description = "Error Message")
    private String errorMessage;


    public static class ContractAgreementTransferProcessBuilder {
        private String transferProcessId;
        private OffsetDateTime lastUpdatedDate;
        private TransferProcessState state;
        private String errorMessage;

        ContractAgreementTransferProcessBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder transferProcessId(final String transferProcessId) {
            this.transferProcessId = transferProcessId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder lastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder state(final TransferProcessState state) {
            this.state = state;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder errorMessage(final String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public ContractAgreementTransferProcess build() {
            return new ContractAgreementTransferProcess(this.transferProcessId, this.lastUpdatedDate, this.state, this.errorMessage);
        }

        @Override
        public String toString() {
            return "ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder(transferProcessId=" + this.transferProcessId + ", lastUpdatedDate=" + this.lastUpdatedDate + ", state=" + this.state + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    public static ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder builder() {
        return new ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder();
    }

    public ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder toBuilder() {
        return new ContractAgreementTransferProcess.ContractAgreementTransferProcessBuilder().transferProcessId(this.transferProcessId).lastUpdatedDate(this.lastUpdatedDate).state(this.state).errorMessage(this.errorMessage);
    }

    public String getTransferProcessId() {
        return this.transferProcessId;
    }

    public OffsetDateTime getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public TransferProcessState getState() {
        return this.state;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setTransferProcessId(final String transferProcessId) {
        this.transferProcessId = transferProcessId;
    }

    public void setLastUpdatedDate(final OffsetDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void setState(final TransferProcessState state) {
        this.state = state;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractAgreementTransferProcess)) return false;
        final ContractAgreementTransferProcess other = (ContractAgreementTransferProcess) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$transferProcessId = this.getTransferProcessId();
        final Object other$transferProcessId = other.getTransferProcessId();
        if (this$transferProcessId == null ? other$transferProcessId != null : !this$transferProcessId.equals(other$transferProcessId)) return false;
        final Object this$lastUpdatedDate = this.getLastUpdatedDate();
        final Object other$lastUpdatedDate = other.getLastUpdatedDate();
        if (this$lastUpdatedDate == null ? other$lastUpdatedDate != null : !this$lastUpdatedDate.equals(other$lastUpdatedDate)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$errorMessage = this.getErrorMessage();
        final Object other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractAgreementTransferProcess;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $transferProcessId = this.getTransferProcessId();
        result = result * PRIME + ($transferProcessId == null ? 43 : $transferProcessId.hashCode());
        final Object $lastUpdatedDate = this.getLastUpdatedDate();
        result = result * PRIME + ($lastUpdatedDate == null ? 43 : $lastUpdatedDate.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $errorMessage = this.getErrorMessage();
        result = result * PRIME + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractAgreementTransferProcess(transferProcessId=" + this.getTransferProcessId() + ", lastUpdatedDate=" + this.getLastUpdatedDate() + ", state=" + this.getState() + ", errorMessage=" + this.getErrorMessage() + ")";
    }

    public ContractAgreementTransferProcess(final String transferProcessId, final OffsetDateTime lastUpdatedDate, final TransferProcessState state, final String errorMessage) {
        this.transferProcessId = transferProcessId;
        this.lastUpdatedDate = lastUpdatedDate;
        this.state = state;
        this.errorMessage = errorMessage;
    }

    public ContractAgreementTransferProcess() {
    }
}
