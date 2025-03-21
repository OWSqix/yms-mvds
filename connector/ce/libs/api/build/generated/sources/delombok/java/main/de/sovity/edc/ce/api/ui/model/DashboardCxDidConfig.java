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

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Managed Identity Wallet (MIW) Config")
public class DashboardCxDidConfig {
    @Schema(description = "My DID / edc.iam.issuer.id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String myDid;
    @Schema(description = "Wallet Token Url / edc.iam.sts.oauth.token.url", requiredMode = Schema.RequiredMode.REQUIRED)
    private String walletTokenUrl;
    @Schema(description = "Trusted VC Issuer / edc.iam.trusted-issuer.cofinity.id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String trustedVcIssuer;
    @Schema(description = "BDRS Url / tx.iam.iatp.bdrs.server.url", requiredMode = Schema.RequiredMode.REQUIRED)
    private String bdrsUrl;
    @Schema(description = "STS DIM Url / edc.iam.sts.dim.url", requiredMode = Schema.RequiredMode.REQUIRED)
    private String dimUrl;

    public String getMyDid() {
        return this.myDid;
    }

    public String getWalletTokenUrl() {
        return this.walletTokenUrl;
    }

    public String getTrustedVcIssuer() {
        return this.trustedVcIssuer;
    }

    public String getBdrsUrl() {
        return this.bdrsUrl;
    }

    public String getDimUrl() {
        return this.dimUrl;
    }

    public void setMyDid(final String myDid) {
        this.myDid = myDid;
    }

    public void setWalletTokenUrl(final String walletTokenUrl) {
        this.walletTokenUrl = walletTokenUrl;
    }

    public void setTrustedVcIssuer(final String trustedVcIssuer) {
        this.trustedVcIssuer = trustedVcIssuer;
    }

    public void setBdrsUrl(final String bdrsUrl) {
        this.bdrsUrl = bdrsUrl;
    }

    public void setDimUrl(final String dimUrl) {
        this.dimUrl = dimUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DashboardCxDidConfig)) return false;
        final DashboardCxDidConfig other = (DashboardCxDidConfig) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$myDid = this.getMyDid();
        final Object other$myDid = other.getMyDid();
        if (this$myDid == null ? other$myDid != null : !this$myDid.equals(other$myDid)) return false;
        final Object this$walletTokenUrl = this.getWalletTokenUrl();
        final Object other$walletTokenUrl = other.getWalletTokenUrl();
        if (this$walletTokenUrl == null ? other$walletTokenUrl != null : !this$walletTokenUrl.equals(other$walletTokenUrl)) return false;
        final Object this$trustedVcIssuer = this.getTrustedVcIssuer();
        final Object other$trustedVcIssuer = other.getTrustedVcIssuer();
        if (this$trustedVcIssuer == null ? other$trustedVcIssuer != null : !this$trustedVcIssuer.equals(other$trustedVcIssuer)) return false;
        final Object this$bdrsUrl = this.getBdrsUrl();
        final Object other$bdrsUrl = other.getBdrsUrl();
        if (this$bdrsUrl == null ? other$bdrsUrl != null : !this$bdrsUrl.equals(other$bdrsUrl)) return false;
        final Object this$dimUrl = this.getDimUrl();
        final Object other$dimUrl = other.getDimUrl();
        if (this$dimUrl == null ? other$dimUrl != null : !this$dimUrl.equals(other$dimUrl)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DashboardCxDidConfig;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $myDid = this.getMyDid();
        result = result * PRIME + ($myDid == null ? 43 : $myDid.hashCode());
        final Object $walletTokenUrl = this.getWalletTokenUrl();
        result = result * PRIME + ($walletTokenUrl == null ? 43 : $walletTokenUrl.hashCode());
        final Object $trustedVcIssuer = this.getTrustedVcIssuer();
        result = result * PRIME + ($trustedVcIssuer == null ? 43 : $trustedVcIssuer.hashCode());
        final Object $bdrsUrl = this.getBdrsUrl();
        result = result * PRIME + ($bdrsUrl == null ? 43 : $bdrsUrl.hashCode());
        final Object $dimUrl = this.getDimUrl();
        result = result * PRIME + ($dimUrl == null ? 43 : $dimUrl.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DashboardCxDidConfig(myDid=" + this.getMyDid() + ", walletTokenUrl=" + this.getWalletTokenUrl() + ", trustedVcIssuer=" + this.getTrustedVcIssuer() + ", bdrsUrl=" + this.getBdrsUrl() + ", dimUrl=" + this.getDimUrl() + ")";
    }

    public DashboardCxDidConfig() {
    }
}
