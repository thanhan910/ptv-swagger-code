# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RunsForRoute**](RunsApi.md#RunsForRoute) | **Get** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
[**RunsForRouteAndRouteType**](RunsApi.md#RunsForRouteAndRouteType) | **Get** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
[**RunsForRun**](RunsApi.md#RunsForRun) | **Get** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
[**RunsForRunAndRouteType**](RunsApi.md#RunsForRunAndRouteType) | **Get** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type

# **RunsForRoute**
> V3RunsResponse RunsForRoute(ctx, routeId, optional)
View all trip/service runs for a specific route ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes. | 
 **optional** | ***RunsApiRunsForRouteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RunsApiRunsForRouteOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **expand** | [**optional.Interface of []string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **dateUtc** | **optional.Time**| Date of the request. (optional - defaults to now) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RunsResponse**](V3.RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RunsForRouteAndRouteType**
> V3RunsResponse RunsForRouteAndRouteType(ctx, routeId, routeType, expand, optional)
View all trip/service runs for a specific route ID and route type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes. | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
  **expand** | [**[]string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. | 
 **optional** | ***RunsApiRunsForRouteAndRouteTypeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RunsApiRunsForRouteAndRouteTypeOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **dateUtc** | **optional.Time**| Date of the request. (optional - defaults to now) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RunsResponse**](V3.RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RunsForRun**
> V3RunsResponse RunsForRun(ctx, runRef, expand, optional)
View all trip/service runs for a specific run_ref

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runRef** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
  **expand** | [**[]string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **optional** | ***RunsApiRunsForRunOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RunsApiRunsForRunOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **dateUtc** | **optional.Time**| Date of the request. (optional - defaults to now) | 
 **includeGeopath** | **optional.Bool**| Indicates if geopath data will be returned (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RunsResponse**](V3.RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RunsForRunAndRouteType**
> V3RunResponse RunsForRunAndRouteType(ctx, runRef, routeType, expand, optional)
View the trip/service run for a specific run_ref and route type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **runRef** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
  **expand** | [**[]string**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **optional** | ***RunsApiRunsForRunAndRouteTypeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RunsApiRunsForRunAndRouteTypeOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **dateUtc** | **optional.Time**| Date of the request. (optional - defaults to now) | 
 **includeGeopath** | **optional.Bool**| Indicates if geopath data will be returned (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RunResponse**](V3.RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

