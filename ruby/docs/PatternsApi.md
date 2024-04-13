# SwaggerClient::PatternsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patterns_get_pattern_by_run**](PatternsApi.md#patterns_get_pattern_by_run) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run

# **patterns_get_pattern_by_run**
> V3StoppingPattern patterns_get_pattern_by_run(run_ref, route_type, expand, opts)

View the stopping pattern for a specific trip/service run

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::PatternsApi.new
run_ref = 'run_ref_example' # String | The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
expand = ['expand_example'] # Array<String> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
opts = { 
  stop_id: 56, # Integer | Filter by stop_id; values returned by Stops API
  date_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Filter by the date and time of the request (ISO 8601 UTC format)
  include_skipped_stops: true, # BOOLEAN | Include any skipped stops in a stopping pattern. Defaults to false.
  include_geopath: true, # BOOLEAN | Indicates if geopath data will be returned (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View the stopping pattern for a specific trip/service run
  result = api_instance.patterns_get_pattern_by_run(run_ref, route_type, expand, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PatternsApi->patterns_get_pattern_by_run: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **String**| The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**Array&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **stop_id** | **Integer**| Filter by stop_id; values returned by Stops API | [optional] 
 **date_utc** | **DateTime**| Filter by the date and time of the request (ISO 8601 UTC format) | [optional] 
 **include_skipped_stops** | **BOOLEAN**| Include any skipped stops in a stopping pattern. Defaults to false. | [optional] 
 **include_geopath** | **BOOLEAN**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StoppingPattern**](V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



