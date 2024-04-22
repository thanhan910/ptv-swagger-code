# V3DeparturesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departures** | [**list[V3Departure]**](V3Departure.md) | Timetabled and real-time service departures | [optional] 
**stops** | [**dict(str, V3StopModel)**](V3StopModel.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**routes** | **dict(str, object)** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**runs** | [**dict(str, V3Run)**](V3Run.md) | Individual trips/services of a route | [optional] 
**directions** | [**dict(str, V3Direction)**](V3Direction.md) | Directions of travel of route | [optional] 
**disruptions** | [**dict(str, V3Disruption)**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**status** | [**V3Status**](V3Status.md) | API Status / Metadata | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


