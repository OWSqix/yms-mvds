# EnterpriseEditionApi

All URIs are relative to *https://my-connector/api/management*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**connectorLimits**](EnterpriseEditionApi.md#connectorLimits) | **GET** /wrapper/ee/connector-limits |  |
| [**fileUploadCreateAsset**](EnterpriseEditionApi.md#fileUploadCreateAsset) | **POST** /wrapper/ee/file-upload/blobs/{blobId}/asset | Create an asset from an uploaded file. |
| [**fileUploadRequestSasToken**](EnterpriseEditionApi.md#fileUploadRequestSasToken) | **POST** /wrapper/ee/file-upload/blobs | Requests a Blob for file upload. |


<a id="connectorLimits"></a>
# **connectorLimits**
> ConnectorLimits connectorLimits()



Available and used resources of a connector.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.EnterpriseEditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    EnterpriseEditionApi apiInstance = new EnterpriseEditionApi(defaultClient);
    try {
      ConnectorLimits result = apiInstance.connectorLimits();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseEditionApi#connectorLimits");
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

[**ConnectorLimits**](ConnectorLimits.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="fileUploadCreateAsset"></a>
# **fileUploadCreateAsset**
> fileUploadCreateAsset(blobId, uiAssetCreateRequest)

Create an asset from an uploaded file.

Creates an asset using the uploaded file as data source.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.EnterpriseEditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    EnterpriseEditionApi apiInstance = new EnterpriseEditionApi(defaultClient);
    String blobId = "blobId_example"; // String | The Blob ID / URL the file was uploaded into.
    UiAssetCreateRequest uiAssetCreateRequest = new UiAssetCreateRequest(); // UiAssetCreateRequest | Metadata for the Asset. File-related metadata might be overridden.
    try {
      apiInstance.fileUploadCreateAsset(blobId, uiAssetCreateRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseEditionApi#fileUploadCreateAsset");
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
| **blobId** | **String**| The Blob ID / URL the file was uploaded into. | |
| **uiAssetCreateRequest** | [**UiAssetCreateRequest**](UiAssetCreateRequest.md)| Metadata for the Asset. File-related metadata might be overridden. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="fileUploadRequestSasToken"></a>
# **fileUploadRequestSasToken**
> String fileUploadRequestSasToken()

Requests a Blob for file upload.

Requests a Blob URL with a SAS Token so that the UI can directly upload the file to the Azure Blob Storage. Returns the Blob ID / Token.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.EnterpriseEditionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    EnterpriseEditionApi apiInstance = new EnterpriseEditionApi(defaultClient);
    try {
      String result = apiInstance.fileUploadRequestSasToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseEditionApi#fileUploadRequestSasToken");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

