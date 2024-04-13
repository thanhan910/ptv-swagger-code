# PtvTimetableApiVersion3.V3BulkDeparturesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**[V3StopDepartureRequest]**](V3StopDepartureRequest.md) | Collection of departure requests | 
**dateUtc** | **Date** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**lookBackwards** | **Boolean** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**includeCancelled** | **Boolean** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**includeGeopath** | **Boolean** | Indicates if the route geopath should be returned | [optional] 
**expand** | **[String]** | List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none | [optional] 

<a name="[ExpandEnum]"></a>
## Enum: [ExpandEnum]

* `all` (value: `"All"`)
* `stop` (value: `"Stop"`)
* `route` (value: `"Route"`)
* `run` (value: `"Run"`)
* `direction` (value: `"Direction"`)
* `disruption` (value: `"Disruption"`)
* `vehicleDescriptor` (value: `"VehicleDescriptor"`)
* `vehiclePosition` (value: `"VehiclePosition"`)
* `none` (value: `"None"`)

