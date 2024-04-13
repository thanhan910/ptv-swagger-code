# swagger.api.SearchApi

## Load the API package
```dart
import 'package:swagger/api.dart';
```

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSearch**](SearchApi.md#searchSearch) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term

# **searchSearch**
> V3SearchResult searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature)

View stops, routes and myki ticket outlets that match the search term

### Example
```dart
import 'package:swagger/api.dart';

var api_instance = new SearchApi();
var searchTerm = searchTerm_example; // String | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
var routeTypes = []; // List<int> | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
var latitude = 3.4; // double | Filter by geographic coordinate of latitude
var longitude = 3.4; // double | Filter by geographic coordinate of longitude
var maxDistance = 3.4; // double | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
var includeAddresses = true; // bool | Placeholder for future development; currently unavailable
var includeOutlets = true; // bool | Indicates if outlets will be returned in response (default = true)
var matchStopBySuburb = true; // bool | Indicates whether to find stops by suburbs in the search term (default = true)
var matchRouteBySuburb = true; // bool | Indicates whether to find routes by suburbs in the search term (default = true)
var matchStopByGtfsStopId = true; // bool | Indicates whether to search for stops according to a metlink stop ID (default = false)
var token = token_example; // String | Please ignore
var devid = devid_example; // String | Your developer id
var signature = signature_example; // String | Authentication signature for request

try {
    var result = api_instance.searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature);
    print(result);
} catch (e) {
    print("Exception when calling SearchApi->searchSearch: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **String**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) | 
 **routeTypes** | [**List&lt;int&gt;**](int.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] 
 **latitude** | **double**| Filter by geographic coordinate of latitude | [optional] 
 **longitude** | **double**| Filter by geographic coordinate of longitude | [optional] 
 **maxDistance** | **double**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional] 
 **includeAddresses** | **bool**| Placeholder for future development; currently unavailable | [optional] 
 **includeOutlets** | **bool**| Indicates if outlets will be returned in response (default &#x3D; true) | [optional] 
 **matchStopBySuburb** | **bool**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional] 
 **matchRouteBySuburb** | **bool**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional] 
 **matchStopByGtfsStopId** | **bool**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3SearchResult**](V3SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

