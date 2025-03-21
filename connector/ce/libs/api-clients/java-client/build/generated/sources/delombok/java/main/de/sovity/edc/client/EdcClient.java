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

import de.sovity.edc.client.gen.api.EnterpriseEditionApi;
import de.sovity.edc.client.gen.api.UiApi;
import de.sovity.edc.client.gen.api.UseCaseApi;

/**
 * API Client for our EDC API Wrapper.
 */
public final class EdcClient {
    private final UiApi uiApi;
    private final UseCaseApi useCaseApi;
    private final EnterpriseEditionApi enterpriseEditionApi;

    public static EdcClientBuilder builder() {
        return new EdcClientBuilder();
    }

    public void testConnection() {
        useCaseApi.getKpis();
    }

    public EdcClient(final UiApi uiApi, final UseCaseApi useCaseApi, final EnterpriseEditionApi enterpriseEditionApi) {
        this.uiApi = uiApi;
        this.useCaseApi = useCaseApi;
        this.enterpriseEditionApi = enterpriseEditionApi;
    }

    public UiApi uiApi() {
        return this.uiApi;
    }

    public UseCaseApi useCaseApi() {
        return this.useCaseApi;
    }

    public EnterpriseEditionApi enterpriseEditionApi() {
        return this.enterpriseEditionApi;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EdcClient)) return false;
        final EdcClient other = (EdcClient) o;
        final Object this$uiApi = this.uiApi();
        final Object other$uiApi = other.uiApi();
        if (this$uiApi == null ? other$uiApi != null : !this$uiApi.equals(other$uiApi)) return false;
        final Object this$useCaseApi = this.useCaseApi();
        final Object other$useCaseApi = other.useCaseApi();
        if (this$useCaseApi == null ? other$useCaseApi != null : !this$useCaseApi.equals(other$useCaseApi)) return false;
        final Object this$enterpriseEditionApi = this.enterpriseEditionApi();
        final Object other$enterpriseEditionApi = other.enterpriseEditionApi();
        if (this$enterpriseEditionApi == null ? other$enterpriseEditionApi != null : !this$enterpriseEditionApi.equals(other$enterpriseEditionApi)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uiApi = this.uiApi();
        result = result * PRIME + ($uiApi == null ? 43 : $uiApi.hashCode());
        final Object $useCaseApi = this.useCaseApi();
        result = result * PRIME + ($useCaseApi == null ? 43 : $useCaseApi.hashCode());
        final Object $enterpriseEditionApi = this.enterpriseEditionApi();
        result = result * PRIME + ($enterpriseEditionApi == null ? 43 : $enterpriseEditionApi.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "EdcClient(uiApi=" + this.uiApi() + ", useCaseApi=" + this.useCaseApi() + ", enterpriseEditionApi=" + this.enterpriseEditionApi() + ")";
    }
}
