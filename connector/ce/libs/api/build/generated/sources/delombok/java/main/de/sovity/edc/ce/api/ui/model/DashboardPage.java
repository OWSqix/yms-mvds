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
@Schema(description = "Data as required by the UI\'s Dashboard Page")
public class DashboardPage {
    @Schema(description = "Number of Assets", requiredMode = Schema.RequiredMode.REQUIRED)
    private int numAssets;
    @Schema(description = "Number of Policies", requiredMode = Schema.RequiredMode.REQUIRED)
    private int numPolicies;
    @Schema(description = "Number of Contract Definitions", requiredMode = Schema.RequiredMode.REQUIRED)
    private int numContractDefinitions;
    @Schema(description = "Number of consuming Contract Agreements", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numContractAgreementsConsuming;
    @Schema(description = "Number of providing Contract Agreements", requiredMode = Schema.RequiredMode.REQUIRED)
    private long numContractAgreementsProviding;
    @Schema(description = "Consuming Transfer Process Amounts", requiredMode = Schema.RequiredMode.REQUIRED)
    private DashboardTransferAmounts transferProcessesConsuming;
    @Schema(description = "Providing Transfer Process Amounts", requiredMode = Schema.RequiredMode.REQUIRED)
    private DashboardTransferAmounts transferProcessesProviding;
    @Schema(description = "Your Connector\'s Connector Endpoint", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorEndpoint;
    @Schema(description = "Your Connector\'s Participant ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorParticipantId;
    @Schema(description = "Your Connector\'s Title", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorTitle;
    @Schema(description = "Your Connector\'s Description", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorDescription;
    @Schema(description = "Your Organization Homepage", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorCuratorUrl;
    @Schema(description = "Your Organization Name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorCuratorName;
    @Schema(description = "Your Connector\'s Maintainer\'s Organization Homepage", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorMaintainerUrl;
    @Schema(description = "Your Connector\'s Maintainer\'s Organization Name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorMaintainerName;
    @Schema(description = "Your Connector\'s DAPS Configuration (if present)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private DashboardDapsConfig connectorDapsConfig;
    @Schema(description = "Your Connector\'s Catena-X Web-DID Configuration (if present)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private DashboardCxDidConfig connectorCxDidConfig;


    public static class DashboardPageBuilder {
        private int numAssets;
        private int numPolicies;
        private int numContractDefinitions;
        private long numContractAgreementsConsuming;
        private long numContractAgreementsProviding;
        private DashboardTransferAmounts transferProcessesConsuming;
        private DashboardTransferAmounts transferProcessesProviding;
        private String connectorEndpoint;
        private String connectorParticipantId;
        private String connectorTitle;
        private String connectorDescription;
        private String connectorCuratorUrl;
        private String connectorCuratorName;
        private String connectorMaintainerUrl;
        private String connectorMaintainerName;
        private DashboardDapsConfig connectorDapsConfig;
        private DashboardCxDidConfig connectorCxDidConfig;

        DashboardPageBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder numAssets(final int numAssets) {
            this.numAssets = numAssets;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder numPolicies(final int numPolicies) {
            this.numPolicies = numPolicies;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder numContractDefinitions(final int numContractDefinitions) {
            this.numContractDefinitions = numContractDefinitions;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder numContractAgreementsConsuming(final long numContractAgreementsConsuming) {
            this.numContractAgreementsConsuming = numContractAgreementsConsuming;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder numContractAgreementsProviding(final long numContractAgreementsProviding) {
            this.numContractAgreementsProviding = numContractAgreementsProviding;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder transferProcessesConsuming(final DashboardTransferAmounts transferProcessesConsuming) {
            this.transferProcessesConsuming = transferProcessesConsuming;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder transferProcessesProviding(final DashboardTransferAmounts transferProcessesProviding) {
            this.transferProcessesProviding = transferProcessesProviding;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorEndpoint(final String connectorEndpoint) {
            this.connectorEndpoint = connectorEndpoint;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorParticipantId(final String connectorParticipantId) {
            this.connectorParticipantId = connectorParticipantId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorTitle(final String connectorTitle) {
            this.connectorTitle = connectorTitle;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorDescription(final String connectorDescription) {
            this.connectorDescription = connectorDescription;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorCuratorUrl(final String connectorCuratorUrl) {
            this.connectorCuratorUrl = connectorCuratorUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorCuratorName(final String connectorCuratorName) {
            this.connectorCuratorName = connectorCuratorName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorMaintainerUrl(final String connectorMaintainerUrl) {
            this.connectorMaintainerUrl = connectorMaintainerUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorMaintainerName(final String connectorMaintainerName) {
            this.connectorMaintainerName = connectorMaintainerName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorDapsConfig(final DashboardDapsConfig connectorDapsConfig) {
            this.connectorDapsConfig = connectorDapsConfig;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public DashboardPage.DashboardPageBuilder connectorCxDidConfig(final DashboardCxDidConfig connectorCxDidConfig) {
            this.connectorCxDidConfig = connectorCxDidConfig;
            return this;
        }

        public DashboardPage build() {
            return new DashboardPage(this.numAssets, this.numPolicies, this.numContractDefinitions, this.numContractAgreementsConsuming, this.numContractAgreementsProviding, this.transferProcessesConsuming, this.transferProcessesProviding, this.connectorEndpoint, this.connectorParticipantId, this.connectorTitle, this.connectorDescription, this.connectorCuratorUrl, this.connectorCuratorName, this.connectorMaintainerUrl, this.connectorMaintainerName, this.connectorDapsConfig, this.connectorCxDidConfig);
        }

        @Override
        public String toString() {
            return "DashboardPage.DashboardPageBuilder(numAssets=" + this.numAssets + ", numPolicies=" + this.numPolicies + ", numContractDefinitions=" + this.numContractDefinitions + ", numContractAgreementsConsuming=" + this.numContractAgreementsConsuming + ", numContractAgreementsProviding=" + this.numContractAgreementsProviding + ", transferProcessesConsuming=" + this.transferProcessesConsuming + ", transferProcessesProviding=" + this.transferProcessesProviding + ", connectorEndpoint=" + this.connectorEndpoint + ", connectorParticipantId=" + this.connectorParticipantId + ", connectorTitle=" + this.connectorTitle + ", connectorDescription=" + this.connectorDescription + ", connectorCuratorUrl=" + this.connectorCuratorUrl + ", connectorCuratorName=" + this.connectorCuratorName + ", connectorMaintainerUrl=" + this.connectorMaintainerUrl + ", connectorMaintainerName=" + this.connectorMaintainerName + ", connectorDapsConfig=" + this.connectorDapsConfig + ", connectorCxDidConfig=" + this.connectorCxDidConfig + ")";
        }
    }

    public static DashboardPage.DashboardPageBuilder builder() {
        return new DashboardPage.DashboardPageBuilder();
    }

    public DashboardPage.DashboardPageBuilder toBuilder() {
        return new DashboardPage.DashboardPageBuilder().numAssets(this.numAssets).numPolicies(this.numPolicies).numContractDefinitions(this.numContractDefinitions).numContractAgreementsConsuming(this.numContractAgreementsConsuming).numContractAgreementsProviding(this.numContractAgreementsProviding).transferProcessesConsuming(this.transferProcessesConsuming).transferProcessesProviding(this.transferProcessesProviding).connectorEndpoint(this.connectorEndpoint).connectorParticipantId(this.connectorParticipantId).connectorTitle(this.connectorTitle).connectorDescription(this.connectorDescription).connectorCuratorUrl(this.connectorCuratorUrl).connectorCuratorName(this.connectorCuratorName).connectorMaintainerUrl(this.connectorMaintainerUrl).connectorMaintainerName(this.connectorMaintainerName).connectorDapsConfig(this.connectorDapsConfig).connectorCxDidConfig(this.connectorCxDidConfig);
    }

    public int getNumAssets() {
        return this.numAssets;
    }

    public int getNumPolicies() {
        return this.numPolicies;
    }

    public int getNumContractDefinitions() {
        return this.numContractDefinitions;
    }

    public long getNumContractAgreementsConsuming() {
        return this.numContractAgreementsConsuming;
    }

    public long getNumContractAgreementsProviding() {
        return this.numContractAgreementsProviding;
    }

    public DashboardTransferAmounts getTransferProcessesConsuming() {
        return this.transferProcessesConsuming;
    }

    public DashboardTransferAmounts getTransferProcessesProviding() {
        return this.transferProcessesProviding;
    }

    public String getConnectorEndpoint() {
        return this.connectorEndpoint;
    }

    public String getConnectorParticipantId() {
        return this.connectorParticipantId;
    }

    public String getConnectorTitle() {
        return this.connectorTitle;
    }

    public String getConnectorDescription() {
        return this.connectorDescription;
    }

    public String getConnectorCuratorUrl() {
        return this.connectorCuratorUrl;
    }

    public String getConnectorCuratorName() {
        return this.connectorCuratorName;
    }

    public String getConnectorMaintainerUrl() {
        return this.connectorMaintainerUrl;
    }

    public String getConnectorMaintainerName() {
        return this.connectorMaintainerName;
    }

    public DashboardDapsConfig getConnectorDapsConfig() {
        return this.connectorDapsConfig;
    }

    public DashboardCxDidConfig getConnectorCxDidConfig() {
        return this.connectorCxDidConfig;
    }

    public void setNumAssets(final int numAssets) {
        this.numAssets = numAssets;
    }

    public void setNumPolicies(final int numPolicies) {
        this.numPolicies = numPolicies;
    }

    public void setNumContractDefinitions(final int numContractDefinitions) {
        this.numContractDefinitions = numContractDefinitions;
    }

    public void setNumContractAgreementsConsuming(final long numContractAgreementsConsuming) {
        this.numContractAgreementsConsuming = numContractAgreementsConsuming;
    }

    public void setNumContractAgreementsProviding(final long numContractAgreementsProviding) {
        this.numContractAgreementsProviding = numContractAgreementsProviding;
    }

    public void setTransferProcessesConsuming(final DashboardTransferAmounts transferProcessesConsuming) {
        this.transferProcessesConsuming = transferProcessesConsuming;
    }

    public void setTransferProcessesProviding(final DashboardTransferAmounts transferProcessesProviding) {
        this.transferProcessesProviding = transferProcessesProviding;
    }

    public void setConnectorEndpoint(final String connectorEndpoint) {
        this.connectorEndpoint = connectorEndpoint;
    }

    public void setConnectorParticipantId(final String connectorParticipantId) {
        this.connectorParticipantId = connectorParticipantId;
    }

    public void setConnectorTitle(final String connectorTitle) {
        this.connectorTitle = connectorTitle;
    }

    public void setConnectorDescription(final String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    public void setConnectorCuratorUrl(final String connectorCuratorUrl) {
        this.connectorCuratorUrl = connectorCuratorUrl;
    }

    public void setConnectorCuratorName(final String connectorCuratorName) {
        this.connectorCuratorName = connectorCuratorName;
    }

    public void setConnectorMaintainerUrl(final String connectorMaintainerUrl) {
        this.connectorMaintainerUrl = connectorMaintainerUrl;
    }

    public void setConnectorMaintainerName(final String connectorMaintainerName) {
        this.connectorMaintainerName = connectorMaintainerName;
    }

    public void setConnectorDapsConfig(final DashboardDapsConfig connectorDapsConfig) {
        this.connectorDapsConfig = connectorDapsConfig;
    }

    public void setConnectorCxDidConfig(final DashboardCxDidConfig connectorCxDidConfig) {
        this.connectorCxDidConfig = connectorCxDidConfig;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DashboardPage)) return false;
        final DashboardPage other = (DashboardPage) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getNumAssets() != other.getNumAssets()) return false;
        if (this.getNumPolicies() != other.getNumPolicies()) return false;
        if (this.getNumContractDefinitions() != other.getNumContractDefinitions()) return false;
        if (this.getNumContractAgreementsConsuming() != other.getNumContractAgreementsConsuming()) return false;
        if (this.getNumContractAgreementsProviding() != other.getNumContractAgreementsProviding()) return false;
        final Object this$transferProcessesConsuming = this.getTransferProcessesConsuming();
        final Object other$transferProcessesConsuming = other.getTransferProcessesConsuming();
        if (this$transferProcessesConsuming == null ? other$transferProcessesConsuming != null : !this$transferProcessesConsuming.equals(other$transferProcessesConsuming)) return false;
        final Object this$transferProcessesProviding = this.getTransferProcessesProviding();
        final Object other$transferProcessesProviding = other.getTransferProcessesProviding();
        if (this$transferProcessesProviding == null ? other$transferProcessesProviding != null : !this$transferProcessesProviding.equals(other$transferProcessesProviding)) return false;
        final Object this$connectorEndpoint = this.getConnectorEndpoint();
        final Object other$connectorEndpoint = other.getConnectorEndpoint();
        if (this$connectorEndpoint == null ? other$connectorEndpoint != null : !this$connectorEndpoint.equals(other$connectorEndpoint)) return false;
        final Object this$connectorParticipantId = this.getConnectorParticipantId();
        final Object other$connectorParticipantId = other.getConnectorParticipantId();
        if (this$connectorParticipantId == null ? other$connectorParticipantId != null : !this$connectorParticipantId.equals(other$connectorParticipantId)) return false;
        final Object this$connectorTitle = this.getConnectorTitle();
        final Object other$connectorTitle = other.getConnectorTitle();
        if (this$connectorTitle == null ? other$connectorTitle != null : !this$connectorTitle.equals(other$connectorTitle)) return false;
        final Object this$connectorDescription = this.getConnectorDescription();
        final Object other$connectorDescription = other.getConnectorDescription();
        if (this$connectorDescription == null ? other$connectorDescription != null : !this$connectorDescription.equals(other$connectorDescription)) return false;
        final Object this$connectorCuratorUrl = this.getConnectorCuratorUrl();
        final Object other$connectorCuratorUrl = other.getConnectorCuratorUrl();
        if (this$connectorCuratorUrl == null ? other$connectorCuratorUrl != null : !this$connectorCuratorUrl.equals(other$connectorCuratorUrl)) return false;
        final Object this$connectorCuratorName = this.getConnectorCuratorName();
        final Object other$connectorCuratorName = other.getConnectorCuratorName();
        if (this$connectorCuratorName == null ? other$connectorCuratorName != null : !this$connectorCuratorName.equals(other$connectorCuratorName)) return false;
        final Object this$connectorMaintainerUrl = this.getConnectorMaintainerUrl();
        final Object other$connectorMaintainerUrl = other.getConnectorMaintainerUrl();
        if (this$connectorMaintainerUrl == null ? other$connectorMaintainerUrl != null : !this$connectorMaintainerUrl.equals(other$connectorMaintainerUrl)) return false;
        final Object this$connectorMaintainerName = this.getConnectorMaintainerName();
        final Object other$connectorMaintainerName = other.getConnectorMaintainerName();
        if (this$connectorMaintainerName == null ? other$connectorMaintainerName != null : !this$connectorMaintainerName.equals(other$connectorMaintainerName)) return false;
        final Object this$connectorDapsConfig = this.getConnectorDapsConfig();
        final Object other$connectorDapsConfig = other.getConnectorDapsConfig();
        if (this$connectorDapsConfig == null ? other$connectorDapsConfig != null : !this$connectorDapsConfig.equals(other$connectorDapsConfig)) return false;
        final Object this$connectorCxDidConfig = this.getConnectorCxDidConfig();
        final Object other$connectorCxDidConfig = other.getConnectorCxDidConfig();
        if (this$connectorCxDidConfig == null ? other$connectorCxDidConfig != null : !this$connectorCxDidConfig.equals(other$connectorCxDidConfig)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DashboardPage;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getNumAssets();
        result = result * PRIME + this.getNumPolicies();
        result = result * PRIME + this.getNumContractDefinitions();
        final long $numContractAgreementsConsuming = this.getNumContractAgreementsConsuming();
        result = result * PRIME + (int) ($numContractAgreementsConsuming >>> 32 ^ $numContractAgreementsConsuming);
        final long $numContractAgreementsProviding = this.getNumContractAgreementsProviding();
        result = result * PRIME + (int) ($numContractAgreementsProviding >>> 32 ^ $numContractAgreementsProviding);
        final Object $transferProcessesConsuming = this.getTransferProcessesConsuming();
        result = result * PRIME + ($transferProcessesConsuming == null ? 43 : $transferProcessesConsuming.hashCode());
        final Object $transferProcessesProviding = this.getTransferProcessesProviding();
        result = result * PRIME + ($transferProcessesProviding == null ? 43 : $transferProcessesProviding.hashCode());
        final Object $connectorEndpoint = this.getConnectorEndpoint();
        result = result * PRIME + ($connectorEndpoint == null ? 43 : $connectorEndpoint.hashCode());
        final Object $connectorParticipantId = this.getConnectorParticipantId();
        result = result * PRIME + ($connectorParticipantId == null ? 43 : $connectorParticipantId.hashCode());
        final Object $connectorTitle = this.getConnectorTitle();
        result = result * PRIME + ($connectorTitle == null ? 43 : $connectorTitle.hashCode());
        final Object $connectorDescription = this.getConnectorDescription();
        result = result * PRIME + ($connectorDescription == null ? 43 : $connectorDescription.hashCode());
        final Object $connectorCuratorUrl = this.getConnectorCuratorUrl();
        result = result * PRIME + ($connectorCuratorUrl == null ? 43 : $connectorCuratorUrl.hashCode());
        final Object $connectorCuratorName = this.getConnectorCuratorName();
        result = result * PRIME + ($connectorCuratorName == null ? 43 : $connectorCuratorName.hashCode());
        final Object $connectorMaintainerUrl = this.getConnectorMaintainerUrl();
        result = result * PRIME + ($connectorMaintainerUrl == null ? 43 : $connectorMaintainerUrl.hashCode());
        final Object $connectorMaintainerName = this.getConnectorMaintainerName();
        result = result * PRIME + ($connectorMaintainerName == null ? 43 : $connectorMaintainerName.hashCode());
        final Object $connectorDapsConfig = this.getConnectorDapsConfig();
        result = result * PRIME + ($connectorDapsConfig == null ? 43 : $connectorDapsConfig.hashCode());
        final Object $connectorCxDidConfig = this.getConnectorCxDidConfig();
        result = result * PRIME + ($connectorCxDidConfig == null ? 43 : $connectorCxDidConfig.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DashboardPage(numAssets=" + this.getNumAssets() + ", numPolicies=" + this.getNumPolicies() + ", numContractDefinitions=" + this.getNumContractDefinitions() + ", numContractAgreementsConsuming=" + this.getNumContractAgreementsConsuming() + ", numContractAgreementsProviding=" + this.getNumContractAgreementsProviding() + ", transferProcessesConsuming=" + this.getTransferProcessesConsuming() + ", transferProcessesProviding=" + this.getTransferProcessesProviding() + ", connectorEndpoint=" + this.getConnectorEndpoint() + ", connectorParticipantId=" + this.getConnectorParticipantId() + ", connectorTitle=" + this.getConnectorTitle() + ", connectorDescription=" + this.getConnectorDescription() + ", connectorCuratorUrl=" + this.getConnectorCuratorUrl() + ", connectorCuratorName=" + this.getConnectorCuratorName() + ", connectorMaintainerUrl=" + this.getConnectorMaintainerUrl() + ", connectorMaintainerName=" + this.getConnectorMaintainerName() + ", connectorDapsConfig=" + this.getConnectorDapsConfig() + ", connectorCxDidConfig=" + this.getConnectorCxDidConfig() + ")";
    }

    public DashboardPage(final int numAssets, final int numPolicies, final int numContractDefinitions, final long numContractAgreementsConsuming, final long numContractAgreementsProviding, final DashboardTransferAmounts transferProcessesConsuming, final DashboardTransferAmounts transferProcessesProviding, final String connectorEndpoint, final String connectorParticipantId, final String connectorTitle, final String connectorDescription, final String connectorCuratorUrl, final String connectorCuratorName, final String connectorMaintainerUrl, final String connectorMaintainerName, final DashboardDapsConfig connectorDapsConfig, final DashboardCxDidConfig connectorCxDidConfig) {
        this.numAssets = numAssets;
        this.numPolicies = numPolicies;
        this.numContractDefinitions = numContractDefinitions;
        this.numContractAgreementsConsuming = numContractAgreementsConsuming;
        this.numContractAgreementsProviding = numContractAgreementsProviding;
        this.transferProcessesConsuming = transferProcessesConsuming;
        this.transferProcessesProviding = transferProcessesProviding;
        this.connectorEndpoint = connectorEndpoint;
        this.connectorParticipantId = connectorParticipantId;
        this.connectorTitle = connectorTitle;
        this.connectorDescription = connectorDescription;
        this.connectorCuratorUrl = connectorCuratorUrl;
        this.connectorCuratorName = connectorCuratorName;
        this.connectorMaintainerUrl = connectorMaintainerUrl;
        this.connectorMaintainerName = connectorMaintainerName;
        this.connectorDapsConfig = connectorDapsConfig;
        this.connectorCxDidConfig = connectorCxDidConfig;
    }

    public DashboardPage() {
    }
}
