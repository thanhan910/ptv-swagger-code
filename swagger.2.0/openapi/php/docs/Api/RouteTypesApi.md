# OpenAPI\Client\RouteTypesApi

All URIs are relative to https://timetableapi.ptv.vic.gov.au, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**routeTypesGetRouteTypes()**](RouteTypesApi.md#routeTypesGetRouteTypes) | **GET** /v3/route_types | View all route types and their names |


## `routeTypesGetRouteTypes()`

```php
routeTypesGetRouteTypes($token, $devid, $signature): \OpenAPI\Client\Model\V3RouteTypesResponse
```

View all route types and their names

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\RouteTypesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->routeTypesGetRouteTypes($token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RouteTypesApi->routeTypesGetRouteTypes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3RouteTypesResponse**](../Model/V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
