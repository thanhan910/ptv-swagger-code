# IO.Swagger.Model.V3RouteDeparturesSpecificParameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrainScheduledTimetables** | **bool?** | DEPRECATED - use &#x60;scheduled_timetables&#x60; instead | [optional] 
**ScheduledTimetables** | **bool?** | When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available. | [optional] 
**DateUtc** | **DateTime?** | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**MaxResults** | **int?** | Maximum number of results returned | [optional] 
**IncludeCancelled** | **bool?** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**LookBackwards** | **bool?** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**Expand** | **List&lt;string&gt;** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
**IncludeGeopath** | **bool?** | Indicates if the route geopath should be returned | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

