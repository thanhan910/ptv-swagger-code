
# V3StopOnRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruptionIds** | **List&lt;Long&gt;** | Disruption information identifier(s) |  [optional]
**stopSuburb** | **String** | suburb of stop |  [optional]
**routeType** | **Integer** | Transport mode identifier |  [optional]
**stopLatitude** | **Float** | Geographic coordinate of latitude at stop |  [optional]
**stopLongitude** | **Float** | Geographic coordinate of longitude at stop |  [optional]
**stopSequence** | **Integer** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. |  [optional]
**stopTicket** | [**V3StopTicket**](V3StopTicket.md) | Stop ticket information |  [optional]
**stopId** | **Integer** | Stop identifier |  [optional]
**stopName** | **String** | Name of stop |  [optional]
**stopLandmark** | **String** | Landmark in proximity of stop |  [optional]



