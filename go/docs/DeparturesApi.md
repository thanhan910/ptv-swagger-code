# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeparturesGetForStop**](DeparturesApi.md#DeparturesGetForStop) | **Get** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop
[**DeparturesGetForStopAndRoute**](DeparturesApi.md#DeparturesGetForStopAndRoute) | **Get** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop

# **DeparturesGetForStop**
> V3DeparturesResponse DeparturesGetForStop(ctx, routeType, stopId, optional)
View departures for all routes from a stop

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
  **stopId** | **int32**| Identifier of stop; values returned by Stops API | 
 **optional** | ***DeparturesApiDeparturesGetForStopOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DeparturesApiDeparturesGetForStopOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **platformNumbers** | [**optional.Interface of []int32**](int32.md)| Filter by platform number at stop | 
 **directionId** | **optional.Int32**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **gtfs** | **optional.Bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | 
 **dateUtc** | **optional.Time**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | 
 **maxResults** | **optional.Int32**| Maximum number of results returned | 
 **includeCancelled** | **optional.Bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | 
 **lookBackwards** | **optional.Bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | 
 **expand** | [**optional.Interface of []string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **includeGeopath** | **optional.Bool**| Indicates if the route geopath should be returned | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DeparturesResponse**](V3.DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeparturesGetForStopAndRoute**
> V3DeparturesResponse DeparturesGetForStopAndRoute(ctx, routeType, stopId, routeId, optional)
View departures for a specific route from a stop

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
  **stopId** | **int32**| Identifier of stop; values returned by Stops API | 
  **routeId** | **string**| Identifier of route; values returned by Routes API - v3/routes | 
 **optional** | ***DeparturesApiDeparturesGetForStopAndRouteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DeparturesApiDeparturesGetForStopAndRouteOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **directionId** | **optional.Int32**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **gtfs** | **optional.Bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | 
 **dateUtc** | **optional.Time**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | 
 **maxResults** | **optional.Int32**| Maximum number of results returned | 
 **includeCancelled** | **optional.Bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | 
 **lookBackwards** | **optional.Bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | 
 **expand** | [**optional.Interface of []string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **includeGeopath** | **optional.Bool**| Indicates if the route geopath should be returned | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DeparturesResponse**](V3.DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

