# V3BulkDeparturesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Responses** | [**[]V3BulkDeparturesUpdateResponse**](V3.BulkDeparturesUpdateResponse.md) | Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. | [optional] [default to null]
**Stops** | [**map[string]V3BulkDeparturesStopResponse**](V3.BulkDeparturesStopResponse.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] [default to null]
**Routes** | [**[]interface{}**](interface{}.md) | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] [default to null]
**Runs** | [**[]V3Run**](V3.Run.md) | Individual trips/services of a route | [optional] [default to null]
**Directions** | [**[]V3Direction**](V3.Direction.md) | Directions of travel of route | [optional] [default to null]
**Disruptions** | [**map[string]V3Disruption**](V3.Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] [default to null]
**Status** | [***V3Status**](V3.Status.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

