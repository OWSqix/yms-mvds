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
package de.sovity.edc.client.oauth2;

import lombok.NonNull;

/**
 * Credentials for connecting to the EDC via the OAuth2 "Client Credentials" flow.
 */
public class OAuth2ClientCredentials {
    @NonNull
    private String tokenUrl;
    @NonNull
    private String clientId;
    @NonNull
    private String clientSecret;


    public static class OAuth2ClientCredentialsBuilder {
        private String tokenUrl;
        private String clientId;
        private String clientSecret;

        OAuth2ClientCredentialsBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder tokenUrl(@NonNull final String tokenUrl) {
            if (tokenUrl == null) {
                throw new NullPointerException("tokenUrl is marked non-null but is null");
            }
            this.tokenUrl = tokenUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder clientId(@NonNull final String clientId) {
            if (clientId == null) {
                throw new NullPointerException("clientId is marked non-null but is null");
            }
            this.clientId = clientId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder clientSecret(@NonNull final String clientSecret) {
            if (clientSecret == null) {
                throw new NullPointerException("clientSecret is marked non-null but is null");
            }
            this.clientSecret = clientSecret;
            return this;
        }

        public OAuth2ClientCredentials build() {
            return new OAuth2ClientCredentials(this.tokenUrl, this.clientId, this.clientSecret);
        }

        @Override
        public String toString() {
            return "OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder(tokenUrl=" + this.tokenUrl + ", clientId=" + this.clientId + ", clientSecret=" + this.clientSecret + ")";
        }
    }

    public static OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder builder() {
        return new OAuth2ClientCredentials.OAuth2ClientCredentialsBuilder();
    }

    @NonNull
    public String getTokenUrl() {
        return this.tokenUrl;
    }

    @NonNull
    public String getClientId() {
        return this.clientId;
    }

    @NonNull
    public String getClientSecret() {
        return this.clientSecret;
    }

    private OAuth2ClientCredentials(@NonNull final String tokenUrl, @NonNull final String clientId, @NonNull final String clientSecret) {
        if (tokenUrl == null) {
            throw new NullPointerException("tokenUrl is marked non-null but is null");
        }
        if (clientId == null) {
            throw new NullPointerException("clientId is marked non-null but is null");
        }
        if (clientSecret == null) {
            throw new NullPointerException("clientSecret is marked non-null but is null");
        }
        this.tokenUrl = tokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}
