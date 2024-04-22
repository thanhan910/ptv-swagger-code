# V3SiriEstimatedTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previewInterval** | **String** | Siri Preview Interval | 
**subscriberRef** | **String** | Siri Subscriber Ref | 
**subscriptionRef** | **String** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siriFormat** | [**SiriFormatEnum**](#SiriFormatEnum) | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siriVersion** | **String** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumerAddress** | **String** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initialTerminationTime** | [**OffsetDateTime**](OffsetDateTime.md) | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**List&lt;V3SiriSubscriptionTopic&gt;**](V3SiriSubscriptionTopic.md) |  | 

<a name="SiriFormatEnum"></a>
## Enum: SiriFormatEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
