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

import de.sovity.edc.ce.api.common.model.UiAssetCreateRequest;
import de.sovity.edc.ce.api.common.model.UiPolicyExpression;
import io.swagger.v3.oas.annotations.media.Schema;
import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.NOT_REQUIRED;
import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

@Schema(description = "Request to create a data offer")
public class DataOfferCreateRequest {
    @Schema(description = "The asset to create", requiredMode = REQUIRED)
    private UiAssetCreateRequest asset;
    @Schema(requiredMode = REQUIRED)
    private DataOfferPublishType publishType;
    @Schema(description = "Policy Expression. Only relevant if policyType is \'RESTRICTED\'", requiredMode = NOT_REQUIRED)
    private UiPolicyExpression policyExpression;


    public static class DataOfferCreateRequestBuilder {
        private UiAssetCreateRequest asset;
        private DataOfferPublishType publishType;
        private UiPolicyExpression policyExpression;

        DataOfferCreateRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public DataOfferCreateRequest.DataOfferCreateRequestBuilder asset(final UiAssetCreateRequest asset) {
            this.asset = asset;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DataOfferCreateRequest.DataOfferCreateRequestBuilder publishType(final DataOfferPublishType publishType) {
            this.publishType = publishType;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DataOfferCreateRequest.DataOfferCreateRequestBuilder policyExpression(final UiPolicyExpression policyExpression) {
            this.policyExpression = policyExpression;
            return this;
        }

        public DataOfferCreateRequest build() {
            return new DataOfferCreateRequest(this.asset, this.publishType, this.policyExpression);
        }

        @Override
        public String toString() {
            return "DataOfferCreateRequest.DataOfferCreateRequestBuilder(asset=" + this.asset + ", publishType=" + this.publishType + ", policyExpression=" + this.policyExpression + ")";
        }
    }

    public static DataOfferCreateRequest.DataOfferCreateRequestBuilder builder() {
        return new DataOfferCreateRequest.DataOfferCreateRequestBuilder();
    }

    public DataOfferCreateRequest.DataOfferCreateRequestBuilder toBuilder() {
        return new DataOfferCreateRequest.DataOfferCreateRequestBuilder().asset(this.asset).publishType(this.publishType).policyExpression(this.policyExpression);
    }

    public UiAssetCreateRequest getAsset() {
        return this.asset;
    }

    public DataOfferPublishType getPublishType() {
        return this.publishType;
    }

    public UiPolicyExpression getPolicyExpression() {
        return this.policyExpression;
    }

    public void setAsset(final UiAssetCreateRequest asset) {
        this.asset = asset;
    }

    public void setPublishType(final DataOfferPublishType publishType) {
        this.publishType = publishType;
    }

    public void setPolicyExpression(final UiPolicyExpression policyExpression) {
        this.policyExpression = policyExpression;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataOfferCreateRequest)) return false;
        final DataOfferCreateRequest other = (DataOfferCreateRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$asset = this.getAsset();
        final Object other$asset = other.getAsset();
        if (this$asset == null ? other$asset != null : !this$asset.equals(other$asset)) return false;
        final Object this$publishType = this.getPublishType();
        final Object other$publishType = other.getPublishType();
        if (this$publishType == null ? other$publishType != null : !this$publishType.equals(other$publishType)) return false;
        final Object this$policyExpression = this.getPolicyExpression();
        final Object other$policyExpression = other.getPolicyExpression();
        if (this$policyExpression == null ? other$policyExpression != null : !this$policyExpression.equals(other$policyExpression)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataOfferCreateRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $asset = this.getAsset();
        result = result * PRIME + ($asset == null ? 43 : $asset.hashCode());
        final Object $publishType = this.getPublishType();
        result = result * PRIME + ($publishType == null ? 43 : $publishType.hashCode());
        final Object $policyExpression = this.getPolicyExpression();
        result = result * PRIME + ($policyExpression == null ? 43 : $policyExpression.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DataOfferCreateRequest(asset=" + this.getAsset() + ", publishType=" + this.getPublishType() + ", policyExpression=" + this.getPolicyExpression() + ")";
    }

    public DataOfferCreateRequest(final UiAssetCreateRequest asset, final DataOfferPublishType publishType, final UiPolicyExpression policyExpression) {
        this.asset = asset;
        this.publishType = publishType;
        this.policyExpression = policyExpression;
    }

    public DataOfferCreateRequest() {
    }
}
