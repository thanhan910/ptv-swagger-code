# DeparturesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**departuresGetForStop**](DeparturesApi.md#departuresGetForStop) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop
[**departuresGetForStopAndRoute**](DeparturesApi.md#departuresGetForStopAndRoute) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop

<a name="departuresGetForStop"></a>
# **departuresGetForStop**
> V3DeparturesResponse departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)

View departures for all routes from a stop

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DeparturesApi()
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val stopId : kotlin.Int = 56 // kotlin.Int | Identifier of stop; values returned by Stops API
val platformNumbers : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by platform number at stop
val directionId : kotlin.Int = 56 // kotlin.Int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
val gtfs : kotlin.Boolean = true // kotlin.Boolean | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
val maxResults : kotlin.Int = 56 // kotlin.Int | Maximum number of results returned
val includeCancelled : kotlin.Boolean = true // kotlin.Boolean | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
val lookBackwards : kotlin.Boolean = true // kotlin.Boolean | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if the route geopath should be returned
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DeparturesResponse = apiInstance.departuresGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeparturesApi#departuresGetForStop")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeparturesApi#departuresGetForStop")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **stopId** | **kotlin.Int**| Identifier of stop; values returned by Stops API |
 **platformNumbers** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by platform number at stop | [optional]
 **directionId** | **kotlin.Int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional]
 **gtfs** | **kotlin.Boolean**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional]
 **dateUtc** | **java.time.LocalDateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional]
 **maxResults** | **kotlin.Int**| Maximum number of results returned | [optional]
 **includeCancelled** | **kotlin.Boolean**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional]
 **lookBackwards** | **kotlin.Boolean**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional]
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] [enum: All, Stop, Route, Run, Direction, Disruption, VehicleDescriptor, VehiclePosition, None]
 **includeGeopath** | **kotlin.Boolean**| Indicates if the route geopath should be returned | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="departuresGetForStopAndRoute"></a>
# **departuresGetForStopAndRoute**
> V3DeparturesResponse departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)

View departures for a specific route from a stop

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DeparturesApi()
val routeType : kotlin.Int = 56 // kotlin.Int | Number identifying transport mode; values returned via RouteTypes API
val stopId : kotlin.Int = 56 // kotlin.Int | Identifier of stop; values returned by Stops API
val routeId : kotlin.String = routeId_example // kotlin.String | Identifier of route; values returned by Routes API - v3/routes
val directionId : kotlin.Int = 56 // kotlin.Int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
val gtfs : kotlin.Boolean = true // kotlin.Boolean | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
val dateUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
val maxResults : kotlin.Int = 56 // kotlin.Int | Maximum number of results returned
val includeCancelled : kotlin.Boolean = true // kotlin.Boolean | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
val lookBackwards : kotlin.Boolean = true // kotlin.Boolean | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
val expand : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates if the route geopath should be returned
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3DeparturesResponse = apiInstance.departuresGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeparturesApi#departuresGetForStopAndRoute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeparturesApi#departuresGetForStopAndRoute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **kotlin.Int**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **stopId** | **kotlin.Int**| Identifier of stop; values returned by Stops API |
 **routeId** | **kotlin.String**| Identifier of route; values returned by Routes API - v3/routes |
 **directionId** | **kotlin.Int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional]
 **gtfs** | **kotlin.Boolean**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional]
 **dateUtc** | **java.time.LocalDateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional]
 **maxResults** | **kotlin.Int**| Maximum number of results returned | [optional]
 **includeCancelled** | **kotlin.Boolean**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional]
 **lookBackwards** | **kotlin.Boolean**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional]
 **expand** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] [enum: All, Stop, Route, Run, Direction, Disruption, VehicleDescriptor, VehiclePosition, None]
 **includeGeopath** | **kotlin.Boolean**| Indicates if the route geopath should be returned | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

