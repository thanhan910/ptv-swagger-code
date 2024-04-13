# SwaggerClient::V3Run

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**run_id** | **Integer** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] 
**run_ref** | **String** | Alphanumeric trip/service run identifier | [optional] 
**route_id** | **Integer** | Route identifier | [optional] 
**route_type** | **Integer** | Transport mode identifier | [optional] 
**final_stop_id** | **Integer** | stop_id of final stop of run | [optional] 
**destination_name** | **String** | Name of destination of run | [optional] 
**status** | **String** | Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes | [optional] 
**direction_id** | **Integer** | Direction of travel identifier | [optional] 
**run_sequence** | **Integer** | Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. | [optional] 
**express_stop_count** | **Integer** | The number of remaining skipped/express stations for the run/service from a stop | [optional] 
**vehicle_position** | [**V3VehiclePosition**](V3VehiclePosition.md) |  | [optional] 
**vehicle_descriptor** | [**V3VehicleDescriptor**](V3VehicleDescriptor.md) |  | [optional] 
**geopath** | **Array&lt;Object&gt;** | Geopath of the route | [optional] 

