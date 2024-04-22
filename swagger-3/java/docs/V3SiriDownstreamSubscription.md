# V3SiriDownstreamSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriberRef** | **String** |  |  [optional]
**subscriptionRef** | **String** |  |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional]
**siriFormat** | [**SiriFormatEnum**](#SiriFormatEnum) |  |  [optional]
**siriVersion** | **String** |  |  [optional]
**consumerAddress** | **String** |  |  [optional]
**initialTerminationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**validityPeriodStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**validityPeriodEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**previewInterval** | **String** |  |  [optional]
**topics** | [**List&lt;V3SiriDownstreamSubscriptionTopic&gt;**](V3SiriDownstreamSubscriptionTopic.md) |  |  [optional]

<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

<a name="SiriFormatEnum"></a>
## Enum: SiriFormatEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
