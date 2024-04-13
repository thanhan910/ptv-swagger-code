# PtvTimetableApiVersion3.V3SiriEstimatedTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**previewInterval** | **String** | Siri Preview Interval | 
**subscriberRef** | **String** | Siri Subscriber Ref | 
**subscriptionRef** | **String** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siriFormat** | **Number** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siriVersion** | **String** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumerAddress** | **String** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initialTerminationTime** | **Date** | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**[V3SiriSubscriptionTopic]**](V3SiriSubscriptionTopic.md) |  | 

<a name="SiriFormatEnum"></a>
## Enum: SiriFormatEnum

* `_0` (value: `0`)
* `_1` (value: `1`)

