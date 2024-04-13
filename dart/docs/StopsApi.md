# swagger.api.StopsApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stopsStopDetails**](StopsApi.md#stopsStopDetails) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only)
[**stopsStopsByGeolocation**](StopsApi.md#stopsStopsByGeolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location
[**stopsStopsForRoute**](StopsApi.md#stopsStopsForRoute) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route

# **stopsStopDetails**
> V3StopResponse stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature)

View facilities at a specific stop (Metro and V/Line stations only)

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new StopsApi();
var stopId = 56; // int | Identifier of stop; values returned by Stops API
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var stopLocation = true; // bool | Indicates if stop location information will be returned (default = false)
var stopAmenities = true; // bool | Indicates if stop amenity information will be returned (default = false)
var stopAccessibility = true; // bool | Indicates if stop accessibility information will be returned (default = false)
var stopContact = true; // bool | Indicates if stop contact information will be returned (default = false)
var stopTicket = true; // bool | Indicates if stop ticket information will be returned (default = false)
var gtfs = true; // bool | Incdicates whether the stop_id is a GTFS ID or not
var stopStaffing = true; // bool | Indicates if stop staffing information will be returned (default = false)
var stopDisruptions = true; // bool | Indicates if stop disruption information will be returned (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling StopsApi->stopsStopDetails: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **int**| Identifier of stop; values returned by Stops API | 
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **stopLocation** | **bool**| Indicates if stop location information will be returned (default &#x3D; false) | [optional] 
 **stopAmenities** | **bool**| Indicates if stop amenity information will be returned (default &#x3D; false) | [optional] 
 **stopAccessibility** | **bool**| Indicates if stop accessibility information will be returned (default &#x3D; false) | [optional] 
 **stopContact** | **bool**| Indicates if stop contact information will be returned (default &#x3D; false) | [optional] 
 **stopTicket** | **bool**| Indicates if stop ticket information will be returned (default &#x3D; false) | [optional] 
 **gtfs** | **bool**| Incdicates whether the stop_id is a GTFS ID or not | [optional] 
 **stopStaffing** | **bool**| Indicates if stop staffing information will be returned (default &#x3D; false) | [optional] 
 **stopDisruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopResponse**](V3StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stopsStopsByGeolocation**
> V3StopsByDistanceResponse stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature)

View all stops near a specific location

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new StopsApi();
var latitude = 3.4; // double | Geographic coordinate of latitude
var longitude = 3.4; // double | Geographic coordinate of longitude
var routeTypes = []; // List<int> | Filter by route_type; values returned via RouteTypes API
var maxResults = 56; // int | Maximum number of results returned (default = 30)
var maxDistance = 1.2; // double | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
var stopDisruptions = true; // bool | Indicates if stop disruption information will be returned (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling StopsApi->stopsStopsByGeolocation: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **double**| Geographic coordinate of latitude | 
 **longitude** | **double**| Geographic coordinate of longitude | 
 **routeTypes** | [**List&lt;int&gt;**](int.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **maxResults** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **maxDistance** | **double**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] 
 **stopDisruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopsByDistanceResponse**](V3StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stopsStopsForRoute**
> V3StopsOnRouteResponse stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature)

View all stops on a specific route

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new StopsApi();
var routeId = 56; // int | Identifier of route; values returned by Routes API - v3/routes
var routeType = 56; // int | Number identifying transport mode; values returned via RouteTypes API
var directionId = 56; // int | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
var stopDisruptions = true; // bool | Indicates if stop disruption information will be returned (default = false)
var includeGeopath = true; // bool | Indicates if geopath data will be returned (default = false)
var geopathUtc = 2013-10-20T19:20:30+01:00; // DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling StopsApi->stopsStopsForRoute: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int**| Identifier of route; values returned by Routes API - v3/routes | 
 **routeType** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **directionId** | **int**| An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | [optional] 
 **stopDisruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **includeGeopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **geopathUtc** | **DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopsOnRouteResponse**](V3StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

