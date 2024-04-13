# swagger.api.FareEstimateApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fareEstimateGetFareEstimateByZone**](FareEstimateApi.md#fareEstimateGetFareEstimateByZone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone

# **fareEstimateGetFareEstimateByZone**
> V3FareEstimateResponse fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature)

Estimate a fare by zone

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new FareEstimateApi();
var minZone = 56; // int | Minimum Zone travelled through ie. 1
var maxZone = 56; // int | Maximum Zone travelled through id. 6
var journeyTouchOnUtc = 2013-10-20T19:20:30+01:00; // DateTime | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
var journeyTouchOffUtc = 2013-10-20T19:20:30+01:00; // DateTime | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
var isJourneyInFreeTramZone = true; // bool | 
var travelledRouteTypes = []; // List<int> | 
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling FareEstimateApi->fareEstimateGetFareEstimateByZone: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **minZone** | **int**| Minimum Zone travelled through ie. 1 | 
 **maxZone** | **int**| Maximum Zone travelled through id. 6 | 
 **journeyTouchOnUtc** | **DateTime**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **journeyTouchOffUtc** | **DateTime**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **isJourneyInFreeTramZone** | **bool**|  | [optional] 
 **travelledRouteTypes** | [**List&lt;int&gt;**](int.md)|  | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3FareEstimateResponse**](V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

