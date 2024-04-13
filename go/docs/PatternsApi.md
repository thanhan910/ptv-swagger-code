# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PatternsGetPatternByRun**](PatternsApi.md#PatternsGetPatternByRun) | **Get** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run

# **PatternsGetPatternByRun**
> V3StoppingPattern PatternsGetPatternByRun(ctx, runRef, routeType, expand, optional)
View the stopping pattern for a specific trip/service run

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runRef** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
  **expand** | [**[]string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **optional** | ***PatternsApiPatternsGetPatternByRunOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PatternsApiPatternsGetPatternByRunOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **stopId** | **optional.Int32**| Filter by stop_id; values returned by Stops API | 
 **dateUtc** | **optional.Time**| Filter by the date and time of the request (ISO 8601 UTC format) | 
 **includeSkippedStops** | **optional.Bool**| Include any skipped stops in a stopping pattern. Defaults to false. | 
 **includeGeopath** | **optional.Bool**| Indicates if geopath data will be returned (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3StoppingPattern**](V3.StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

