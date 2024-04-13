# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RouteTypesGetRouteTypes**](RouteTypesApi.md#RouteTypesGetRouteTypes) | **Get** /v3/route_types | View all route types and their names

# **RouteTypesGetRouteTypes**
> V3RouteTypesResponse RouteTypesGetRouteTypes(ctx, optional)
View all route types and their names

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***RouteTypesApiRouteTypesGetRouteTypesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RouteTypesApiRouteTypesGetRouteTypesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RouteTypesResponse**](V3.RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

