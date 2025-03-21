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
package de.sovity.edc.client;

import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.oauth2.OAuth2ClientCredentials;
import okhttp3.OkHttpClient;
import java.util.function.Consumer;

public class EdcClientBuilder {
    /**
     * Management API Base URL, e.g. https://my-connector.com/control/management
     */
    private String managementApiUrl;
    /**
     * Enables EDC Management API Key authentication.
     */
    private String managementApiKey = "ApiKeyDefaultValue";
    /**
     * Enables OAuth2 "Client Credentials Flow" authentication.
     */
    private OAuth2ClientCredentials oauth2ClientCredentials;
    /**
     * Custom configurer for the {@link ApiClient} and the {@link ApiClient#getHttpClient()}/{@link ApiClient#setHttpClient(OkHttpClient)}
     * for environments with custom authentication mechanisms.
     */
    private Consumer<ApiClient> customConfigurer;

    public EdcClient build() {
        return EdcClientFactory.newClient(this);
    }

    /**
     * Management API Base URL, e.g. https://my-connector.com/control/management
     */
    public String managementApiUrl() {
        return this.managementApiUrl;
    }

    /**
     * Enables EDC Management API Key authentication.
     */
    public String managementApiKey() {
        return this.managementApiKey;
    }

    /**
     * Enables OAuth2 "Client Credentials Flow" authentication.
     */
    public OAuth2ClientCredentials oauth2ClientCredentials() {
        return this.oauth2ClientCredentials;
    }

    /**
     * Custom configurer for the {@link ApiClient} and the {@link ApiClient#getHttpClient()}/{@link ApiClient#setHttpClient(OkHttpClient)}
     * for environments with custom authentication mechanisms.
     */
    public Consumer<ApiClient> customConfigurer() {
        return this.customConfigurer;
    }

    /**
     * Management API Base URL, e.g. https://my-connector.com/control/management
     * @return {@code this}.
     */
    public EdcClientBuilder managementApiUrl(final String managementApiUrl) {
        this.managementApiUrl = managementApiUrl;
        return this;
    }

    /**
     * Enables EDC Management API Key authentication.
     * @return {@code this}.
     */
    public EdcClientBuilder managementApiKey(final String managementApiKey) {
        this.managementApiKey = managementApiKey;
        return this;
    }

    /**
     * Enables OAuth2 "Client Credentials Flow" authentication.
     * @return {@code this}.
     */
    public EdcClientBuilder oauth2ClientCredentials(final OAuth2ClientCredentials oauth2ClientCredentials) {
        this.oauth2ClientCredentials = oauth2ClientCredentials;
        return this;
    }

    /**
     * Custom configurer for the {@link ApiClient} and the {@link ApiClient#getHttpClient()}/{@link ApiClient#setHttpClient(OkHttpClient)}
     * for environments with custom authentication mechanisms.
     * @return {@code this}.
     */
    public EdcClientBuilder customConfigurer(final Consumer<ApiClient> customConfigurer) {
        this.customConfigurer = customConfigurer;
        return this;
    }
}
