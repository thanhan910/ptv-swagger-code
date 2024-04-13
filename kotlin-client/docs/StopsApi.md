# StopsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stopsStopDetails**](StopsApi.md#stopsStopDetails) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only)
[**stopsStopsByGeolocation**](StopsApi.md#stopsStopsByGeolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location
[**stopsStopsForRoute**](StopsApi.md#stopsStopsForRoute) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route

<a name="stopsStopDetails"></a>
# **stopsStopDetails**
> V3StopResponse stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature)

View facilities at a specific stop (Metro and V/Line stations only)

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StopsApi()
val stopId : kotlin.Int = 56 // kotlin.Int | Identifier of stop; values returned by Stops API
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val stopLocation : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop location information will be returned (default = false)
val stopAmenities : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop amenity information will be returned (default = false)
val stopAccessibility : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop accessibility information will be returned (default = false)
val stopContact : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop contact information will be returned (default = false)
val stopTicket : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop ticket information will be returned (default = false)
val gtfs : kotlin.Boolean = true // kotlin.Boolean | Incdicates whether the stop_id is a GTFS ID or not
val stopStaffing : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop staffing information will be returned (default = false)
val stopDisruptions : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop disruption information will be returned (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3StopResponse = apiInstance.stopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StopsApi#stopsStopDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StopsApi#stopsStopDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **kotlin.Int**| Identifier of stop; values returned by Stops API |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **stopLocation** | **kotlin.Boolean**| Indicates if stop location information will be returned (default &#x3D; false) | [optional]
 **stopAmenities** | **kotlin.Boolean**| Indicates if stop amenity information will be returned (default &#x3D; false) | [optional]
 **stopAccessibility** | **kotlin.Boolean**| Indicates if stop accessibility information will be returned (default &#x3D; false) | [optional]
 **stopContact** | **kotlin.Boolean**| Indicates if stop contact information will be returned (default &#x3D; false) | [optional]
 **stopTicket** | **kotlin.Boolean**| Indicates if stop ticket information will be returned (default &#x3D; false) | [optional]
 **gtfs** | **kotlin.Boolean**| Incdicates whether the stop_id is a GTFS ID or not | [optional]
 **stopStaffing** | **kotlin.Boolean**| Indicates if stop staffing information will be returned (default &#x3D; false) | [optional]
 **stopDisruptions** | **kotlin.Boolean**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3StopResponse**](V3StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="stopsStopsByGeolocation"></a>
# **stopsStopsByGeolocation**
> V3StopsByDistanceResponse stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature)

View all stops near a specific location

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StopsApi()
val latitude : kotlin.Float = 3.4 // kotlin.Float | Geographic coordinate of latitude
val longitude : kotlin.Float = 3.4 // kotlin.Float | Geographic coordinate of longitude
val routeTypes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by route_type; values returned via RouteTypes API
val maxResults : kotlin.Int = 56 // kotlin.Int | Maximum number of results returned (default = 30)
val maxDistance : kotlin.Double = 1.2 // kotlin.Double | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
val stopDisruptions : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop disruption information will be returned (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3StopsByDistanceResponse = apiInstance.stopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StopsApi#stopsStopsByGeolocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StopsApi#stopsStopsByGeolocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **kotlin.Float**| Geographic coordinate of latitude |
 **longitude** | **kotlin.Float**| Geographic coordinate of longitude |
 **routeTypes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by route_type; values returned via RouteTypes API | [optional] [enum: 0, 1, 2, 3, 4]
 **maxResults** | **kotlin.Int**| Maximum number of results returned (default &#x3D; 30) | [optional]
 **maxDistance** | **kotlin.Double**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional]
 **stopDisruptions** | **kotlin.Boolean**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3StopsByDistanceResponse**](V3StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="stopsStopsForRoute"></a>
# **stopsStopsForRoute**
> V3StopsOnRouteResponse stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature)

View all stops on a specific route

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StopsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val directionId : kotlin.Int = 56 // kotlin.Int | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
val stopDisruptions : kotlin.Boolean = true // kotlin.Boolean | Indicates if stop disruption information will be returned (default = false)
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if geopath data will be returned (default = false)
val geopathUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3StopsOnRouteResponse = apiInstance.stopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StopsApi#stopsStopsForRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StopsApi#stopsStopsForRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **directionId** | **kotlin.Int**| An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | [optional]
 **stopDisruptions** | **kotlin.Boolean**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]
 **includeGeopath** | **kotlin.Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **geopathUtc** | **java.time.LocalDateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3StopsOnRouteResponse**](V3StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

