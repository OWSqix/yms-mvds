

# CatalogQuery

Catalog query parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorEndpoint** | **String** | Target EDC DSP endpoint URL. Can contain a queryParam &#39;participantId&#39;, which is provided by default in the Connector Endpoint in the EDC UI. |  |
|**participantId** | **String** | Target EDC Participant ID. It is required if the connector endpoint does not contain the queryParam &#39;participantId&#39;. |  [optional] |
|**limit** | **Integer** | Limit the number of results |  [optional] |
|**offset** | **Integer** | Offset for returned results, e.g. start at result 2 |  [optional] |
|**filterExpressions** | [**List&lt;CatalogFilterExpression&gt;**](CatalogFilterExpression.md) | Filter expressions for catalog filtering |  [optional] |



