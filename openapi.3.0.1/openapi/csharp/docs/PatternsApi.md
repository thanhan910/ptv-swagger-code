# Ptv.Api.Client.Api.PatternsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PatternsGetPatternByRun**](PatternsApi.md#patternsgetpatternbyrun) | **GET** /v3/pattern/run/{run_ref}/route_type/{route_type} | View the stopping pattern for a specific trip/service run |

<a id="patternsgetpatternbyrun"></a>
# **PatternsGetPatternByRun**
> V3StoppingPattern PatternsGetPatternByRun (string runRef, int routeType, List<string> expand, int? stopId = null, DateTime? dateUtc = null, bool? includeSkippedStops = null, bool? includeGeopath = null, string? token = null, string? devid = null, string? signature = null)

View the stopping pattern for a specific trip/service run

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class PatternsGetPatternByRunExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new PatternsApi(config);
            var runRef = "runRef_example";  // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
            var stopId = 56;  // int? | Filter by stop_id; values returned by Stops API (optional) 
            var dateUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Filter by the date and time of the request (ISO 8601 UTC format) (optional) 
            var includeSkippedStops = true;  // bool? | Include any skipped stops in a stopping pattern. Defaults to false. (optional) 
            var includeGeopath = true;  // bool? | Indicates if geopath data will be returned (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View the stopping pattern for a specific trip/service run
                V3StoppingPattern result = apiInstance.PatternsGetPatternByRun(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PatternsApi.PatternsGetPatternByRun: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PatternsGetPatternByRunWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View the stopping pattern for a specific trip/service run
    ApiResponse<V3StoppingPattern> response = apiInstance.PatternsGetPatternByRunWithHttpInfo(runRef, routeType, expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PatternsApi.PatternsGetPatternByRunWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runRef** | **string** | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **expand** | [**List&lt;string&gt;**](string.md) | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. |  |
| **stopId** | **int?** | Filter by stop_id; values returned by Stops API | [optional]  |
| **dateUtc** | **DateTime?** | Filter by the date and time of the request (ISO 8601 UTC format) | [optional]  |
| **includeSkippedStops** | **bool?** | Include any skipped stops in a stopping pattern. Defaults to false. | [optional]  |
| **includeGeopath** | **bool?** | Indicates if geopath data will be returned (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3StoppingPattern**](V3StoppingPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The stopping pattern of the specified run_ref and route type. (NOTE: the departure sequence field should be used to sort departures in chronological order, however it is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4) |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

