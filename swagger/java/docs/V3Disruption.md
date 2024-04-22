# V3Disruption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruptionId** | **Long** | Disruption information identifier |  [optional]
**title** | **String** | Headline title summarising disruption information |  [optional]
**url** | **String** | URL of relevant article on PTV website |  [optional]
**description** | **String** | Description of the disruption |  [optional]
**disruptionStatus** | **String** | Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;) |  [optional]
**disruptionType** | **String** | Type of disruption |  [optional]
**publishedOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time disruption information is published on PTV website, in ISO 8601 UTC format |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time disruption information was last updated by PTV, in ISO 8601 UTC format |  [optional]
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which disruption begins, in ISO 8601 UTC format |  [optional]
**toDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) |  [optional]
**routes** | [**List&lt;V3DisruptionRoute&gt;**](V3DisruptionRoute.md) | Route relevant to a disruption (if applicable) |  [optional]
**stops** | [**List&lt;V3DisruptionStop&gt;**](V3DisruptionStop.md) | Stop relevant to a disruption (if applicable) |  [optional]
**colour** | **String** |  |  [optional]
**displayOnBoard** | **Boolean** |  |  [optional]
**displayStatus** | **Boolean** |  |  [optional]
