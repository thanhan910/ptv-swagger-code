# IO.Swagger.Model.V3Run
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunId** | **int?** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] 
**RunRef** | **string** | Alphanumeric trip/service run identifier | [optional] 
**RouteId** | **int?** | Route identifier | [optional] 
**RouteType** | **int?** | Transport mode identifier | [optional] 
**FinalStopId** | **int?** | stop_id of final stop of run | [optional] 
**DestinationName** | **string** | Name of destination of run | [optional] 
**Status** | **string** | Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes | [optional] 
**DirectionId** | **int?** | Direction of travel identifier | [optional] 
**RunSequence** | **int?** | Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. | [optional] 
**ExpressStopCount** | **int?** | The number of remaining skipped/express stations for the run/service from a stop | [optional] 
**VehiclePosition** | [**V3VehiclePosition**](V3VehiclePosition.md) |  | [optional] 
**VehicleDescriptor** | [**V3VehicleDescriptor**](V3VehicleDescriptor.md) |  | [optional] 
**Geopath** | **List&lt;Object&gt;** | Geopath of the route | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

