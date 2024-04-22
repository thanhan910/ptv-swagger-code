# Swagger\Client\PatternsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patternsGetPatternByRun**](PatternsApi.md#patternsGetPatternByRun) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run


# **patternsGetPatternByRun**
> \Swagger\Client\Model\V3StoppingPattern patternsGetPatternByRun($run_ref, $route_type, $expand, $stop_id, $date_utc, $include_skipped_stops, $include_geopath, $token, $devid, $signature)

View the stopping pattern for a specific trip/service run

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\PatternsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$run_ref = "run_ref_example"; // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
$route_type = 56; // int | Number identifying transport mode; values returned via RouteTypes API
$expand = array("expand_example"); // string[] | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
$stop_id = 56; // int | Filter by stop_id; values returned by Stops API
$date_utc = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Filter by the date and time of the request (ISO 8601 UTC format)
$include_skipped_stops = true; // bool | Include any skipped stops in a stopping pattern. Defaults to false.
$include_geopath = true; // bool | Indicates if geopath data will be returned (default = false)
$token = "token_example"; // string | Please ignore
$devid = "devid_example"; // string | Your developer id
$signature = "signature_example"; // string | Authentication signature for request

try {
    $result = $apiInstance->patternsGetPatternByRun($run_ref, $route_type, $expand, $stop_id, $date_utc, $include_skipped_stops, $include_geopath, $token, $devid, $signature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PatternsApi->patternsGetPatternByRun: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **string**| The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |
 **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API |
 **expand** | [**string[]**](../Model/string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. |
 **stop_id** | **int**| Filter by stop_id; values returned by Stops API | [optional]
 **date_utc** | **\DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) | [optional]
 **include_skipped_stops** | **bool**| Include any skipped stops in a stopping pattern. Defaults to false. | [optional]
 **include_geopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional]
 **token** | **string**| Please ignore | [optional]
 **devid** | **string**| Your developer id | [optional]
 **signature** | **string**| Authentication signature for request | [optional]

### Return type

[**\Swagger\Client\Model\V3StoppingPattern**](../Model/V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

