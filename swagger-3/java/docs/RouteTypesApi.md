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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RouteTypesApi;


RouteTypesApi apiInstance = new RouteTypesApi();
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3RouteTypesResponse result = apiInstance.routeTypesGetRouteTypes(token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RouteTypesApi#routeTypesGetRouteTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

### Return type

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

