# V3SiriEstimatedTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PreviewInterval** | **string** | Siri Preview Interval | [default to null]
**SubscriberRef** | **string** | Siri Subscriber Ref | [default to null]
**SubscriptionRef** | **string** | Siri Subscription Ref - Unique to a Subscriber Ref | [default to null]
**SiriFormat** | **int32** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | [default to null]
**SiriVersion** | **string** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | [default to null]
**ConsumerAddress** | **string** | Siri Consumer Address - Baseline and Updates will be sent to this address | [default to null]
**InitialTerminationTime** | [**time.Time**](time.Time.md) | Siri Initial Termination Time - Expiry of the subscription | [default to null]
**Topics** | [**[]V3SiriSubscriptionTopic**](V3.SiriSubscriptionTopic.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

