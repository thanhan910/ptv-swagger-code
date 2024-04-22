# Ptv.Api.Client.Model.V3SiriProductionTimetableSubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartTime** | **DateTime** | Siri Start Time of the Validity Period | 
**EndTime** | **DateTime** | Siri End Time of the Validity Period | 
**SubscriberRef** | **string** | Siri Subscriber Ref | 
**SubscriptionRef** | **string** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**SiriFormat** | **int** | Siri Message Format &#39;xml&#39; or &#39;json&#39; | 
**SiriVersion** | **string** | Siri Message Version &#39;1.3&#39; or &#39;2.0&#39; | 
**ConsumerAddress** | **string** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**InitialTerminationTime** | **DateTime** | Siri Initial Termination Time - Expiry of the subscription | 
**Topics** | [**List&lt;V3SiriSubscriptionTopic&gt;**](V3SiriSubscriptionTopic.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

