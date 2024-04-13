# SwaggerClient::FareEstimateApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fare_estimate_get_fare_estimate_by_zone**](FareEstimateApi.md#fare_estimate_get_fare_estimate_by_zone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone

# **fare_estimate_get_fare_estimate_by_zone**
> V3FareEstimateResponse fare_estimate_get_fare_estimate_by_zone(min_zone, max_zone, opts)

Estimate a fare by zone

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::FareEstimateApi.new
min_zone = 56 # Integer | Minimum Zone travelled through ie. 1
max_zone = 56 # Integer | Maximum Zone travelled through id. 6
opts = { 
  journey_touch_on_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
  journey_touch_off_utc: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
  is_journey_in_free_tram_zone: true, # BOOLEAN | 
  travelled_route_types: [56], # Array<Integer> | 
  token: 'token_example', # String | Please ignore
  devid: 'devid_example', # String | Your developer id
  signature: 'signature_example' # String | Authentication signature for request
}

begin
  #Estimate a fare by zone
  result = api_instance.fare_estimate_get_fare_estimate_by_zone(min_zone, max_zone, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling FareEstimateApi->fare_estimate_get_fare_estimate_by_zone: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **min_zone** | **Integer**| Minimum Zone travelled through ie. 1 | 
 **max_zone** | **Integer**| Maximum Zone travelled through id. 6 | 
 **journey_touch_on_utc** | **DateTime**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **journey_touch_off_utc** | **DateTime**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **is_journey_in_free_tram_zone** | **BOOLEAN**|  | [optional] 
 **travelled_route_types** | [**Array&lt;Integer&gt;**](Integer.md)|  | [optional] 
 **token** | **String**| Please ignore | [optional] 
 **devid** | **String**| Your developer id | [optional] 
 **signature** | **String**| Authentication signature for request | [optional] 

### Return type

[**V3FareEstimateResponse**](V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html



