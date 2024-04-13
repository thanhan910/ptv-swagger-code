# V3Run

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RunId** | **int32** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] [default to null]
**RunRef** | **string** | Alphanumeric trip/service run identifier | [optional] [default to null]
**RouteId** | **int32** | Route identifier | [optional] [default to null]
**RouteType** | **int32** | Transport mode identifier | [optional] [default to null]
**FinalStopId** | **int32** | stop_id of final stop of run | [optional] [default to null]
**DestinationName** | **string** | Name of destination of run | [optional] [default to null]
**Status** | **string** | Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes | [optional] [default to null]
**DirectionId** | **int32** | Direction of travel identifier | [optional] [default to null]
**RunSequence** | **int32** | Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. | [optional] [default to null]
**ExpressStopCount** | **int32** | The number of remaining skipped/express stations for the run/service from a stop | [optional] [default to null]
**VehiclePosition** | [***V3VehiclePosition**](V3.VehiclePosition.md) |  | [optional] [default to null]
**VehicleDescriptor** | [***V3VehicleDescriptor**](V3.VehicleDescriptor.md) |  | [optional] [default to null]
**Geopath** | [**[]interface{}**](interface{}.md) | Geopath of the route | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

