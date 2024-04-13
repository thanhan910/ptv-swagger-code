# swagger.api.PatternsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patternsGetPatternByRun**](PatternsApi.md#patternsGetPatternByRun) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run

# **patternsGetPatternByRun**
> V3StoppingPattern patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature)

View the stopping pattern for a specific trip/service run

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new PatternsApi();
var runRef = runRef_example; // String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
var stopId = 56; // int | Filter by stop_id; values returned by Stops API
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Filter by the date and time of the request (ISO 8601 UTC format)
var includeSkippedStops = true; // bool | Include any skipped stops in a stopping pattern. Defaults to false.
var includeGeopath = true; // bool | Indicates if geopath data will be returned (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling PatternsApi->patternsGetPatternByRun: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **stopId** | **int**| Filter by stop_id; values returned by Stops API | [optional] 
 **dateUtc** | **DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) | [optional] 
 **includeSkippedStops** | **bool**| Include any skipped stops in a stopping pattern. Defaults to false. | [optional] 
 **includeGeopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StoppingPattern**](V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

