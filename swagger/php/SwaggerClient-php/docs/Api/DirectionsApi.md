# Swagger\Client\DirectionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directionsForDirection**](DirectionsApi.md#directionsfordirection) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel
[**directionsForDirectionAndType**](DirectionsApi.md#directionsfordirectionandtype) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
[**directionsForRoute**](DirectionsApi.md#directionsforroute) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in

# **directionsForDirection**
> \Swagger\Client\Model\V3DirectionsResponse directionsForDirection($direction_id, $token, $devid, $signature)

View all routes for a direction of travel

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$direction_id = 56; // int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->directionsForDirection($direction_id, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectionsApi->directionsForDirection: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction_id** | **int**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DirectionsResponse**](../Model/V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **directionsForDirectionAndType**
> \Swagger\Client\Model\V3DirectionsResponse directionsForDirectionAndType($direction_id, $route_type, $token, $devid, $signature)

View all routes of a particular type for a direction of travel

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$direction_id = 56; // int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->directionsForDirectionAndType($direction_id, $route_type, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectionsApi->directionsForDirectionAndType: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction_id** | **int**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |
 **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API |
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DirectionsResponse**](../Model/V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **directionsForRoute**
> \Swagger\Client\Model\V3DirectionsResponse directionsForRoute($route_id, $token, $devid, $signature)

View directions that a route travels in

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DirectionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->directionsForRoute($route_id, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DirectionsApi->directionsForRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes |
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DirectionsResponse**](../Model/V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

