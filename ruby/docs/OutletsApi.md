# SwaggerClient::OutletsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outlets_get_all_outlets**](OutletsApi.md#outlets_get_all_outlets) | **GET** /v3/outlets | List all ticket outlets
[**outlets_get_outlets_by_geolocation**](OutletsApi.md#outlets_get_outlets_by_geolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location

# **outlets_get_all_outlets**
> V3OutletResponse outlets_get_all_outlets(opts)

List all ticket outlets

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OutletsApi.new
opts = { 
  max_results: 56, # Integer | Maximum number of results returned (default = 30)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #List all ticket outlets
  result = api_instance.outlets_get_all_outlets(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OutletsApi->outlets_get_all_outlets: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **max_results** | **Integer**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3OutletResponse**](V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **outlets_get_outlets_by_geolocation**
> V3OutletGeolocationResponse outlets_get_outlets_by_geolocation(latitude, longitude, opts)

List ticket outlets near a specific location

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OutletsApi.new
latitude = 3.4 # Float | Geographic coordinate of latitude
longitude = 3.4 # Float | Geographic coordinate of longitude
opts = { 
  max_distance: 1.2, # Float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
  max_results: 56, # Integer | Maximum number of results returned (default = 30)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #List ticket outlets near a specific location
  result = api_instance.outlets_get_outlets_by_geolocation(latitude, longitude, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OutletsApi->outlets_get_outlets_by_geolocation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Float**| Geographic coordinate of latitude | 
 **longitude** | **Float**| Geographic coordinate of longitude | 
 **max_distance** | **Float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] 
 **max_results** | **Integer**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3OutletGeolocationResponse**](V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



