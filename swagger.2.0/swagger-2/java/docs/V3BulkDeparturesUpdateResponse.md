
# V3BulkDeparturesUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departures** | [**List&lt;V3Departure&gt;**](V3Departure.md) | Timetabled and real-time service departures |  [optional]
**routeType** | **Integer** | Transport mode identifier |  [optional]
**stopId** | **Integer** | Stop identifier |  [optional]
**requestedRouteDirection** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) | The route direction that these departures are for. Will be one of the requested route directions |  [optional]
**routeDirectionStatus** | [**RouteDirectionStatusEnum**](#RouteDirectionStatusEnum) | The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied. |  [optional]
**routeDirection** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) | The route direction found matching the requested_route_direction |  [optional]


<a name="RouteDirectionStatusEnum"></a>
## Enum: RouteDirectionStatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



