# RunsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runsForRoute**](RunsApi.md#runsForRoute) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
[**runsForRouteAndRouteType**](RunsApi.md#runsForRouteAndRouteType) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
[**runsForRun**](RunsApi.md#runsForRun) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
[**runsForRunAndRouteType**](RunsApi.md#runsForRunAndRouteType) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type

<a name="runsForRoute"></a>
# **runsForRoute**
> V3RunsResponse runsForRoute(routeId, expand, dateUtc, token, devid, signature)

View all trip/service runs for a specific route ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RunsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes.
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Date of the request. (optional - defaults to now)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RunsResponse = apiInstance.runsForRoute(routeId, expand, dateUtc, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RunsApi#runsForRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RunsApi#runsForRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes. |
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional] [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **java.time.LocalDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="runsForRouteAndRouteType"></a>
# **runsForRouteAndRouteType**
> V3RunsResponse runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature)

View all trip/service runs for a specific route ID and route type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RunsApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Routes API - v3/routes.
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Date of the request. (optional - defaults to now)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RunsResponse = apiInstance.runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RunsApi#runsForRouteAndRouteType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RunsApi#runsForRouteAndRouteType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Routes API - v3/routes. |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **java.time.LocalDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="runsForRun"></a>
# **runsForRun**
> V3RunsResponse runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature)

View all trip/service runs for a specific run_ref

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RunsApi()
val runRef : kotlin.String = runRef_example // kotlin.String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Date of the request. (optional - defaults to now)
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if geopath data will be returned (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RunsResponse = apiInstance.runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RunsApi#runsForRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RunsApi#runsForRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **kotlin.String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **java.time.LocalDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **includeGeopath** | **kotlin.Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="runsForRunAndRouteType"></a>
# **runsForRunAndRouteType**
> V3RunResponse runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature)

View the trip/service run for a specific run_ref and route type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RunsApi()
val runRef : kotlin.String = runRef_example // kotlin.String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Date of the request. (optional - defaults to now)
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if geopath data will be returned (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RunResponse = apiInstance.runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RunsApi#runsForRunAndRouteType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RunsApi#runsForRunAndRouteType")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **kotlin.String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **java.time.LocalDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **includeGeopath** | **kotlin.Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RunResponse**](V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

