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
@Schema(description = "Filters for querying a Contract Contract Agreement Page")
public class ContractAgreementPageQuery {
    @Schema(description = "Optionally filter the resulting contract agreements by their termination status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private ContractTerminationStatus terminationStatus;

    public ContractTerminationStatus getTerminationStatus() {
        return this.terminationStatus;
    }

    public void setTerminationStatus(final ContractTerminationStatus terminationStatus) {
        this.terminationStatus = terminationStatus;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractAgreementPageQuery)) return false;
        final ContractAgreementPageQuery other = (ContractAgreementPageQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$terminationStatus = this.getTerminationStatus();
        final Object other$terminationStatus = other.getTerminationStatus();
        if (this$terminationStatus == null ? other$terminationStatus != null : !this$terminationStatus.equals(other$terminationStatus)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractAgreementPageQuery;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $terminationStatus = this.getTerminationStatus();
        result = result * PRIME + ($terminationStatus == null ? 43 : $terminationStatus.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractAgreementPageQuery(terminationStatus=" + this.getTerminationStatus() + ")";
    }

    public ContractAgreementPageQuery(final ContractTerminationStatus terminationStatus) {
        this.terminationStatus = terminationStatus;
    }

    public ContractAgreementPageQuery() {
    }
}
