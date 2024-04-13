# SwaggerClient::StopsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stops_stop_details**](StopsApi.md#stops_stop_details) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only)
[**stops_stops_by_geolocation**](StopsApi.md#stops_stops_by_geolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location
[**stops_stops_for_route**](StopsApi.md#stops_stops_for_route) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route

# **stops_stop_details**
> V3StopResponse stops_stop_details(stop_id, route_type, opts)

View facilities at a specific stop (Metro and V/Line stations only)

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StopsApi.new
stop_id = 56 # Integer | Identifier of stop; values returned by Stops API
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
opts = { 
  stop_location: true, # BOOLEAN | Indicates if stop location information will be returned (default = false)
  stop_amenities: true, # BOOLEAN | Indicates if stop amenity information will be returned (default = false)
  stop_accessibility: true, # BOOLEAN | Indicates if stop accessibility information will be returned (default = false)
  stop_contact: true, # BOOLEAN | Indicates if stop contact information will be returned (default = false)
  stop_ticket: true, # BOOLEAN | Indicates if stop ticket information will be returned (default = false)
  gtfs: true, # BOOLEAN | Incdicates whether the stop_id is a GTFS ID or not
  stop_staffing: true, # BOOLEAN | Indicates if stop staffing information will be returned (default = false)
  stop_disruptions: true, # BOOLEAN | Indicates if stop disruption information will be returned (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View facilities at a specific stop (Metro and V/Line stations only)
  result = api_instance.stops_stop_details(stop_id, route_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StopsApi->stops_stop_details: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stop_id** | **Integer**| Identifier of stop; values returned by Stops API | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **stop_location** | **BOOLEAN**| Indicates if stop location information will be returned (default &#x3D; false) | [optional] 
 **stop_amenities** | **BOOLEAN**| Indicates if stop amenity information will be returned (default &#x3D; false) | [optional] 
 **stop_accessibility** | **BOOLEAN**| Indicates if stop accessibility information will be returned (default &#x3D; false) | [optional] 
 **stop_contact** | **BOOLEAN**| Indicates if stop contact information will be returned (default &#x3D; false) | [optional] 
 **stop_ticket** | **BOOLEAN**| Indicates if stop ticket information will be returned (default &#x3D; false) | [optional] 
 **gtfs** | **BOOLEAN**| Incdicates whether the stop_id is a GTFS ID or not | [optional] 
 **stop_staffing** | **BOOLEAN**| Indicates if stop staffing information will be returned (default &#x3D; false) | [optional] 
 **stop_disruptions** | **BOOLEAN**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopResponse**](V3StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **stops_stops_by_geolocation**
> V3StopsByDistanceResponse stops_stops_by_geolocation(latitude, longitude, opts)

View all stops near a specific location

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StopsApi.new
latitude = 3.4 # Float | Geographic coordinate of latitude
longitude = 3.4 # Float | Geographic coordinate of longitude
opts = { 
  route_types: [56], # Array<Integer> | Filter by route_type; values returned via RouteTypes API
  max_results: 56, # Integer | Maximum number of results returned (default = 30)
  max_distance: 1.2, # Float | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
  stop_disruptions: true, # BOOLEAN | Indicates if stop disruption information will be returned (default = false)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all stops near a specific location
  result = api_instance.stops_stops_by_geolocation(latitude, longitude, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StopsApi->stops_stops_by_geolocation: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Float**| Geographic coordinate of latitude | 
 **longitude** | **Float**| Geographic coordinate of longitude | 
 **route_types** | [**Array&lt;Integer&gt;**](Integer.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **max_results** | **Integer**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **max_distance** | **Float**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] 
 **stop_disruptions** | **BOOLEAN**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopsByDistanceResponse**](V3StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



# **stops_stops_for_route**
> V3StopsOnRouteResponse stops_stops_for_route(route_id, route_type, opts)

View all stops on a specific route

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StopsApi.new
route_id = 56 # Integer | Identifier of route; values returned by Routes API - v3/routes
route_type = 56 # Integer | Number identifying transport mode; values returned via RouteTypes API
opts = { 
  direction_id: 56, # Integer | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
  stop_disruptions: true, # BOOLEAN | Indicates if stop disruption information will be returned (default = false)
  include_geopath: true, # BOOLEAN | Indicates if geopath data will be returned (default = false)
  geopath_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Filter geopaths by date (ISO 8601 UTC format) (default = current date)
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #View all stops on a specific route
  result = api_instance.stops_stops_for_route(route_id, route_type, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StopsApi->stops_stops_for_route: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **route_id** | **Integer**| Identifier of route; values returned by Routes API - v3/routes | 
 **route_type** | **Integer**| Number identifying transport mode; values returned via RouteTypes API | 
 **direction_id** | **Integer**| An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | [optional] 
 **stop_disruptions** | **BOOLEAN**| Indicates if stop disruption information will be returned (default &#x3D; false) | [optional] 
 **include_geopath** | **BOOLEAN**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **geopath_utc** | **DateTime**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3StopsOnRouteResponse**](V3StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



