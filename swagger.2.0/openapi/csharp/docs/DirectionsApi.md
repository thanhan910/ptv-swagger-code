# Ptv.Api.Client.Api.DirectionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DirectionsForDirection**](DirectionsApi.md#directionsfordirection) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel |
| [**DirectionsForDirectionAndType**](DirectionsApi.md#directionsfordirectionandtype) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel |
| [**DirectionsForRoute**](DirectionsApi.md#directionsforroute) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in |

<a id="directionsfordirection"></a>
# **DirectionsForDirection**
> V3DirectionsResponse DirectionsForDirection (int directionId, string? token = null, string? devid = null, string? signature = null)

View all routes for a direction of travel

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class DirectionsForDirectionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new DirectionsApi(config);
            var directionId = 56;  // int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all routes for a direction of travel
                V3DirectionsResponse result = apiInstance.DirectionsForDirection(directionId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForDirection: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DirectionsForDirectionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all routes for a direction of travel
    ApiResponse<V3DirectionsResponse> response = apiInstance.DirectionsForDirectionWithHttpInfo(directionId, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectionsApi.DirectionsForDirectionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **directionId** | **int** | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All routes that travel in the specified direction. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="directionsfordirectionandtype"></a>
# **DirectionsForDirectionAndType**
> V3DirectionsResponse DirectionsForDirectionAndType (int directionId, int routeType, string? token = null, string? devid = null, string? signature = null)

View all routes of a particular type for a direction of travel

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class DirectionsForDirectionAndTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new DirectionsApi(config);
            var directionId = 56;  // int | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all routes of a particular type for a direction of travel
                V3DirectionsResponse result = apiInstance.DirectionsForDirectionAndType(directionId, routeType, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForDirectionAndType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DirectionsForDirectionAndTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all routes of a particular type for a direction of travel
    ApiResponse<V3DirectionsResponse> response = apiInstance.DirectionsForDirectionAndTypeWithHttpInfo(directionId, routeType, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectionsApi.DirectionsForDirectionAndTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **directionId** | **int** | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All routes of the specified route type that travel in the specified direction. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="directionsforroute"></a>
# **DirectionsForRoute**
> V3DirectionsResponse DirectionsForRoute (int routeId, string? token = null, string? devid = null, string? signature = null)

View directions that a route travels in

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class DirectionsForRouteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new DirectionsApi(config);
            var routeId = 56;  // int | Identifier of route; values returned by Routes API - v3/routes
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View directions that a route travels in
                V3DirectionsResponse result = apiInstance.DirectionsForRoute(routeId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForRoute: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DirectionsForRouteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View directions that a route travels in
    ApiResponse<V3DirectionsResponse> response = apiInstance.DirectionsForRouteWithHttpInfo(routeId, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectionsApi.DirectionsForRouteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeId** | **int** | Identifier of route; values returned by Routes API - v3/routes |  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The directions that a specified route travels in. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

