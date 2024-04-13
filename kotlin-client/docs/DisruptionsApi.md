# DisruptionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disruptionsGetAllDisruptions**](DisruptionsApi.md#disruptionsGetAllDisruptions) | **GET** /v3/disruptions | View all disruptions for all route types
[**disruptionsGetDisruptionById**](DisruptionsApi.md#disruptionsGetDisruptionById) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
[**disruptionsGetDisruptionModes**](DisruptionsApi.md#disruptionsGetDisruptionModes) | **GET** /v3/disruptions/modes | Get all disruption modes
[**disruptionsGetDisruptionsByRoute**](DisruptionsApi.md#disruptionsGetDisruptionsByRoute) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**disruptionsGetDisruptionsByRouteAndStop**](DisruptionsApi.md#disruptionsGetDisruptionsByRouteAndStop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**disruptionsGetDisruptionsByStop**](DisruptionsApi.md#disruptionsGetDisruptionsByStop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop

<a name="disruptionsGetAllDisruptions"></a>
# **disruptionsGetAllDisruptions**
> V3DisruptionsResponse disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature)

View all disruptions for all route types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val routeTypes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by route_type; values returned via RouteTypes API
val disruptionModes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by disruption_mode; values returned via v3/disruptions/modes API
val disruptionStatus : kotlin.String = disruptionStatus_example // kotlin.String | Filter by status of disruption
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionsResponse = apiInstance.disruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetAllDisruptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetAllDisruptions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by route_type; values returned via RouteTypes API | [optional] [enum: 0, 1, 2, 3, 4]
 **disruptionModes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | [optional] [enum: 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 100]
 **disruptionStatus** | **kotlin.String**| Filter by status of disruption | [optional] [enum: current, planned]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="disruptionsGetDisruptionById"></a>
# **disruptionsGetDisruptionById**
> V3DisruptionResponse disruptionsGetDisruptionById(disruptionId, token, devid, signature)

View a specific disruption

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val disruptionId : kotlin.Long = 789 // kotlin.Long | Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionResponse = apiInstance.disruptionsGetDisruptionById(disruptionId, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetDisruptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetDisruptionById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disruptionId** | **kotlin.Long**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} |
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionResponse**](V3DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="disruptionsGetDisruptionModes"></a>
# **disruptionsGetDisruptionModes**
> V3DisruptionModesResponse disruptionsGetDisruptionModes(token, devid, signature)

Get all disruption modes

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionModesResponse = apiInstance.disruptionsGetDisruptionModes(token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetDisruptionModes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetDisruptionModes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionModesResponse**](V3DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="disruptionsGetDisruptionsByRoute"></a>
# **disruptionsGetDisruptionsByRoute**
> V3DisruptionsResponse disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature)

View all disruptions for a particular route

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes
val disruptionStatus : kotlin.String = disruptionStatus_example // kotlin.String | Filter by status of disruption
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionsResponse = apiInstance.disruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetDisruptionsByRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetDisruptionsByRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes |
 **disruptionStatus** | **kotlin.String**| Filter by status of disruption | [optional] [enum: current, planned]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="disruptionsGetDisruptionsByRouteAndStop"></a>
# **disruptionsGetDisruptionsByRouteAndStop**
> V3DisruptionsResponse disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature)

View all disruptions for a particular route and stop

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes
val stopId : kotlin.Int = 56 // kotlin.Int | Identifier of stop; values returned by Stops API - v3/stops
val disruptionStatus : kotlin.String = disruptionStatus_example // kotlin.String | Filter by status of disruption
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionsResponse = apiInstance.disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetDisruptionsByRouteAndStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetDisruptionsByRouteAndStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes |
 **stopId** | **kotlin.Int**| Identifier of stop; values returned by Stops API - v3/stops |
 **disruptionStatus** | **kotlin.String**| Filter by status of disruption | [optional] [enum: current, planned]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="disruptionsGetDisruptionsByStop"></a>
# **disruptionsGetDisruptionsByStop**
> V3DisruptionsResponse disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature)

View all disruptions for a particular stop

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DisruptionsApi()
val stopId : kotlin.Int = 56 // kotlin.Int | Identifier of stop; values returned by Stops API - v3/stops
val disruptionStatus : kotlin.String = disruptionStatus_example // kotlin.String | Filter by status of disruption
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DisruptionsResponse = apiInstance.disruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DisruptionsApi#disruptionsGetDisruptionsByStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DisruptionsApi#disruptionsGetDisruptionsByStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **kotlin.Int**| Identifier of stop; values returned by Stops API - v3/stops |
 **disruptionStatus** | **kotlin.String**| Filter by status of disruption | [optional] [enum: current, planned]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

