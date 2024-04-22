# Swagger\Client\RunsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runsForRoute**](RunsApi.md#runsforroute) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
[**runsForRouteAndRouteType**](RunsApi.md#runsforrouteandroutetype) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
[**runsForRun**](RunsApi.md#runsforrun) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
[**runsForRunAndRouteType**](RunsApi.md#runsforrunandroutetype) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type

# **runsForRoute**
> \Swagger\Client\Model\V3RunsResponse runsForRoute($route_id, $expand, $date_utc, $token, $devid, $signature)

View all trip/service runs for a specific route ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RunsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes.
$expand = array("expand_example"); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Date of the request. (optional - defaults to now)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->runsForRoute($route_id, $expand, $date_utc, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RunsApi->runsForRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes. |
 **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional]
 **date_utc** | **\DateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RunsResponse**](../Model/V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **runsForRouteAndRouteType**
> \Swagger\Client\Model\V3RunsResponse runsForRouteAndRouteType($route_id, $route_type, $expand, $date_utc, $token, $devid, $signature)

View all trip/service runs for a specific route ID and route type

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RunsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes.
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$expand = array("expand_example"); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Date of the request. (optional - defaults to now)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->runsForRouteAndRouteType($route_id, $route_type, $expand, $date_utc, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RunsApi->runsForRouteAndRouteType: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes. |
 **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API |
 **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. |
 **date_utc** | **\DateTime**| Date of the request. (optional - defaults to now) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RunsResponse**](../Model/V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **runsForRun**
> \Swagger\Client\Model\V3RunsResponse runsForRun($run_ref, $expand, $date_utc, $include_geopath, $token, $devid, $signature)

View all trip/service runs for a specific run_ref

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RunsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$run_ref = "run_ref_example"; // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
$expand = array("expand_example"); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Date of the request. (optional - defaults to now)
$include_geopath = true; // bool | Indicates if geopath data will be returned (default = false)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->runsForRun($run_ref, $expand, $date_utc, $include_geopath, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RunsApi->runsForRun: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. |
 **date_utc** | **\DateTime**| Date of the request. (optional - defaults to now) | [optional]
 **include_geopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RunsResponse**](../Model/V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **runsForRunAndRouteType**
> \Swagger\Client\Model\V3RunResponse runsForRunAndRouteType($run_ref, $route_type, $expand, $date_utc, $include_geopath, $token, $devid, $signature)

View the trip/service run for a specific run_ref and route type

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RunsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$run_ref = "run_ref_example"; // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$expand = array("expand_example"); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Date of the request. (optional - defaults to now)
$include_geopath = true; // bool | Indicates if geopath data will be returned (default = false)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->runsForRunAndRouteType($run_ref, $route_type, $expand, $date_utc, $include_geopath, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RunsApi->runsForRunAndRouteType: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API |
 **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. |
 **date_utc** | **\DateTime**| Date of the request. (optional - defaults to now) | [optional]
 **include_geopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RunResponse**](../Model/V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

