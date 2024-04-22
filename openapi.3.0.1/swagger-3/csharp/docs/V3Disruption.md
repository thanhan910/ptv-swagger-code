# IO.Swagger.Model.V3Disruption
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisruptionId** | **long?** | Disruption information identifier | [optional] 
**Title** | **string** | Headline title summarising disruption information | [optional] 
**Url** | **string** | URL of relevant article on PTV website | [optional] 
**Description** | **string** | Description of the disruption | [optional] 
**DisruptionStatus** | **string** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) | [optional] 
**DisruptionType** | **string** | Type of disruption | [optional] 
**PublishedOn** | **DateTime?** | Date and time disruption information is published on PTV website, in ISO 8601 UTC format | [optional] 
**LastUpdated** | **DateTime?** | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format | [optional] 
**FromDate** | **DateTime?** | Date and time at which disruption begins, in ISO 8601 UTC format | [optional] 
**ToDate** | **DateTime?** | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) | [optional] 
**Routes** | [**List&lt;V3DisruptionRoute&gt;**](V3DisruptionRoute.md) | Route relevant to a disruption (if applicable) | [optional] 
**Stops** | [**List&lt;V3DisruptionStop&gt;**](V3DisruptionStop.md) | Stop relevant to a disruption (if applicable) | [optional] 
**Colour** | **string** |  | [optional] 
**DisplayOnBoard** | **bool?** |  | [optional] 
**DisplayStatus** | **bool?** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

