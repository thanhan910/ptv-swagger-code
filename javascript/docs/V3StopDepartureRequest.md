# PtvTimetableApiVersion3.V3StopDepartureRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeType** | **Number** | Number identifying transport mode; values returned via RouteTypes API | [optional] 
**stopId** | **Number** | Identifier of stop; values returned by Stops API | [optional] 
**maxResults** | **Number** | Maximum number of results returned | [optional] 
**gtfs** | **Boolean** | Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data | [optional] 
**routeDirections** | [**[V3StopDepartureRequestRouteDirection]**](V3StopDepartureRequestRouteDirection.md) | The route directions to find departures for at this stop. | 

<a name="RouteTypeEnum"></a>
## Enum: RouteTypeEnum

* `_0` (value: `0`)
* `_1` (value: `1`)
* `_2` (value: `2`)
* `_3` (value: `3`)
* `_4` (value: `4`)

