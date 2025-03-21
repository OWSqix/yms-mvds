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
import de.sovity.edc.ce.api.common.model.UiAsset;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Catalog Data Offer as required by the UI")
public class UiDataOffer {
    @Schema(description = "Connector Endpoint", requiredMode = Schema.RequiredMode.REQUIRED)
    private String endpoint;
    @Schema(description = "Participant ID. Required for initiating transfers.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String participantId;
    @Schema(description = "Asset Information", requiredMode = Schema.RequiredMode.REQUIRED)
    private UiAsset asset;
    @Schema(description = "Available Contract Offers", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<UiContractOffer> contractOffers;


    public static class UiDataOfferBuilder {
        private String endpoint;
        private String participantId;
        private UiAsset asset;
        private List<UiContractOffer> contractOffers;

        UiDataOfferBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiDataOffer.UiDataOfferBuilder endpoint(final String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataOffer.UiDataOfferBuilder participantId(final String participantId) {
            this.participantId = participantId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataOffer.UiDataOfferBuilder asset(final UiAsset asset) {
            this.asset = asset;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataOffer.UiDataOfferBuilder contractOffers(final List<UiContractOffer> contractOffers) {
            this.contractOffers = contractOffers;
            return this;
        }

        public UiDataOffer build() {
            return new UiDataOffer(this.endpoint, this.participantId, this.asset, this.contractOffers);
        }

        @Override
        public String toString() {
            return "UiDataOffer.UiDataOfferBuilder(endpoint=" + this.endpoint + ", participantId=" + this.participantId + ", asset=" + this.asset + ", contractOffers=" + this.contractOffers + ")";
        }
    }

    public static UiDataOffer.UiDataOfferBuilder builder() {
        return new UiDataOffer.UiDataOfferBuilder();
    }

    public UiDataOffer.UiDataOfferBuilder toBuilder() {
        return new UiDataOffer.UiDataOfferBuilder().endpoint(this.endpoint).participantId(this.participantId).asset(this.asset).contractOffers(this.contractOffers);
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public UiAsset getAsset() {
        return this.asset;
    }

    public List<UiContractOffer> getContractOffers() {
        return this.contractOffers;
    }

    public void setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
    }

    public void setParticipantId(final String participantId) {
        this.participantId = participantId;
    }

    public void setAsset(final UiAsset asset) {
        this.asset = asset;
    }

    public void setContractOffers(final List<UiContractOffer> contractOffers) {
        this.contractOffers = contractOffers;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiDataOffer)) return false;
        final UiDataOffer other = (UiDataOffer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$endpoint = this.getEndpoint();
        final Object other$endpoint = other.getEndpoint();
        if (this$endpoint == null ? other$endpoint != null : !this$endpoint.equals(other$endpoint)) return false;
        final Object this$participantId = this.getParticipantId();
        final Object other$participantId = other.getParticipantId();
        if (this$participantId == null ? other$participantId != null : !this$participantId.equals(other$participantId)) return false;
        final Object this$asset = this.getAsset();
        final Object other$asset = other.getAsset();
        if (this$asset == null ? other$asset != null : !this$asset.equals(other$asset)) return false;
        final Object this$contractOffers = this.getContractOffers();
        final Object other$contractOffers = other.getContractOffers();
        if (this$contractOffers == null ? other$contractOffers != null : !this$contractOffers.equals(other$contractOffers)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiDataOffer;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $endpoint = this.getEndpoint();
        result = result * PRIME + ($endpoint == null ? 43 : $endpoint.hashCode());
        final Object $participantId = this.getParticipantId();
        result = result * PRIME + ($participantId == null ? 43 : $participantId.hashCode());
        final Object $asset = this.getAsset();
        result = result * PRIME + ($asset == null ? 43 : $asset.hashCode());
        final Object $contractOffers = this.getContractOffers();
        result = result * PRIME + ($contractOffers == null ? 43 : $contractOffers.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiDataOffer(endpoint=" + this.getEndpoint() + ", participantId=" + this.getParticipantId() + ", asset=" + this.getAsset() + ", contractOffers=" + this.getContractOffers() + ")";
    }

    public UiDataOffer(final String endpoint, final String participantId, final UiAsset asset, final List<UiContractOffer> contractOffers) {
        this.endpoint = endpoint;
        this.participantId = participantId;
        this.asset = asset;
        this.contractOffers = contractOffers;
    }

    public UiDataOffer() {
    }
}
