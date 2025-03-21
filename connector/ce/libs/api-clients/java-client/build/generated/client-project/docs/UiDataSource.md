

# UiDataSource

Type-safe data source as supported by the sovity product landscape. Contains extension points for using custom data address properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **DataSourceType** | Data Address Type. |  |
|**httpData** | [**UiDataSourceHttpData**](UiDataSourceHttpData.md) | Only for type HTTP_DATA |  [optional] |
|**onRequest** | [**UiDataSourceOnRequest**](UiDataSourceOnRequest.md) | Only for type ON_REQUEST |  [optional] |
|**customProperties** | **Map&lt;String, String&gt;** | For all types. Custom Data Address Properties. |  [optional] |



