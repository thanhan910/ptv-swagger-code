# DirectionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directionsForDirection**](DirectionsApi.md#directionsForDirection) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel
[**directionsForDirectionAndType**](DirectionsApi.md#directionsForDirectionAndType) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
[**directionsForRoute**](DirectionsApi.md#directionsForRoute) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in

<a name="directionsForDirection"></a>
# **directionsForDirection**
> V3DirectionsResponse directionsForDirection(directionId, token, devid, signature)

View all routes for a direction of travel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DirectionsApi()
val directionId : kotlin.Int = 56 // kotlin.Int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DirectionsResponse = apiInstance.directionsForDirection(directionId, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectionsApi#directionsForDirection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectionsApi#directionsForDirection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **kotlin.Int**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="directionsForDirectionAndType"></a>
# **directionsForDirectionAndType**
> V3DirectionsResponse directionsForDirectionAndType(directionId, routeType, token, devid, signature)

View all routes of a particular type for a direction of travel

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DirectionsApi()
val directionId : kotlin.Int = 56 // kotlin.Int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DirectionsResponse = apiInstance.directionsForDirectionAndType(directionId, routeType, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectionsApi#directionsForDirectionAndType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectionsApi#directionsForDirectionAndType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **kotlin.Int**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="directionsForRoute"></a>
# **directionsForRoute**
> V3DirectionsResponse directionsForRoute(routeId, token, devid, signature)

View directions that a route travels in

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DirectionsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DirectionsResponse = apiInstance.directionsForRoute(routeId, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DirectionsApi#directionsForRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DirectionsApi#directionsForRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes |
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

