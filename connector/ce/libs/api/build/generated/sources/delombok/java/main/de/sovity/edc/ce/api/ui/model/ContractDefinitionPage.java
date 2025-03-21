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
public class ContractDefinitionPage {
    @Schema(description = "Contract Definition Entries", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ContractDefinitionEntry> contractDefinitions;


    public static class ContractDefinitionPageBuilder {
        private List<ContractDefinitionEntry> contractDefinitions;

        ContractDefinitionPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ContractDefinitionPage.ContractDefinitionPageBuilder contractDefinitions(final List<ContractDefinitionEntry> contractDefinitions) {
            this.contractDefinitions = contractDefinitions;
            return this;
        }

        public ContractDefinitionPage build() {
            return new ContractDefinitionPage(this.contractDefinitions);
        }

        @Override
        public String toString() {
            return "ContractDefinitionPage.ContractDefinitionPageBuilder(contractDefinitions=" + this.contractDefinitions + ")";
        }
    }

    public static ContractDefinitionPage.ContractDefinitionPageBuilder builder() {
        return new ContractDefinitionPage.ContractDefinitionPageBuilder();
    }

    public ContractDefinitionPage.ContractDefinitionPageBuilder toBuilder() {
        return new ContractDefinitionPage.ContractDefinitionPageBuilder().contractDefinitions(this.contractDefinitions);
    }

    public List<ContractDefinitionEntry> getContractDefinitions() {
        return this.contractDefinitions;
    }

    public void setContractDefinitions(final List<ContractDefinitionEntry> contractDefinitions) {
        this.contractDefinitions = contractDefinitions;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContractDefinitionPage)) return false;
        final ContractDefinitionPage other = (ContractDefinitionPage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractDefinitions = this.getContractDefinitions();
        final Object other$contractDefinitions = other.getContractDefinitions();
        if (this$contractDefinitions == null ? other$contractDefinitions != null : !this$contractDefinitions.equals(other$contractDefinitions)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContractDefinitionPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractDefinitions = this.getContractDefinitions();
        result = result * PRIME + ($contractDefinitions == null ? 43 : $contractDefinitions.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ContractDefinitionPage(contractDefinitions=" + this.getContractDefinitions() + ")";
    }

    public ContractDefinitionPage(final List<ContractDefinitionEntry> contractDefinitions) {
        this.contractDefinitions = contractDefinitions;
    }

    public ContractDefinitionPage() {
    }
}
