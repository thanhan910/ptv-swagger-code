# Swagger\Client\RoutesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routesOneOrMoreRoutes**](RoutesApi.md#routesOneOrMoreRoutes) | **GET** /v3/routes | View route names and numbers for all routes
[**routesRouteFromId**](RoutesApi.md#routesRouteFromId) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID


# **routesOneOrMoreRoutes**
> \Swagger\Client\Model\V3RouteResponse routesOneOrMoreRoutes($route_types, $route_name, $token, $devid, $signature)

View route names and numbers for all routes

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_types = array(56); // int[] | Filter by route_type; values returned via RouteTypes API
$route_name = "route_name_example"; // string | Filter by name  of route (accepts partial route name matches)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->routesOneOrMoreRoutes($route_types, $route_name, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->routesOneOrMoreRoutes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_types** | [**int[]**](../Model/int.md)| Filter by route_type; values returned via RouteTypes API | [optional]
 **route_name** | **string**| Filter by name  of route (accepts partial route name matches) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RouteResponse**](../Model/V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **routesRouteFromId**
> \Swagger\Client\Model\V3RouteResponse routesRouteFromId($route_id, $include_geopath, $geopath_utc, $token, $devid, $signature)

View route name and number for specific route ID

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\RoutesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$route_id = 56; // int | Identifier of route; values returned by Departures, Directions and Disruptions APIs
$include_geopath = true; // bool | Indicates kif geopath data will be returned (default = false)
$geopath_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->routesRouteFromId($route_id, $include_geopath, $geopath_utc, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RoutesApi->routesRouteFromId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **int**| Identifier of route; values returned by Departures, Directions and Disruptions APIs |
 **include_geopath** | **bool**| Indicates kif geopath data will be returned (default &#x3D; false) | [optional]
 **geopath_utc** | **\DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3RouteResponse**](../Model/V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

