# SwaggerClient::V3DeparturesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**departures** | [**Array&lt;V3Departure&gt;**](V3Departure.md) | Timetabled and real-time service departures | [optional] 
**stops** | [**Hash&lt;String, V3StopModel&gt;**](V3StopModel.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**routes** | **Hash&lt;String, Object&gt;** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**runs** | [**Hash&lt;String, V3Run&gt;**](V3Run.md) | Individual trips/services of a route | [optional] 
**directions** | [**Hash&lt;String, V3Direction&gt;**](V3Direction.md) | Directions of travel of route | [optional] 
**disruptions** | [**Hash&lt;String, V3Disruption&gt;**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**status** | [**V3Status**](V3Status.md) |  | [optional] 

