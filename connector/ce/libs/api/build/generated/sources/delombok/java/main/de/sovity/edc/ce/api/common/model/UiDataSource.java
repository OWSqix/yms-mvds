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
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Type-safe data source as supported by the sovity product landscape. Contains extension points for using custom data address properties.")
public class UiDataSource {
    @Schema(description = "Data Address Type.", defaultValue = "CUSTOM", requiredMode = Schema.RequiredMode.REQUIRED)
    private DataSourceType type;
    @Schema(description = "Only for type HTTP_DATA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private UiDataSourceHttpData httpData;
    @Schema(description = "Only for type ON_REQUEST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private UiDataSourceOnRequest onRequest;
    @Schema(description = "For all types. Custom Data Address Properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Map<String, String> customProperties;


    public static class UiDataSourceBuilder {
        private DataSourceType type;
        private UiDataSourceHttpData httpData;
        private UiDataSourceOnRequest onRequest;
        private Map<String, String> customProperties;

        UiDataSourceBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiDataSource.UiDataSourceBuilder type(final DataSourceType type) {
            this.type = type;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSource.UiDataSourceBuilder httpData(final UiDataSourceHttpData httpData) {
            this.httpData = httpData;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSource.UiDataSourceBuilder onRequest(final UiDataSourceOnRequest onRequest) {
            this.onRequest = onRequest;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSource.UiDataSourceBuilder customProperties(final Map<String, String> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        public UiDataSource build() {
            return new UiDataSource(this.type, this.httpData, this.onRequest, this.customProperties);
        }

        @Override
        public String toString() {
            return "UiDataSource.UiDataSourceBuilder(type=" + this.type + ", httpData=" + this.httpData + ", onRequest=" + this.onRequest + ", customProperties=" + this.customProperties + ")";
        }
    }

    public static UiDataSource.UiDataSourceBuilder builder() {
        return new UiDataSource.UiDataSourceBuilder();
    }

    public UiDataSource.UiDataSourceBuilder toBuilder() {
        return new UiDataSource.UiDataSourceBuilder().type(this.type).httpData(this.httpData).onRequest(this.onRequest).customProperties(this.customProperties);
    }

    public DataSourceType getType() {
        return this.type;
    }

    public UiDataSourceHttpData getHttpData() {
        return this.httpData;
    }

    public UiDataSourceOnRequest getOnRequest() {
        return this.onRequest;
    }

    public Map<String, String> getCustomProperties() {
        return this.customProperties;
    }

    public void setType(final DataSourceType type) {
        this.type = type;
    }

    public void setHttpData(final UiDataSourceHttpData httpData) {
        this.httpData = httpData;
    }

    public void setOnRequest(final UiDataSourceOnRequest onRequest) {
        this.onRequest = onRequest;
    }

    public void setCustomProperties(final Map<String, String> customProperties) {
        this.customProperties = customProperties;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiDataSource)) return false;
        final UiDataSource other = (UiDataSource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$httpData = this.getHttpData();
        final Object other$httpData = other.getHttpData();
        if (this$httpData == null ? other$httpData != null : !this$httpData.equals(other$httpData)) return false;
        final Object this$onRequest = this.getOnRequest();
        final Object other$onRequest = other.getOnRequest();
        if (this$onRequest == null ? other$onRequest != null : !this$onRequest.equals(other$onRequest)) return false;
        final Object this$customProperties = this.getCustomProperties();
        final Object other$customProperties = other.getCustomProperties();
        if (this$customProperties == null ? other$customProperties != null : !this$customProperties.equals(other$customProperties)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiDataSource;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $httpData = this.getHttpData();
        result = result * PRIME + ($httpData == null ? 43 : $httpData.hashCode());
        final Object $onRequest = this.getOnRequest();
        result = result * PRIME + ($onRequest == null ? 43 : $onRequest.hashCode());
        final Object $customProperties = this.getCustomProperties();
        result = result * PRIME + ($customProperties == null ? 43 : $customProperties.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiDataSource(type=" + this.getType() + ", httpData=" + this.getHttpData() + ", onRequest=" + this.getOnRequest() + ", customProperties=" + this.getCustomProperties() + ")";
    }

    public UiDataSource(final DataSourceType type, final UiDataSourceHttpData httpData, final UiDataSourceOnRequest onRequest, final Map<String, String> customProperties) {
        this.type = type;
        this.httpData = httpData;
        this.onRequest = onRequest;
        this.customProperties = customProperties;
    }

    public UiDataSource() {
    }
}
