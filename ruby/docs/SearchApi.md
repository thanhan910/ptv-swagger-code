# SwaggerClient::SearchApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_search**](SearchApi.md#search_search) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term

# **search_search**
> V3SearchResult search_search(search_term, opts)

View stops, routes and myki ticket outlets that match the search term

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SearchApi.new
search_term = 'search_term_example' # String | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
opts = { 
  route_types: [56], # Array<Integer> | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
  latitude: 3.4, # Float | Filter by geographic coordinate of latitude
  longitude: 3.4, # Float | Filter by geographic coordinate of longitude
  max_distance: 3.4, # Float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
  include_addresses: true, # BOOLEAN | Placeholder for future development; currently unavailable
  include_outlets: true, # BOOLEAN | Indicates if outlets will be returned in response (default = true)
  match_stop_by_suburb: true, # BOOLEAN | Indicates whether to find stops by suburbs in the search term (default = true)
  match_route_by_suburb: true, # BOOLEAN | Indicates whether to find routes by suburbs in the search term (default = true)
  match_stop_by_gtfs_stop_id: true, # BOOLEAN | Indicates whether to search for stops according to a metlink stop ID (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View stops, routes and myki ticket outlets that match the search term
  result = api_instance.search_search(search_term, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SearchApi->search_search: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_term** | **String**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) | 
 **route_types** | [**Array&lt;Integer&gt;**](Integer.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] 
 **latitude** | **Float**| Filter by geographic coordinate of latitude | [optional] 
 **longitude** | **Float**| Filter by geographic coordinate of longitude | [optional] 
 **max_distance** | **Float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional] 
 **include_addresses** | **BOOLEAN**| Placeholder for future development; currently unavailable | [optional] 
 **include_outlets** | **BOOLEAN**| Indicates if outlets will be returned in response (default &#x3D; true) | [optional] 
 **match_stop_by_suburb** | **BOOLEAN**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional] 
 **match_route_by_suburb** | **BOOLEAN**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional] 
 **match_stop_by_gtfs_stop_id** | **BOOLEAN**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3SearchResult**](V3SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



