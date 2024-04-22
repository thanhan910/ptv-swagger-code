# swagger_client.PatternsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patterns_get_pattern_by_run**](PatternsApi.md#patterns_get_pattern_by_run) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run


# **patterns_get_pattern_by_run**
> V3StoppingPattern patterns_get_pattern_by_run(run_ref, route_type, expand, stop_id=stop_id, date_utc=date_utc, include_skipped_stops=include_skipped_stops, include_geopath=include_geopath, token=token, devid=devid, signature=signature)

View the stopping pattern for a specific trip/service run

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PatternsApi()
run_ref = 'run_ref_example' # str | The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
route_type = 56 # int | Number identifying transport mode; values returned via RouteTypes API
expand = ['expand_example'] # list[str] | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
stop_id = 56 # int | Filter by stop_id; values returned by Stops API (optional)
date_utc = '2013-10-20T19:20:30+01:00' # datetime | Filter by the date and time of the request (ISO 8601 UTC format) (optional)
include_skipped_stops = true # bool | Include any skipped stops in a stopping pattern. Defaults to false. (optional)
include_geopath = true # bool | Indicates if geopath data will be returned (default = false) (optional)
token = 'token_example' # str | Please ignore (optional)
devid = 'devid_example' # str | Your developer id (optional)
signature = 'signature_example' # str | Authentication signature for request (optional)

try:
    # View the stopping pattern for a specific trip/service run
    api_response = api_instance.patterns_get_pattern_by_run(run_ref, route_type, expand, stop_id=stop_id, date_utc=date_utc, include_skipped_stops=include_skipped_stops, include_geopath=include_geopath, token=token, devid=devid, signature=signature)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PatternsApi->patterns_get_pattern_by_run: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **run_ref** | **str**| The run_ref is the identifier of a run as returned by the departures/* and runs/* endpoints. WARNING, run_id is deprecated. Use run_ref instead. | 
 **route_type** | **int**| Number identifying transport mode; values returned via RouteTypes API | 
 **expand** | [**list[str]**](str.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | 
 **stop_id** | **int**| Filter by stop_id; values returned by Stops API | [optional] 
 **date_utc** | **datetime**| Filter by the date and time of the request (ISO 8601 UTC format) | [optional] 
 **include_skipped_stops** | **bool**| Include any skipped stops in a stopping pattern. Defaults to false. | [optional] 
 **include_geopath** | **bool**| Indicates if geopath data will be returned (default &#x3D; false) | [optional] 
 **token** | **str**| Please ignore | [optional] 
 **devid** | **str**| Your developer id | [optional] 
 **signature** | **str**| Authentication signature for request | [optional] 

### Return type

[**V3StoppingPattern**](V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

