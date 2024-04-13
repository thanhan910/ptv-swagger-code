# swagger.api.OutletsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outletsGetAllOutlets**](OutletsApi.md#outletsGetAllOutlets) | **GET** /v3/outlets | List all ticket outlets
[**outletsGetOutletsByGeolocation**](OutletsApi.md#outletsGetOutletsByGeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location

# **outletsGetAllOutlets**
> V3OutletResponse outletsGetAllOutlets(maxResults, token, devid, signature)

List all ticket outlets

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new OutletsApi();
var maxResults = 56; // int | Maximum number of results returned (default = 30)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.outletsGetAllOutlets(maxResults, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling OutletsApi->outletsGetAllOutlets: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3OutletResponse**](V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **outletsGetOutletsByGeolocation**
> V3OutletGeolocationResponse outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature)

List ticket outlets near a specific location

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new OutletsApi();
var latitude = 3.4; // double | Geographic coordinate of latitude
var longitude = 3.4; // double | Geographic coordinate of longitude
var maxDistance = 1.2; // double | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
var maxResults = 56; // int | Maximum number of results returned (default = 30)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling OutletsApi->outletsGetOutletsByGeolocation: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **double**| Geographic coordinate of latitude | 
 **longitude** | **double**| Geographic coordinate of longitude | 
 **maxDistance** | **double**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] 
 **maxResults** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3OutletGeolocationResponse**](V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

