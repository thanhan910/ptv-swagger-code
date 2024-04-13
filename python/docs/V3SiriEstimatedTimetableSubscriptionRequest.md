# V3SiriEstimatedTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preview_interval** | **str** | Siri Preview Interval | 
**subscriber_ref** | **str** | Siri Subscriber Ref | 
**subscription_ref** | **str** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siri_format** | **int** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siri_version** | **str** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumer_address** | **str** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initial_termination_time** | **datetime** | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**list[V3SiriSubscriptionTopic]**](V3SiriSubscriptionTopic.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

