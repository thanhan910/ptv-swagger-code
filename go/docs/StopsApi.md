# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StopsStopDetails**](StopsApi.md#StopsStopDetails) | **Get** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only)
[**StopsStopsByGeolocation**](StopsApi.md#StopsStopsByGeolocation) | **Get** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location
[**StopsStopsForRoute**](StopsApi.md#StopsStopsForRoute) | **Get** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route

# **StopsStopDetails**
> V3StopResponse StopsStopDetails(ctx, stopId, routeType, optional)
View facilities at a specific stop (Metro and V/Line stations only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **stopId** | **int32**| Identifier of stop; values returned by Stops API | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
 **optional** | ***StopsApiStopsStopDetailsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a StopsApiStopsStopDetailsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **stopLocation** | **optional.Bool**| Indicates if stop location information will be returned (default &#x3D; false) | 
 **stopAmenities** | **optional.Bool**| Indicates if stop amenity information will be returned (default &#x3D; false) | 
 **stopAccessibility** | **optional.Bool**| Indicates if stop accessibility information will be returned (default &#x3D; false) | 
 **stopContact** | **optional.Bool**| Indicates if stop contact information will be returned (default &#x3D; false) | 
 **stopTicket** | **optional.Bool**| Indicates if stop ticket information will be returned (default &#x3D; false) | 
 **gtfs** | **optional.Bool**| Incdicates whether the stop_id is a GTFS ID or not | 
 **stopStaffing** | **optional.Bool**| Indicates if stop staffing information will be returned (default &#x3D; false) | 
 **stopDisruptions** | **optional.Bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3StopResponse**](V3.StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StopsStopsByGeolocation**
> V3StopsByDistanceResponse StopsStopsByGeolocation(ctx, latitude, longitude, optional)
View all stops near a specific location

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **latitude** | **float32**| Geographic coordinate of latitude | 
  **longitude** | **float32**| Geographic coordinate of longitude | 
 **optional** | ***StopsApiStopsStopsByGeolocationOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a StopsApiStopsStopsByGeolocationOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **routeTypes** | [**optional.Interface of []int32**](int32.md)| Filter by route_type; values returned via RouteTypes API | 
 **maxResults** | **optional.Int32**| Maximum number of results returned (default &#x3D; 30) | 
 **maxDistance** | **optional.Float64**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | 
 **stopDisruptions** | **optional.Bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3StopsByDistanceResponse**](V3.StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StopsStopsForRoute**
> V3StopsOnRouteResponse StopsStopsForRoute(ctx, routeId, routeType, optional)
View all stops on a specific route

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **routeId** | **int32**| Identifier of route; values returned by Routes API - v3/routes | 
  **routeType** | **int32**| Number identifying transport mode; values returned via RouteTypes API | 
 **optional** | ***StopsApiStopsStopsForRouteOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a StopsApiStopsStopsForRouteOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **directionId** | **optional.Int32**| An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | 
 **stopDisruptions** | **optional.Bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | 
 **includeGeopath** | **optional.Bool**| Indicates if geopath data will be returned (default &#x3D; false) | 
 **geopathUtc** | **optional.Time**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3StopsOnRouteResponse**](V3.StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

