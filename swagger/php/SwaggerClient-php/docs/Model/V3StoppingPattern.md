# V3StoppingPattern

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruptions** | [**\Swagger\Client\Model\V3Disruption[]**](V3Disruption.md) | Disruption information applicable to relevant routes or stops | [optional] 
**departures** | [**\Swagger\Client\Model\V3PatternDeparture[]**](V3PatternDeparture.md) | Timetabled and real-time service departures | [optional] 
**stops** | [**map[string,\Swagger\Client\Model\V3StoppingPatternStop]**](V3StoppingPatternStop.md) | A train station, tram stop, bus stop, regional coach stop or Night Bus stop | [optional] 
**routes** | **map[string,object]** | Train lines, tram routes, bus routes, regional coach routes, Night Bus routes | [optional] 
**runs** | [**map[string,\Swagger\Client\Model\V3Run]**](V3Run.md) | Individual trips/services of a route | [optional] 
**directions** | [**map[string,\Swagger\Client\Model\V3Direction]**](V3Direction.md) | Directions of travel of route | [optional] 
**status** | [**\Swagger\Client\Model\V3Status**](V3Status.md) | API Status / Metadata | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


