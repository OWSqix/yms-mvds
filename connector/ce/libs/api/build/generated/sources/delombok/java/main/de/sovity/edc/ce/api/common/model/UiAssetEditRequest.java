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
import java.time.LocalDate;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "Type-safe data offer metadata for editing an asset as supported by the sovity product landscape. Contains extension points.")
public class UiAssetEditRequest {
    @Schema(description = "Data Source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private UiDataSource dataSourceOverrideOrNull;
    @Schema(description = "Asset Title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String title;
    @Schema(description = "Asset Language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String language;
    @Schema(description = "Asset Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String description;
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
    @Schema(description = "Landing Page URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String landingPageUrl;
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
    @Schema(description = "Contains serialized custom properties in the JSON format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customJsonAsString;
    @Schema(description = "Contains serialized custom properties in the JSON LD format. " + "Contrary to the customJsonAsString field, this string must represent a JSON LD object " + "and will be affected by JSON LD compaction and expansion. " + "Due to a technical limitation, the properties can\'t be booleans.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customJsonLdAsString;
    @Schema(description = "Same as customJsonAsString but the data will be stored in the private properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String privateCustomJsonAsString;
    @Schema(description = "Same as customJsonLdAsString but the data will be stored in the private properties. " + "The same limitations apply.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String privateCustomJsonLdAsString;


    public static class UiAssetEditRequestBuilder {
        private UiDataSource dataSourceOverrideOrNull;
        private String title;
        private String language;
        private String description;
        private String publisherHomepage;
        private String licenseUrl;
        private String version;
        private List<String> keywords;
        private String mediaType;
        private String landingPageUrl;
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
        private String customJsonAsString;
        private String customJsonLdAsString;
        private String privateCustomJsonAsString;
        private String privateCustomJsonLdAsString;

        UiAssetEditRequestBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataSourceOverrideOrNull(final UiDataSource dataSourceOverrideOrNull) {
            this.dataSourceOverrideOrNull = dataSourceOverrideOrNull;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder title(final String title) {
            this.title = title;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder language(final String language) {
            this.language = language;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder description(final String description) {
            this.description = description;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder publisherHomepage(final String publisherHomepage) {
            this.publisherHomepage = publisherHomepage;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder licenseUrl(final String licenseUrl) {
            this.licenseUrl = licenseUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder version(final String version) {
            this.version = version;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder keywords(final List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder mediaType(final String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder landingPageUrl(final String landingPageUrl) {
            this.landingPageUrl = landingPageUrl;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataCategory(final String dataCategory) {
            this.dataCategory = dataCategory;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataSubcategory(final String dataSubcategory) {
            this.dataSubcategory = dataSubcategory;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataModel(final String dataModel) {
            this.dataModel = dataModel;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder geoReferenceMethod(final String geoReferenceMethod) {
            this.geoReferenceMethod = geoReferenceMethod;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder transportMode(final String transportMode) {
            this.transportMode = transportMode;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder sovereignLegalName(final String sovereignLegalName) {
            this.sovereignLegalName = sovereignLegalName;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder geoLocation(final String geoLocation) {
            this.geoLocation = geoLocation;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder nutsLocations(final List<String> nutsLocations) {
            this.nutsLocations = nutsLocations;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataSampleUrls(final List<String> dataSampleUrls) {
            this.dataSampleUrls = dataSampleUrls;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder referenceFileUrls(final List<String> referenceFileUrls) {
            this.referenceFileUrls = referenceFileUrls;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder referenceFilesDescription(final String referenceFilesDescription) {
            this.referenceFilesDescription = referenceFilesDescription;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder conditionsForUse(final String conditionsForUse) {
            this.conditionsForUse = conditionsForUse;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder dataUpdateFrequency(final String dataUpdateFrequency) {
            this.dataUpdateFrequency = dataUpdateFrequency;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder temporalCoverageFrom(final LocalDate temporalCoverageFrom) {
            this.temporalCoverageFrom = temporalCoverageFrom;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder temporalCoverageToInclusive(final LocalDate temporalCoverageToInclusive) {
            this.temporalCoverageToInclusive = temporalCoverageToInclusive;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder customJsonAsString(final String customJsonAsString) {
            this.customJsonAsString = customJsonAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder customJsonLdAsString(final String customJsonLdAsString) {
            this.customJsonLdAsString = customJsonLdAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder privateCustomJsonAsString(final String privateCustomJsonAsString) {
            this.privateCustomJsonAsString = privateCustomJsonAsString;
            return this;
        }

        /**
         * @return {@code this}.
         */
        public UiAssetEditRequest.UiAssetEditRequestBuilder privateCustomJsonLdAsString(final String privateCustomJsonLdAsString) {
            this.privateCustomJsonLdAsString = privateCustomJsonLdAsString;
            return this;
        }

        public UiAssetEditRequest build() {
            return new UiAssetEditRequest(this.dataSourceOverrideOrNull, this.title, this.language, this.description, this.publisherHomepage, this.licenseUrl, this.version, this.keywords, this.mediaType, this.landingPageUrl, this.dataCategory, this.dataSubcategory, this.dataModel, this.geoReferenceMethod, this.transportMode, this.sovereignLegalName, this.geoLocation, this.nutsLocations, this.dataSampleUrls, this.referenceFileUrls, this.referenceFilesDescription, this.conditionsForUse, this.dataUpdateFrequency, this.temporalCoverageFrom, this.temporalCoverageToInclusive, this.customJsonAsString, this.customJsonLdAsString, this.privateCustomJsonAsString, this.privateCustomJsonLdAsString);
        }

        @Override
        public String toString() {
            return "UiAssetEditRequest.UiAssetEditRequestBuilder(dataSourceOverrideOrNull=" + this.dataSourceOverrideOrNull + ", title=" + this.title + ", language=" + this.language + ", description=" + this.description + ", publisherHomepage=" + this.publisherHomepage + ", licenseUrl=" + this.licenseUrl + ", version=" + this.version + ", keywords=" + this.keywords + ", mediaType=" + this.mediaType + ", landingPageUrl=" + this.landingPageUrl + ", dataCategory=" + this.dataCategory + ", dataSubcategory=" + this.dataSubcategory + ", dataModel=" + this.dataModel + ", geoReferenceMethod=" + this.geoReferenceMethod + ", transportMode=" + this.transportMode + ", sovereignLegalName=" + this.sovereignLegalName + ", geoLocation=" + this.geoLocation + ", nutsLocations=" + this.nutsLocations + ", dataSampleUrls=" + this.dataSampleUrls + ", referenceFileUrls=" + this.referenceFileUrls + ", referenceFilesDescription=" + this.referenceFilesDescription + ", conditionsForUse=" + this.conditionsForUse + ", dataUpdateFrequency=" + this.dataUpdateFrequency + ", temporalCoverageFrom=" + this.temporalCoverageFrom + ", temporalCoverageToInclusive=" + this.temporalCoverageToInclusive + ", customJsonAsString=" + this.customJsonAsString + ", customJsonLdAsString=" + this.customJsonLdAsString + ", privateCustomJsonAsString=" + this.privateCustomJsonAsString + ", privateCustomJsonLdAsString=" + this.privateCustomJsonLdAsString + ")";
        }
    }

    public static UiAssetEditRequest.UiAssetEditRequestBuilder builder() {
        return new UiAssetEditRequest.UiAssetEditRequestBuilder();
    }

    public UiAssetEditRequest.UiAssetEditRequestBuilder toBuilder() {
        return new UiAssetEditRequest.UiAssetEditRequestBuilder().dataSourceOverrideOrNull(this.dataSourceOverrideOrNull).title(this.title).language(this.language).description(this.description).publisherHomepage(this.publisherHomepage).licenseUrl(this.licenseUrl).version(this.version).keywords(this.keywords).mediaType(this.mediaType).landingPageUrl(this.landingPageUrl).dataCategory(this.dataCategory).dataSubcategory(this.dataSubcategory).dataModel(this.dataModel).geoReferenceMethod(this.geoReferenceMethod).transportMode(this.transportMode).sovereignLegalName(this.sovereignLegalName).geoLocation(this.geoLocation).nutsLocations(this.nutsLocations).dataSampleUrls(this.dataSampleUrls).referenceFileUrls(this.referenceFileUrls).referenceFilesDescription(this.referenceFilesDescription).conditionsForUse(this.conditionsForUse).dataUpdateFrequency(this.dataUpdateFrequency).temporalCoverageFrom(this.temporalCoverageFrom).temporalCoverageToInclusive(this.temporalCoverageToInclusive).customJsonAsString(this.customJsonAsString).customJsonLdAsString(this.customJsonLdAsString).privateCustomJsonAsString(this.privateCustomJsonAsString).privateCustomJsonLdAsString(this.privateCustomJsonLdAsString);
    }

    public UiDataSource getDataSourceOverrideOrNull() {
        return this.dataSourceOverrideOrNull;
    }

    public String getTitle() {
        return this.title;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getDescription() {
        return this.description;
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

    public void setDataSourceOverrideOrNull(final UiDataSource dataSourceOverrideOrNull) {
        this.dataSourceOverrideOrNull = dataSourceOverrideOrNull;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setDescription(final String description) {
        this.description = description;
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
        if (!(o instanceof UiAssetEditRequest)) return false;
        final UiAssetEditRequest other = (UiAssetEditRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$dataSourceOverrideOrNull = this.getDataSourceOverrideOrNull();
        final Object other$dataSourceOverrideOrNull = other.getDataSourceOverrideOrNull();
        if (this$dataSourceOverrideOrNull == null ? other$dataSourceOverrideOrNull != null : !this$dataSourceOverrideOrNull.equals(other$dataSourceOverrideOrNull)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$language = this.getLanguage();
        final Object other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) return false;
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
        return other instanceof UiAssetEditRequest;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $dataSourceOverrideOrNull = this.getDataSourceOverrideOrNull();
        result = result * PRIME + ($dataSourceOverrideOrNull == null ? 43 : $dataSourceOverrideOrNull.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $language = this.getLanguage();
        result = result * PRIME + ($language == null ? 43 : $language.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
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
        return "UiAssetEditRequest(dataSourceOverrideOrNull=" + this.getDataSourceOverrideOrNull() + ", title=" + this.getTitle() + ", language=" + this.getLanguage() + ", description=" + this.getDescription() + ", publisherHomepage=" + this.getPublisherHomepage() + ", licenseUrl=" + this.getLicenseUrl() + ", version=" + this.getVersion() + ", keywords=" + this.getKeywords() + ", mediaType=" + this.getMediaType() + ", landingPageUrl=" + this.getLandingPageUrl() + ", dataCategory=" + this.getDataCategory() + ", dataSubcategory=" + this.getDataSubcategory() + ", dataModel=" + this.getDataModel() + ", geoReferenceMethod=" + this.getGeoReferenceMethod() + ", transportMode=" + this.getTransportMode() + ", sovereignLegalName=" + this.getSovereignLegalName() + ", geoLocation=" + this.getGeoLocation() + ", nutsLocations=" + this.getNutsLocations() + ", dataSampleUrls=" + this.getDataSampleUrls() + ", referenceFileUrls=" + this.getReferenceFileUrls() + ", referenceFilesDescription=" + this.getReferenceFilesDescription() + ", conditionsForUse=" + this.getConditionsForUse() + ", dataUpdateFrequency=" + this.getDataUpdateFrequency() + ", temporalCoverageFrom=" + this.getTemporalCoverageFrom() + ", temporalCoverageToInclusive=" + this.getTemporalCoverageToInclusive() + ", customJsonAsString=" + this.getCustomJsonAsString() + ", customJsonLdAsString=" + this.getCustomJsonLdAsString() + ", privateCustomJsonAsString=" + this.getPrivateCustomJsonAsString() + ", privateCustomJsonLdAsString=" + this.getPrivateCustomJsonLdAsString() + ")";
    }

    public UiAssetEditRequest(final UiDataSource dataSourceOverrideOrNull, final String title, final String language, final String description, final String publisherHomepage, final String licenseUrl, final String version, final List<String> keywords, final String mediaType, final String landingPageUrl, final String dataCategory, final String dataSubcategory, final String dataModel, final String geoReferenceMethod, final String transportMode, final String sovereignLegalName, final String geoLocation, final List<String> nutsLocations, final List<String> dataSampleUrls, final List<String> referenceFileUrls, final String referenceFilesDescription, final String conditionsForUse, final String dataUpdateFrequency, final LocalDate temporalCoverageFrom, final LocalDate temporalCoverageToInclusive, final String customJsonAsString, final String customJsonLdAsString, final String privateCustomJsonAsString, final String privateCustomJsonLdAsString) {
        this.dataSourceOverrideOrNull = dataSourceOverrideOrNull;
        this.title = title;
        this.language = language;
        this.description = description;
        this.publisherHomepage = publisherHomepage;
        this.licenseUrl = licenseUrl;
        this.version = version;
        this.keywords = keywords;
        this.mediaType = mediaType;
        this.landingPageUrl = landingPageUrl;
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
        this.customJsonAsString = customJsonAsString;
        this.customJsonLdAsString = customJsonLdAsString;
        this.privateCustomJsonAsString = privateCustomJsonAsString;
        this.privateCustomJsonLdAsString = privateCustomJsonLdAsString;
    }

    public UiAssetEditRequest() {
    }
}
