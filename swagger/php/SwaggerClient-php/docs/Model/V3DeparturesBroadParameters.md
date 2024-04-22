# V3DeparturesBroadParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform_numbers** | **int[]** | Filter by platform number at stop | [optional] 
**direction_id** | **int** | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
**gtfs** | **bool** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
**date_utc** | [**\DateTime**](\DateTime.md) | Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
**max_results** | **int** | Maximum number of results returned | [optional] 
**include_cancelled** | **bool** | Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
**look_backwards** | **bool** | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
**expand** | **string[]** | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
**include_geopath** | **bool** | Indicates if the route geopath should be returned | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


