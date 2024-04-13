# SwaggerClient::V3RouteDeparturesSpecificParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**train_scheduled_timetables** | **BOOLEAN** | DEPRECATED - use &#x60;scheduled_timetables&#x60; instead | [optional] 
**scheduled_timetables** | **BOOLEAN** | When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available. | [optional] 
**date_utc** | **DateTime** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**max_results** | **Integer** | Maximum number of results returned | [optional] 
**include_cancelled** | **BOOLEAN** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**look_backwards** | **BOOLEAN** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**expand** | **Array&lt;String&gt;** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
**include_geopath** | **BOOLEAN** | Indicates if the route geopath should be returned | [optional] 

