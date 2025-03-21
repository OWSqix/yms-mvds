

# UiDataSourceHttpData

HTTP_DATA type Data Source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | **UiDataSourceHttpDataMethod** | HTTP Request Method |  [optional] |
|**baseUrl** | **String** | HTTP Request URL. If parameterized, additional pathParams will be joined onto existing one. |  |
|**queryString** | **String** | HTTP Request Query Params / Query String. |  [optional] |
|**authHeaderName** | **String** | Auth Header name. The auth header is handled specially by the EDC as its value can be read from a vault. |  [optional] |
|**authHeaderValue** | [**SecretValue**](SecretValue.md) | Auth Header value. |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | HTTP Request Headers. HTTP Header Parameterization is not available. |  [optional] |
|**enableMethodParameterization** | **Boolean** | Enable Method Parameterization. This forces consumers to provide a method, otherwise the transfer will fail. |  [optional] |
|**enablePathParameterization** | **Boolean** | Enable Path Parameterization. |  [optional] |
|**enableQueryParameterization** | **Boolean** | Enable Query Parameterization. Any additionally provided queryString will be merged with the existing one. |  [optional] |
|**enableBodyParameterization** | **Boolean** | Enable Body Parameterization. Forces the provider to provide both a request body and a content type. Only Methods POST, PUT and PATCH allow request bodies. |  [optional] |



