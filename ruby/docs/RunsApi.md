# SwaggerClient::RunsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runs_for_route**](RunsApi.md#runs_for_route) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID
[**runs_for_route_and_route_type**](RunsApi.md#runs_for_route_and_route_type) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type
[**runs_for_run**](RunsApi.md#runs_for_run) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref
[**runs_for_run_and_route_type**](RunsApi.md#runs_for_run_and_route_type) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type

# **runs_for_route**
> V3RunsResponse runs_for_route(route_id, opts)

View all trip/service runs for a specific route ID

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RunsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes.
opts = { 
  expand: ['expand_example'], # Array<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
  date_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Date of the request. (optional - defaults to now)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all trip/service runs for a specific route ID
  result = api_instance.runs_for_route(route_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RunsApi->runs_for_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes. | 
 **expand** | [**Array&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional] 
 **date_utc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **runs_for_route_and_route_type**
> V3RunsResponse runs_for_route_and_route_type(route_id, route_type, expand, opts)

View all trip/service runs for a specific route ID and route type

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RunsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes.
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
expand = ['expand_example'] # Array<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
opts = { 
  date_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Date of the request. (optional - defaults to now)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all trip/service runs for a specific route ID and route type
  result = api_instance.runs_for_route_and_route_type(route_id, route_type, expand, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RunsApi->runs_for_route_and_route_type: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes. | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**Array&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. | 
 **date_utc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **runs_for_run**
> V3RunsResponse runs_for_run(run_ref, expand, opts)

View all trip/service runs for a specific run_ref

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RunsApi.new
run_ref = 'run_ref_example' # String | The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
expand = ['expand_example'] # Array<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
opts = { 
  date_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Date of the request. (optional - defaults to now)
  include_geopath: true, # BOOLEAN | Indicates if geopath data will be returned (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all trip/service runs for a specific run_ref
  result = api_instance.runs_for_run(run_ref, expand, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RunsApi->runs_for_run: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **String**| The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **expand** | [**Array&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **date_utc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **include_geopath** | **BOOLEAN**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **runs_for_run_and_route_type**
> V3RunResponse runs_for_run_and_route_type(run_ref, route_type, expand, opts)

View the trip/service run for a specific run_ref and route type

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RunsApi.new
run_ref = 'run_ref_example' # String | The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
expand = ['expand_example'] # Array<String> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
opts = { 
  date_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Date of the request. (optional - defaults to now)
  include_geopath: true, # BOOLEAN | Indicates if geopath data will be returned (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View the trip/service run for a specific run_ref and route type
  result = api_instance.runs_for_run_and_route_type(run_ref, route_type, expand, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RunsApi->runs_for_run_and_route_type: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **String**| The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**Array&lt;String&gt;**](String.md)| List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | 
 **date_utc** | **DateTime**| Date of the request. (optional - defaults to now) | [optional] 
 **include_geopath** | **BOOLEAN**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RunResponse**](V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



