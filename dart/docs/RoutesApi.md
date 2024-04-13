# swagger.api.RoutesApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routesOneOrMoreRoutes**](RoutesApi.md#routesOneOrMoreRoutes) | **GET** /v3/routes | View route names and numbers for all routes
[**routesRouteFromId**](RoutesApi.md#routesRouteFromId) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID

# **routesOneOrMoreRoutes**
> V3RouteResponse routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature)

View route names and numbers for all routes

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RoutesApi();
var routeTypes = []; // List<int> | Filter by route_type; values returned via RouteTypes API
var routeName = routeName_example; // String | Filter by name  of route (accepts partial route name matches)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->routesOneOrMoreRoutes: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**List&lt;int&gt;**](int.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **routeName** | **String**| Filter by name  of route (accepts partial route name matches) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **routesRouteFromId**
> V3RouteResponse routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature)

View route name and number for specific route ID

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new RoutesApi();
var routeId = 56; // int | Identifier of route; values returned by Departures, Directions and Disruptions APIs
var includeGeopath = true; // bool | Indicates kif geopath data will be returned (default = false)
var geopathUtc = 2013-10-20T19:20:30+01:00; // DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling RoutesApi->routesRouteFromId: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Departures, Directions and Disruptions APIs | 
 **includeGeopath** | **bool**| Indicates kif geopath data will be returned (default &#x3D; false) | [optional] 
 **geopathUtc** | **DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

