# SwaggerClient::RoutesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**routes_one_or_more_routes**](RoutesApi.md#routes_one_or_more_routes) | **GET** /v3/routes | View route names and numbers for all routes
[**routes_route_from_id**](RoutesApi.md#routes_route_from_id) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID

# **routes_one_or_more_routes**
> V3RouteResponse routes_one_or_more_routes(opts)

View route names and numbers for all routes

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RoutesApi.new
opts = { 
  route_types: [56], # Array<Integer> | Filter by route_type; values returned via RouteTypes API
  route_name: 'route_name_example', # String | Filter by name  of route (accepts partial route name matches)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View route names and numbers for all routes
  result = api_instance.routes_one_or_more_routes(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RoutesApi->routes_one_or_more_routes: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_types** | [**Array&lt;Integer&gt;**](Integer.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **route_name** | **String**| Filter by name  of route (accepts partial route name matches) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **routes_route_from_id**
> V3RouteResponse routes_route_from_id(route_id, opts)

View route name and number for specific route ID

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::RoutesApi.new
route_id = 56 # Integer | Identifier of route; values returned by Departures, Directions and Disruptions APIs
opts = { 
  include_geopath: true, # BOOLEAN | Indicates kif geopath data will be returned (default = false)
  geopath_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View route name and number for specific route ID
  result = api_instance.routes_route_from_id(route_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling RoutesApi->routes_route_from_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Departures, Directions and Disruptions APIs | 
 **include_geopath** | **BOOLEAN**| Indicates kif geopath data will be returned (default &#x3D; false) | [optional] 
 **geopath_utc** | **DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



