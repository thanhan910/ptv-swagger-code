# RoutesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routesOneOrMoreRoutes**](RoutesApi.md#routesOneOrMoreRoutes) | **GET** /v3/routes | View route names and numbers for all routes
[**routesRouteFromId**](RoutesApi.md#routesRouteFromId) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID

<a name="routesOneOrMoreRoutes"></a>
# **routesOneOrMoreRoutes**
> V3RouteResponse routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature)

View route names and numbers for all routes

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RoutesApi()
val routeTypes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | Filter by route_type; values returned via RouteTypes API
val routeName : kotlin.String = routeName_example // kotlin.String | Filter by name  of route (accepts partial route name matches)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RouteResponse = apiInstance.routesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#routesOneOrMoreRoutes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#routesOneOrMoreRoutes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)| Filter by route_type; values returned via RouteTypes API | [optional] [enum: 0, 1, 2, 3, 4]
 **routeName** | **kotlin.String**| Filter by name  of route (accepts partial route name matches) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="routesRouteFromId"></a>
# **routesRouteFromId**
> V3RouteResponse routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature)

View route name and number for specific route ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RoutesApi()
val routeId : kotlin.Int = 56 // kotlin.Int | Identifier of route; values returned by Departures, Directions and Disruptions APIs
val includeGeopath : kotlin.Boolean = true // kotlin.Boolean | Indicates kif geopath data will be returned (default = false)
val geopathUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RouteResponse = apiInstance.routesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoutesApi#routesRouteFromId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoutesApi#routesRouteFromId")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **kotlin.Int**| Identifier of route; values returned by Departures, Directions and Disruptions APIs |
 **includeGeopath** | **kotlin.Boolean**| Indicates kif geopath data will be returned (default &#x3D; false) | [optional]
 **geopathUtc** | **java.time.LocalDateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

