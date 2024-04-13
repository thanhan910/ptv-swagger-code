# SwaggerClient::DisruptionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disruptions_get_all_disruptions**](DisruptionsApi.md#disruptions_get_all_disruptions) | **GET** /v3/disruptions | View all disruptions for all route types
[**disruptions_get_disruption_by_id**](DisruptionsApi.md#disruptions_get_disruption_by_id) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
[**disruptions_get_disruption_modes**](DisruptionsApi.md#disruptions_get_disruption_modes) | **GET** /v3/disruptions/modes | Get all disruption modes
[**disruptions_get_disruptions_by_route**](DisruptionsApi.md#disruptions_get_disruptions_by_route) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**disruptions_get_disruptions_by_route_and_stop**](DisruptionsApi.md#disruptions_get_disruptions_by_route_and_stop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**disruptions_get_disruptions_by_stop**](DisruptionsApi.md#disruptions_get_disruptions_by_stop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop

# **disruptions_get_all_disruptions**
> V3DisruptionsResponse disruptions_get_all_disruptions(opts)

View all disruptions for all route types

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
opts = { 
  route_types: [56], # Array<Integer> | Filter by route_type; values returned via RouteTypes API
  disruption_modes: [56], # Array<Integer> | Filter by disruption_mode; values returned via v3/disruptions/modes API
  disruption_status: 'disruption_status_example', # String | Filter by status of disruption
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all disruptions for all route types
  result = api_instance.disruptions_get_all_disruptions(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_all_disruptions: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_types** | [**Array&lt;Integer&gt;**](Integer.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **disruption_modes** | [**Array&lt;Integer&gt;**](Integer.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | [optional] 
 **disruption_status** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **disruptions_get_disruption_by_id**
> V3DisruptionResponse disruptions_get_disruption_by_id(disruption_id, opts)

View a specific disruption

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
disruption_id = 789 # Integer | Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View a specific disruption
  result = api_instance.disruptions_get_disruption_by_id(disruption_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_disruption_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disruption_id** | **Integer**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} | 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionResponse**](V3DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **disruptions_get_disruption_modes**
> V3DisruptionModesResponse disruptions_get_disruption_modes(opts)

Get all disruption modes

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #Get all disruption modes
  result = api_instance.disruptions_get_disruption_modes(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_disruption_modes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionModesResponse**](V3DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **disruptions_get_disruptions_by_route**
> V3DisruptionsResponse disruptions_get_disruptions_by_route(route_id, opts)

View all disruptions for a particular route

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes
opts = { 
  disruption_status: 'disruption_status_example', # String | Filter by status of disruption
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all disruptions for a particular route
  result = api_instance.disruptions_get_disruptions_by_route(route_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_disruptions_by_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes | 
 **disruption_status** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **disruptions_get_disruptions_by_route_and_stop**
> V3DisruptionsResponse disruptions_get_disruptions_by_route_and_stop(route_id, stop_id, opts)

View all disruptions for a particular route and stop

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes
stop_id = 56 # Integer | Identifier of stop; values returned by Stops API - v3/stops
opts = { 
  disruption_status: 'disruption_status_example', # String | Filter by status of disruption
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all disruptions for a particular route and stop
  result = api_instance.disruptions_get_disruptions_by_route_and_stop(route_id, stop_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_disruptions_by_route_and_stop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes | 
 **stop_id** | **Integer**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruption_status** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **disruptions_get_disruptions_by_stop**
> V3DisruptionsResponse disruptions_get_disruptions_by_stop(stop_id, opts)

View all disruptions for a particular stop

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DisruptionsApi.new
stop_id = 56 # Integer | Identifier of stop; values returned by Stops API - v3/stops
opts = { 
  disruption_status: 'disruption_status_example', # String | Filter by status of disruption
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all disruptions for a particular stop
  result = api_instance.disruptions_get_disruptions_by_stop(stop_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DisruptionsApi->disruptions_get_disruptions_by_stop: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stop_id** | **Integer**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruption_status** | **String**| Filter by status of disruption | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



