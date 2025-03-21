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
@Schema(description = "HTTP_DATA type Data Source.")
public class UiDataSourceHttpData {
    @Schema(description = "HTTP Request Method", defaultValue = "GET", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private UiDataSourceHttpDataMethod method;
    @Schema(description = "HTTP Request URL. If parameterized, additional pathParams will be joined onto existing one.", example = "https://my-app.my-org.com/api/edc-data-offer/v1", requiredMode = Schema.RequiredMode.REQUIRED)
    private String baseUrl;
    @Schema(description = "HTTP Request Query Params / Query String.", example = "search=example&limit=10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String queryString;
    @Schema(description = "Auth Header name. The auth header is handled specially by the EDC as its value can be read from a vault.", example = "Authorization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String authHeaderName;
    @Schema(description = "Auth Header value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private SecretValue authHeaderValue;
    @Schema(description = "HTTP Request Headers. HTTP Header Parameterization is not available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Map<String, String> headers;
    @Schema(description = "Enable Method Parameterization. This forces consumers to provide" + " a method, otherwise the transfer will fail.", defaultValue = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean enableMethodParameterization;
    @Schema(description = "Enable Path Parameterization.", defaultValue = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean enablePathParameterization;
    @Schema(description = "Enable Query Parameterization. Any additionally provided queryString" + " will be merged with the existing one.", defaultValue = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean enableQueryParameterization;
    @Schema(description = "Enable Body Parameterization. Forces the provider to provide both a" + " request body and a content type. Only Methods POST, PUT and PATCH allow request bodies.", defaultValue = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean enableBodyParameterization;


    public static class UiDataSourceHttpDataBuilder {
        private UiDataSourceHttpDataMethod method;
        private String baseUrl;
        private String queryString;
        private String authHeaderName;
        private SecretValue authHeaderValue;
        private Map<String, String> headers;
        private Boolean enableMethodParameterization;
        private Boolean enablePathParameterization;
        private Boolean enableQueryParameterization;
        private Boolean enableBodyParameterization;

        UiDataSourceHttpDataBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder method(final UiDataSourceHttpDataMethod method) {
            this.method = method;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder baseUrl(final String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder queryString(final String queryString) {
            this.queryString = queryString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder authHeaderName(final String authHeaderName) {
            this.authHeaderName = authHeaderName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder authHeaderValue(final SecretValue authHeaderValue) {
            this.authHeaderValue = authHeaderValue;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder headers(final Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder enableMethodParameterization(final Boolean enableMethodParameterization) {
            this.enableMethodParameterization = enableMethodParameterization;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder enablePathParameterization(final Boolean enablePathParameterization) {
            this.enablePathParameterization = enablePathParameterization;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder enableQueryParameterization(final Boolean enableQueryParameterization) {
            this.enableQueryParameterization = enableQueryParameterization;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiDataSourceHttpData.UiDataSourceHttpDataBuilder enableBodyParameterization(final Boolean enableBodyParameterization) {
            this.enableBodyParameterization = enableBodyParameterization;
            return this;
        }

        public UiDataSourceHttpData build() {
            return new UiDataSourceHttpData(this.method, this.baseUrl, this.queryString, this.authHeaderName, this.authHeaderValue, this.headers, this.enableMethodParameterization, this.enablePathParameterization, this.enableQueryParameterization, this.enableBodyParameterization);
        }

        @Override
        public String toString() {
            return "UiDataSourceHttpData.UiDataSourceHttpDataBuilder(method=" + this.method + ", baseUrl=" + this.baseUrl + ", queryString=" + this.queryString + ", authHeaderName=" + this.authHeaderName + ", authHeaderValue=" + this.authHeaderValue + ", headers=" + this.headers + ", enableMethodParameterization=" + this.enableMethodParameterization + ", enablePathParameterization=" + this.enablePathParameterization + ", enableQueryParameterization=" + this.enableQueryParameterization + ", enableBodyParameterization=" + this.enableBodyParameterization + ")";
        }
    }

    public static UiDataSourceHttpData.UiDataSourceHttpDataBuilder builder() {
        return new UiDataSourceHttpData.UiDataSourceHttpDataBuilder();
    }

    public UiDataSourceHttpData.UiDataSourceHttpDataBuilder toBuilder() {
        return new UiDataSourceHttpData.UiDataSourceHttpDataBuilder().method(this.method).baseUrl(this.baseUrl).queryString(this.queryString).authHeaderName(this.authHeaderName).authHeaderValue(this.authHeaderValue).headers(this.headers).enableMethodParameterization(this.enableMethodParameterization).enablePathParameterization(this.enablePathParameterization).enableQueryParameterization(this.enableQueryParameterization).enableBodyParameterization(this.enableBodyParameterization);
    }

    public UiDataSourceHttpDataMethod getMethod() {
        return this.method;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getAuthHeaderName() {
        return this.authHeaderName;
    }

    public SecretValue getAuthHeaderValue() {
        return this.authHeaderValue;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Boolean getEnableMethodParameterization() {
        return this.enableMethodParameterization;
    }

    public Boolean getEnablePathParameterization() {
        return this.enablePathParameterization;
    }

    public Boolean getEnableQueryParameterization() {
        return this.enableQueryParameterization;
    }

    public Boolean getEnableBodyParameterization() {
        return this.enableBodyParameterization;
    }

    public void setMethod(final UiDataSourceHttpDataMethod method) {
        this.method = method;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setQueryString(final String queryString) {
        this.queryString = queryString;
    }

    public void setAuthHeaderName(final String authHeaderName) {
        this.authHeaderName = authHeaderName;
    }

    public void setAuthHeaderValue(final SecretValue authHeaderValue) {
        this.authHeaderValue = authHeaderValue;
    }

    public void setHeaders(final Map<String, String> headers) {
        this.headers = headers;
    }

    public void setEnableMethodParameterization(final Boolean enableMethodParameterization) {
        this.enableMethodParameterization = enableMethodParameterization;
    }

    public void setEnablePathParameterization(final Boolean enablePathParameterization) {
        this.enablePathParameterization = enablePathParameterization;
    }

    public void setEnableQueryParameterization(final Boolean enableQueryParameterization) {
        this.enableQueryParameterization = enableQueryParameterization;
    }

    public void setEnableBodyParameterization(final Boolean enableBodyParameterization) {
        this.enableBodyParameterization = enableBodyParameterization;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiDataSourceHttpData)) return false;
        final UiDataSourceHttpData other = (UiDataSourceHttpData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$enableMethodParameterization = this.getEnableMethodParameterization();
        final Object other$enableMethodParameterization = other.getEnableMethodParameterization();
        if (this$enableMethodParameterization == null ? other$enableMethodParameterization != null : !this$enableMethodParameterization.equals(other$enableMethodParameterization)) return false;
        final Object this$enablePathParameterization = this.getEnablePathParameterization();
        final Object other$enablePathParameterization = other.getEnablePathParameterization();
        if (this$enablePathParameterization == null ? other$enablePathParameterization != null : !this$enablePathParameterization.equals(other$enablePathParameterization)) return false;
        final Object this$enableQueryParameterization = this.getEnableQueryParameterization();
        final Object other$enableQueryParameterization = other.getEnableQueryParameterization();
        if (this$enableQueryParameterization == null ? other$enableQueryParameterization != null : !this$enableQueryParameterization.equals(other$enableQueryParameterization)) return false;
        final Object this$enableBodyParameterization = this.getEnableBodyParameterization();
        final Object other$enableBodyParameterization = other.getEnableBodyParameterization();
        if (this$enableBodyParameterization == null ? other$enableBodyParameterization != null : !this$enableBodyParameterization.equals(other$enableBodyParameterization)) return false;
        final Object this$method = this.getMethod();
        final Object other$method = other.getMethod();
        if (this$method == null ? other$method != null : !this$method.equals(other$method)) return false;
        final Object this$baseUrl = this.getBaseUrl();
        final Object other$baseUrl = other.getBaseUrl();
        if (this$baseUrl == null ? other$baseUrl != null : !this$baseUrl.equals(other$baseUrl)) return false;
        final Object this$queryString = this.getQueryString();
        final Object other$queryString = other.getQueryString();
        if (this$queryString == null ? other$queryString != null : !this$queryString.equals(other$queryString)) return false;
        final Object this$authHeaderName = this.getAuthHeaderName();
        final Object other$authHeaderName = other.getAuthHeaderName();
        if (this$authHeaderName == null ? other$authHeaderName != null : !this$authHeaderName.equals(other$authHeaderName)) return false;
        final Object this$authHeaderValue = this.getAuthHeaderValue();
        final Object other$authHeaderValue = other.getAuthHeaderValue();
        if (this$authHeaderValue == null ? other$authHeaderValue != null : !this$authHeaderValue.equals(other$authHeaderValue)) return false;
        final Object this$headers = this.getHeaders();
        final Object other$headers = other.getHeaders();
        if (this$headers == null ? other$headers != null : !this$headers.equals(other$headers)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiDataSourceHttpData;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $enableMethodParameterization = this.getEnableMethodParameterization();
        result = result * PRIME + ($enableMethodParameterization == null ? 43 : $enableMethodParameterization.hashCode());
        final Object $enablePathParameterization = this.getEnablePathParameterization();
        result = result * PRIME + ($enablePathParameterization == null ? 43 : $enablePathParameterization.hashCode());
        final Object $enableQueryParameterization = this.getEnableQueryParameterization();
        result = result * PRIME + ($enableQueryParameterization == null ? 43 : $enableQueryParameterization.hashCode());
        final Object $enableBodyParameterization = this.getEnableBodyParameterization();
        result = result * PRIME + ($enableBodyParameterization == null ? 43 : $enableBodyParameterization.hashCode());
        final Object $method = this.getMethod();
        result = result * PRIME + ($method == null ? 43 : $method.hashCode());
        final Object $baseUrl = this.getBaseUrl();
        result = result * PRIME + ($baseUrl == null ? 43 : $baseUrl.hashCode());
        final Object $queryString = this.getQueryString();
        result = result * PRIME + ($queryString == null ? 43 : $queryString.hashCode());
        final Object $authHeaderName = this.getAuthHeaderName();
        result = result * PRIME + ($authHeaderName == null ? 43 : $authHeaderName.hashCode());
        final Object $authHeaderValue = this.getAuthHeaderValue();
        result = result * PRIME + ($authHeaderValue == null ? 43 : $authHeaderValue.hashCode());
        final Object $headers = this.getHeaders();
        result = result * PRIME + ($headers == null ? 43 : $headers.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiDataSourceHttpData(method=" + this.getMethod() + ", baseUrl=" + this.getBaseUrl() + ", queryString=" + this.getQueryString() + ", authHeaderName=" + this.getAuthHeaderName() + ", authHeaderValue=" + this.getAuthHeaderValue() + ", headers=" + this.getHeaders() + ", enableMethodParameterization=" + this.getEnableMethodParameterization() + ", enablePathParameterization=" + this.getEnablePathParameterization() + ", enableQueryParameterization=" + this.getEnableQueryParameterization() + ", enableBodyParameterization=" + this.getEnableBodyParameterization() + ")";
    }

    public UiDataSourceHttpData(final UiDataSourceHttpDataMethod method, final String baseUrl, final String queryString, final String authHeaderName, final SecretValue authHeaderValue, final Map<String, String> headers, final Boolean enableMethodParameterization, final Boolean enablePathParameterization, final Boolean enableQueryParameterization, final Boolean enableBodyParameterization) {
        this.method = method;
        this.baseUrl = baseUrl;
        this.queryString = queryString;
        this.authHeaderName = authHeaderName;
        this.authHeaderValue = authHeaderValue;
        this.headers = headers;
        this.enableMethodParameterization = enableMethodParameterization;
        this.enablePathParameterization = enablePathParameterization;
        this.enableQueryParameterization = enableQueryParameterization;
        this.enableBodyParameterization = enableBodyParameterization;
    }

    public UiDataSourceHttpData() {
    }
}
