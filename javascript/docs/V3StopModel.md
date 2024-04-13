# PtvTimetableApiVersion3.V3StopModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopDistance** | **Number** | Distance of stop from input location (in metres); returns 0 if no location is input | [optional] 
**stopSuburb** | **String** | suburb of stop | [optional] 
**stopName** | **String** | Name of stop | [optional] 
**stopId** | **Number** | Stop identifier | [optional] 
**routeType** | **Number** | Transport mode identifier | [optional] 
**stopLatitude** | **Number** | Geographic coordinate of latitude at stop | [optional] 
**stopLongitude** | **Number** | Geographic coordinate of longitude at stop | [optional] 
**stopLandmark** | **String** | Landmark in proximity of stop | [optional] 
**stopSequence** | **Number** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. | [optional] 
