# V3StopDepartureRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RouteType** | **int32** | Number identifying transport mode; values returned via RouteTypes API | [optional] [default to null]
**StopId** | **int32** | Identifier of stop; values returned by Stops API | [optional] [default to null]
**MaxResults** | **int32** | Maximum number of results returned | [optional] [default to null]
**Gtfs** | **bool** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data | [optional] [default to null]
**RouteDirections** | [**[]V3StopDepartureRequestRouteDirection**](V3.StopDepartureRequestRouteDirection.md) | The route directions to find departures for at this stop. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

