# SwaggerClient::RouteTypesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**route_types_get_route_types**](RouteTypesApi.md#route_types_get_route_types) | **GET** /v3/route_types | View all route types and their names

# **route_types_get_route_types**
> V3RouteTypesResponse route_types_get_route_types(opts)

View all route types and their names

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RouteTypesApi.new
opts = { 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all route types and their names
  result = api_instance.route_types_get_route_types(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RouteTypesApi->route_types_get_route_types: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



