# swagger.api.DeparturesApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**departuresGetForStop**](DeparturesApi.md#departuresGetForStop) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop
[**departuresGetForStopAndRoute**](DeparturesApi.md#departuresGetForStopAndRoute) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop

# **departuresGetForStop**
> V3DeparturesResponse departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)

View departures for all routes from a stop

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DeparturesApi();
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var stopId = 56; // int | Identifier of stop; values returned by Stops API
var platformNumbers = []; // List<int> | Filter by platform number at stop
var directionId = 56; // int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
var gtfs = true; // bool | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
var maxResults = 56; // int | Maximum number of results returned
var includeCancelled = true; // bool | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
var lookBackwards = true; // bool | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
var includeGeopath = true; // bool | Indicates if the route geopath should be returned
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DeparturesApi->departuresGetForStop: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **stopId** | **int**| Identifier of stop; values returned by Stops API | 
 **platformNumbers** | [**List&lt;int&gt;**](int.md)| Filter by platform number at stop | [optional] 
 **directionId** | **int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
 **gtfs** | **bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
 **dateUtc** | **DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
 **maxResults** | **int**| Maximum number of results returned | [optional] 
 **includeCancelled** | **bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
 **lookBackwards** | **bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
 **includeGeopath** | **bool**| Indicates if the route geopath should be returned | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **departuresGetForStopAndRoute**
> V3DeparturesResponse departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)

View departures for a specific route from a stop

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new DeparturesApi();
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var stopId = 56; // int | Identifier of stop; values returned by Stops API
var routeId = routeId_example; // String | Identifier of route; values returned by Routes API - v3/routes
var directionId = 56; // int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
var gtfs = true; // bool | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
var dateUtc = 2013-10-20T19:20:30+01:00; // DateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
var maxResults = 56; // int | Maximum number of results returned
var includeCancelled = true; // bool | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
var lookBackwards = true; // bool | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
var expand = []; // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
var includeGeopath = true; // bool | Indicates if the route geopath should be returned
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling DeparturesApi->departuresGetForStopAndRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **stopId** | **int**| Identifier of stop; values returned by Stops API | 
 **routeId** | **String**| Identifier of route; values returned by Routes API - v3/routes | 
 **directionId** | **int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
 **gtfs** | **bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
 **dateUtc** | **DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
 **maxResults** | **int**| Maximum number of results returned | [optional] 
 **includeCancelled** | **bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
 **lookBackwards** | **bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
 **includeGeopath** | **bool**| Indicates if the route geopath should be returned | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

