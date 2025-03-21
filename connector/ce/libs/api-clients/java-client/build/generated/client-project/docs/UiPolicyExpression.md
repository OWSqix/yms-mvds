

# UiPolicyExpression

ODRL constraint as supported by the sovity product landscape

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **UiPolicyExpressionType** | Expression type |  |
|**expressions** | [**List&lt;UiPolicyExpression&gt;**](UiPolicyExpression.md) | Only for types AND, OR, XONE. List of sub-expressions to be evaluated according to the expressionType. |  [optional] |
|**constraint** | [**UiPolicyConstraint**](UiPolicyConstraint.md) | Only for type CONSTRAINT. A single constraint. |  [optional] |



