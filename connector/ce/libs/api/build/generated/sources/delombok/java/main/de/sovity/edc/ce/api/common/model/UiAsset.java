/*
 * Copyright 2025 sovity GmbH
 * Copyright 2023 Fraunhofer-Institut für Software- und Systemtechnik ISST
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
 *     Fraunhofer ISST - initial implementation of an unified workflow for creating data offerings
 */
package de.sovity.edc.ce.api.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Type-safe data offer metadata as supported by the sovity product landscape. Contains extension points.")
public class UiAsset {
    @Schema(description = "\'Live\' vs \'On Request\'", requiredMode = Schema.RequiredMode.REQUIRED)
    private DataSourceAvailability dataSourceAvailability;
    @Schema(description = "Asset Id", requiredMode = Schema.RequiredMode.REQUIRED)
    private String assetId;
    @Schema(description = "Providing Connector\'s Connector Endpoint", requiredMode = Schema.RequiredMode.REQUIRED)
    private String connectorEndpoint;
    @Schema(description = "Providing Connector\'s Participant ID", requiredMode = Schema.RequiredMode.REQUIRED)
    private String participantId;
    @Schema(description = "Asset Title", requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;
    @Schema(description = "Asset Organization Name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String creatorOrganizationName;
    @Schema(description = "Contact E-Mail address. Only for dataSourceAvailability ON_REQUEST.", example = "contact@my-org.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String onRequestContactEmail;
    @Schema(description = "Contact Preferred E-Mail Subject. Only for dataSourceAvailability ON_REQUEST.", example = "Department XYZ Data Offer Request - My Product, My API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String onRequestContactEmailSubject;
    @Schema(description = "Asset Language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String language;
    @Schema(description = "Asset Description. Supports markdown.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String description;
    @Schema(description = "Asset Description Short Text generated from description. Contains no markdown.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String descriptionShortText;
    @Schema(description = "Flag that indicates whether this asset is created by this connector.", requiredMode = Schema.RequiredMode.REQUIRED)
    private Boolean isOwnConnector;
    @Schema(description = "Asset Homepage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String publisherHomepage;
    @Schema(description = "License URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String licenseUrl;
    @Schema(description = "Version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String version;
    @Schema(description = "Asset Keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<String> keywords;
    @Schema(description = "Asset MediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mediaType;
    @Schema(description = "Homepage URL associated with the Asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String landingPageUrl;
    @Schema(description = "HTTP Datasource Hint: Proxy Method. " + "Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean httpDatasourceHintsProxyMethod;
    @Schema(description = "HTTP Datasource Hint: Proxy Path. " + "Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean httpDatasourceHintsProxyPath;
    @Schema(description = "HTTP Datasource Hint: Proxy Query Params. " + "Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean httpDatasourceHintsProxyQueryParams;
    @Schema(description = "HTTP Datasource Hint: Proxy Body. " + "Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Boolean httpDatasourceHintsProxyBody;
    @Schema(description = "Data Category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String dataCategory;
    @Schema(description = "Data Subcategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String dataSubcategory;
    @Schema(description = "Data Model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String dataModel;
    @Schema(description = "Geo-Reference Method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String geoReferenceMethod;
    @Schema(description = "Transport Mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String transportMode;
    @Schema(description = "The sovereign is distinct from the publisher by being the legal owner of the data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String sovereignLegalName;
    @Schema(description = "Geo location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String geoLocation;
    @Schema(description = "Locations by NUTS standard which divides countries into administrative divisions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<String> nutsLocations;
    @Schema(description = "Data sample URLs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<String> dataSampleUrls;
    @Schema(description = "Reference file/schema URLs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<String> referenceFileUrls;
    @Schema(description = "Additional information on reference files/schemas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String referenceFilesDescription;
    @Schema(description = "Instructions for use that are not legally relevant e.g. information on how to cite the dataset in papers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String conditionsForUse;
    @Schema(description = "Data update frequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String dataUpdateFrequency;
    @Schema(description = "Temporal coverage start date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private LocalDate temporalCoverageFrom;
    @Schema(description = "Temporal coverage end date (inclusive)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private LocalDate temporalCoverageToInclusive;
    @Schema(description = "Contains the entire asset in the JSON-LD format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String assetJsonLd;
    @Schema(description = "Contains serialized custom properties in the JSON format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customJsonAsString;
    @Schema(description = "Contains serialized custom properties in the JSON LD format. " + "Contrary to the customJsonAsString field, this string must represent a JSON LD object " + "and will be affected by JSON LD compaction and expansion. " + "Due to a technical limitation, the properties can\'t be booleans.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customJsonLdAsString;
    @Schema(description = "Same as customJsonAsString but the data will be stored in the private properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String privateCustomJsonAsString;
    @Schema(description = "Same as customJsonLdAsString but the data will be stored in the private properties. " + "The same limitations apply.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String privateCustomJsonLdAsString;


    public static class UiAssetBuilder {
        private DataSourceAvailability dataSourceAvailability;
        private String assetId;
        private String connectorEndpoint;
        private String participantId;
        private String title;
        private String creatorOrganizationName;
        private String onRequestContactEmail;
        private String onRequestContactEmailSubject;
        private String language;
        private String description;
        private String descriptionShortText;
        private Boolean isOwnConnector;
        private String publisherHomepage;
        private String licenseUrl;
        private String version;
        private List<String> keywords;
        private String mediaType;
        private String landingPageUrl;
        private Boolean httpDatasourceHintsProxyMethod;
        private Boolean httpDatasourceHintsProxyPath;
        private Boolean httpDatasourceHintsProxyQueryParams;
        private Boolean httpDatasourceHintsProxyBody;
        private String dataCategory;
        private String dataSubcategory;
        private String dataModel;
        private String geoReferenceMethod;
        private String transportMode;
        private String sovereignLegalName;
        private String geoLocation;
        private List<String> nutsLocations;
        private List<String> dataSampleUrls;
        private List<String> referenceFileUrls;
        private String referenceFilesDescription;
        private String conditionsForUse;
        private String dataUpdateFrequency;
        private LocalDate temporalCoverageFrom;
        private LocalDate temporalCoverageToInclusive;
        private String assetJsonLd;
        private String customJsonAsString;
        private String customJsonLdAsString;
        private String privateCustomJsonAsString;
        private String privateCustomJsonLdAsString;

        UiAssetBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataSourceAvailability(final DataSourceAvailability dataSourceAvailability) {
            this.dataSourceAvailability = dataSourceAvailability;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder assetId(final String assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder connectorEndpoint(final String connectorEndpoint) {
            this.connectorEndpoint = connectorEndpoint;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder participantId(final String participantId) {
            this.participantId = participantId;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder title(final String title) {
            this.title = title;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder creatorOrganizationName(final String creatorOrganizationName) {
            this.creatorOrganizationName = creatorOrganizationName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder onRequestContactEmail(final String onRequestContactEmail) {
            this.onRequestContactEmail = onRequestContactEmail;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder onRequestContactEmailSubject(final String onRequestContactEmailSubject) {
            this.onRequestContactEmailSubject = onRequestContactEmailSubject;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder language(final String language) {
            this.language = language;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder description(final String description) {
            this.description = description;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder descriptionShortText(final String descriptionShortText) {
            this.descriptionShortText = descriptionShortText;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder isOwnConnector(final Boolean isOwnConnector) {
            this.isOwnConnector = isOwnConnector;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder publisherHomepage(final String publisherHomepage) {
            this.publisherHomepage = publisherHomepage;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder licenseUrl(final String licenseUrl) {
            this.licenseUrl = licenseUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder version(final String version) {
            this.version = version;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder keywords(final List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder mediaType(final String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder landingPageUrl(final String landingPageUrl) {
            this.landingPageUrl = landingPageUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder httpDatasourceHintsProxyMethod(final Boolean httpDatasourceHintsProxyMethod) {
            this.httpDatasourceHintsProxyMethod = httpDatasourceHintsProxyMethod;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder httpDatasourceHintsProxyPath(final Boolean httpDatasourceHintsProxyPath) {
            this.httpDatasourceHintsProxyPath = httpDatasourceHintsProxyPath;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder httpDatasourceHintsProxyQueryParams(final Boolean httpDatasourceHintsProxyQueryParams) {
            this.httpDatasourceHintsProxyQueryParams = httpDatasourceHintsProxyQueryParams;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder httpDatasourceHintsProxyBody(final Boolean httpDatasourceHintsProxyBody) {
            this.httpDatasourceHintsProxyBody = httpDatasourceHintsProxyBody;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataCategory(final String dataCategory) {
            this.dataCategory = dataCategory;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataSubcategory(final String dataSubcategory) {
            this.dataSubcategory = dataSubcategory;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataModel(final String dataModel) {
            this.dataModel = dataModel;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder geoReferenceMethod(final String geoReferenceMethod) {
            this.geoReferenceMethod = geoReferenceMethod;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder transportMode(final String transportMode) {
            this.transportMode = transportMode;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder sovereignLegalName(final String sovereignLegalName) {
            this.sovereignLegalName = sovereignLegalName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder geoLocation(final String geoLocation) {
            this.geoLocation = geoLocation;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder nutsLocations(final List<String> nutsLocations) {
            this.nutsLocations = nutsLocations;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataSampleUrls(final List<String> dataSampleUrls) {
            this.dataSampleUrls = dataSampleUrls;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder referenceFileUrls(final List<String> referenceFileUrls) {
            this.referenceFileUrls = referenceFileUrls;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder referenceFilesDescription(final String referenceFilesDescription) {
            this.referenceFilesDescription = referenceFilesDescription;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder conditionsForUse(final String conditionsForUse) {
            this.conditionsForUse = conditionsForUse;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder dataUpdateFrequency(final String dataUpdateFrequency) {
            this.dataUpdateFrequency = dataUpdateFrequency;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder temporalCoverageFrom(final LocalDate temporalCoverageFrom) {
            this.temporalCoverageFrom = temporalCoverageFrom;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder temporalCoverageToInclusive(final LocalDate temporalCoverageToInclusive) {
            this.temporalCoverageToInclusive = temporalCoverageToInclusive;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder assetJsonLd(final String assetJsonLd) {
            this.assetJsonLd = assetJsonLd;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder customJsonAsString(final String customJsonAsString) {
            this.customJsonAsString = customJsonAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder customJsonLdAsString(final String customJsonLdAsString) {
            this.customJsonLdAsString = customJsonLdAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder privateCustomJsonAsString(final String privateCustomJsonAsString) {
            this.privateCustomJsonAsString = privateCustomJsonAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAsset.UiAssetBuilder privateCustomJsonLdAsString(final String privateCustomJsonLdAsString) {
            this.privateCustomJsonLdAsString = privateCustomJsonLdAsString;
            return this;
        }

        public UiAsset build() {
            return new UiAsset(this.dataSourceAvailability, this.assetId, this.connectorEndpoint, this.participantId, this.title, this.creatorOrganizationName, this.onRequestContactEmail, this.onRequestContactEmailSubject, this.language, this.description, this.descriptionShortText, this.isOwnConnector, this.publisherHomepage, this.licenseUrl, this.version, this.keywords, this.mediaType, this.landingPageUrl, this.httpDatasourceHintsProxyMethod, this.httpDatasourceHintsProxyPath, this.httpDatasourceHintsProxyQueryParams, this.httpDatasourceHintsProxyBody, this.dataCategory, this.dataSubcategory, this.dataModel, this.geoReferenceMethod, this.transportMode, this.sovereignLegalName, this.geoLocation, this.nutsLocations, this.dataSampleUrls, this.referenceFileUrls, this.referenceFilesDescription, this.conditionsForUse, this.dataUpdateFrequency, this.temporalCoverageFrom, this.temporalCoverageToInclusive, this.assetJsonLd, this.customJsonAsString, this.customJsonLdAsString, this.privateCustomJsonAsString, this.privateCustomJsonLdAsString);
        }

        @Override
        public String toString() {
            return "UiAsset.UiAssetBuilder(dataSourceAvailability=" + this.dataSourceAvailability + ", assetId=" + this.assetId + ", connectorEndpoint=" + this.connectorEndpoint + ", participantId=" + this.participantId + ", title=" + this.title + ", creatorOrganizationName=" + this.creatorOrganizationName + ", onRequestContactEmail=" + this.onRequestContactEmail + ", onRequestContactEmailSubject=" + this.onRequestContactEmailSubject + ", language=" + this.language + ", description=" + this.description + ", descriptionShortText=" + this.descriptionShortText + ", isOwnConnector=" + this.isOwnConnector + ", publisherHomepage=" + this.publisherHomepage + ", licenseUrl=" + this.licenseUrl + ", version=" + this.version + ", keywords=" + this.keywords + ", mediaType=" + this.mediaType + ", landingPageUrl=" + this.landingPageUrl + ", httpDatasourceHintsProxyMethod=" + this.httpDatasourceHintsProxyMethod + ", httpDatasourceHintsProxyPath=" + this.httpDatasourceHintsProxyPath + ", httpDatasourceHintsProxyQueryParams=" + this.httpDatasourceHintsProxyQueryParams + ", httpDatasourceHintsProxyBody=" + this.httpDatasourceHintsProxyBody + ", dataCategory=" + this.dataCategory + ", dataSubcategory=" + this.dataSubcategory + ", dataModel=" + this.dataModel + ", geoReferenceMethod=" + this.geoReferenceMethod + ", transportMode=" + this.transportMode + ", sovereignLegalName=" + this.sovereignLegalName + ", geoLocation=" + this.geoLocation + ", nutsLocations=" + this.nutsLocations + ", dataSampleUrls=" + this.dataSampleUrls + ", referenceFileUrls=" + this.referenceFileUrls + ", referenceFilesDescription=" + this.referenceFilesDescription + ", conditionsForUse=" + this.conditionsForUse + ", dataUpdateFrequency=" + this.dataUpdateFrequency + ", temporalCoverageFrom=" + this.temporalCoverageFrom + ", temporalCoverageToInclusive=" + this.temporalCoverageToInclusive + ", assetJsonLd=" + this.assetJsonLd + ", customJsonAsString=" + this.customJsonAsString + ", customJsonLdAsString=" + this.customJsonLdAsString + ", privateCustomJsonAsString=" + this.privateCustomJsonAsString + ", privateCustomJsonLdAsString=" + this.privateCustomJsonLdAsString + ")";
        }
    }

    public static UiAsset.UiAssetBuilder builder() {
        return new UiAsset.UiAssetBuilder();
    }

    public UiAsset.UiAssetBuilder toBuilder() {
        return new UiAsset.UiAssetBuilder().dataSourceAvailability(this.dataSourceAvailability).assetId(this.assetId).connectorEndpoint(this.connectorEndpoint).participantId(this.participantId).title(this.title).creatorOrganizationName(this.creatorOrganizationName).onRequestContactEmail(this.onRequestContactEmail).onRequestContactEmailSubject(this.onRequestContactEmailSubject).language(this.language).description(this.description).descriptionShortText(this.descriptionShortText).isOwnConnector(this.isOwnConnector).publisherHomepage(this.publisherHomepage).licenseUrl(this.licenseUrl).version(this.version).keywords(this.keywords).mediaType(this.mediaType).landingPageUrl(this.landingPageUrl).httpDatasourceHintsProxyMethod(this.httpDatasourceHintsProxyMethod).httpDatasourceHintsProxyPath(this.httpDatasourceHintsProxyPath).httpDatasourceHintsProxyQueryParams(this.httpDatasourceHintsProxyQueryParams).httpDatasourceHintsProxyBody(this.httpDatasourceHintsProxyBody).dataCategory(this.dataCategory).dataSubcategory(this.dataSubcategory).dataModel(this.dataModel).geoReferenceMethod(this.geoReferenceMethod).transportMode(this.transportMode).sovereignLegalName(this.sovereignLegalName).geoLocation(this.geoLocation).nutsLocations(this.nutsLocations).dataSampleUrls(this.dataSampleUrls).referenceFileUrls(this.referenceFileUrls).referenceFilesDescription(this.referenceFilesDescription).conditionsForUse(this.conditionsForUse).dataUpdateFrequency(this.dataUpdateFrequency).temporalCoverageFrom(this.temporalCoverageFrom).temporalCoverageToInclusive(this.temporalCoverageToInclusive).assetJsonLd(this.assetJsonLd).customJsonAsString(this.customJsonAsString).customJsonLdAsString(this.customJsonLdAsString).privateCustomJsonAsString(this.privateCustomJsonAsString).privateCustomJsonLdAsString(this.privateCustomJsonLdAsString);
    }

    public DataSourceAvailability getDataSourceAvailability() {
        return this.dataSourceAvailability;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getConnectorEndpoint() {
        return this.connectorEndpoint;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCreatorOrganizationName() {
        return this.creatorOrganizationName;
    }

    public String getOnRequestContactEmail() {
        return this.onRequestContactEmail;
    }

    public String getOnRequestContactEmailSubject() {
        return this.onRequestContactEmailSubject;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionShortText() {
        return this.descriptionShortText;
    }

    public Boolean getIsOwnConnector() {
        return this.isOwnConnector;
    }

    public String getPublisherHomepage() {
        return this.publisherHomepage;
    }

    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    public String getVersion() {
        return this.version;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getLandingPageUrl() {
        return this.landingPageUrl;
    }

    public Boolean getHttpDatasourceHintsProxyMethod() {
        return this.httpDatasourceHintsProxyMethod;
    }

    public Boolean getHttpDatasourceHintsProxyPath() {
        return this.httpDatasourceHintsProxyPath;
    }

    public Boolean getHttpDatasourceHintsProxyQueryParams() {
        return this.httpDatasourceHintsProxyQueryParams;
    }

    public Boolean getHttpDatasourceHintsProxyBody() {
        return this.httpDatasourceHintsProxyBody;
    }

    public String getDataCategory() {
        return this.dataCategory;
    }

    public String getDataSubcategory() {
        return this.dataSubcategory;
    }

    public String getDataModel() {
        return this.dataModel;
    }

    public String getGeoReferenceMethod() {
        return this.geoReferenceMethod;
    }

    public String getTransportMode() {
        return this.transportMode;
    }

    public String getSovereignLegalName() {
        return this.sovereignLegalName;
    }

    public String getGeoLocation() {
        return this.geoLocation;
    }

    public List<String> getNutsLocations() {
        return this.nutsLocations;
    }

    public List<String> getDataSampleUrls() {
        return this.dataSampleUrls;
    }

    public List<String> getReferenceFileUrls() {
        return this.referenceFileUrls;
    }

    public String getReferenceFilesDescription() {
        return this.referenceFilesDescription;
    }

    public String getConditionsForUse() {
        return this.conditionsForUse;
    }

    public String getDataUpdateFrequency() {
        return this.dataUpdateFrequency;
    }

    public LocalDate getTemporalCoverageFrom() {
        return this.temporalCoverageFrom;
    }

    public LocalDate getTemporalCoverageToInclusive() {
        return this.temporalCoverageToInclusive;
    }

    public String getAssetJsonLd() {
        return this.assetJsonLd;
    }

    public String getCustomJsonAsString() {
        return this.customJsonAsString;
    }

    public String getCustomJsonLdAsString() {
        return this.customJsonLdAsString;
    }

    public String getPrivateCustomJsonAsString() {
        return this.privateCustomJsonAsString;
    }

    public String getPrivateCustomJsonLdAsString() {
        return this.privateCustomJsonLdAsString;
    }

    public void setDataSourceAvailability(final DataSourceAvailability dataSourceAvailability) {
        this.dataSourceAvailability = dataSourceAvailability;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setConnectorEndpoint(final String connectorEndpoint) {
        this.connectorEndpoint = connectorEndpoint;
    }

    public void setParticipantId(final String participantId) {
        this.participantId = participantId;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setCreatorOrganizationName(final String creatorOrganizationName) {
        this.creatorOrganizationName = creatorOrganizationName;
    }

    public void setOnRequestContactEmail(final String onRequestContactEmail) {
        this.onRequestContactEmail = onRequestContactEmail;
    }

    public void setOnRequestContactEmailSubject(final String onRequestContactEmailSubject) {
        this.onRequestContactEmailSubject = onRequestContactEmailSubject;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setDescriptionShortText(final String descriptionShortText) {
        this.descriptionShortText = descriptionShortText;
    }

    public void setIsOwnConnector(final Boolean isOwnConnector) {
        this.isOwnConnector = isOwnConnector;
    }

    public void setPublisherHomepage(final String publisherHomepage) {
        this.publisherHomepage = publisherHomepage;
    }

    public void setLicenseUrl(final String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public void setKeywords(final List<String> keywords) {
        this.keywords = keywords;
    }

    public void setMediaType(final String mediaType) {
        this.mediaType = mediaType;
    }

    public void setLandingPageUrl(final String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
    }

    public void setHttpDatasourceHintsProxyMethod(final Boolean httpDatasourceHintsProxyMethod) {
        this.httpDatasourceHintsProxyMethod = httpDatasourceHintsProxyMethod;
    }

    public void setHttpDatasourceHintsProxyPath(final Boolean httpDatasourceHintsProxyPath) {
        this.httpDatasourceHintsProxyPath = httpDatasourceHintsProxyPath;
    }

    public void setHttpDatasourceHintsProxyQueryParams(final Boolean httpDatasourceHintsProxyQueryParams) {
        this.httpDatasourceHintsProxyQueryParams = httpDatasourceHintsProxyQueryParams;
    }

    public void setHttpDatasourceHintsProxyBody(final Boolean httpDatasourceHintsProxyBody) {
        this.httpDatasourceHintsProxyBody = httpDatasourceHintsProxyBody;
    }

    public void setDataCategory(final String dataCategory) {
        this.dataCategory = dataCategory;
    }

    public void setDataSubcategory(final String dataSubcategory) {
        this.dataSubcategory = dataSubcategory;
    }

    public void setDataModel(final String dataModel) {
        this.dataModel = dataModel;
    }

    public void setGeoReferenceMethod(final String geoReferenceMethod) {
        this.geoReferenceMethod = geoReferenceMethod;
    }

    public void setTransportMode(final String transportMode) {
        this.transportMode = transportMode;
    }

    public void setSovereignLegalName(final String sovereignLegalName) {
        this.sovereignLegalName = sovereignLegalName;
    }

    public void setGeoLocation(final String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public void setNutsLocations(final List<String> nutsLocations) {
        this.nutsLocations = nutsLocations;
    }

    public void setDataSampleUrls(final List<String> dataSampleUrls) {
        this.dataSampleUrls = dataSampleUrls;
    }

    public void setReferenceFileUrls(final List<String> referenceFileUrls) {
        this.referenceFileUrls = referenceFileUrls;
    }

    public void setReferenceFilesDescription(final String referenceFilesDescription) {
        this.referenceFilesDescription = referenceFilesDescription;
    }

    public void setConditionsForUse(final String conditionsForUse) {
        this.conditionsForUse = conditionsForUse;
    }

    public void setDataUpdateFrequency(final String dataUpdateFrequency) {
        this.dataUpdateFrequency = dataUpdateFrequency;
    }

    public void setTemporalCoverageFrom(final LocalDate temporalCoverageFrom) {
        this.temporalCoverageFrom = temporalCoverageFrom;
    }

    public void setTemporalCoverageToInclusive(final LocalDate temporalCoverageToInclusive) {
        this.temporalCoverageToInclusive = temporalCoverageToInclusive;
    }

    public void setAssetJsonLd(final String assetJsonLd) {
        this.assetJsonLd = assetJsonLd;
    }

    public void setCustomJsonAsString(final String customJsonAsString) {
        this.customJsonAsString = customJsonAsString;
    }

    public void setCustomJsonLdAsString(final String customJsonLdAsString) {
        this.customJsonLdAsString = customJsonLdAsString;
    }

    public void setPrivateCustomJsonAsString(final String privateCustomJsonAsString) {
        this.privateCustomJsonAsString = privateCustomJsonAsString;
    }

    public void setPrivateCustomJsonLdAsString(final String privateCustomJsonLdAsString) {
        this.privateCustomJsonLdAsString = privateCustomJsonLdAsString;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UiAsset)) return false;
        final UiAsset other = (UiAsset) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$isOwnConnector = this.getIsOwnConnector();
        final Object other$isOwnConnector = other.getIsOwnConnector();
        if (this$isOwnConnector == null ? other$isOwnConnector != null : !this$isOwnConnector.equals(other$isOwnConnector)) return false;
        final Object this$httpDatasourceHintsProxyMethod = this.getHttpDatasourceHintsProxyMethod();
        final Object other$httpDatasourceHintsProxyMethod = other.getHttpDatasourceHintsProxyMethod();
        if (this$httpDatasourceHintsProxyMethod == null ? other$httpDatasourceHintsProxyMethod != null : !this$httpDatasourceHintsProxyMethod.equals(other$httpDatasourceHintsProxyMethod)) return false;
        final Object this$httpDatasourceHintsProxyPath = this.getHttpDatasourceHintsProxyPath();
        final Object other$httpDatasourceHintsProxyPath = other.getHttpDatasourceHintsProxyPath();
        if (this$httpDatasourceHintsProxyPath == null ? other$httpDatasourceHintsProxyPath != null : !this$httpDatasourceHintsProxyPath.equals(other$httpDatasourceHintsProxyPath)) return false;
        final Object this$httpDatasourceHintsProxyQueryParams = this.getHttpDatasourceHintsProxyQueryParams();
        final Object other$httpDatasourceHintsProxyQueryParams = other.getHttpDatasourceHintsProxyQueryParams();
        if (this$httpDatasourceHintsProxyQueryParams == null ? other$httpDatasourceHintsProxyQueryParams != null : !this$httpDatasourceHintsProxyQueryParams.equals(other$httpDatasourceHintsProxyQueryParams)) return false;
        final Object this$httpDatasourceHintsProxyBody = this.getHttpDatasourceHintsProxyBody();
        final Object other$httpDatasourceHintsProxyBody = other.getHttpDatasourceHintsProxyBody();
        if (this$httpDatasourceHintsProxyBody == null ? other$httpDatasourceHintsProxyBody != null : !this$httpDatasourceHintsProxyBody.equals(other$httpDatasourceHintsProxyBody)) return false;
        final Object this$dataSourceAvailability = this.getDataSourceAvailability();
        final Object other$dataSourceAvailability = other.getDataSourceAvailability();
        if (this$dataSourceAvailability == null ? other$dataSourceAvailability != null : !this$dataSourceAvailability.equals(other$dataSourceAvailability)) return false;
        final Object this$assetId = this.getAssetId();
        final Object other$assetId = other.getAssetId();
        if (this$assetId == null ? other$assetId != null : !this$assetId.equals(other$assetId)) return false;
        final Object this$connectorEndpoint = this.getConnectorEndpoint();
        final Object other$connectorEndpoint = other.getConnectorEndpoint();
        if (this$connectorEndpoint == null ? other$connectorEndpoint != null : !this$connectorEndpoint.equals(other$connectorEndpoint)) return false;
        final Object this$participantId = this.getParticipantId();
        final Object other$participantId = other.getParticipantId();
        if (this$participantId == null ? other$participantId != null : !this$participantId.equals(other$participantId)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$creatorOrganizationName = this.getCreatorOrganizationName();
        final Object other$creatorOrganizationName = other.getCreatorOrganizationName();
        if (this$creatorOrganizationName == null ? other$creatorOrganizationName != null : !this$creatorOrganizationName.equals(other$creatorOrganizationName)) return false;
        final Object this$onRequestContactEmail = this.getOnRequestContactEmail();
        final Object other$onRequestContactEmail = other.getOnRequestContactEmail();
        if (this$onRequestContactEmail == null ? other$onRequestContactEmail != null : !this$onRequestContactEmail.equals(other$onRequestContactEmail)) return false;
        final Object this$onRequestContactEmailSubject = this.getOnRequestContactEmailSubject();
        final Object other$onRequestContactEmailSubject = other.getOnRequestContactEmailSubject();
        if (this$onRequestContactEmailSubject == null ? other$onRequestContactEmailSubject != null : !this$onRequestContactEmailSubject.equals(other$onRequestContactEmailSubject)) return false;
        final Object this$language = this.getLanguage();
        final Object other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
        final Object this$descriptionShortText = this.getDescriptionShortText();
        final Object other$descriptionShortText = other.getDescriptionShortText();
        if (this$descriptionShortText == null ? other$descriptionShortText != null : !this$descriptionShortText.equals(other$descriptionShortText)) return false;
        final Object this$publisherHomepage = this.getPublisherHomepage();
        final Object other$publisherHomepage = other.getPublisherHomepage();
        if (this$publisherHomepage == null ? other$publisherHomepage != null : !this$publisherHomepage.equals(other$publisherHomepage)) return false;
        final Object this$licenseUrl = this.getLicenseUrl();
        final Object other$licenseUrl = other.getLicenseUrl();
        if (this$licenseUrl == null ? other$licenseUrl != null : !this$licenseUrl.equals(other$licenseUrl)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$keywords = this.getKeywords();
        final Object other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords)) return false;
        final Object this$mediaType = this.getMediaType();
        final Object other$mediaType = other.getMediaType();
        if (this$mediaType == null ? other$mediaType != null : !this$mediaType.equals(other$mediaType)) return false;
        final Object this$landingPageUrl = this.getLandingPageUrl();
        final Object other$landingPageUrl = other.getLandingPageUrl();
        if (this$landingPageUrl == null ? other$landingPageUrl != null : !this$landingPageUrl.equals(other$landingPageUrl)) return false;
        final Object this$dataCategory = this.getDataCategory();
        final Object other$dataCategory = other.getDataCategory();
        if (this$dataCategory == null ? other$dataCategory != null : !this$dataCategory.equals(other$dataCategory)) return false;
        final Object this$dataSubcategory = this.getDataSubcategory();
        final Object other$dataSubcategory = other.getDataSubcategory();
        if (this$dataSubcategory == null ? other$dataSubcategory != null : !this$dataSubcategory.equals(other$dataSubcategory)) return false;
        final Object this$dataModel = this.getDataModel();
        final Object other$dataModel = other.getDataModel();
        if (this$dataModel == null ? other$dataModel != null : !this$dataModel.equals(other$dataModel)) return false;
        final Object this$geoReferenceMethod = this.getGeoReferenceMethod();
        final Object other$geoReferenceMethod = other.getGeoReferenceMethod();
        if (this$geoReferenceMethod == null ? other$geoReferenceMethod != null : !this$geoReferenceMethod.equals(other$geoReferenceMethod)) return false;
        final Object this$transportMode = this.getTransportMode();
        final Object other$transportMode = other.getTransportMode();
        if (this$transportMode == null ? other$transportMode != null : !this$transportMode.equals(other$transportMode)) return false;
        final Object this$sovereignLegalName = this.getSovereignLegalName();
        final Object other$sovereignLegalName = other.getSovereignLegalName();
        if (this$sovereignLegalName == null ? other$sovereignLegalName != null : !this$sovereignLegalName.equals(other$sovereignLegalName)) return false;
        final Object this$geoLocation = this.getGeoLocation();
        final Object other$geoLocation = other.getGeoLocation();
        if (this$geoLocation == null ? other$geoLocation != null : !this$geoLocation.equals(other$geoLocation)) return false;
        final Object this$nutsLocations = this.getNutsLocations();
        final Object other$nutsLocations = other.getNutsLocations();
        if (this$nutsLocations == null ? other$nutsLocations != null : !this$nutsLocations.equals(other$nutsLocations)) return false;
        final Object this$dataSampleUrls = this.getDataSampleUrls();
        final Object other$dataSampleUrls = other.getDataSampleUrls();
        if (this$dataSampleUrls == null ? other$dataSampleUrls != null : !this$dataSampleUrls.equals(other$dataSampleUrls)) return false;
        final Object this$referenceFileUrls = this.getReferenceFileUrls();
        final Object other$referenceFileUrls = other.getReferenceFileUrls();
        if (this$referenceFileUrls == null ? other$referenceFileUrls != null : !this$referenceFileUrls.equals(other$referenceFileUrls)) return false;
        final Object this$referenceFilesDescription = this.getReferenceFilesDescription();
        final Object other$referenceFilesDescription = other.getReferenceFilesDescription();
        if (this$referenceFilesDescription == null ? other$referenceFilesDescription != null : !this$referenceFilesDescription.equals(other$referenceFilesDescription)) return false;
        final Object this$conditionsForUse = this.getConditionsForUse();
        final Object other$conditionsForUse = other.getConditionsForUse();
        if (this$conditionsForUse == null ? other$conditionsForUse != null : !this$conditionsForUse.equals(other$conditionsForUse)) return false;
        final Object this$dataUpdateFrequency = this.getDataUpdateFrequency();
        final Object other$dataUpdateFrequency = other.getDataUpdateFrequency();
        if (this$dataUpdateFrequency == null ? other$dataUpdateFrequency != null : !this$dataUpdateFrequency.equals(other$dataUpdateFrequency)) return false;
        final Object this$temporalCoverageFrom = this.getTemporalCoverageFrom();
        final Object other$temporalCoverageFrom = other.getTemporalCoverageFrom();
        if (this$temporalCoverageFrom == null ? other$temporalCoverageFrom != null : !this$temporalCoverageFrom.equals(other$temporalCoverageFrom)) return false;
        final Object this$temporalCoverageToInclusive = this.getTemporalCoverageToInclusive();
        final Object other$temporalCoverageToInclusive = other.getTemporalCoverageToInclusive();
        if (this$temporalCoverageToInclusive == null ? other$temporalCoverageToInclusive != null : !this$temporalCoverageToInclusive.equals(other$temporalCoverageToInclusive)) return false;
        final Object this$assetJsonLd = this.getAssetJsonLd();
        final Object other$assetJsonLd = other.getAssetJsonLd();
        if (this$assetJsonLd == null ? other$assetJsonLd != null : !this$assetJsonLd.equals(other$assetJsonLd)) return false;
        final Object this$customJsonAsString = this.getCustomJsonAsString();
        final Object other$customJsonAsString = other.getCustomJsonAsString();
        if (this$customJsonAsString == null ? other$customJsonAsString != null : !this$customJsonAsString.equals(other$customJsonAsString)) return false;
        final Object this$customJsonLdAsString = this.getCustomJsonLdAsString();
        final Object other$customJsonLdAsString = other.getCustomJsonLdAsString();
        if (this$customJsonLdAsString == null ? other$customJsonLdAsString != null : !this$customJsonLdAsString.equals(other$customJsonLdAsString)) return false;
        final Object this$privateCustomJsonAsString = this.getPrivateCustomJsonAsString();
        final Object other$privateCustomJsonAsString = other.getPrivateCustomJsonAsString();
        if (this$privateCustomJsonAsString == null ? other$privateCustomJsonAsString != null : !this$privateCustomJsonAsString.equals(other$privateCustomJsonAsString)) return false;
        final Object this$privateCustomJsonLdAsString = this.getPrivateCustomJsonLdAsString();
        final Object other$privateCustomJsonLdAsString = other.getPrivateCustomJsonLdAsString();
        if (this$privateCustomJsonLdAsString == null ? other$privateCustomJsonLdAsString != null : !this$privateCustomJsonLdAsString.equals(other$privateCustomJsonLdAsString)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UiAsset;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $isOwnConnector = this.getIsOwnConnector();
        result = result * PRIME + ($isOwnConnector == null ? 43 : $isOwnConnector.hashCode());
        final Object $httpDatasourceHintsProxyMethod = this.getHttpDatasourceHintsProxyMethod();
        result = result * PRIME + ($httpDatasourceHintsProxyMethod == null ? 43 : $httpDatasourceHintsProxyMethod.hashCode());
        final Object $httpDatasourceHintsProxyPath = this.getHttpDatasourceHintsProxyPath();
        result = result * PRIME + ($httpDatasourceHintsProxyPath == null ? 43 : $httpDatasourceHintsProxyPath.hashCode());
        final Object $httpDatasourceHintsProxyQueryParams = this.getHttpDatasourceHintsProxyQueryParams();
        result = result * PRIME + ($httpDatasourceHintsProxyQueryParams == null ? 43 : $httpDatasourceHintsProxyQueryParams.hashCode());
        final Object $httpDatasourceHintsProxyBody = this.getHttpDatasourceHintsProxyBody();
        result = result * PRIME + ($httpDatasourceHintsProxyBody == null ? 43 : $httpDatasourceHintsProxyBody.hashCode());
        final Object $dataSourceAvailability = this.getDataSourceAvailability();
        result = result * PRIME + ($dataSourceAvailability == null ? 43 : $dataSourceAvailability.hashCode());
        final Object $assetId = this.getAssetId();
        result = result * PRIME + ($assetId == null ? 43 : $assetId.hashCode());
        final Object $connectorEndpoint = this.getConnectorEndpoint();
        result = result * PRIME + ($connectorEndpoint == null ? 43 : $connectorEndpoint.hashCode());
        final Object $participantId = this.getParticipantId();
        result = result * PRIME + ($participantId == null ? 43 : $participantId.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $creatorOrganizationName = this.getCreatorOrganizationName();
        result = result * PRIME + ($creatorOrganizationName == null ? 43 : $creatorOrganizationName.hashCode());
        final Object $onRequestContactEmail = this.getOnRequestContactEmail();
        result = result * PRIME + ($onRequestContactEmail == null ? 43 : $onRequestContactEmail.hashCode());
        final Object $onRequestContactEmailSubject = this.getOnRequestContactEmailSubject();
        result = result * PRIME + ($onRequestContactEmailSubject == null ? 43 : $onRequestContactEmailSubject.hashCode());
        final Object $language = this.getLanguage();
        result = result * PRIME + ($language == null ? 43 : $language.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $descriptionShortText = this.getDescriptionShortText();
        result = result * PRIME + ($descriptionShortText == null ? 43 : $descriptionShortText.hashCode());
        final Object $publisherHomepage = this.getPublisherHomepage();
        result = result * PRIME + ($publisherHomepage == null ? 43 : $publisherHomepage.hashCode());
        final Object $licenseUrl = this.getLicenseUrl();
        result = result * PRIME + ($licenseUrl == null ? 43 : $licenseUrl.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $keywords = this.getKeywords();
        result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
        final Object $mediaType = this.getMediaType();
        result = result * PRIME + ($mediaType == null ? 43 : $mediaType.hashCode());
        final Object $landingPageUrl = this.getLandingPageUrl();
        result = result * PRIME + ($landingPageUrl == null ? 43 : $landingPageUrl.hashCode());
        final Object $dataCategory = this.getDataCategory();
        result = result * PRIME + ($dataCategory == null ? 43 : $dataCategory.hashCode());
        final Object $dataSubcategory = this.getDataSubcategory();
        result = result * PRIME + ($dataSubcategory == null ? 43 : $dataSubcategory.hashCode());
        final Object $dataModel = this.getDataModel();
        result = result * PRIME + ($dataModel == null ? 43 : $dataModel.hashCode());
        final Object $geoReferenceMethod = this.getGeoReferenceMethod();
        result = result * PRIME + ($geoReferenceMethod == null ? 43 : $geoReferenceMethod.hashCode());
        final Object $transportMode = this.getTransportMode();
        result = result * PRIME + ($transportMode == null ? 43 : $transportMode.hashCode());
        final Object $sovereignLegalName = this.getSovereignLegalName();
        result = result * PRIME + ($sovereignLegalName == null ? 43 : $sovereignLegalName.hashCode());
        final Object $geoLocation = this.getGeoLocation();
        result = result * PRIME + ($geoLocation == null ? 43 : $geoLocation.hashCode());
        final Object $nutsLocations = this.getNutsLocations();
        result = result * PRIME + ($nutsLocations == null ? 43 : $nutsLocations.hashCode());
        final Object $dataSampleUrls = this.getDataSampleUrls();
        result = result * PRIME + ($dataSampleUrls == null ? 43 : $dataSampleUrls.hashCode());
        final Object $referenceFileUrls = this.getReferenceFileUrls();
        result = result * PRIME + ($referenceFileUrls == null ? 43 : $referenceFileUrls.hashCode());
        final Object $referenceFilesDescription = this.getReferenceFilesDescription();
        result = result * PRIME + ($referenceFilesDescription == null ? 43 : $referenceFilesDescription.hashCode());
        final Object $conditionsForUse = this.getConditionsForUse();
        result = result * PRIME + ($conditionsForUse == null ? 43 : $conditionsForUse.hashCode());
        final Object $dataUpdateFrequency = this.getDataUpdateFrequency();
        result = result * PRIME + ($dataUpdateFrequency == null ? 43 : $dataUpdateFrequency.hashCode());
        final Object $temporalCoverageFrom = this.getTemporalCoverageFrom();
        result = result * PRIME + ($temporalCoverageFrom == null ? 43 : $temporalCoverageFrom.hashCode());
        final Object $temporalCoverageToInclusive = this.getTemporalCoverageToInclusive();
        result = result * PRIME + ($temporalCoverageToInclusive == null ? 43 : $temporalCoverageToInclusive.hashCode());
        final Object $assetJsonLd = this.getAssetJsonLd();
        result = result * PRIME + ($assetJsonLd == null ? 43 : $assetJsonLd.hashCode());
        final Object $customJsonAsString = this.getCustomJsonAsString();
        result = result * PRIME + ($customJsonAsString == null ? 43 : $customJsonAsString.hashCode());
        final Object $customJsonLdAsString = this.getCustomJsonLdAsString();
        result = result * PRIME + ($customJsonLdAsString == null ? 43 : $customJsonLdAsString.hashCode());
        final Object $privateCustomJsonAsString = this.getPrivateCustomJsonAsString();
        result = result * PRIME + ($privateCustomJsonAsString == null ? 43 : $privateCustomJsonAsString.hashCode());
        final Object $privateCustomJsonLdAsString = this.getPrivateCustomJsonLdAsString();
        result = result * PRIME + ($privateCustomJsonLdAsString == null ? 43 : $privateCustomJsonLdAsString.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UiAsset(dataSourceAvailability=" + this.getDataSourceAvailability() + ", assetId=" + this.getAssetId() + ", connectorEndpoint=" + this.getConnectorEndpoint() + ", participantId=" + this.getParticipantId() + ", title=" + this.getTitle() + ", creatorOrganizationName=" + this.getCreatorOrganizationName() + ", onRequestContactEmail=" + this.getOnRequestContactEmail() + ", onRequestContactEmailSubject=" + this.getOnRequestContactEmailSubject() + ", language=" + this.getLanguage() + ", description=" + this.getDescription() + ", descriptionShortText=" + this.getDescriptionShortText() + ", isOwnConnector=" + this.getIsOwnConnector() + ", publisherHomepage=" + this.getPublisherHomepage() + ", licenseUrl=" + this.getLicenseUrl() + ", version=" + this.getVersion() + ", keywords=" + this.getKeywords() + ", mediaType=" + this.getMediaType() + ", landingPageUrl=" + this.getLandingPageUrl() + ", httpDatasourceHintsProxyMethod=" + this.getHttpDatasourceHintsProxyMethod() + ", httpDatasourceHintsProxyPath=" + this.getHttpDatasourceHintsProxyPath() + ", httpDatasourceHintsProxyQueryParams=" + this.getHttpDatasourceHintsProxyQueryParams() + ", httpDatasourceHintsProxyBody=" + this.getHttpDatasourceHintsProxyBody() + ", dataCategory=" + this.getDataCategory() + ", dataSubcategory=" + this.getDataSubcategory() + ", dataModel=" + this.getDataModel() + ", geoReferenceMethod=" + this.getGeoReferenceMethod() + ", transportMode=" + this.getTransportMode() + ", sovereignLegalName=" + this.getSovereignLegalName() + ", geoLocation=" + this.getGeoLocation() + ", nutsLocations=" + this.getNutsLocations() + ", dataSampleUrls=" + this.getDataSampleUrls() + ", referenceFileUrls=" + this.getReferenceFileUrls() + ", referenceFilesDescription=" + this.getReferenceFilesDescription() + ", conditionsForUse=" + this.getConditionsForUse() + ", dataUpdateFrequency=" + this.getDataUpdateFrequency() + ", temporalCoverageFrom=" + this.getTemporalCoverageFrom() + ", temporalCoverageToInclusive=" + this.getTemporalCoverageToInclusive() + ", assetJsonLd=" + this.getAssetJsonLd() + ", customJsonAsString=" + this.getCustomJsonAsString() + ", customJsonLdAsString=" + this.getCustomJsonLdAsString() + ", privateCustomJsonAsString=" + this.getPrivateCustomJsonAsString() + ", privateCustomJsonLdAsString=" + this.getPrivateCustomJsonLdAsString() + ")";
    }

    public UiAsset(final DataSourceAvailability dataSourceAvailability, final String assetId, final String connectorEndpoint, final String participantId, final String title, final String creatorOrganizationName, final String onRequestContactEmail, final String onRequestContactEmailSubject, final String language, final String description, final String descriptionShortText, final Boolean isOwnConnector, final String publisherHomepage, final String licenseUrl, final String version, final List<String> keywords, final String mediaType, final String landingPageUrl, final Boolean httpDatasourceHintsProxyMethod, final Boolean httpDatasourceHintsProxyPath, final Boolean httpDatasourceHintsProxyQueryParams, final Boolean httpDatasourceHintsProxyBody, final String dataCategory, final String dataSubcategory, final String dataModel, final String geoReferenceMethod, final String transportMode, final String sovereignLegalName, final String geoLocation, final List<String> nutsLocations, final List<String> dataSampleUrls, final List<String> referenceFileUrls, final String referenceFilesDescription, final String conditionsForUse, final String dataUpdateFrequency, final LocalDate temporalCoverageFrom, final LocalDate temporalCoverageToInclusive, final String assetJsonLd, final String customJsonAsString, final String customJsonLdAsString, final String privateCustomJsonAsString, final String privateCustomJsonLdAsString) {
        this.dataSourceAvailability = dataSourceAvailability;
        this.assetId = assetId;
        this.connectorEndpoint = connectorEndpoint;
        this.participantId = participantId;
        this.title = title;
        this.creatorOrganizationName = creatorOrganizationName;
        this.onRequestContactEmail = onRequestContactEmail;
        this.onRequestContactEmailSubject = onRequestContactEmailSubject;
        this.language = language;
        this.description = description;
        this.descriptionShortText = descriptionShortText;
        this.isOwnConnector = isOwnConnector;
        this.publisherHomepage = publisherHomepage;
        this.licenseUrl = licenseUrl;
        this.version = version;
        this.keywords = keywords;
        this.mediaType = mediaType;
        this.landingPageUrl = landingPageUrl;
        this.httpDatasourceHintsProxyMethod = httpDatasourceHintsProxyMethod;
        this.httpDatasourceHintsProxyPath = httpDatasourceHintsProxyPath;
        this.httpDatasourceHintsProxyQueryParams = httpDatasourceHintsProxyQueryParams;
        this.httpDatasourceHintsProxyBody = httpDatasourceHintsProxyBody;
        this.dataCategory = dataCategory;
        this.dataSubcategory = dataSubcategory;
        this.dataModel = dataModel;
        this.geoReferenceMethod = geoReferenceMethod;
        this.transportMode = transportMode;
        this.sovereignLegalName = sovereignLegalName;
        this.geoLocation = geoLocation;
        this.nutsLocations = nutsLocations;
        this.dataSampleUrls = dataSampleUrls;
        this.referenceFileUrls = referenceFileUrls;
        this.referenceFilesDescription = referenceFilesDescription;
        this.conditionsForUse = conditionsForUse;
        this.dataUpdateFrequency = dataUpdateFrequency;
        this.temporalCoverageFrom = temporalCoverageFrom;
        this.temporalCoverageToInclusive = temporalCoverageToInclusive;
        this.assetJsonLd = assetJsonLd;
        this.customJsonAsString = customJsonAsString;
        this.customJsonLdAsString = customJsonLdAsString;
        this.privateCustomJsonAsString = privateCustomJsonAsString;
        this.privateCustomJsonLdAsString = privateCustomJsonLdAsString;
    }

    public UiAsset() {
    }
}
