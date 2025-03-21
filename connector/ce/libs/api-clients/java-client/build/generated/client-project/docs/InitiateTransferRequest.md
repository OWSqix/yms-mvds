

# InitiateTransferRequest

For type PARAMS_ONLY: Required data for starting a Transfer Process

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractAgreementId** | **String** | Contract Agreement ID |  |
|**transferType** | **String** | Transfer Type. Used to select a compatible DataPlane. Examples are &#39;HttpData-PUSH&#39;, &#39;HttpData-PULL&#39;. Not to be confused with the &#39;type&#39; of the data source, or the &#39;type&#39; of the data sink found in the &#39;properties&#39; |  |
|**dataSinkProperties** | **Map&lt;String, String&gt;** | Data Sink / Data Address |  |
|**transferProcessProperties** | **Map&lt;String, String&gt;** | Additional transfer process properties. These are not passed to the consumer EDC |  |



