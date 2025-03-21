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
@Schema(description = "Data as required by the UI\'s Contract Agreement Page")
public class ContractAgreementPage {
    @Schema(description = "Contract Agreement Cards", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ContractAgreementCard> contractAgreements;


    public static class ContractAgreementPageBuilder {
        private List<ContractAgreementCard> contractAgreements;

        ContractAgreementPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractAgreementPage.ContractAgreementPageBuilder contractAgreements(final List<ContractAgreementCard> contractAgreements) {
            this.contractAgreements = contractAgreements;
            return this;
        }

        public ContractAgreementPage build() {
            return new ContractAgreementPage(this.contractAgreements);
        }

        @Override
        public String toString() {
            return "ContractAgreementPage.ContractAgreementPageBuilder(contractAgreements=" + this.contractAgreements + ")";
        }
    }

    public static ContractAgreementPage.ContractAgreementPageBuilder builder() {
        return new ContractAgreementPage.ContractAgreementPageBuilder();
    }

    public ContractAgreementPage.ContractAgreementPageBuilder toBuilder() {
        return new ContractAgreementPage.ContractAgreementPageBuilder().contractAgreements(this.contractAgreements);
    }

    public List<ContractAgreementCard> getContractAgreements() {
        return this.contractAgreements;
    }

    public void setContractAgreements(final List<ContractAgreementCard> contractAgreements) {
        this.contractAgreements = contractAgreements;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractAgreementPage)) return false;
        final ContractAgreementPage other = (ContractAgreementPage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractAgreements = this.getContractAgreements();
        final Object other$contractAgreements = other.getContractAgreements();
        if (this$contractAgreements == null ? other$contractAgreements != null : !this$contractAgreements.equals(other$contractAgreements)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractAgreementPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractAgreements = this.getContractAgreements();
        result = result * PRIME + ($contractAgreements == null ? 43 : $contractAgreements.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractAgreementPage(contractAgreements=" + this.getContractAgreements() + ")";
    }

    public ContractAgreementPage(final List<ContractAgreementCard> contractAgreements) {
        this.contractAgreements = contractAgreements;
    }

    public ContractAgreementPage() {
    }
}
