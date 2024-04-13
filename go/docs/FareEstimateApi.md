# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FareEstimateGetFareEstimateByZone**](FareEstimateApi.md#FareEstimateGetFareEstimateByZone) | **Get** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone

# **FareEstimateGetFareEstimateByZone**
> V3FareEstimateResponse FareEstimateGetFareEstimateByZone(ctx, minZone, maxZone, optional)
Estimate a fare by zone

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **minZone** | **int32**| Minimum Zone travelled through ie. 1 | 
  **maxZone** | **int32**| Maximum Zone travelled through id. 6 | 
 **optional** | ***FareEstimateApiFareEstimateGetFareEstimateByZoneOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a FareEstimateApiFareEstimateGetFareEstimateByZoneOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **journeyTouchOnUtc** | **optional.Time**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | 
 **journeyTouchOffUtc** | **optional.Time**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | 
 **isJourneyInFreeTramZone** | **optional.Bool**|  | 
 **travelledRouteTypes** | [**optional.Interface of []int32**](int32.md)|  | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3FareEstimateResponse**](V3.FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

