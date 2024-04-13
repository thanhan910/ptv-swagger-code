# SwaggerClient::DirectionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**directions_for_direction**](DirectionsApi.md#directions_for_direction) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel
[**directions_for_direction_and_type**](DirectionsApi.md#directions_for_direction_and_type) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
[**directions_for_route**](DirectionsApi.md#directions_for_route) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in

# **directions_for_direction**
> V3DirectionsResponse directions_for_direction(direction_id, opts)

View all routes for a direction of travel

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DirectionsApi.new
direction_id = 56 # Integer | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all routes for a direction of travel
  result = api_instance.directions_for_direction(direction_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DirectionsApi->directions_for_direction: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction_id** | **Integer**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **directions_for_direction_and_type**
> V3DirectionsResponse directions_for_direction_and_type(direction_id, route_type, opts)

View all routes of a particular type for a direction of travel

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DirectionsApi.new
direction_id = 56 # Integer | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all routes of a particular type for a direction of travel
  result = api_instance.directions_for_direction_and_type(direction_id, route_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DirectionsApi->directions_for_direction_and_type: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **direction_id** | **Integer**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **directions_for_route**
> V3DirectionsResponse directions_for_route(route_id, opts)

View directions that a route travels in

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::DirectionsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View directions that a route travels in
  result = api_instance.directions_for_route(route_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling DirectionsApi->directions_for_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes | 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



