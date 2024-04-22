# Swagger\Client\SearchApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSearch**](SearchApi.md#searchSearch) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term


# **searchSearch**
> \Swagger\Client\Model\V3SearchResult searchSearch($search_term, $route_types, $latitude, $longitude, $max_distance, $include_addresses, $include_outlets, $match_stop_by_suburb, $match_route_by_suburb, $match_stop_by_gtfs_stop_id, $token, $devid, $signature)

View stops, routes and myki ticket outlets that match the search term

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$search_term = "search_term_example"; // string | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
$route_types = array(56); // int[] | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
$latitude = 3.4; // float | Filter by geographic coordinate of latitude
$longitude = 3.4; // float | Filter by geographic coordinate of longitude
$max_distance = 3.4; // float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
$include_addresses = true; // bool | Placeholder for future development; currently unavailable
$include_outlets = true; // bool | Indicates if outlets will be returned in response (default = true)
$match_stop_by_suburb = true; // bool | Indicates whether to find stops by suburbs in the search term (default = true)
$match_route_by_suburb = true; // bool | Indicates whether to find routes by suburbs in the search term (default = true)
$match_stop_by_gtfs_stop_id = true; // bool | Indicates whether to search for stops according to a metlink stop ID (default = false)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->searchSearch($search_term, $route_types, $latitude, $longitude, $max_distance, $include_addresses, $include_outlets, $match_stop_by_suburb, $match_route_by_suburb, $match_stop_by_gtfs_stop_id, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchSearch: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_term** | **string**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) |
 **route_types** | [**int[]**](../Model/int.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional]
 **latitude** | **float**| Filter by geographic coordinate of latitude | [optional]
 **longitude** | **float**| Filter by geographic coordinate of longitude | [optional]
 **max_distance** | **float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional]
 **include_addresses** | **bool**| Placeholder for future development; currently unavailable | [optional]
 **include_outlets** | **bool**| Indicates if outlets will be returned in response (default &#x3D; true) | [optional]
 **match_stop_by_suburb** | **bool**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional]
 **match_route_by_suburb** | **bool**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional]
 **match_stop_by_gtfs_stop_id** | **bool**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3SearchResult**](../Model/V3SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

