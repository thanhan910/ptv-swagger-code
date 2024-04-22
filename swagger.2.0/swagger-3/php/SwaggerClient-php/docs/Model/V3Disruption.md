# V3Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_id** | **int** | Disruption information identifier | [optional] 
**title** | **string** | Headline title summarising disruption information | [optional] 
**url** | **string** | URL of relevant article on PTV website | [optional] 
**description** | **string** | Description of the disruption | [optional] 
**disruption_status** | **string** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) | [optional] 
**disruption_type** | **string** | Type of disruption | [optional] 
**published_on** | [**\DateTime**](\DateTime.md) | Date and time disruption information is published on PTV website, in ISO 8601 UTC format | [optional] 
**last_updated** | [**\DateTime**](\DateTime.md) | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format | [optional] 
**from_date** | [**\DateTime**](\DateTime.md) | Date and time at which disruption begins, in ISO 8601 UTC format | [optional] 
**to_date** | [**\DateTime**](\DateTime.md) | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) | [optional] 
**routes** | [**\Swagger\Client\Model\V3DisruptionRoute[]**](V3DisruptionRoute.md) | Route relevant to a disruption (if applicable) | [optional] 
**stops** | [**\Swagger\Client\Model\V3DisruptionStop[]**](V3DisruptionStop.md) | Stop relevant to a disruption (if applicable) | [optional] 
**colour** | **string** |  | [optional] 
**display_on_board** | **bool** |  | [optional] 
**display_status** | **bool** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

