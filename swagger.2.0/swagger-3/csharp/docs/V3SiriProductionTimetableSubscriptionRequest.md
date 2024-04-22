# IO.Swagger.Model.V3SiriProductionTimetableSubscriptionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartTime** | **DateTime?** | Siri Start Time of the Validity Period | 
**EndTime** | **DateTime?** | Siri End Time of the Validity Period | 
**SubscriberRef** | **string** | Siri Subscriber Ref | 
**SubscriptionRef** | **string** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**SiriFormat** | **int?** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**SiriVersion** | **string** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**ConsumerAddress** | **string** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**InitialTerminationTime** | **DateTime?** | Siri Initial Termination Time - Expiry of the subscription | 
**Topics** | [**List&lt;V3SiriSubscriptionTopic&gt;**](V3SiriSubscriptionTopic.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

