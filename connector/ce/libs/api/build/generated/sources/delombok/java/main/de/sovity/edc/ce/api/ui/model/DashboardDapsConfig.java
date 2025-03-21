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
@Schema(description = "DAPS Config")
public class DashboardDapsConfig {
    @Schema(description = "Your Connector\'s DAPS Token URL", requiredMode = Schema.RequiredMode.REQUIRED)
    private String tokenUrl;
    @Schema(description = "Your Connector\'s DAPS JWKS URL", requiredMode = Schema.RequiredMode.REQUIRED)
    private String jwksUrl;


    public static class DashboardDapsConfigBuilder {
        private String tokenUrl;
        private String jwksUrl;

        DashboardDapsConfigBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public DashboardDapsConfig.DashboardDapsConfigBuilder tokenUrl(final String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardDapsConfig.DashboardDapsConfigBuilder jwksUrl(final String jwksUrl) {
            this.jwksUrl = jwksUrl;
            return this;
        }

        public DashboardDapsConfig build() {
            return new DashboardDapsConfig(this.tokenUrl, this.jwksUrl);
        }

        @Override
        public String toString() {
            return "DashboardDapsConfig.DashboardDapsConfigBuilder(tokenUrl=" + this.tokenUrl + ", jwksUrl=" + this.jwksUrl + ")";
        }
    }

    public static DashboardDapsConfig.DashboardDapsConfigBuilder builder() {
        return new DashboardDapsConfig.DashboardDapsConfigBuilder();
    }

    public DashboardDapsConfig.DashboardDapsConfigBuilder toBuilder() {
        return new DashboardDapsConfig.DashboardDapsConfigBuilder().tokenUrl(this.tokenUrl).jwksUrl(this.jwksUrl);
    }

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    public String getJwksUrl() {
        return this.jwksUrl;
    }

    public void setTokenUrl(final String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public void setJwksUrl(final String jwksUrl) {
        this.jwksUrl = jwksUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DashboardDapsConfig)) return false;
        final DashboardDapsConfig other = (DashboardDapsConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tokenUrl = this.getTokenUrl();
        final Object other$tokenUrl = other.getTokenUrl();
        if (this$tokenUrl == null ? other$tokenUrl != null : !this$tokenUrl.equals(other$tokenUrl)) return false;
        final Object this$jwksUrl = this.getJwksUrl();
        final Object other$jwksUrl = other.getJwksUrl();
        if (this$jwksUrl == null ? other$jwksUrl != null : !this$jwksUrl.equals(other$jwksUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DashboardDapsConfig;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tokenUrl = this.getTokenUrl();
        result = result * PRIME + ($tokenUrl == null ? 43 : $tokenUrl.hashCode());
        final Object $jwksUrl = this.getJwksUrl();
        result = result * PRIME + ($jwksUrl == null ? 43 : $jwksUrl.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DashboardDapsConfig(tokenUrl=" + this.getTokenUrl() + ", jwksUrl=" + this.getJwksUrl() + ")";
    }

    public DashboardDapsConfig(final String tokenUrl, final String jwksUrl) {
        this.tokenUrl = tokenUrl;
        this.jwksUrl = jwksUrl;
    }

    public DashboardDapsConfig() {
    }
}
