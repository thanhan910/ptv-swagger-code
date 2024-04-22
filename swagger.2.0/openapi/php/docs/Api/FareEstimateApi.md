# OpenAPI\Client\FareEstimateApi

All URIs are relative to https://timetableapi.ptv.vic.gov.au, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**fareEstimateGetFareEstimateByZone()**](FareEstimateApi.md#fareEstimateGetFareEstimateByZone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone |


## `fareEstimateGetFareEstimateByZone()`

```php
fareEstimateGetFareEstimateByZone($min_zone, $max_zone, $journey_touch_on_utc, $journey_touch_off_utc, $is_journey_in_free_tram_zone, $travelled_route_types, $token, $devid, $signature): \OpenAPI\Client\Model\V3FareEstimateResponse
```

Estimate a fare by zone

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\FareEstimateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$min_zone = 56; // int | Minimum Zone travelled through ie. 1
$max_zone = 56; // int | Maximum Zone travelled through id. 6
$journey_touch_on_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
$journey_touch_off_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
$is_journey_in_free_tram_zone = True; // bool
$travelled_route_types = array(56); // int[]
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->fareEstimateGetFareEstimateByZone($min_zone, $max_zone, $journey_touch_on_utc, $journey_touch_off_utc, $is_journey_in_free_tram_zone, $travelled_route_types, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FareEstimateApi->fareEstimateGetFareEstimateByZone: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **min_zone** | **int**| Minimum Zone travelled through ie. 1 | |
| **max_zone** | **int**| Maximum Zone travelled through id. 6 | |
| **journey_touch_on_utc** | **\DateTime**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] |
| **journey_touch_off_utc** | **\DateTime**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] |
| **is_journey_in_free_tram_zone** | **bool**|  | [optional] |
| **travelled_route_types** | [**int[]**](../Model/int.md)|  | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3FareEstimateResponse**](../Model/V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
