# PatternsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patternsGetPatternByRun**](PatternsApi.md#patternsGetPatternByRun) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run

<a name="patternsGetPatternByRun"></a>
# **patternsGetPatternByRun**
> V3StoppingPattern patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature)

View the stopping pattern for a specific trip/service run

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = PatternsApi()
val runRef : kotlin.String = runRef_example // kotlin.String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
val stopId : kotlin.Int = 56 // kotlin.Int | Filter by stop_id; values returned by Stops API
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Filter by the date and time of the request (ISO 8601 UTC format)
val includeSkippedStops : kotlin.Boolean = true // kotlin.Boolean | Include any skipped stops in a stopping pattern. Defaults to false.
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if geopath data will be returned (default = false)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3StoppingPattern = apiInstance.patternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PatternsApi#patternsGetPatternByRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PatternsApi#patternsGetPatternByRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **kotlin.String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [enum: All, Stop, Route, Run, Direction, Disruption, VehicleDescriptor, VehiclePosition, None]
 **stopId** | **kotlin.Int**| Filter by stop_id; values returned by Stops API | [optional]
 **dateUtc** | **java.time.LocalDateTime**| Filter by the date and time of the request (ISO 8601 UTC format) | [optional]
 **includeSkippedStops** | **kotlin.Boolean**| Include any skipped stops in a stopping pattern. Defaults to false. | [optional]
 **includeGeopath** | **kotlin.Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3StoppingPattern**](V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

