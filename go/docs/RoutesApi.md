# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RoutesOneOrMoreRoutes**](RoutesApi.md#RoutesOneOrMoreRoutes) | **Get** /v3/routes | View route names and numbers for all routes
[**RoutesRouteFromId**](RoutesApi.md#RoutesRouteFromId) | **Get** /v3/routes/{route_id} | View route name and number for specific route ID

# **RoutesOneOrMoreRoutes**
> V3RouteResponse RoutesOneOrMoreRoutes(ctx, optional)
View route names and numbers for all routes

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***RoutesApiRoutesOneOrMoreRoutesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RoutesApiRoutesOneOrMoreRoutesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**optional.Interface of []int32**](int32.md)| Filter by route_type; values returned via RouteTypes API | 
 **routeName** | **optional.String**| Filter by name  of route (accepts partial route name matches) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RouteResponse**](V3.RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RoutesRouteFromId**
> V3RouteResponse RoutesRouteFromId(ctx, routeId, optional)
View route name and number for specific route ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Departures, Directions and Disruptions APIs | 
 **optional** | ***RoutesApiRoutesRouteFromIdOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a RoutesApiRoutesRouteFromIdOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeGeopath** | **optional.Bool**| Indicates kif geopath data will be returned (default &#x3D; false) | 
 **geopathUtc** | **optional.Time**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3RouteResponse**](V3.RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

