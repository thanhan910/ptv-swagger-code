# V3SiriProductionTimetableSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | [**\DateTime**](\DateTime.md) | Siri Start Time of the Validity Period | 
**end_time** | [**\DateTime**](\DateTime.md) | Siri End Time of the Validity Period | 
**subscriber_ref** | **string** | Siri Subscriber Ref | 
**subscription_ref** | **string** | Siri Subscription Ref - Unique to a Subscriber Ref | 
**siri_format** | **int** | Siri Message Format &#x27;xml&#x27; or &#x27;json&#x27; | 
**siri_version** | **string** | Siri Message Version &#x27;1.3&#x27; or &#x27;2.0&#x27; | 
**consumer_address** | **string** | Siri Consumer Address - Baseline and Updates will be sent to this address | 
**initial_termination_time** | [**\DateTime**](\DateTime.md) | Siri Initial Termination Time - Expiry of the subscription | 
**topics** | [**\Swagger\Client\Model\V3SiriSubscriptionTopic[]**](V3SiriSubscriptionTopic.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

