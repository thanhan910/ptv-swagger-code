# swagger.api.RunsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runsForRoute**](RunsApi.md#runsForRoute) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
[**runsForRouteAndRouteType**](RunsApi.md#runsForRouteAndRouteType) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
[**runsForRun**](RunsApi.md#runsForRun) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
[**runsForRunAndRouteType**](RunsApi.md#runsForRunAndRouteType) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type

# **runsForRoute**
> V3RunsResponse runsForRoute(routeId, expand, dateUtc, token, devid, signature)

View all trip/service runs for a specific route ID

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RunsApi();
var routeId = 56; // int | Identifier of route; values returned by Routes API - v3/routes.
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Date of the request. (optional - defaults to now)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.runsForRoute(routeId, expand, dateUtc, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RunsApi->runsForRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Routes API - v3/routes. | 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional] 
 **dateUtc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **runsForRouteAndRouteType**
> V3RunsResponse runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature)

View all trip/service runs for a specific route ID and route type

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RunsApi();
var routeId = 56; // int | Identifier of route; values returned by Routes API - v3/routes.
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Date of the request. (optional - defaults to now)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RunsApi->runsForRouteAndRouteType: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Routes API - v3/routes. | 
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. | 
 **dateUtc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **runsForRun**
> V3RunsResponse runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature)

View all trip/service runs for a specific run_ref

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RunsApi();
var runRef = runRef_example; // String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Date of the request. (optional - defaults to now)
var includeGeopath = true; // bool | Indicates if geopath data will be returned (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RunsApi->runsForRun: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **dateUtc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **includeGeopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **runsForRunAndRouteType**
> V3RunResponse runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature)

View the trip/service run for a specific run_ref and route type

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RunsApi();
var runRef = runRef_example; // String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Date of the request. (optional - defaults to now)
var includeGeopath = true; // bool | Indicates if geopath data will be returned (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RunsApi->runsForRunAndRouteType: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **dateUtc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **includeGeopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunResponse**](V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

