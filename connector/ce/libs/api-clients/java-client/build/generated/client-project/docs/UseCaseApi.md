# UseCaseApi

All URIs are relative to *https://my-connector/api/management*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getKpis**](UseCaseApi.md#getKpis) | **GET** /wrapper/use-case-api/kpis |  |
| [**getSupportedFunctions**](UseCaseApi.md#getSupportedFunctions) | **GET** /wrapper/use-case-api/supported-policy-functions |  |
| [**queryCatalog**](UseCaseApi.md#queryCatalog) | **POST** /wrapper/use-case-api/catalog |  |


<a id="getKpis"></a>
# **getKpis**
> KpiResult getKpis()



Basic KPIs about the running EDC Connector.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UseCaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UseCaseApi apiInstance = new UseCaseApi(defaultClient);
    try {
      KpiResult result = apiInstance.getKpis();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UseCaseApi#getKpis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**KpiResult**](KpiResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getSupportedFunctions"></a>
# **getSupportedFunctions**
> List&lt;String&gt; getSupportedFunctions()



List available functions in policies, prohibitions and obligations.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UseCaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UseCaseApi apiInstance = new UseCaseApi(defaultClient);
    try {
      List<String> result = apiInstance.getSupportedFunctions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UseCaseApi#getSupportedFunctions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="queryCatalog"></a>
# **queryCatalog**
> List&lt;UiDataOffer&gt; queryCatalog(catalogQuery)



Fetch a connector&#39;s data offers

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UseCaseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UseCaseApi apiInstance = new UseCaseApi(defaultClient);
    CatalogQuery catalogQuery = new CatalogQuery(); // CatalogQuery | 
    try {
      List<UiDataOffer> result = apiInstance.queryCatalog(catalogQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UseCaseApi#queryCatalog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogQuery** | [**CatalogQuery**](CatalogQuery.md)|  | |

### Return type

[**List&lt;UiDataOffer&gt;**](UiDataOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

