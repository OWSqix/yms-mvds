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

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

@Schema(description = "Contract\'s agreement metadata")
public class ContractAgreementTerminationInfo {
    @Schema(description = "Termination\'s date and time", requiredMode = Schema.RequiredMode.REQUIRED)
    private OffsetDateTime terminatedAt;
    @Schema(title = "Termination\'s reason", description = "The termination\'s nature e.g. User Termination", requiredMode = Schema.RequiredMode.REQUIRED)
    private String reason;
    @Schema(description = "Detailed message from the terminating party about why the contract was terminated.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String detail;
    @Schema(description = "Indicates whether the termination comes from this EDC or the counterparty EDC.", requiredMode = Schema.RequiredMode.REQUIRED)
    private ContractTerminatedBy terminatedBy;


    public static class ContractAgreementTerminationInfoBuilder {
        private OffsetDateTime terminatedAt;
        private String reason;
        private String detail;
        private ContractTerminatedBy terminatedBy;

        ContractAgreementTerminationInfoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder terminatedAt(final OffsetDateTime terminatedAt) {
            this.terminatedAt = terminatedAt;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder reason(final String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder detail(final String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder terminatedBy(final ContractTerminatedBy terminatedBy) {
            this.terminatedBy = terminatedBy;
            return this;
        }

        public ContractAgreementTerminationInfo build() {
            return new ContractAgreementTerminationInfo(this.terminatedAt, this.reason, this.detail, this.terminatedBy);
        }

        @Override
        public String toString() {
            return "ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder(terminatedAt=" + this.terminatedAt + ", reason=" + this.reason + ", detail=" + this.detail + ", terminatedBy=" + this.terminatedBy + ")";
        }
    }

    public static ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder builder() {
        return new ContractAgreementTerminationInfo.ContractAgreementTerminationInfoBuilder();
    }

    public OffsetDateTime getTerminatedAt() {
        return this.terminatedAt;
    }

    public String getReason() {
        return this.reason;
    }

    public String getDetail() {
        return this.detail;
    }

    public ContractTerminatedBy getTerminatedBy() {
        return this.terminatedBy;
    }

    public void setTerminatedAt(final OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
    }

    public void setReason(final String reason) {
        this.reason = reason;
    }

    public void setDetail(final String detail) {
        this.detail = detail;
    }

    public void setTerminatedBy(final ContractTerminatedBy terminatedBy) {
        this.terminatedBy = terminatedBy;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractAgreementTerminationInfo)) return false;
        final ContractAgreementTerminationInfo other = (ContractAgreementTerminationInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$terminatedAt = this.getTerminatedAt();
        final Object other$terminatedAt = other.getTerminatedAt();
        if (this$terminatedAt == null ? other$terminatedAt != null : !this$terminatedAt.equals(other$terminatedAt)) return false;
        final Object this$reason = this.getReason();
        final Object other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) return false;
        final Object this$detail = this.getDetail();
        final Object other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !this$detail.equals(other$detail)) return false;
        final Object this$terminatedBy = this.getTerminatedBy();
        final Object other$terminatedBy = other.getTerminatedBy();
        if (this$terminatedBy == null ? other$terminatedBy != null : !this$terminatedBy.equals(other$terminatedBy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractAgreementTerminationInfo;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $terminatedAt = this.getTerminatedAt();
        result = result * PRIME + ($terminatedAt == null ? 43 : $terminatedAt.hashCode());
        final Object $reason = this.getReason();
        result = result * PRIME + ($reason == null ? 43 : $reason.hashCode());
        final Object $detail = this.getDetail();
        result = result * PRIME + ($detail == null ? 43 : $detail.hashCode());
        final Object $terminatedBy = this.getTerminatedBy();
        result = result * PRIME + ($terminatedBy == null ? 43 : $terminatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractAgreementTerminationInfo(terminatedAt=" + this.getTerminatedAt() + ", reason=" + this.getReason() + ", detail=" + this.getDetail() + ", terminatedBy=" + this.getTerminatedBy() + ")";
    }

    public ContractAgreementTerminationInfo(final OffsetDateTime terminatedAt, final String reason, final String detail, final ContractTerminatedBy terminatedBy) {
        this.terminatedAt = terminatedAt;
        this.reason = reason;
        this.detail = detail;
        this.terminatedBy = terminatedBy;
    }

    public ContractAgreementTerminationInfo() {
    }
}
