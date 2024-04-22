# SearchApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSearch**](SearchApi.md#searchSearch) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term

<a name="searchSearch"></a>
# **searchSearch**
> V3SearchResult searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature)

View stops, routes and myki ticket outlets that match the search term

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String searchTerm = "searchTerm_example"; // String | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
List<Integer> routeTypes = Arrays.asList(56); // List<Integer> | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
Float latitude = 3.4F; // Float | Filter by geographic coordinate of latitude
Float longitude = 3.4F; // Float | Filter by geographic coordinate of longitude
Float maxDistance = 3.4F; // Float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
Boolean includeAddresses = true; // Boolean | Placeholder for future development; currently unavailable
Boolean includeOutlets = true; // Boolean | Indicates if outlets will be returned in response (default = true)
Boolean matchStopBySuburb = true; // Boolean | Indicates whether to find stops by suburbs in the search term (default = true)
Boolean matchRouteBySuburb = true; // Boolean | Indicates whether to find routes by suburbs in the search term (default = true)
Boolean matchStopByGtfsStopId = true; // Boolean | Indicates whether to search for stops according to a metlink stop ID (default = false)
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3SearchResult result = apiInstance.searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **String**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) |
 **routeTypes** | [**List&lt;Integer&gt;**](Integer.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] [enum: 0, 1, 2, 3, 4]
 **latitude** | **Float**| Filter by geographic coordinate of latitude | [optional]
 **longitude** | **Float**| Filter by geographic coordinate of longitude | [optional]
 **maxDistance** | **Float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional]
 **includeAddresses** | **Boolean**| Placeholder for future development; currently unavailable | [optional]
 **includeOutlets** | **Boolean**| Indicates if outlets will be returned in response (default &#x3D; true) | [optional]
 **matchStopBySuburb** | **Boolean**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional]
 **matchRouteBySuburb** | **Boolean**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional]
 **matchStopByGtfsStopId** | **Boolean**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional]
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

