# Swagger\Client\DisruptionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disruptionsGetAllDisruptions**](DisruptionsApi.md#disruptionsGetAllDisruptions) | **GET** /v3/disruptions | View all disruptions for all route types
[**disruptionsGetDisruptionById**](DisruptionsApi.md#disruptionsGetDisruptionById) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
[**disruptionsGetDisruptionModes**](DisruptionsApi.md#disruptionsGetDisruptionModes) | **GET** /v3/disruptions/modes | Get all disruption modes
[**disruptionsGetDisruptionsByRoute**](DisruptionsApi.md#disruptionsGetDisruptionsByRoute) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**disruptionsGetDisruptionsByRouteAndStop**](DisruptionsApi.md#disruptionsGetDisruptionsByRouteAndStop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**disruptionsGetDisruptionsByStop**](DisruptionsApi.md#disruptionsGetDisruptionsByStop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop


# **disruptionsGetAllDisruptions**
> \Swagger\Client\Model\V3DisruptionsResponse disruptionsGetAllDisruptions($route_types, $disruption_modes, $disruption_status, $token, $devid, $signature)

View all disruptions for all route types

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_types = array(56); // int[] | Filter by route_type; values returned via RouteTypes API
$disruption_modes = array(56); // int[] | Filter by disruption_mode; values returned via v3/disruptions/modes API
$disruption_status = "disruption_status_example"; // string | Filter by status of disruption
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetAllDisruptions($route_types, $disruption_modes, $disruption_status, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetAllDisruptions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_types** | [**int[]**](../Model/int.md)| Filter by route_type; values returned via RouteTypes API | [optional]
 **disruption_modes** | [**int[]**](../Model/int.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | [optional]
 **disruption_status** | **string**| Filter by status of disruption | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionsResponse**](../Model/V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **disruptionsGetDisruptionById**
> \Swagger\Client\Model\V3DisruptionResponse disruptionsGetDisruptionById($disruption_id, $token, $devid, $signature)

View a specific disruption

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$disruption_id = 789; // int | Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetDisruptionById($disruption_id, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetDisruptionById: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disruption_id** | **int**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} |
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionResponse**](../Model/V3DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **disruptionsGetDisruptionModes**
> \Swagger\Client\Model\V3DisruptionModesResponse disruptionsGetDisruptionModes($token, $devid, $signature)

Get all disruption modes

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetDisruptionModes($token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetDisruptionModes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionModesResponse**](../Model/V3DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **disruptionsGetDisruptionsByRoute**
> \Swagger\Client\Model\V3DisruptionsResponse disruptionsGetDisruptionsByRoute($route_id, $disruption_status, $token, $devid, $signature)

View all disruptions for a particular route

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes
$disruption_status = "disruption_status_example"; // string | Filter by status of disruption
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetDisruptionsByRoute($route_id, $disruption_status, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetDisruptionsByRoute: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes |
 **disruption_status** | **string**| Filter by status of disruption | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionsResponse**](../Model/V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **disruptionsGetDisruptionsByRouteAndStop**
> \Swagger\Client\Model\V3DisruptionsResponse disruptionsGetDisruptionsByRouteAndStop($route_id, $stop_id, $disruption_status, $token, $devid, $signature)

View all disruptions for a particular route and stop

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes
$stop_id = 56; // int | Identifier of stop; values returned by Stops API - v3/stops
$disruption_status = "disruption_status_example"; // string | Filter by status of disruption
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetDisruptionsByRouteAndStop($route_id, $stop_id, $disruption_status, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetDisruptionsByRouteAndStop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes |
 **stop_id** | **int**| Identifier of stop; values returned by Stops API - v3/stops |
 **disruption_status** | **string**| Filter by status of disruption | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionsResponse**](../Model/V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **disruptionsGetDisruptionsByStop**
> \Swagger\Client\Model\V3DisruptionsResponse disruptionsGetDisruptionsByStop($stop_id, $disruption_status, $token, $devid, $signature)

View all disruptions for a particular stop

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\DisruptionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stop_id = 56; // int | Identifier of stop; values returned by Stops API - v3/stops
$disruption_status = "disruption_status_example"; // string | Filter by status of disruption
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->disruptionsGetDisruptionsByStop($stop_id, $disruption_status, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DisruptionsApi->disruptionsGetDisruptionsByStop: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stop_id** | **int**| Identifier of stop; values returned by Stops API - v3/stops |
 **disruption_status** | **string**| Filter by status of disruption | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3DisruptionsResponse**](../Model/V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

