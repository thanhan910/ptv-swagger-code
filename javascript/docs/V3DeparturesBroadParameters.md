# PtvTimetableApiVersion3.V3DeparturesBroadParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platformNumbers** | **[Number]** | Filter by platform number at stop | [optional] 
**directionId** | **Number** | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
**gtfs** | **Boolean** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
**dateUtc** | **Date** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**maxResults** | **Number** | Maximum number of results returned | [optional] 
**includeCancelled** | **Boolean** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**lookBackwards** | **Boolean** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**expand** | **[String]** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
**includeGeopath** | **Boolean** | Indicates if the route geopath should be returned | [optional] 

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

