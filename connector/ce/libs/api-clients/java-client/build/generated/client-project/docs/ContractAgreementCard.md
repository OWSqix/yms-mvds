

# ContractAgreementCard

Contract Agreement for Contract Agreement Page

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractAgreementId** | **String** | Contract Agreement ID |  |
|**contractNegotiationId** | **String** | Contract Negotiation ID |  |
|**direction** | **ContractAgreementDirection** | Incoming vs Outgoing |  |
|**counterPartyAddress** | **String** | Other Connector&#39;s Endpoint |  |
|**counterPartyId** | **String** | Other Connector&#39;s ID |  |
|**contractSigningDate** | **OffsetDateTime** | Contract Agreements Signing Date |  |
|**asset** | [**UiAsset**](UiAsset.md) | Asset details |  |
|**contractPolicy** | [**UiPolicy**](UiPolicy.md) | Contract Policy |  |
|**transferProcesses** | [**List&lt;ContractAgreementTransferProcess&gt;**](ContractAgreementTransferProcess.md) | Contract Agreement&#39;s Transfer Processes |  |
|**terminationStatus** | **ContractTerminationStatus** | Contract Agreement&#39;s Termination Status |  |
|**terminationInformation** | [**ContractAgreementTerminationInfo**](ContractAgreementTerminationInfo.md) | Contract Agreement&#39;s Metadata |  [optional] |



