# V3RouteDeparturesSpecificParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrainScheduledTimetables** | **bool** | DEPRECATED - use &#x60;scheduled_timetables&#x60; instead | [optional] [default to null]
**ScheduledTimetables** | **bool** | When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available. | [optional] [default to null]
**DateUtc** | [**time.Time**](time.Time.md) | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] [default to null]
**MaxResults** | **int32** | Maximum number of results returned | [optional] [default to null]
**IncludeCancelled** | **bool** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] [default to null]
**LookBackwards** | **bool** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] [default to null]
**Expand** | **[]string** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] [default to null]
**IncludeGeopath** | **bool** | Indicates if the route geopath should be returned | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

