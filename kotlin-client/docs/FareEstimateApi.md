# FareEstimateApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fareEstimateGetFareEstimateByZone**](FareEstimateApi.md#fareEstimateGetFareEstimateByZone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone

<a name="fareEstimateGetFareEstimateByZone"></a>
# **fareEstimateGetFareEstimateByZone**
> V3FareEstimateResponse fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature)

Estimate a fare by zone

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = FareEstimateApi()
val minZone : kotlin.Int = 56 // kotlin.Int | Minimum Zone travelled through ie. 1
val maxZone : kotlin.Int = 56 // kotlin.Int | Maximum Zone travelled through id. 6
val journeyTouchOnUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
val journeyTouchOffUtc : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
val isJourneyInFreeTramZone : kotlin.Boolean = true // kotlin.Boolean | 
val travelledRouteTypes : kotlin.Array<kotlin.Int> =  // kotlin.Array<kotlin.Int> | 
val token : kotlin.String = token_example // kotlin.String | Please ignore
val devid : kotlin.String = devid_example // kotlin.String | Your developer id
val signature : kotlin.String = signature_example // kotlin.String | Authentication signature for request
try {
    val result : V3FareEstimateResponse = apiInstance.fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FareEstimateApi#fareEstimateGetFareEstimateByZone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FareEstimateApi#fareEstimateGetFareEstimateByZone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **minZone** | **kotlin.Int**| Minimum Zone travelled through ie. 1 |
 **maxZone** | **kotlin.Int**| Maximum Zone travelled through id. 6 |
 **journeyTouchOnUtc** | **java.time.LocalDateTime**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional]
 **journeyTouchOffUtc** | **java.time.LocalDateTime**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional]
 **isJourneyInFreeTramZone** | **kotlin.Boolean**|  | [optional]
 **travelledRouteTypes** | [**kotlin.Array&lt;kotlin.Int&gt;**](kotlin.Int.md)|  | [optional] [enum: 0, 1, 2, 3, 4]
 **token** | **kotlin.String**| Please ignore | [optional]
 **devid** | **kotlin.String**| Your developer id | [optional]
 **signature** | **kotlin.String**| Authentication signature for request | [optional]

### Return type

[**V3FareEstimateResponse**](V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

