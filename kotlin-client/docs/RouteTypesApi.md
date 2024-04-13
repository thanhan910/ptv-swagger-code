# RouteTypesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routeTypesGetRouteTypes**](RouteTypesApi.md#routeTypesGetRouteTypes) | **GET** /v3/route_types | View all route types and their names

<a name="routeTypesGetRouteTypes"></a>
# **routeTypesGetRouteTypes**
> V3RouteTypesResponse routeTypesGetRouteTypes(token, devid, signature)

View all route types and their names

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RouteTypesApi()
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3RouteTypesResponse = apiInstance.routeTypesGetRouteTypes(token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RouteTypesApi#routeTypesGetRouteTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RouteTypesApi#routeTypesGetRouteTypes")
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

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

