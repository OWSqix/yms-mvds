

# UiPolicy

Type-Safe OpenAPI generator friendly ODLR policy subset as endorsed by sovity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyJsonLd** | **String** | EDC Policy JSON-LD. This is required because the EDC requires the full policy when initiating contract negotiations. |  |
|**expression** | [**UiPolicyExpression**](UiPolicyExpression.md) | Policy expression |  [optional] |
|**errors** | **List&lt;String&gt;** | When trying to reduce the policy JSON-LD to our opinionated subset of functionalities, many fields and functionalities are unsupported. Should any discrepancies occur during the mapping process, we&#39;ll collect them here. |  |



