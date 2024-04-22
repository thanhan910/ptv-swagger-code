# # V3BulkDeparturesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responses** | [**\OpenAPI\Client\Model\V3BulkDeparturesUpdateResponse[]**](V3BulkDeparturesUpdateResponse.md) | Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. | [optional]
**stops** | [**array<string,\OpenAPI\Client\Model\V3BulkDeparturesStopResponse>**](V3BulkDeparturesStopResponse.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional]
**routes** | **object[]** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional]
**runs** | [**\OpenAPI\Client\Model\V3Run[]**](V3Run.md) | Individual trips/services of a route | [optional]
**directions** | [**\OpenAPI\Client\Model\V3Direction[]**](V3Direction.md) | Directions of travel of route | [optional]
**disruptions** | [**array<string,\OpenAPI\Client\Model\V3Disruption>**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional]
**status** | [**\OpenAPI\Client\Model\V3Status**](V3Status.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
