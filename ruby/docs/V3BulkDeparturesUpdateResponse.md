# SwaggerClient::V3BulkDeparturesUpdateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departures** | [**Array&lt;V3Departure&gt;**](V3Departure.md) | Timetabled and real-time service departures | [optional] 
**route_type** | **Integer** | Transport mode identifier | [optional] 
**stop_id** | **Integer** | Stop identifier | [optional] 
**requested_route_direction** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) |  | [optional] 
**route_direction_status** | **Integer** | The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied. | [optional] 
**route_direction** | [**V3BulkDeparturesRouteDirectionResponse**](V3BulkDeparturesRouteDirectionResponse.md) |  | [optional] 

