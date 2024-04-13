# IO.Swagger.Model.V3BulkDeparturesUpdateResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Departures** | [**List&lt;V3Departure&gt;**](V3Departure.md) | Timetabled and real-time service departures | [optional] 
**RouteType** | **int?** | Transport mode identifier | [optional] 
**StopId** | **int?** | Stop identifier | [optional] 
**RequestedRouteDirection** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) |  | [optional] 
**RouteDirectionStatus** | **int?** | The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied. | [optional] 
**RouteDirection** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

