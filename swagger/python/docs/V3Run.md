# V3Run

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**run_id** | **int** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] 
**run_ref** | **str** | Alphanumeric trip/service run identifier | [optional] 
**route_id** | **int** | Route identifier | [optional] 
**route_type** | **int** | Transport mode identifier | [optional] 
**final_stop_id** | **int** | stop_id of final stop of run | [optional] 
**destination_name** | **str** | Name of destination of run | [optional] 
**status** | **str** | Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes | [optional] 
**direction_id** | **int** | Direction of travel identifier | [optional] 
**run_sequence** | **int** | Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. | [optional] 
**express_stop_count** | **int** | The number of remaining skipped/express stations for the run/service from a stop | [optional] 
**vehicle_position** | [**V3VehiclePosition**](V3VehiclePosition.md) |  | [optional] 
**vehicle_descriptor** | [**V3VehicleDescriptor**](V3VehicleDescriptor.md) |  | [optional] 
**geopath** | **list[object]** | Geopath of the route | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

