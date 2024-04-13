# V3Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisruptionId** | **int64** | Disruption information identifier | [optional] [default to null]
**Title** | **string** | Headline title summarising disruption information | [optional] [default to null]
**Url** | **string** | URL of relevant article on PTV website | [optional] [default to null]
**Description** | **string** | Description of the disruption | [optional] [default to null]
**DisruptionStatus** | **string** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) | [optional] [default to null]
**DisruptionType** | **string** | Type of disruption | [optional] [default to null]
**PublishedOn** | [**time.Time**](time.Time.md) | Date and time disruption information is published on PTV website, in ISO 8601 UTC format | [optional] [default to null]
**LastUpdated** | [**time.Time**](time.Time.md) | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format | [optional] [default to null]
**FromDate** | [**time.Time**](time.Time.md) | Date and time at which disruption begins, in ISO 8601 UTC format | [optional] [default to null]
**ToDate** | [**time.Time**](time.Time.md) | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) | [optional] [default to null]
**Routes** | [**[]V3DisruptionRoute**](V3.DisruptionRoute.md) | Route relevant to a disruption (if applicable) | [optional] [default to null]
**Stops** | [**[]V3DisruptionStop**](V3.DisruptionStop.md) | Stop relevant to a disruption (if applicable) | [optional] [default to null]
**Colour** | **string** |  | [optional] [default to null]
**DisplayOnBoard** | **bool** |  | [optional] [default to null]
**DisplayStatus** | **bool** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

