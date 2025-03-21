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
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Data as required by the UI\'s Transfer History Page")
public class TransferHistoryPage {
    @Schema(description = "Transfer History Page Entries", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<TransferHistoryEntry> transferEntries;


    public static class TransferHistoryPageBuilder {
        private List<TransferHistoryEntry> transferEntries;

        TransferHistoryPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public TransferHistoryPage.TransferHistoryPageBuilder transferEntries(final List<TransferHistoryEntry> transferEntries) {
            this.transferEntries = transferEntries;
            return this;
        }

        public TransferHistoryPage build() {
            return new TransferHistoryPage(this.transferEntries);
        }

        @Override
        public String toString() {
            return "TransferHistoryPage.TransferHistoryPageBuilder(transferEntries=" + this.transferEntries + ")";
        }
    }

    public static TransferHistoryPage.TransferHistoryPageBuilder builder() {
        return new TransferHistoryPage.TransferHistoryPageBuilder();
    }

    public TransferHistoryPage.TransferHistoryPageBuilder toBuilder() {
        return new TransferHistoryPage.TransferHistoryPageBuilder().transferEntries(this.transferEntries);
    }

    public List<TransferHistoryEntry> getTransferEntries() {
        return this.transferEntries;
    }

    public void setTransferEntries(final List<TransferHistoryEntry> transferEntries) {
        this.transferEntries = transferEntries;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransferHistoryPage)) return false;
        final TransferHistoryPage other = (TransferHistoryPage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$transferEntries = this.getTransferEntries();
        final Object other$transferEntries = other.getTransferEntries();
        if (this$transferEntries == null ? other$transferEntries != null : !this$transferEntries.equals(other$transferEntries)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransferHistoryPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $transferEntries = this.getTransferEntries();
        result = result * PRIME + ($transferEntries == null ? 43 : $transferEntries.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TransferHistoryPage(transferEntries=" + this.getTransferEntries() + ")";
    }

    public TransferHistoryPage(final List<TransferHistoryEntry> transferEntries) {
        this.transferEntries = transferEntries;
    }

    public TransferHistoryPage() {
    }
}
