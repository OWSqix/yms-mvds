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
import de.sovity.edc.ce.api.ui.model.TransferProcessSimplifiedState;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferProcessStatesDto {
    @Schema(description = "States and count of incoming transferprocess counts", requiredMode = Schema.RequiredMode.REQUIRED)
    private Map<TransferProcessSimplifiedState, Long> incomingTransferProcessCounts;
    @Schema(description = "States and counts of outgoing transferprocess counts", requiredMode = Schema.RequiredMode.REQUIRED)
    private Map<TransferProcessSimplifiedState, Long> outgoingTransferProcessCounts;


    public static class TransferProcessStatesDtoBuilder {
        private Map<TransferProcessSimplifiedState, Long> incomingTransferProcessCounts;
        private Map<TransferProcessSimplifiedState, Long> outgoingTransferProcessCounts;

        TransferProcessStatesDtoBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public TransferProcessStatesDto.TransferProcessStatesDtoBuilder incomingTransferProcessCounts(final Map<TransferProcessSimplifiedState, Long> incomingTransferProcessCounts) {
            this.incomingTransferProcessCounts = incomingTransferProcessCounts;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public TransferProcessStatesDto.TransferProcessStatesDtoBuilder outgoingTransferProcessCounts(final Map<TransferProcessSimplifiedState, Long> outgoingTransferProcessCounts) {
            this.outgoingTransferProcessCounts = outgoingTransferProcessCounts;
            return this;
        }

        public TransferProcessStatesDto build() {
            return new TransferProcessStatesDto(this.incomingTransferProcessCounts, this.outgoingTransferProcessCounts);
        }

        @Override
        public String toString() {
            return "TransferProcessStatesDto.TransferProcessStatesDtoBuilder(incomingTransferProcessCounts=" + this.incomingTransferProcessCounts + ", outgoingTransferProcessCounts=" + this.outgoingTransferProcessCounts + ")";
        }
    }

    public static TransferProcessStatesDto.TransferProcessStatesDtoBuilder builder() {
        return new TransferProcessStatesDto.TransferProcessStatesDtoBuilder();
    }

    public TransferProcessStatesDto.TransferProcessStatesDtoBuilder toBuilder() {
        return new TransferProcessStatesDto.TransferProcessStatesDtoBuilder().incomingTransferProcessCounts(this.incomingTransferProcessCounts).outgoingTransferProcessCounts(this.outgoingTransferProcessCounts);
    }

    public Map<TransferProcessSimplifiedState, Long> getIncomingTransferProcessCounts() {
        return this.incomingTransferProcessCounts;
    }

    public Map<TransferProcessSimplifiedState, Long> getOutgoingTransferProcessCounts() {
        return this.outgoingTransferProcessCounts;
    }

    public void setIncomingTransferProcessCounts(final Map<TransferProcessSimplifiedState, Long> incomingTransferProcessCounts) {
        this.incomingTransferProcessCounts = incomingTransferProcessCounts;
    }

    public void setOutgoingTransferProcessCounts(final Map<TransferProcessSimplifiedState, Long> outgoingTransferProcessCounts) {
        this.outgoingTransferProcessCounts = outgoingTransferProcessCounts;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransferProcessStatesDto)) return false;
        final TransferProcessStatesDto other = (TransferProcessStatesDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$incomingTransferProcessCounts = this.getIncomingTransferProcessCounts();
        final Object other$incomingTransferProcessCounts = other.getIncomingTransferProcessCounts();
        if (this$incomingTransferProcessCounts == null ? other$incomingTransferProcessCounts != null : !this$incomingTransferProcessCounts.equals(other$incomingTransferProcessCounts)) return false;
        final Object this$outgoingTransferProcessCounts = this.getOutgoingTransferProcessCounts();
        final Object other$outgoingTransferProcessCounts = other.getOutgoingTransferProcessCounts();
        if (this$outgoingTransferProcessCounts == null ? other$outgoingTransferProcessCounts != null : !this$outgoingTransferProcessCounts.equals(other$outgoingTransferProcessCounts)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransferProcessStatesDto;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $incomingTransferProcessCounts = this.getIncomingTransferProcessCounts();
        result = result * PRIME + ($incomingTransferProcessCounts == null ? 43 : $incomingTransferProcessCounts.hashCode());
        final Object $outgoingTransferProcessCounts = this.getOutgoingTransferProcessCounts();
        result = result * PRIME + ($outgoingTransferProcessCounts == null ? 43 : $outgoingTransferProcessCounts.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TransferProcessStatesDto(incomingTransferProcessCounts=" + this.getIncomingTransferProcessCounts() + ", outgoingTransferProcessCounts=" + this.getOutgoingTransferProcessCounts() + ")";
    }

    public TransferProcessStatesDto(final Map<TransferProcessSimplifiedState, Long> incomingTransferProcessCounts, final Map<TransferProcessSimplifiedState, Long> outgoingTransferProcessCounts) {
        this.incomingTransferProcessCounts = incomingTransferProcessCounts;
        this.outgoingTransferProcessCounts = outgoingTransferProcessCounts;
    }

    public TransferProcessStatesDto() {
    }
}
