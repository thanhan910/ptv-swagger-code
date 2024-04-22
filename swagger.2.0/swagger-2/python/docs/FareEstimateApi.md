# swagger_client.FareEstimateApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fare_estimate_get_fare_estimate_by_zone**](FareEstimateApi.md#fare_estimate_get_fare_estimate_by_zone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone


# **fare_estimate_get_fare_estimate_by_zone**
> V3FareEstimateResponse fare_estimate_get_fare_estimate_by_zone(min_zone, max_zone, journey_touch_on_utc=journey_touch_on_utc, journey_touch_off_utc=journey_touch_off_utc, is_journey_in_free_tram_zone=is_journey_in_free_tram_zone, travelled_route_types=travelled_route_types, token=token, devid=devid, signature=signature)

Estimate a fare by zone

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.FareEstimateApi()
min_zone = 56 # int | Minimum Zone travelled through ie. 1
max_zone = 56 # int | Maximum Zone travelled through id. 6
journey_touch_on_utc = '2013-10-20T19:20:30+01:00' # datetime | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)
journey_touch_off_utc = '2013-10-20T19:20:30+01:00' # datetime | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional)
is_journey_in_free_tram_zone = true # bool |  (optional)
travelled_route_types = [56] # list[int] |  (optional)
token = 'token_example' # str | Please ignore (optional)
devid = 'devid_example' # str | Your developer id (optional)
signature = 'signature_example' # str | Authentication signature for request (optional)

try:
    # Estimate a fare by zone
    api_response = api_instance.fare_estimate_get_fare_estimate_by_zone(min_zone, max_zone, journey_touch_on_utc=journey_touch_on_utc, journey_touch_off_utc=journey_touch_off_utc, is_journey_in_free_tram_zone=is_journey_in_free_tram_zone, travelled_route_types=travelled_route_types, token=token, devid=devid, signature=signature)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FareEstimateApi->fare_estimate_get_fare_estimate_by_zone: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **min_zone** | **int**| Minimum Zone travelled through ie. 1 | 
 **max_zone** | **int**| Maximum Zone travelled through id. 6 | 
 **journey_touch_on_utc** | **datetime**| JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **journey_touch_off_utc** | **datetime**| JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional] 
 **is_journey_in_free_tram_zone** | **bool**|  | [optional] 
 **travelled_route_types** | [**list[int]**](int.md)|  | [optional] 
 **token** | **str**| Please ignore | [optional] 
 **devid** | **str**| Your developer id | [optional] 
 **signature** | **str**| Authentication signature for request | [optional] 

### Return type

[**V3FareEstimateResponse**](V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

