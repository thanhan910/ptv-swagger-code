# V3StoppingPattern

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disruptions** | [**[]V3Disruption**](V3.Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] [default to null]
**Departures** | [**[]V3PatternDeparture**](V3.PatternDeparture.md) | Timetabled and real-time service departures | [optional] [default to null]
**Stops** | [**map[string]V3StoppingPatternStop**](V3.StoppingPatternStop.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] [default to null]
**Routes** | [**map[string]interface{}**](interface{}.md) | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] [default to null]
**Runs** | [**map[string]V3Run**](V3.Run.md) | Individual trips/services of a route | [optional] [default to null]
**Directions** | [**map[string]V3Direction**](V3.Direction.md) | Directions of travel of route | [optional] [default to null]
**Status** | [***V3Status**](V3.Status.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

