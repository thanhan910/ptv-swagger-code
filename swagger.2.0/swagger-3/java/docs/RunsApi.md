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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
Integer routeId = 56; // Integer | Identifier of route; values returned by Routes API - v3/routes.
List<String> expand = Arrays.asList("expand_example"); // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
OffsetDateTime dateUtc = new OffsetDateTime(); // OffsetDateTime | Date of the request. (optional - defaults to now)
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3RunsResponse result = apiInstance.runsForRoute(routeId, expand, dateUtc, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsForRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **Integer**| Identifier of route; values returned by Routes API - v3/routes. |
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional] [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **OffsetDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
Integer routeId = 56; // Integer | Identifier of route; values returned by Routes API - v3/routes.
Integer routeType = 56; // Integer | Number identifying transport mode; values returned via RouteTypes API
List<String> expand = Arrays.asList("expand_example"); // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
OffsetDateTime dateUtc = new OffsetDateTime(); // OffsetDateTime | Date of the request. (optional - defaults to now)
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3RunsResponse result = apiInstance.runsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsForRouteAndRouteType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **Integer**| Identifier of route; values returned by Routes API - v3/routes. |
 **routeType** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **OffsetDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String runRef = "runRef_example"; // String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
List<String> expand = Arrays.asList("expand_example"); // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
OffsetDateTime dateUtc = new OffsetDateTime(); // OffsetDateTime | Date of the request. (optional - defaults to now)
Boolean includeGeopath = true; // Boolean | Indicates if geopath data will be returned (default = false)
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3RunsResponse result = apiInstance.runsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsForRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **OffsetDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **includeGeopath** | **Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunsApi;


RunsApi apiInstance = new RunsApi();
String runRef = "runRef_example"; // String | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
Integer routeType = 56; // Integer | Number identifying transport mode; values returned via RouteTypes API
List<String> expand = Arrays.asList("expand_example"); // List<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
OffsetDateTime dateUtc = new OffsetDateTime(); // OffsetDateTime | Date of the request. (optional - defaults to now)
Boolean includeGeopath = true; // Boolean | Indicates if geopath data will be returned (default = false)
String token = "token_example"; // String | Please ignore
String devid = "devid_example"; // String | Your developer id
String signature = "signature_example"; // String | Authentication signature for request
try {
    V3RunResponse result = apiInstance.runsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunsApi#runsForRunAndRouteType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runRef** | **String**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **routeType** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | [enum: 0, 1, 2, 3, 4]
 **expand** | [**List&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [enum: All, VehicleDescriptor, VehiclePosition, None]
 **dateUtc** | **OffsetDateTime**| Date of the request. (optional - defaults to now) | [optional]
 **includeGeopath** | **Boolean**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **String**| Please ignore | [optional]
 **devid** | **String**| Your developer id | [optional]
 **signature** | **String**| Authentication signature for request | [optional]

### Return type

[**V3RunResponse**](V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

