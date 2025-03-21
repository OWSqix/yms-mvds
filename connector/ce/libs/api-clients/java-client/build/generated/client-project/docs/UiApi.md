# UiApi

All URIs are relative to *https://my-connector/api/management*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buildInfo**](UiApi.md#buildInfo) | **GET** /wrapper/ui/build-info |  |
| [**createAsset**](UiApi.md#createAsset) | **POST** /wrapper/ui/pages/asset-page/assets |  |
| [**createContractDefinition**](UiApi.md#createContractDefinition) | **POST** /wrapper/ui/pages/contract-definition-page/contract-definitions |  |
| [**createDataOffer**](UiApi.md#createDataOffer) | **POST** /wrapper/ui/pages/create-data-offer |  |
| [**createPolicyDefinition**](UiApi.md#createPolicyDefinition) | **POST** /wrapper/ui/pages/policy-page/policy-definitions |  |
| [**createPolicyDefinitionV2**](UiApi.md#createPolicyDefinitionV2) | **POST** /wrapper/ui/v2/pages/policy-page/policy-definitions |  |
| [**deleteAsset**](UiApi.md#deleteAsset) | **DELETE** /wrapper/ui/pages/asset-page/assets/{assetId} |  |
| [**deleteContractDefinition**](UiApi.md#deleteContractDefinition) | **DELETE** /wrapper/ui/pages/contract-definition-page/contract-definitions/{contractDefinitionId} |  |
| [**deletePolicyDefinition**](UiApi.md#deletePolicyDefinition) | **DELETE** /wrapper/ui/pages/policy-page/policy-definitions/{policyId} |  |
| [**editAsset**](UiApi.md#editAsset) | **PUT** /wrapper/ui/pages/asset-page/assets/{assetId} |  |
| [**getAssetPage**](UiApi.md#getAssetPage) | **GET** /wrapper/ui/pages/asset-page |  |
| [**getCatalogPageDataOffers**](UiApi.md#getCatalogPageDataOffers) | **GET** /wrapper/ui/pages/catalog-page/data-offers |  |
| [**getContractAgreementCard**](UiApi.md#getContractAgreementCard) | **GET** /wrapper/ui/pages/contract-agreement-page/{contractAgreementId} |  |
| [**getContractAgreementPage**](UiApi.md#getContractAgreementPage) | **POST** /wrapper/ui/pages/contract-agreement-page |  |
| [**getContractDefinitionPage**](UiApi.md#getContractDefinitionPage) | **GET** /wrapper/ui/pages/contract-definition-page |  |
| [**getContractNegotiation**](UiApi.md#getContractNegotiation) | **GET** /wrapper/ui/pages/catalog-page/contract-negotiations/{contractNegotiationId} |  |
| [**getDashboardPage**](UiApi.md#getDashboardPage) | **GET** /wrapper/ui/pages/dashboard-page |  |
| [**getPolicyDefinitionPage**](UiApi.md#getPolicyDefinitionPage) | **GET** /wrapper/ui/pages/policy-page |  |
| [**getTransferHistoryPage**](UiApi.md#getTransferHistoryPage) | **GET** /wrapper/ui/pages/transfer-history-page |  |
| [**getTransferProcessAsset**](UiApi.md#getTransferProcessAsset) | **GET** /wrapper/ui/pages/transfer-history-page/transfer-processes/{transferProcessId}/asset |  |
| [**initiateContractNegotiation**](UiApi.md#initiateContractNegotiation) | **POST** /wrapper/ui/pages/catalog-page/contract-negotiations |  |
| [**initiateCustomTransfer**](UiApi.md#initiateCustomTransfer) | **POST** /wrapper/ui/pages/contract-agreement-page/transfers/custom |  |
| [**initiateTransfer**](UiApi.md#initiateTransfer) | **POST** /wrapper/ui/pages/contract-agreement-page/transfers |  |
| [**isAssetIdAvailable**](UiApi.md#isAssetIdAvailable) | **GET** /wrapper/ui/pages/data-offer-page/validate-asset-id/{assetId} |  |
| [**isContractDefinitionIdAvailable**](UiApi.md#isContractDefinitionIdAvailable) | **GET** /wrapper/ui/pages/data-offer-page/validate-contract-definition-id/{contractDefinitionId} |  |
| [**isPolicyIdAvailable**](UiApi.md#isPolicyIdAvailable) | **GET** /wrapper/ui/pages/data-offer-page/validate-policy-id/{policyId} |  |
| [**terminateContractAgreement**](UiApi.md#terminateContractAgreement) | **POST** /wrapper/ui/pages/content-agreement-page/{contractAgreementId}/terminate |  |


<a id="buildInfo"></a>
# **buildInfo**
> BuildInfo buildInfo()



Get the build version info

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      BuildInfo result = apiInstance.buildInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#buildInfo");
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

[**BuildInfo**](BuildInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="createAsset"></a>
# **createAsset**
> IdResponseDto createAsset(uiAssetCreateRequest)



Create a new Asset

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    UiAssetCreateRequest uiAssetCreateRequest = new UiAssetCreateRequest(); // UiAssetCreateRequest | 
    try {
      IdResponseDto result = apiInstance.createAsset(uiAssetCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#createAsset");
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
| **uiAssetCreateRequest** | [**UiAssetCreateRequest**](UiAssetCreateRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="createContractDefinition"></a>
# **createContractDefinition**
> IdResponseDto createContractDefinition(contractDefinitionRequest)



Create a new Contract Definition

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    ContractDefinitionRequest contractDefinitionRequest = new ContractDefinitionRequest(); // ContractDefinitionRequest | 
    try {
      IdResponseDto result = apiInstance.createContractDefinition(contractDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#createContractDefinition");
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
| **contractDefinitionRequest** | [**ContractDefinitionRequest**](ContractDefinitionRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="createDataOffer"></a>
# **createDataOffer**
> IdResponseDto createDataOffer(dataOfferCreateRequest)



Create a new asset, contract definition and optional policies. Uses the same id for the asset, the contract policy, the access policy and the contract definition

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    DataOfferCreateRequest dataOfferCreateRequest = new DataOfferCreateRequest(); // DataOfferCreateRequest | 
    try {
      IdResponseDto result = apiInstance.createDataOffer(dataOfferCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#createDataOffer");
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
| **dataOfferCreateRequest** | [**DataOfferCreateRequest**](DataOfferCreateRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | On success: the id (identical) for the created asset, policy and contract definition) |  -  |

<a id="createPolicyDefinition"></a>
# **createPolicyDefinition**
> IdResponseDto createPolicyDefinition(policyDefinitionCreateRequest)



[Deprecated] Create a new Policy Definition from a list of constraints. Use createPolicyDefinitionV2 instead.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    PolicyDefinitionCreateRequest policyDefinitionCreateRequest = new PolicyDefinitionCreateRequest(); // PolicyDefinitionCreateRequest | 
    try {
      IdResponseDto result = apiInstance.createPolicyDefinition(policyDefinitionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#createPolicyDefinition");
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
| **policyDefinitionCreateRequest** | [**PolicyDefinitionCreateRequest**](PolicyDefinitionCreateRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="createPolicyDefinitionV2"></a>
# **createPolicyDefinitionV2**
> IdResponseDto createPolicyDefinitionV2(policyDefinitionCreateDto)



Create a new Policy Definition

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    PolicyDefinitionCreateDto policyDefinitionCreateDto = new PolicyDefinitionCreateDto(); // PolicyDefinitionCreateDto | 
    try {
      IdResponseDto result = apiInstance.createPolicyDefinitionV2(policyDefinitionCreateDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#createPolicyDefinitionV2");
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
| **policyDefinitionCreateDto** | [**PolicyDefinitionCreateDto**](PolicyDefinitionCreateDto.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="deleteAsset"></a>
# **deleteAsset**
> IdResponseDto deleteAsset(assetId)



Delete an Asset

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      IdResponseDto result = apiInstance.deleteAsset(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#deleteAsset");
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
| **assetId** | **String**|  | |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="deleteContractDefinition"></a>
# **deleteContractDefinition**
> IdResponseDto deleteContractDefinition(contractDefinitionId)



Delete a Contract Definition

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String contractDefinitionId = "contractDefinitionId_example"; // String | 
    try {
      IdResponseDto result = apiInstance.deleteContractDefinition(contractDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#deleteContractDefinition");
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
| **contractDefinitionId** | **String**|  | |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="deletePolicyDefinition"></a>
# **deletePolicyDefinition**
> IdResponseDto deletePolicyDefinition(policyId)



Delete a Policy Definition

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      IdResponseDto result = apiInstance.deletePolicyDefinition(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#deletePolicyDefinition");
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
| **policyId** | **String**|  | |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="editAsset"></a>
# **editAsset**
> IdResponseDto editAsset(assetId, uiAssetEditRequest)



Updates an Asset&#39;s metadata and optionally also the data source.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    UiAssetEditRequest uiAssetEditRequest = new UiAssetEditRequest(); // UiAssetEditRequest | 
    try {
      IdResponseDto result = apiInstance.editAsset(assetId, uiAssetEditRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#editAsset");
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
| **assetId** | **String**|  | |
| **uiAssetEditRequest** | [**UiAssetEditRequest**](UiAssetEditRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getAssetPage"></a>
# **getAssetPage**
> AssetPage getAssetPage()



Collect all data for Asset Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      AssetPage result = apiInstance.getAssetPage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getAssetPage");
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

[**AssetPage**](AssetPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getCatalogPageDataOffers"></a>
# **getCatalogPageDataOffers**
> List&lt;UiDataOffer&gt; getCatalogPageDataOffers(participantId, connectorEndpoint)



Fetch a connector&#39;s data offers

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String participantId = "participantId_example"; // String | 
    String connectorEndpoint = "connectorEndpoint_example"; // String | 
    try {
      List<UiDataOffer> result = apiInstance.getCatalogPageDataOffers(participantId, connectorEndpoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getCatalogPageDataOffers");
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
| **participantId** | **String**|  | [optional] |
| **connectorEndpoint** | **String**|  | [optional] |

### Return type

[**List&lt;UiDataOffer&gt;**](UiDataOffer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getContractAgreementCard"></a>
# **getContractAgreementCard**
> ContractAgreementCard getContractAgreementCard(contractAgreementId)



Get a single contract agreement card by its identifier

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String contractAgreementId = "contractAgreementId_example"; // String | 
    try {
      ContractAgreementCard result = apiInstance.getContractAgreementCard(contractAgreementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getContractAgreementCard");
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
| **contractAgreementId** | **String**|  | |

### Return type

[**ContractAgreementCard**](ContractAgreementCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getContractAgreementPage"></a>
# **getContractAgreementPage**
> ContractAgreementPage getContractAgreementPage(contractAgreementPageQuery)



Collect filtered data for the Contract Agreement Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    ContractAgreementPageQuery contractAgreementPageQuery = new ContractAgreementPageQuery(); // ContractAgreementPageQuery | If null, returns all the contract agreements.
    try {
      ContractAgreementPage result = apiInstance.getContractAgreementPage(contractAgreementPageQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getContractAgreementPage");
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
| **contractAgreementPageQuery** | [**ContractAgreementPageQuery**](ContractAgreementPageQuery.md)| If null, returns all the contract agreements. | [optional] |

### Return type

[**ContractAgreementPage**](ContractAgreementPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getContractDefinitionPage"></a>
# **getContractDefinitionPage**
> ContractDefinitionPage getContractDefinitionPage()



Collect all data for Contract Definition Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      ContractDefinitionPage result = apiInstance.getContractDefinitionPage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getContractDefinitionPage");
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

[**ContractDefinitionPage**](ContractDefinitionPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getContractNegotiation"></a>
# **getContractNegotiation**
> UiContractNegotiation getContractNegotiation(contractNegotiationId)



Get Contract Negotiation Information

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String contractNegotiationId = "contractNegotiationId_example"; // String | 
    try {
      UiContractNegotiation result = apiInstance.getContractNegotiation(contractNegotiationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getContractNegotiation");
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
| **contractNegotiationId** | **String**|  | |

### Return type

[**UiContractNegotiation**](UiContractNegotiation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getDashboardPage"></a>
# **getDashboardPage**
> DashboardPage getDashboardPage()



Collect all data for the Dashboard Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      DashboardPage result = apiInstance.getDashboardPage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getDashboardPage");
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

[**DashboardPage**](DashboardPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getPolicyDefinitionPage"></a>
# **getPolicyDefinitionPage**
> PolicyDefinitionPage getPolicyDefinitionPage()



Collect all data for Policy Definition Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      PolicyDefinitionPage result = apiInstance.getPolicyDefinitionPage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getPolicyDefinitionPage");
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

[**PolicyDefinitionPage**](PolicyDefinitionPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getTransferHistoryPage"></a>
# **getTransferHistoryPage**
> TransferHistoryPage getTransferHistoryPage()



Collect all data for the Transfer History Page

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    try {
      TransferHistoryPage result = apiInstance.getTransferHistoryPage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getTransferHistoryPage");
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

[**TransferHistoryPage**](TransferHistoryPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="getTransferProcessAsset"></a>
# **getTransferProcessAsset**
> UiAsset getTransferProcessAsset(transferProcessId)



Queries a transfer process&#39; asset

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String transferProcessId = "transferProcessId_example"; // String | 
    try {
      UiAsset result = apiInstance.getTransferProcessAsset(transferProcessId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#getTransferProcessAsset");
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
| **transferProcessId** | **String**|  | |

### Return type

[**UiAsset**](UiAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="initiateContractNegotiation"></a>
# **initiateContractNegotiation**
> UiContractNegotiation initiateContractNegotiation(contractNegotiationRequest)



Initiate a new Contract Negotiation

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    ContractNegotiationRequest contractNegotiationRequest = new ContractNegotiationRequest(); // ContractNegotiationRequest | 
    try {
      UiContractNegotiation result = apiInstance.initiateContractNegotiation(contractNegotiationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#initiateContractNegotiation");
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
| **contractNegotiationRequest** | [**ContractNegotiationRequest**](ContractNegotiationRequest.md)|  | [optional] |

### Return type

[**UiContractNegotiation**](UiContractNegotiation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="initiateCustomTransfer"></a>
# **initiateCustomTransfer**
> IdResponseDto initiateCustomTransfer(initiateCustomTransferRequest)



Initiate a Transfer Process via a custom Transfer Process JSON-LD. Fields such as connectorId, assetId, providerConnectorId, providerConnectorAddress will be set automatically.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    InitiateCustomTransferRequest initiateCustomTransferRequest = new InitiateCustomTransferRequest(); // InitiateCustomTransferRequest | 
    try {
      IdResponseDto result = apiInstance.initiateCustomTransfer(initiateCustomTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#initiateCustomTransfer");
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
| **initiateCustomTransferRequest** | [**InitiateCustomTransferRequest**](InitiateCustomTransferRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="initiateTransfer"></a>
# **initiateTransfer**
> IdResponseDto initiateTransfer(initiateTransferRequest)



Initiate a Transfer Process

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    InitiateTransferRequest initiateTransferRequest = new InitiateTransferRequest(); // InitiateTransferRequest | 
    try {
      IdResponseDto result = apiInstance.initiateTransfer(initiateTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#initiateTransfer");
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
| **initiateTransferRequest** | [**InitiateTransferRequest**](InitiateTransferRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="isAssetIdAvailable"></a>
# **isAssetIdAvailable**
> IdAvailabilityResponse isAssetIdAvailable(assetId)



Validates if the provided assetId is already taken

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      IdAvailabilityResponse result = apiInstance.isAssetIdAvailable(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#isAssetIdAvailable");
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
| **assetId** | **String**|  | |

### Return type

[**IdAvailabilityResponse**](IdAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="isContractDefinitionIdAvailable"></a>
# **isContractDefinitionIdAvailable**
> IdAvailabilityResponse isContractDefinitionIdAvailable(contractDefinitionId)



Validates if the provided contractDefinitionId is already taken

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String contractDefinitionId = "contractDefinitionId_example"; // String | 
    try {
      IdAvailabilityResponse result = apiInstance.isContractDefinitionIdAvailable(contractDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#isContractDefinitionIdAvailable");
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
| **contractDefinitionId** | **String**|  | |

### Return type

[**IdAvailabilityResponse**](IdAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="isPolicyIdAvailable"></a>
# **isPolicyIdAvailable**
> IdAvailabilityResponse isPolicyIdAvailable(policyId)



Validates if the provided policyId is already taken

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String policyId = "policyId_example"; // String | 
    try {
      IdAvailabilityResponse result = apiInstance.isPolicyIdAvailable(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#isPolicyIdAvailable");
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
| **policyId** | **String**|  | |

### Return type

[**IdAvailabilityResponse**](IdAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="terminateContractAgreement"></a>
# **terminateContractAgreement**
> IdResponseDto terminateContractAgreement(contractAgreementId, contractTerminationRequest)



Terminates a contract agreement designated by its contract agreement id.

### Example
```java
// Import classes:
import de.sovity.edc.client.gen.ApiClient;
import de.sovity.edc.client.gen.ApiException;
import de.sovity.edc.client.gen.Configuration;
import de.sovity.edc.client.gen.models.*;
import de.sovity.edc.client.gen.api.UiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://my-connector/api/management");

    UiApi apiInstance = new UiApi(defaultClient);
    String contractAgreementId = "contractAgreementId_example"; // String | 
    ContractTerminationRequest contractTerminationRequest = new ContractTerminationRequest(); // ContractTerminationRequest | 
    try {
      IdResponseDto result = apiInstance.terminateContractAgreement(contractAgreementId, contractTerminationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UiApi#terminateContractAgreement");
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
| **contractAgreementId** | **String**|  | |
| **contractTerminationRequest** | [**ContractTerminationRequest**](ContractTerminationRequest.md)|  | [optional] |

### Return type

[**IdResponseDto**](IdResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

