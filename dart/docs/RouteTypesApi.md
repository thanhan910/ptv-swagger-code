# swagger.api.RouteTypesApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routeTypesGetRouteTypes**](RouteTypesApi.md#routeTypesGetRouteTypes) | **GET** /v3/route_types | View all route types and their names

# **routeTypesGetRouteTypes**
> V3RouteTypesResponse routeTypesGetRouteTypes(token, devid, signature)

View all route types and their names

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RouteTypesApi();
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.routeTypesGetRouteTypes(token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RouteTypesApi->routeTypesGetRouteTypes: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

