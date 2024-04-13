# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OutletsGetAllOutlets**](OutletsApi.md#OutletsGetAllOutlets) | **Get** /v3/outlets | List all ticket outlets
[**OutletsGetOutletsByGeolocation**](OutletsApi.md#OutletsGetOutletsByGeolocation) | **Get** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location

# **OutletsGetAllOutlets**
> V3OutletResponse OutletsGetAllOutlets(ctx, optional)
List all ticket outlets

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OutletsApiOutletsGetAllOutletsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OutletsApiOutletsGetAllOutletsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **optional.Int32**| Maximum number of results returned (default &#x3D; 30) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3OutletResponse**](V3.OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OutletsGetOutletsByGeolocation**
> V3OutletGeolocationResponse OutletsGetOutletsByGeolocation(ctx, latitude, longitude, optional)
List ticket outlets near a specific location

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **latitude** | **float32**| Geographic coordinate of latitude | 
  **longitude** | **float32**| Geographic coordinate of longitude | 
 **optional** | ***OutletsApiOutletsGetOutletsByGeolocationOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OutletsApiOutletsGetOutletsByGeolocationOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **maxDistance** | **optional.Float64**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | 
 **maxResults** | **optional.Int32**| Maximum number of results returned (default &#x3D; 30) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3OutletGeolocationResponse**](V3.OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

