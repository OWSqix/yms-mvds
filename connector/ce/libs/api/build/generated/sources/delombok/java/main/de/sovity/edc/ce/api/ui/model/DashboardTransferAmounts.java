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
@Schema(description = "Number of Transfer Processes for given direction.")
public class DashboardTransferAmounts {
    @Schema(description = "Number of Transfer Processes", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numTotal;
    @Schema(description = "Number of running Transfer Processes", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numRunning;
    @Schema(description = "Number of successful Transfer Processes", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numOk;
    @Schema(description = "Number of failed Transfer Processes", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numError;


    public static class DashboardTransferAmountsBuilder {
        private long numTotal;
        private long numRunning;
        private long numOk;
        private long numError;

        DashboardTransferAmountsBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public DashboardTransferAmounts.DashboardTransferAmountsBuilder numTotal(final long numTotal) {
            this.numTotal = numTotal;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardTransferAmounts.DashboardTransferAmountsBuilder numRunning(final long numRunning) {
            this.numRunning = numRunning;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardTransferAmounts.DashboardTransferAmountsBuilder numOk(final long numOk) {
            this.numOk = numOk;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardTransferAmounts.DashboardTransferAmountsBuilder numError(final long numError) {
            this.numError = numError;
            return this;
        }

        public DashboardTransferAmounts build() {
            return new DashboardTransferAmounts(this.numTotal, this.numRunning, this.numOk, this.numError);
        }

        @Override
        public String toString() {
            return "DashboardTransferAmounts.DashboardTransferAmountsBuilder(numTotal=" + this.numTotal + ", numRunning=" + this.numRunning + ", numOk=" + this.numOk + ", numError=" + this.numError + ")";
        }
    }

    public static DashboardTransferAmounts.DashboardTransferAmountsBuilder builder() {
        return new DashboardTransferAmounts.DashboardTransferAmountsBuilder();
    }

    public DashboardTransferAmounts.DashboardTransferAmountsBuilder toBuilder() {
        return new DashboardTransferAmounts.DashboardTransferAmountsBuilder().numTotal(this.numTotal).numRunning(this.numRunning).numOk(this.numOk).numError(this.numError);
    }

    public long getNumTotal() {
        return this.numTotal;
    }

    public long getNumRunning() {
        return this.numRunning;
    }

    public long getNumOk() {
        return this.numOk;
    }

    public long getNumError() {
        return this.numError;
    }

    public void setNumTotal(final long numTotal) {
        this.numTotal = numTotal;
    }

    public void setNumRunning(final long numRunning) {
        this.numRunning = numRunning;
    }

    public void setNumOk(final long numOk) {
        this.numOk = numOk;
    }

    public void setNumError(final long numError) {
        this.numError = numError;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DashboardTransferAmounts)) return false;
        final DashboardTransferAmounts other = (DashboardTransferAmounts) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getNumTotal() != other.getNumTotal()) return false;
        if (this.getNumRunning() != other.getNumRunning()) return false;
        if (this.getNumOk() != other.getNumOk()) return false;
        if (this.getNumError() != other.getNumError()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DashboardTransferAmounts;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $numTotal = this.getNumTotal();
        result = result * PRIME + (int) ($numTotal >>> 32 ^ $numTotal);
        final long $numRunning = this.getNumRunning();
        result = result * PRIME + (int) ($numRunning >>> 32 ^ $numRunning);
        final long $numOk = this.getNumOk();
        result = result * PRIME + (int) ($numOk >>> 32 ^ $numOk);
        final long $numError = this.getNumError();
        result = result * PRIME + (int) ($numError >>> 32 ^ $numError);
        return result;
    }

    @Override
    public String toString() {
        return "DashboardTransferAmounts(numTotal=" + this.getNumTotal() + ", numRunning=" + this.getNumRunning() + ", numOk=" + this.getNumOk() + ", numError=" + this.getNumError() + ")";
    }

    public DashboardTransferAmounts(final long numTotal, final long numRunning, final long numOk, final long numError) {
        this.numTotal = numTotal;
        this.numRunning = numRunning;
        this.numOk = numOk;
        this.numError = numError;
    }

    public DashboardTransferAmounts() {
    }
}
