# IO.Swagger.Model.V3BulkDeparturesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Responses** | [**List&lt;V3BulkDeparturesUpdateResponse&gt;**](V3BulkDeparturesUpdateResponse.md) | Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. | [optional] 
**Stops** | [**Dictionary&lt;string, V3BulkDeparturesStopResponse&gt;**](V3BulkDeparturesStopResponse.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**Routes** | **List&lt;Object&gt;** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**Runs** | [**List&lt;V3Run&gt;**](V3Run.md) | Individual trips/services of a route | [optional] 
**Directions** | [**List&lt;V3Direction&gt;**](V3Direction.md) | Directions of travel of route | [optional] 
**Disruptions** | [**Dictionary&lt;string, V3Disruption&gt;**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**Status** | [**V3Status**](V3Status.md) | API Status / Metadata | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

