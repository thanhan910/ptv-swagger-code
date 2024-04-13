# SwaggerClient::V3SiriEstimatedTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**preview_interval** | **String** | Siri Preview Interval | 
**subscriber_ref** | **String** | Siri Subscriber Ref | 
**subscription_ref** | **String** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siri_format** | **Integer** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siri_version** | **String** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumer_address** | **String** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initial_termination_time** | **DateTime** | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**Array&lt;V3SiriSubscriptionTopic&gt;**](V3SiriSubscriptionTopic.md) |  | 

