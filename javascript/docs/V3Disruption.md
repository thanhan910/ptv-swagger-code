# PtvTimetableApiVersion3.V3Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruptionId** | **Number** | Disruption information identifier | [optional] 
**title** | **String** | Headline title summarising disruption information | [optional] 
**url** | **String** | URL of relevant article on PTV website | [optional] 
**description** | **String** | Description of the disruption | [optional] 
**disruptionStatus** | **String** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) | [optional] 
**disruptionType** | **String** | Type of disruption | [optional] 
**publishedOn** | **Date** | Date and time disruption information is published on PTV website, in ISO 8601 UTC format | [optional] 
**lastUpdated** | **Date** | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format | [optional] 
**fromDate** | **Date** | Date and time at which disruption begins, in ISO 8601 UTC format | [optional] 
**toDate** | **Date** | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) | [optional] 
**routes** | [**[V3DisruptionRoute]**](V3DisruptionRoute.md) | Route relevant to a disruption (if applicable) | [optional] 
**stops** | [**[V3DisruptionStop]**](V3DisruptionStop.md) | Stop relevant to a disruption (if applicable) | [optional] 
**colour** | **String** |  | [optional] 
**displayOnBoard** | **Boolean** |  | [optional] 
**displayStatus** | **Boolean** |  | [optional] 
