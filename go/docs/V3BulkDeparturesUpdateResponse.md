# V3BulkDeparturesUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Departures** | [**[]V3Departure**](V3.Departure.md) | Timetabled and real-time service departures | [optional] [default to null]
**RouteType** | **int32** | Transport mode identifier | [optional] [default to null]
**StopId** | **int32** | Stop identifier | [optional] [default to null]
**RequestedRouteDirection** | [***V3BulkDeparturesRouteDirectionResponse**](V3.BulkDeparturesRouteDirectionResponse.md) |  | [optional] [default to null]
**RouteDirectionStatus** | **int32** | The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied. | [optional] [default to null]
**RouteDirection** | [***V3BulkDeparturesRouteDirectionResponse**](V3.BulkDeparturesRouteDirectionResponse.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

