# Ptv.Api.Client.Model.V3StoppingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disruptions** | [**List&lt;V3Disruption&gt;**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**Departures** | [**List&lt;V3PatternDeparture&gt;**](V3PatternDeparture.md) | Timetabled and real-time service departures | [optional] 
**Stops** | [**Dictionary&lt;string, V3StoppingPatternStop&gt;**](V3StoppingPatternStop.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**Routes** | **Dictionary&lt;string, Object&gt;** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**Runs** | [**Dictionary&lt;string, V3Run&gt;**](V3Run.md) | Individual trips/services of a route | [optional] 
**Directions** | [**Dictionary&lt;string, V3Direction&gt;**](V3Direction.md) | Directions of travel of route | [optional] 
**Status** | [**V3Status**](V3Status.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

