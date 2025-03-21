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
import de.sovity.edc.ce.api.common.model.UiPolicy;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Catalog Data Offer\'s Contract Offer as required by the UI")
public class UiContractOffer {
    @Schema(description = "Contract Offer ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contractOfferId;
    @Schema(description = "Policy", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiPolicy policy;


    public static class UiContractOfferBuilder {
        private String contractOfferId;
        private UiPolicy policy;

        UiContractOfferBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiContractOffer.UiContractOfferBuilder contractOfferId(final String contractOfferId) {
            this.contractOfferId = contractOfferId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiContractOffer.UiContractOfferBuilder policy(final UiPolicy policy) {
            this.policy = policy;
            return this;
        }

        public UiContractOffer build() {
            return new UiContractOffer(this.contractOfferId, this.policy);
        }

        @Override
        public String toString() {
            return "UiContractOffer.UiContractOfferBuilder(contractOfferId=" + this.contractOfferId + ", policy=" + this.policy + ")";
        }
    }

    public static UiContractOffer.UiContractOfferBuilder builder() {
        return new UiContractOffer.UiContractOfferBuilder();
    }

    public UiContractOffer.UiContractOfferBuilder toBuilder() {
        return new UiContractOffer.UiContractOfferBuilder().contractOfferId(this.contractOfferId).policy(this.policy);
    }

    public String getContractOfferId() {
        return this.contractOfferId;
    }

    public UiPolicy getPolicy() {
        return this.policy;
    }

    public void setContractOfferId(final String contractOfferId) {
        this.contractOfferId = contractOfferId;
    }

    public void setPolicy(final UiPolicy policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiContractOffer)) return false;
        final UiContractOffer other = (UiContractOffer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contractOfferId = this.getContractOfferId();
        final Object other$contractOfferId = other.getContractOfferId();
        if (this$contractOfferId == null ? other$contractOfferId != null : !this$contractOfferId.equals(other$contractOfferId)) return false;
        final Object this$policy = this.getPolicy();
        final Object other$policy = other.getPolicy();
        if (this$policy == null ? other$policy != null : !this$policy.equals(other$policy)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiContractOffer;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contractOfferId = this.getContractOfferId();
        result = result * PRIME + ($contractOfferId == null ? 43 : $contractOfferId.hashCode());
        final Object $policy = this.getPolicy();
        result = result * PRIME + ($policy == null ? 43 : $policy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiContractOffer(contractOfferId=" + this.getContractOfferId() + ", policy=" + this.getPolicy() + ")";
    }

    public UiContractOffer(final String contractOfferId, final UiPolicy policy) {
        this.contractOfferId = contractOfferId;
        this.policy = policy;
    }

    public UiContractOffer() {
    }
}
