# swagger.api.DisruptionsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disruptionsGetAllDisruptions**](DisruptionsApi.md#disruptionsGetAllDisruptions) | **GET** /v3/disruptions | View all disruptions for all route types
[**disruptionsGetDisruptionById**](DisruptionsApi.md#disruptionsGetDisruptionById) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
[**disruptionsGetDisruptionModes**](DisruptionsApi.md#disruptionsGetDisruptionModes) | **GET** /v3/disruptions/modes | Get all disruption modes
[**disruptionsGetDisruptionsByRoute**](DisruptionsApi.md#disruptionsGetDisruptionsByRoute) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**disruptionsGetDisruptionsByRouteAndStop**](DisruptionsApi.md#disruptionsGetDisruptionsByRouteAndStop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**disruptionsGetDisruptionsByStop**](DisruptionsApi.md#disruptionsGetDisruptionsByStop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop

# **disruptionsGetAllDisruptions**
> V3DisruptionsResponse disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature)

View all disruptions for all route types

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var routeTypes = []; // List<int> | Filter by route_type; values returned via RouteTypes API
var disruptionModes = []; // List<int> | Filter by disruption_mode; values returned via v3/disruptions/modes API
var disruptionStatus = disruptionStatus_example; // String | Filter by status of disruption
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetAllDisruptions: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**List&lt;int&gt;**](int.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **disruptionModes** | [**List&lt;int&gt;**](int.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | [optional] 
 **disruptionStatus** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disruptionsGetDisruptionById**
> V3DisruptionResponse disruptionsGetDisruptionById(disruptionId, token, devid, signature)

View a specific disruption

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var disruptionId = 789; // int | Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetDisruptionById(disruptionId, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetDisruptionById: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disruptionId** | **int**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} | 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionResponse**](V3DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disruptionsGetDisruptionModes**
> V3DisruptionModesResponse disruptionsGetDisruptionModes(token, devid, signature)

Get all disruption modes

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetDisruptionModes(token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetDisruptionModes: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionModesResponse**](V3DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disruptionsGetDisruptionsByRoute**
> V3DisruptionsResponse disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature)

View all disruptions for a particular route

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var routeId = 56; // int | Identifier of route; values returned by Routes API - v3/routes
var disruptionStatus = disruptionStatus_example; // String | Filter by status of disruption
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetDisruptionsByRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Routes API - v3/routes | 
 **disruptionStatus** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disruptionsGetDisruptionsByRouteAndStop**
> V3DisruptionsResponse disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature)

View all disruptions for a particular route and stop

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var routeId = 56; // int | Identifier of route; values returned by Routes API - v3/routes
var stopId = 56; // int | Identifier of stop; values returned by Stops API - v3/stops
var disruptionStatus = disruptionStatus_example; // String | Filter by status of disruption
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetDisruptionsByRouteAndStop: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Routes API - v3/routes | 
 **stopId** | **int**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruptionStatus** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disruptionsGetDisruptionsByStop**
> V3DisruptionsResponse disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature)

View all disruptions for a particular stop

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DisruptionsApi();
var stopId = 56; // int | Identifier of stop; values returned by Stops API - v3/stops
var disruptionStatus = disruptionStatus_example; // String | Filter by status of disruption
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DisruptionsApi->disruptionsGetDisruptionsByStop: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **int**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruptionStatus** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

