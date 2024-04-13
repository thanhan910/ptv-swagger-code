# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DirectionsForDirection**](DirectionsApi.md#DirectionsForDirection) | **Get** /v3/directions/{direction_id} | View all routes for a direction of travel
[**DirectionsForDirectionAndType**](DirectionsApi.md#DirectionsForDirectionAndType) | **Get** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
[**DirectionsForRoute**](DirectionsApi.md#DirectionsForRoute) | **Get** /v3/directions/route/{route_id} | View directions that a route travels in

# **DirectionsForDirection**
> V3DirectionsResponse DirectionsForDirection(ctx, directionId, optional)
View all routes for a direction of travel

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **directionId** | **int32**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **optional** | ***DirectionsApiDirectionsForDirectionOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DirectionsApiDirectionsForDirectionOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DirectionsResponse**](V3.DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DirectionsForDirectionAndType**
> V3DirectionsResponse DirectionsForDirectionAndType(ctx, directionId, routeType, optional)
View all routes of a particular type for a direction of travel

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **directionId** | **int32**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
 **optional** | ***DirectionsApiDirectionsForDirectionAndTypeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DirectionsApiDirectionsForDirectionAndTypeOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DirectionsResponse**](V3.DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DirectionsForRoute**
> V3DirectionsResponse DirectionsForRoute(ctx, routeId, optional)
View directions that a route travels in

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes | 
 **optional** | ***DirectionsApiDirectionsForRouteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a DirectionsApiDirectionsForRouteOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3DirectionsResponse**](V3.DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

