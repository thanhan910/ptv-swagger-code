# OutletsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outletsGetAllOutlets**](OutletsApi.md#outletsGetAllOutlets) | **GET** /v3/outlets | List all ticket outlets
[**outletsGetOutletsByGeolocation**](OutletsApi.md#outletsGetOutletsByGeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location

<a name="outletsGetAllOutlets"></a>
# **outletsGetAllOutlets**
> V3OutletResponse outletsGetAllOutlets(maxResults, token, devid, signature)

List all ticket outlets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OutletsApi()
val maxResults : kotlin.Int = 56 // kotlin.Int | Maximum number of results returned (default = 30)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3OutletResponse = apiInstance.outletsGetAllOutlets(maxResults, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#outletsGetAllOutlets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#outletsGetAllOutlets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **kotlin.Int**| Maximum number of results returned (default &#x3D; 30) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3OutletResponse**](V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

<a name="outletsGetOutletsByGeolocation"></a>
# **outletsGetOutletsByGeolocation**
> V3OutletGeolocationResponse outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature)

List ticket outlets near a specific location

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OutletsApi()
val latitude : kotlin.Float = 3.4 // kotlin.Float | Geographic coordinate of latitude
val longitude : kotlin.Float = 3.4 // kotlin.Float | Geographic coordinate of longitude
val maxDistance : kotlin.Double = 1.2 // kotlin.Double | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
val maxResults : kotlin.Int = 56 // kotlin.Int | Maximum number of results returned (default = 30)
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3OutletGeolocationResponse = apiInstance.outletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#outletsGetOutletsByGeolocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#outletsGetOutletsByGeolocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **kotlin.Float**| Geographic coordinate of latitude |
 **longitude** | **kotlin.Float**| Geographic coordinate of longitude |
 **maxDistance** | **kotlin.Double**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional]
 **maxResults** | **kotlin.Int**| Maximum number of results returned (default &#x3D; 30) | [optional]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3OutletGeolocationResponse**](V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

