# Ptv.Api.Client.Api.RouteTypesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**RouteTypesGetRouteTypes**](RouteTypesApi.md#routetypesgetroutetypes) | **GET** /v3/route_types | View all route types and their names |

<a id="routetypesgetroutetypes"></a>
# **RouteTypesGetRouteTypes**
> V3RouteTypesResponse RouteTypesGetRouteTypes (string? token = null, string? devid = null, string? signature = null)

View all route types and their names

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RouteTypesGetRouteTypesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RouteTypesApi(config);
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all route types and their names
                V3RouteTypesResponse result = apiInstance.RouteTypesGetRouteTypes(token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RouteTypesApi.RouteTypesGetRouteTypes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RouteTypesGetRouteTypesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all route types and their names
    ApiResponse<V3RouteTypesResponse> response = apiInstance.RouteTypesGetRouteTypesWithHttpInfo(token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RouteTypesApi.RouteTypesGetRouteTypesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All route types (i.e. identifiers of transport modes) and their names. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

