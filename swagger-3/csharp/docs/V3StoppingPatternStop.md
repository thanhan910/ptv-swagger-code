# IO.Swagger.Model.V3StoppingPatternStop
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StopTicket** | [**V3StopTicket**](V3StopTicket.md) |  | [optional] 
**StopDistance** | **float?** | Distance of stop from input location (in metres); returns 0 if no location is input | [optional] 
**StopSuburb** | **string** | suburb of stop | [optional] 
**StopName** | **string** | Name of stop | [optional] 
**StopId** | **int?** | Stop identifier | [optional] 
**RouteType** | **int?** | Transport mode identifier | [optional] 
**StopLatitude** | **float?** | Geographic coordinate of latitude at stop | [optional] 
**StopLongitude** | **float?** | Geographic coordinate of longitude at stop | [optional] 
**StopLandmark** | **string** | Landmark in proximity of stop | [optional] 
**StopSequence** | **int?** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

