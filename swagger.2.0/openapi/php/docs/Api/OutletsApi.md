# OpenAPI\Client\OutletsApi

All URIs are relative to https://timetableapi.ptv.vic.gov.au, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**outletsGetAllOutlets()**](OutletsApi.md#outletsGetAllOutlets) | **GET** /v3/outlets | List all ticket outlets |
| [**outletsGetOutletsByGeolocation()**](OutletsApi.md#outletsGetOutletsByGeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location |


## `outletsGetAllOutlets()`

```php
outletsGetAllOutlets($max_results, $token, $devid, $signature): \OpenAPI\Client\Model\V3OutletResponse
```

List all ticket outlets

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OutletsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$max_results = 56; // int | Maximum number of results returned (default = 30)
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->outletsGetAllOutlets($max_results, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OutletsApi->outletsGetAllOutlets: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **max_results** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3OutletResponse**](../Model/V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `outletsGetOutletsByGeolocation()`

```php
outletsGetOutletsByGeolocation($latitude, $longitude, $max_distance, $max_results, $token, $devid, $signature): \OpenAPI\Client\Model\V3OutletGeolocationResponse
```

List ticket outlets near a specific location

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OutletsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$latitude = 3.4; // float | Geographic coordinate of latitude
$longitude = 3.4; // float | Geographic coordinate of longitude
$max_distance = 3.4; // float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
$max_results = 56; // int | Maximum number of results returned (default = 30)
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->outletsGetOutletsByGeolocation($latitude, $longitude, $max_distance, $max_results, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OutletsApi->outletsGetOutletsByGeolocation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **latitude** | **float**| Geographic coordinate of latitude | |
| **longitude** | **float**| Geographic coordinate of longitude | |
| **max_distance** | **float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] |
| **max_results** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3OutletGeolocationResponse**](../Model/V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
