# Ptv.Api.Client.Api.OutletsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**OutletsGetAllOutlets**](OutletsApi.md#outletsgetalloutlets) | **GET** /v3/outlets | List all ticket outlets |
| [**OutletsGetOutletsByGeolocation**](OutletsApi.md#outletsgetoutletsbygeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location |

<a id="outletsgetalloutlets"></a>
# **OutletsGetAllOutlets**
> V3OutletResponse OutletsGetAllOutlets (int? maxResults = null, string? token = null, string? devid = null, string? signature = null)

List all ticket outlets

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class OutletsGetAllOutletsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new OutletsApi(config);
            var maxResults = 56;  // int? | Maximum number of results returned (default = 30) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // List all ticket outlets
                V3OutletResponse result = apiInstance.OutletsGetAllOutlets(maxResults, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OutletsApi.OutletsGetAllOutlets: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the OutletsGetAllOutletsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List all ticket outlets
    ApiResponse<V3OutletResponse> response = apiInstance.OutletsGetAllOutletsWithHttpInfo(maxResults, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OutletsApi.OutletsGetAllOutletsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **maxResults** | **int?** | Maximum number of results returned (default &#x3D; 30) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3OutletResponse**](V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ticket outlets. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="outletsgetoutletsbygeolocation"></a>
# **OutletsGetOutletsByGeolocation**
> V3OutletGeolocationResponse OutletsGetOutletsByGeolocation (float latitude, float longitude, double? maxDistance = null, int? maxResults = null, string? token = null, string? devid = null, string? signature = null)

List ticket outlets near a specific location

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class OutletsGetOutletsByGeolocationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new OutletsApi(config);
            var latitude = 3.4F;  // float | Geographic coordinate of latitude
            var longitude = 3.4F;  // float | Geographic coordinate of longitude
            var maxDistance = 1.2D;  // double? | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) (optional) 
            var maxResults = 56;  // int? | Maximum number of results returned (default = 30) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // List ticket outlets near a specific location
                V3OutletGeolocationResponse result = apiInstance.OutletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OutletsApi.OutletsGetOutletsByGeolocation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the OutletsGetOutletsByGeolocationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List ticket outlets near a specific location
    ApiResponse<V3OutletGeolocationResponse> response = apiInstance.OutletsGetOutletsByGeolocationWithHttpInfo(latitude, longitude, maxDistance, maxResults, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OutletsApi.OutletsGetOutletsByGeolocationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **latitude** | **float** | Geographic coordinate of latitude |  |
| **longitude** | **float** | Geographic coordinate of longitude |  |
| **maxDistance** | **double?** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional]  |
| **maxResults** | **int?** | Maximum number of results returned (default &#x3D; 30) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3OutletGeolocationResponse**](V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ticket outlets near the specified location. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

