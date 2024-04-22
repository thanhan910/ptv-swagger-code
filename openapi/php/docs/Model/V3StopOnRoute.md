# # V3StopOnRoute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_ids** | **int[]** | Disruption information identifier(s) | [optional]
**stop_suburb** | **string** | suburb of stop | [optional]
**route_type** | **int** | Transport mode identifier | [optional]
**stop_latitude** | **float** | Geographic coordinate of latitude at stop | [optional]
**stop_longitude** | **float** | Geographic coordinate of longitude at stop | [optional]
**stop_sequence** | **int** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. | [optional]
**stop_ticket** | [**\OpenAPI\Client\Model\V3StopTicket**](V3StopTicket.md) |  | [optional]
**stop_id** | **int** | Stop identifier | [optional]
**stop_name** | **string** | Name of stop | [optional]
**stop_landmark** | **string** | Landmark in proximity of stop | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
