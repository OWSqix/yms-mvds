

# UiAsset

Type-safe data offer metadata as supported by the sovity product landscape. Contains extension points.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataSourceAvailability** | **DataSourceAvailability** | &#39;Live&#39; vs &#39;On Request&#39; |  |
|**assetId** | **String** | Asset Id |  |
|**connectorEndpoint** | **String** | Providing Connector&#39;s Connector Endpoint |  |
|**participantId** | **String** | Providing Connector&#39;s Participant ID |  |
|**title** | **String** | Asset Title |  |
|**creatorOrganizationName** | **String** | Asset Organization Name |  |
|**onRequestContactEmail** | **String** | Contact E-Mail address. Only for dataSourceAvailability ON_REQUEST. |  [optional] |
|**onRequestContactEmailSubject** | **String** | Contact Preferred E-Mail Subject. Only for dataSourceAvailability ON_REQUEST. |  [optional] |
|**language** | **String** | Asset Language |  [optional] |
|**description** | **String** | Asset Description. Supports markdown. |  [optional] |
|**descriptionShortText** | **String** | Asset Description Short Text generated from description. Contains no markdown. |  [optional] |
|**isOwnConnector** | **Boolean** | Flag that indicates whether this asset is created by this connector. |  |
|**publisherHomepage** | **String** | Asset Homepage |  [optional] |
|**licenseUrl** | **String** | License URL |  [optional] |
|**version** | **String** | Version |  [optional] |
|**keywords** | **List&lt;String&gt;** | Asset Keywords |  [optional] |
|**mediaType** | **String** | Asset MediaType |  [optional] |
|**landingPageUrl** | **String** | Homepage URL associated with the Asset |  [optional] |
|**httpDatasourceHintsProxyMethod** | **Boolean** | HTTP Datasource Hint: Proxy Method. Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source. |  [optional] |
|**httpDatasourceHintsProxyPath** | **Boolean** | HTTP Datasource Hint: Proxy Path. Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source. |  [optional] |
|**httpDatasourceHintsProxyQueryParams** | **Boolean** | HTTP Datasource Hint: Proxy Query Params. Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source. |  [optional] |
|**httpDatasourceHintsProxyBody** | **Boolean** | HTTP Datasource Hint: Proxy Body. Only for dataSourceAvailability LIVE with an underlying HTTP_DATA Data Source. |  [optional] |
|**dataCategory** | **String** | Data Category |  [optional] |
|**dataSubcategory** | **String** | Data Subcategory |  [optional] |
|**dataModel** | **String** | Data Model |  [optional] |
|**geoReferenceMethod** | **String** | Geo-Reference Method |  [optional] |
|**transportMode** | **String** | Transport Mode |  [optional] |
|**sovereignLegalName** | **String** | The sovereign is distinct from the publisher by being the legal owner of the data. |  [optional] |
|**geoLocation** | **String** | Geo location |  [optional] |
|**nutsLocations** | **List&lt;String&gt;** | Locations by NUTS standard which divides countries into administrative divisions |  [optional] |
|**dataSampleUrls** | **List&lt;String&gt;** | Data sample URLs |  [optional] |
|**referenceFileUrls** | **List&lt;String&gt;** | Reference file/schema URLs |  [optional] |
|**referenceFilesDescription** | **String** | Additional information on reference files/schemas |  [optional] |
|**conditionsForUse** | **String** | Instructions for use that are not legally relevant e.g. information on how to cite the dataset in papers |  [optional] |
|**dataUpdateFrequency** | **String** | Data update frequency |  [optional] |
|**temporalCoverageFrom** | **LocalDate** | Temporal coverage start date |  [optional] |
|**temporalCoverageToInclusive** | **LocalDate** | Temporal coverage end date (inclusive) |  [optional] |
|**assetJsonLd** | **String** | Contains the entire asset in the JSON-LD format |  [optional] |
|**customJsonAsString** | **String** | Contains serialized custom properties in the JSON format. |  [optional] |
|**customJsonLdAsString** | **String** | Contains serialized custom properties in the JSON LD format. Contrary to the customJsonAsString field, this string must represent a JSON LD object and will be affected by JSON LD compaction and expansion. Due to a technical limitation, the properties can&#39;t be booleans. |  [optional] |
|**privateCustomJsonAsString** | **String** | Same as customJsonAsString but the data will be stored in the private properties. |  [optional] |
|**privateCustomJsonLdAsString** | **String** | Same as customJsonLdAsString but the data will be stored in the private properties. The same limitations apply. |  [optional] |



