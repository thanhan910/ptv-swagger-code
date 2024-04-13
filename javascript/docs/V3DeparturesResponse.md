# PtvTimetableApiVersion3.V3DeparturesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departures** | [**[V3Departure]**](V3Departure.md) | Timetabled and real-time service departures | [optional] 
**stops** | [**{String: V3StopModel}**](V3StopModel.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**routes** | **{String: Object}** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**runs** | [**{String: V3Run}**](V3Run.md) | Individual trips/services of a route | [optional] 
**directions** | [**{String: V3Direction}**](V3Direction.md) | Directions of travel of route | [optional] 
**disruptions** | [**{String: V3Disruption}**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**status** | [**V3Status**](V3Status.md) |  | [optional] 
