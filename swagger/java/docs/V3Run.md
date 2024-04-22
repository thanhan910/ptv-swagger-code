# V3Run

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **Integer** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric |  [optional]
**runRef** | **String** | Alphanumeric trip/service run identifier |  [optional]
**routeId** | **Integer** | Route identifier |  [optional]
**routeType** | **Integer** | Transport mode identifier |  [optional]
**finalStopId** | **Integer** | stop_id of final stop of run |  [optional]
**destinationName** | **String** | Name of destination of run |  [optional]
**status** | **String** | Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes |  [optional]
**directionId** | **Integer** | Direction of travel identifier |  [optional]
**runSequence** | **Integer** | Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id. |  [optional]
**expressStopCount** | **Integer** | The number of remaining skipped/express stations for the run/service from a stop |  [optional]
**vehiclePosition** | [**V3VehiclePosition**](V3VehiclePosition.md) |  |  [optional]
**vehicleDescriptor** | [**V3VehicleDescriptor**](V3VehicleDescriptor.md) |  |  [optional]
**geopath** | **List&lt;Object&gt;** | Geopath of the route |  [optional]
