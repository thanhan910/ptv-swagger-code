# V3StopOnRoute

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisruptionIds** | **[]int64** | Disruption information identifier(s) | [optional] [default to null]
**StopSuburb** | **string** | suburb of stop | [optional] [default to null]
**RouteType** | **int32** | Transport mode identifier | [optional] [default to null]
**StopLatitude** | **float32** | Geographic coordinate of latitude at stop | [optional] [default to null]
**StopLongitude** | **float32** | Geographic coordinate of longitude at stop | [optional] [default to null]
**StopSequence** | **int32** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. | [optional] [default to null]
**StopTicket** | [***V3StopTicket**](V3.StopTicket.md) |  | [optional] [default to null]
**StopId** | **int32** | Stop identifier | [optional] [default to null]
**StopName** | **string** | Name of stop | [optional] [default to null]
**StopLandmark** | **string** | Landmark in proximity of stop | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

