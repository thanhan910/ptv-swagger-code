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
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = SearchApi()
val searchTerm : kotlin.String = searchTerm_example // kotlin.String | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
val routeTypes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
val latitude : kotlin.Float = 3.4 // kotlin.Float | Filter by geographic coordinate of latitude
val longitude : kotlin.Float = 3.4 // kotlin.Float | Filter by geographic coordinate of longitude
val maxDistance : kotlin.Float = 3.4 // kotlin.Float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
val includeAddresses : kotlin.Boolean = true // kotlin.Boolean | Placeholder for future development; currently unavailable
val includeOutlets : kotlin.Boolean = true // kotlin.Boolean | Indicates if outlets will be returned in response (default = true)
val matchStopBySuburb : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to find stops by suburbs in the search term (default = true)
val matchRouteBySuburb : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to find routes by suburbs in the search term (default = true)
val matchStopByGtfsStopId : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to search for stops according to a metlink stop ID (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3SearchResult = apiInstance.searchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchTerm** | **kotlin.String**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) |
 **routeTypes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] [enum: 0, 1, 2, 3, 4]
 **latitude** | **kotlin.Float**| Filter by geographic coordinate of latitude | [optional]
 **longitude** | **kotlin.Float**| Filter by geographic coordinate of longitude | [optional]
 **maxDistance** | **kotlin.Float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional]
 **includeAddresses** | **kotlin.Boolean**| Placeholder for future development; currently unavailable | [optional]
 **includeOutlets** | **kotlin.Boolean**| Indicates if outlets will be returned in response (default &#x3D; true) | [optional]
 **matchStopBySuburb** | **kotlin.Boolean**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional]
 **matchRouteBySuburb** | **kotlin.Boolean**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional]
 **matchStopByGtfsStopId** | **kotlin.Boolean**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3SearchResult**](V3SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

