# Ptv.Api.Client.Api.FareEstimateApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**FareEstimateGetFareEstimateByZone**](FareEstimateApi.md#fareestimategetfareestimatebyzone) | **GET** /v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone} | Estimate a fare by zone |

<a id="fareestimategetfareestimatebyzone"></a>
# **FareEstimateGetFareEstimateByZone**
> V3FareEstimateResponse FareEstimateGetFareEstimateByZone (int minZone, int maxZone, DateTime? journeyTouchOnUtc = null, DateTime? journeyTouchOffUtc = null, bool? isJourneyInFreeTramZone = null, List<int>? travelledRouteTypes = null, string? token = null, string? devid = null, string? signature = null)

Estimate a fare by zone

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class FareEstimateGetFareEstimateByZoneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new FareEstimateApi(config);
            var minZone = 56;  // int | Minimum Zone travelled through ie. 1
            var maxZone = 56;  // int | Maximum Zone travelled through id. 6
            var journeyTouchOnUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional) 
            var journeyTouchOffUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). (optional) 
            var isJourneyInFreeTramZone = true;  // bool? |  (optional) 
            var travelledRouteTypes = new List<int>?(); // List<int>? |  (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // Estimate a fare by zone
                V3FareEstimateResponse result = apiInstance.FareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling FareEstimateApi.FareEstimateGetFareEstimateByZone: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the FareEstimateGetFareEstimateByZoneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Estimate a fare by zone
    ApiResponse<V3FareEstimateResponse> response = apiInstance.FareEstimateGetFareEstimateByZoneWithHttpInfo(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling FareEstimateApi.FareEstimateGetFareEstimateByZoneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **minZone** | **int** | Minimum Zone travelled through ie. 1 |  |
| **maxZone** | **int** | Maximum Zone travelled through id. 6 |  |
| **journeyTouchOnUtc** | **DateTime?** | JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional]  |
| **journeyTouchOffUtc** | **DateTime?** | JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53). | [optional]  |
| **isJourneyInFreeTramZone** | **bool?** |  | [optional]  |
| **travelledRouteTypes** | [**List&lt;int&gt;?**](int.md) |  | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3FareEstimateResponse**](V3FareEstimateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Resultant set fare estimates |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

