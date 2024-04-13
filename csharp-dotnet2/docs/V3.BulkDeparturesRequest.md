# IO.Swagger.Model.V3BulkDeparturesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Requests** | [**List&lt;V3StopDepartureRequest&gt;**](V3StopDepartureRequest.md) | Collection of departure requests | 
**DateUtc** | **DateTime?** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**LookBackwards** | **bool?** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**IncludeCancelled** | **bool?** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**IncludeGeopath** | **bool?** | Indicates if the route geopath should be returned | [optional] 
**Expand** | **List&lt;string&gt;** | List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

