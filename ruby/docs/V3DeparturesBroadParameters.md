# SwaggerClient::V3DeparturesBroadParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform_numbers** | **Array&lt;Integer&gt;** | Filter by platform number at stop | [optional] 
**direction_id** | **Integer** | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
**gtfs** | **BOOLEAN** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
**date_utc** | **DateTime** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**max_results** | **Integer** | Maximum number of results returned | [optional] 
**include_cancelled** | **BOOLEAN** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**look_backwards** | **BOOLEAN** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**expand** | **Array&lt;String&gt;** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
**include_geopath** | **BOOLEAN** | Indicates if the route geopath should be returned | [optional] 

