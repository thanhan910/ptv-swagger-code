# SwaggerClient::V3Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_id** | **Integer** | Disruption information identifier | [optional] 
**title** | **String** | Headline title summarising disruption information | [optional] 
**url** | **String** | URL of relevant article on PTV website | [optional] 
**description** | **String** | Description of the disruption | [optional] 
**disruption_status** | **String** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) | [optional] 
**disruption_type** | **String** | Type of disruption | [optional] 
**published_on** | **DateTime** | Date and time disruption information is published on PTV website, in ISO 8601 UTC format | [optional] 
**last_updated** | **DateTime** | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format | [optional] 
**from_date** | **DateTime** | Date and time at which disruption begins, in ISO 8601 UTC format | [optional] 
**to_date** | **DateTime** | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) | [optional] 
**routes** | [**Array&lt;V3DisruptionRoute&gt;**](V3DisruptionRoute.md) | Route relevant to a disruption (if applicable) | [optional] 
**stops** | [**Array&lt;V3DisruptionStop&gt;**](V3DisruptionStop.md) | Stop relevant to a disruption (if applicable) | [optional] 
**colour** | **String** |  | [optional] 
**display_on_board** | **BOOLEAN** |  | [optional] 
**display_status** | **BOOLEAN** |  | [optional] 

