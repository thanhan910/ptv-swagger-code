# V3ResultStop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopDistance** | **Float** | Distance of stop from input location (in metres); returns 0 if no location is input |  [optional]
**stopSuburb** | **String** | suburb of stop |  [optional]
**routeType** | **Integer** | Transport mode identifier |  [optional]
**routes** | [**List&lt;V3ResultRoute&gt;**](V3ResultRoute.md) | List of routes travelling through the stop |  [optional]
**stopLatitude** | **Float** | Geographic coordinate of latitude at stop |  [optional]
**stopLongitude** | **Float** | Geographic coordinate of longitude at stop |  [optional]
**stopSequence** | **Integer** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. |  [optional]
**stopId** | **Integer** | Stop identifier |  [optional]
**stopName** | **String** | Name of stop |  [optional]
**stopLandmark** | **String** | Landmark in proximity of stop |  [optional]
