# OpenAPI\Client\StopsApi

All URIs are relative to https://timetableapi.ptv.vic.gov.au, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**stopsStopDetails()**](StopsApi.md#stopsStopDetails) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only) |
| [**stopsStopsByGeolocation()**](StopsApi.md#stopsStopsByGeolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location |
| [**stopsStopsForRoute()**](StopsApi.md#stopsStopsForRoute) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route |


## `stopsStopDetails()`

```php
stopsStopDetails($stop_id, $route_type, $stop_location, $stop_amenities, $stop_accessibility, $stop_contact, $stop_ticket, $gtfs, $stop_staffing, $stop_disruptions, $token, $devid, $signature): \OpenAPI\Client\Model\V3StopResponse
```

View facilities at a specific stop (Metro and V/Line stations only)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StopsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stop_id = 56; // int | Identifier of stop; values returned by Stops API
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$stop_location = True; // bool | Indicates if stop location information will be returned (default = false)
$stop_amenities = True; // bool | Indicates if stop amenity information will be returned (default = false)
$stop_accessibility = True; // bool | Indicates if stop accessibility information will be returned (default = false)
$stop_contact = True; // bool | Indicates if stop contact information will be returned (default = false)
$stop_ticket = True; // bool | Indicates if stop ticket information will be returned (default = false)
$gtfs = True; // bool | Incdicates whether the stop_id is a GTFS ID or not
$stop_staffing = True; // bool | Indicates if stop staffing information will be returned (default = false)
$stop_disruptions = True; // bool | Indicates if stop disruption information will be returned (default = false)
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->stopsStopDetails($stop_id, $route_type, $stop_location, $stop_amenities, $stop_accessibility, $stop_contact, $stop_ticket, $gtfs, $stop_staffing, $stop_disruptions, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StopsApi->stopsStopDetails: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stop_id** | **int**| Identifier of stop; values returned by Stops API | |
| **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API | |
| **stop_location** | **bool**| Indicates if stop location information will be returned (default &#x3D; false) | [optional] |
| **stop_amenities** | **bool**| Indicates if stop amenity information will be returned (default &#x3D; false) | [optional] |
| **stop_accessibility** | **bool**| Indicates if stop accessibility information will be returned (default &#x3D; false) | [optional] |
| **stop_contact** | **bool**| Indicates if stop contact information will be returned (default &#x3D; false) | [optional] |
| **stop_ticket** | **bool**| Indicates if stop ticket information will be returned (default &#x3D; false) | [optional] |
| **gtfs** | **bool**| Incdicates whether the stop_id is a GTFS ID or not | [optional] |
| **stop_staffing** | **bool**| Indicates if stop staffing information will be returned (default &#x3D; false) | [optional] |
| **stop_disruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3StopResponse**](../Model/V3StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stopsStopsByGeolocation()`

```php
stopsStopsByGeolocation($latitude, $longitude, $route_types, $max_results, $max_distance, $stop_disruptions, $token, $devid, $signature): \OpenAPI\Client\Model\V3StopsByDistanceResponse
```

View all stops near a specific location

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StopsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$latitude = 3.4; // float | Geographic coordinate of latitude
$longitude = 3.4; // float | Geographic coordinate of longitude
$route_types = array(56); // int[] | Filter by route_type; values returned via RouteTypes API
$max_results = 56; // int | Maximum number of results returned (default = 30)
$max_distance = 3.4; // float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
$stop_disruptions = True; // bool | Indicates if stop disruption information will be returned (default = false)
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->stopsStopsByGeolocation($latitude, $longitude, $route_types, $max_results, $max_distance, $stop_disruptions, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StopsApi->stopsStopsByGeolocation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **latitude** | **float**| Geographic coordinate of latitude | |
| **longitude** | **float**| Geographic coordinate of longitude | |
| **route_types** | [**int[]**](../Model/int.md)| Filter by route_type; values returned via RouteTypes API | [optional] |
| **max_results** | **int**| Maximum number of results returned (default &#x3D; 30) | [optional] |
| **max_distance** | **float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] |
| **stop_disruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3StopsByDistanceResponse**](../Model/V3StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `stopsStopsForRoute()`

```php
stopsStopsForRoute($route_id, $route_type, $direction_id, $stop_disruptions, $include_geopath, $geopath_utc, $token, $devid, $signature): \OpenAPI\Client\Model\V3StopsOnRouteResponse
```

View all stops on a specific route

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\StopsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Routes API - v3/routes
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$direction_id = 56; // int | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
$stop_disruptions = True; // bool | Indicates if stop disruption information will be returned (default = false)
$include_geopath = True; // bool | Indicates if geopath data will be returned (default = false)
$geopath_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->stopsStopsForRoute($route_id, $route_type, $direction_id, $stop_disruptions, $include_geopath, $geopath_utc, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StopsApi->stopsStopsForRoute: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **route_id** | **int**| Identifier of route; values returned by Routes API - v3/routes | |
| **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API | |
| **direction_id** | **int**| An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | [optional] |
| **stop_disruptions** | **bool**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] |
| **include_geopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] |
| **geopath_utc** | **\DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3StopsOnRouteResponse**](../Model/V3StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
