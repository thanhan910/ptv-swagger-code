# SwaggerClient::V3SiriProductionTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **DateTime** | Siri Start Time of the Validity Period | 
**end_time** | **DateTime** | Siri End Time of the Validity Period | 
**subscriber_ref** | **String** | Siri Subscriber Ref | 
**subscription_ref** | **String** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siri_format** | **Integer** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siri_version** | **String** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumer_address** | **String** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initial_termination_time** | **DateTime** | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**Array&lt;V3SiriSubscriptionTopic&gt;**](V3SiriSubscriptionTopic.md) |  | 

