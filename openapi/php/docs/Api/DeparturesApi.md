# OpenAPI\Client\DeparturesApi

All URIs are relative to https://timetableapi.ptv.vic.gov.au, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**departuresGetForStop()**](DeparturesApi.md#departuresGetForStop) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop |
| [**departuresGetForStopAndRoute()**](DeparturesApi.md#departuresGetForStopAndRoute) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop |


## `departuresGetForStop()`

```php
departuresGetForStop($route_type, $stop_id, $platform_numbers, $direction_id, $gtfs, $date_utc, $max_results, $include_cancelled, $look_backwards, $expand, $include_geopath, $token, $devid, $signature): \OpenAPI\Client\Model\V3DeparturesResponse
```

View departures for all routes from a stop

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DeparturesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$stop_id = 56; // int | Identifier of stop; values returned by Stops API
$platform_numbers = array(56); // int[] | Filter by platform number at stop
$direction_id = 56; // int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
$gtfs = True; // bool | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
$max_results = 56; // int | Maximum number of results returned
$include_cancelled = True; // bool | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
$look_backwards = True; // bool | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
$expand = array('expand_example'); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
$include_geopath = True; // bool | Indicates if the route geopath should be returned
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->departuresGetForStop($route_type, $stop_id, $platform_numbers, $direction_id, $gtfs, $date_utc, $max_results, $include_cancelled, $look_backwards, $expand, $include_geopath, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DeparturesApi->departuresGetForStop: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API | |
| **stop_id** | **int**| Identifier of stop; values returned by Stops API | |
| **platform_numbers** | [**int[]**](../Model/int.md)| Filter by platform number at stop | [optional] |
| **direction_id** | **int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] |
| **gtfs** | **bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] |
| **date_utc** | **\DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] |
| **max_results** | **int**| Maximum number of results returned | [optional] |
| **include_cancelled** | **bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] |
| **look_backwards** | **bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] |
| **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] |
| **include_geopath** | **bool**| Indicates if the route geopath should be returned | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3DeparturesResponse**](../Model/V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `departuresGetForStopAndRoute()`

```php
departuresGetForStopAndRoute($route_type, $stop_id, $route_id, $direction_id, $gtfs, $date_utc, $max_results, $include_cancelled, $look_backwards, $expand, $include_geopath, $token, $devid, $signature): \OpenAPI\Client\Model\V3DeparturesResponse
```

View departures for a specific route from a stop

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DeparturesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$stop_id = 56; // int | Identifier of stop; values returned by Stops API
$route_id = 'route_id_example'; // string | Identifier of route; values returned by Routes API - v3/routes
$direction_id = 56; // int | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
$gtfs = True; // bool | Indicates that stop_id parameter will accept \"GTFS stop_id\" data
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
$max_results = 56; // int | Maximum number of results returned
$include_cancelled = True; // bool | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
$look_backwards = True; // bool | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
$expand = array('expand_example'); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
$include_geopath = True; // bool | Indicates if the route geopath should be returned
$token = 'token_example'; // string | Please ignore
$devid = 'devid_example'; // string | Your developer id
$signature = 'signature_example'; // string | Authentication signature for request

try {
    $result = $apiInstance->departuresGetForStopAndRoute($route_type, $stop_id, $route_id, $direction_id, $gtfs, $date_utc, $max_results, $include_cancelled, $look_backwards, $expand, $include_geopath, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DeparturesApi->departuresGetForStopAndRoute: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API | |
| **stop_id** | **int**| Identifier of stop; values returned by Stops API | |
| **route_id** | **string**| Identifier of route; values returned by Routes API - v3/routes | |
| **direction_id** | **int**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] |
| **gtfs** | **bool**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] |
| **date_utc** | **\DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] |
| **max_results** | **int**| Maximum number of results returned | [optional] |
| **include_cancelled** | **bool**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] |
| **look_backwards** | **bool**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] |
| **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] |
| **include_geopath** | **bool**| Indicates if the route geopath should be returned | [optional] |
| **token** | **string**| Please ignore | [optional] |
| **devid** | **string**| Your developer id | [optional] |
| **signature** | **string**| Authentication signature for request | [optional] |

### Return type

[**\OpenAPI\Client\Model\V3DeparturesResponse**](../Model/V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `text/json`, `text/html`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
