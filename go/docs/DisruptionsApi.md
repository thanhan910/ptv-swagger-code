# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DisruptionsGetAllDisruptions**](DisruptionsApi.md#DisruptionsGetAllDisruptions) | **Get** /v3/disruptions | View all disruptions for all route types
[**DisruptionsGetDisruptionById**](DisruptionsApi.md#DisruptionsGetDisruptionById) | **Get** /v3/disruptions/{disruption_id} | View a specific disruption
[**DisruptionsGetDisruptionModes**](DisruptionsApi.md#DisruptionsGetDisruptionModes) | **Get** /v3/disruptions/modes | Get all disruption modes
[**DisruptionsGetDisruptionsByRoute**](DisruptionsApi.md#DisruptionsGetDisruptionsByRoute) | **Get** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**DisruptionsGetDisruptionsByRouteAndStop**](DisruptionsApi.md#DisruptionsGetDisruptionsByRouteAndStop) | **Get** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**DisruptionsGetDisruptionsByStop**](DisruptionsApi.md#DisruptionsGetDisruptionsByStop) | **Get** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop

# **DisruptionsGetAllDisruptions**
> V3DisruptionsResponse DisruptionsGetAllDisruptions(ctx, optional)
View all disruptions for all route types

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DisruptionsApiDisruptionsGetAllDisruptionsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetAllDisruptionsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**optional.Interface of []int32**](int32.md)| Filter by route_type; values returned via RouteTypes API | 
 **disruptionModes** | [**optional.Interface of []int32**](int32.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | 
 **disruptionStatus** | **optional.String**| Filter by status of disruption | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionsResponse**](V3.DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DisruptionsGetDisruptionById**
> V3DisruptionResponse DisruptionsGetDisruptionById(ctx, disruptionId, optional)
View a specific disruption

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **disruptionId** | **int64**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} | 
 **optional** | ***DisruptionsApiDisruptionsGetDisruptionByIdOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetDisruptionByIdOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionResponse**](V3.DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DisruptionsGetDisruptionModes**
> V3DisruptionModesResponse DisruptionsGetDisruptionModes(ctx, optional)
Get all disruption modes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***DisruptionsApiDisruptionsGetDisruptionModesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetDisruptionModesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionModesResponse**](V3.DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DisruptionsGetDisruptionsByRoute**
> V3DisruptionsResponse DisruptionsGetDisruptionsByRoute(ctx, routeId, optional)
View all disruptions for a particular route

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes | 
 **optional** | ***DisruptionsApiDisruptionsGetDisruptionsByRouteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetDisruptionsByRouteOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **disruptionStatus** | **optional.String**| Filter by status of disruption | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionsResponse**](V3.DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DisruptionsGetDisruptionsByRouteAndStop**
> V3DisruptionsResponse DisruptionsGetDisruptionsByRouteAndStop(ctx, routeId, stopId, optional)
View all disruptions for a particular route and stop

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes | 
  **stopId** | **int32**| Identifier of stop; values returned by Stops API - v3/stops | 
 **optional** | ***DisruptionsApiDisruptionsGetDisruptionsByRouteAndStopOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetDisruptionsByRouteAndStopOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **disruptionStatus** | **optional.String**| Filter by status of disruption | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionsResponse**](V3.DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DisruptionsGetDisruptionsByStop**
> V3DisruptionsResponse DisruptionsGetDisruptionsByStop(ctx, stopId, optional)
View all disruptions for a particular stop

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **stopId** | **int32**| Identifier of stop; values returned by Stops API - v3/stops | 
 **optional** | ***DisruptionsApiDisruptionsGetDisruptionsByStopOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DisruptionsApiDisruptionsGetDisruptionsByStopOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **disruptionStatus** | **optional.String**| Filter by status of disruption | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DisruptionsResponse**](V3.DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

