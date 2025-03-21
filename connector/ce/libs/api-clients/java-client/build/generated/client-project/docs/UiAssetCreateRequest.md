

# UiAssetCreateRequest

Type-safe data offer metadata for creating an asset as supported by the sovity product landscape. Contains extension points.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataSource** | [**UiDataSource**](UiDataSource.md) | Data Source |  |
|**id** | **String** | Asset Id |  |
|**title** | **String** | Asset Title |  [optional] |
|**language** | **String** | Asset Language |  [optional] |
|**description** | **String** | Asset Description |  [optional] |
|**publisherHomepage** | **String** | Asset Homepage |  [optional] |
|**licenseUrl** | **String** | License URL |  [optional] |
|**version** | **String** | Version |  [optional] |
|**keywords** | **List&lt;String&gt;** | Asset Keywords |  [optional] |
|**mediaType** | **String** | Asset MediaType |  [optional] |
|**landingPageUrl** | **String** | Landing Page URL |  [optional] |
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
|**customJsonAsString** | **String** | Contains serialized custom properties in the JSON format. |  [optional] |
|**customJsonLdAsString** | **String** | Contains serialized custom properties in the JSON LD format. Contrary to the customJsonAsString field, this string must represent a JSON LD object and will be affected by JSON LD compaction and expansion. Due to a technical limitation, the properties can&#39;t be booleans. |  [optional] |
|**privateCustomJsonAsString** | **String** | Same as customJsonAsString but the data will be stored in the private properties. |  [optional] |
|**privateCustomJsonLdAsString** | **String** | Same as customJsonLdAsString but the data will be stored in the private properties. The same limitations apply. |  [optional] |



