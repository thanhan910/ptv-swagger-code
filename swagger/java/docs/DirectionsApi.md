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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectionsApi;


DirectionsApi apiInstance = new DirectionsApi();
Integer directionId = 56; // Integer | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3DirectionsResponse result = apiInstance.directionsForDirection(directionId, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectionsApi#directionsForDirection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **Integer**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectionsApi;


DirectionsApi apiInstance = new DirectionsApi();
Integer directionId = 56; // Integer | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
Integer routeType = 56; // Integer | Number identifying transport mode; values returned via RouteTypes API
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3DirectionsResponse result = apiInstance.directionsForDirectionAndType(directionId, routeType, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectionsApi#directionsForDirectionAndType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **Integer**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **routeType** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectionsApi;


DirectionsApi apiInstance = new DirectionsApi();
Integer routeId = 56; // Integer | Identifier of route; values returned by Routes API - v3/routes
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3DirectionsResponse result = apiInstance.directionsForRoute(routeId, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectionsApi#directionsForRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **Integer**| Identifier of route; values returned by Routes API - v3/routes |
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

