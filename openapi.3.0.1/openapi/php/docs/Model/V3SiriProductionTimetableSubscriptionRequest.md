# # V3SiriProductionTimetableSubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_time** | **\DateTime** | Siri Start Time of the Validity Period |
**end_time** | **\DateTime** | Siri End Time of the Validity Period |
**subscriber_ref** | **string** | Siri Subscriber Ref |
**subscription_ref** | **string** | Siri Subscription Ref - Unique to a Subscriber Ref |
**siri_format** | **int** | Siri Message Format &#39;xml&#39; or &#39;json&#39; |
**siri_version** | **string** | Siri Message Version &#39;1.3&#39; or &#39;2.0&#39; |
**consumer_address** | **string** | Siri Consumer Address - Baseline and Updates will be sent to this address |
**initial_termination_time** | **\DateTime** | Siri Initial Termination Time - Expiry of the subscription |
**topics** | [**\OpenAPI\Client\Model\V3SiriSubscriptionTopic[]**](V3SiriSubscriptionTopic.md) |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
