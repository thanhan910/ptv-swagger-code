# Ptv.Api.Client.Api.RoutesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**RoutesOneOrMoreRoutes**](RoutesApi.md#routesoneormoreroutes) | **GET** /v3/routes | View route names and numbers for all routes |
| [**RoutesRouteFromId**](RoutesApi.md#routesroutefromid) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID |

<a id="routesoneormoreroutes"></a>
# **RoutesOneOrMoreRoutes**
> V3RouteResponse RoutesOneOrMoreRoutes (List<int>? routeTypes = null, string? routeName = null, string? token = null, string? devid = null, string? signature = null)

View route names and numbers for all routes

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RoutesOneOrMoreRoutesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RoutesApi(config);
            var routeTypes = new List<int>?(); // List<int>? | Filter by route_type; values returned via RouteTypes API (optional) 
            var routeName = "routeName_example";  // string? | Filter by name  of route (accepts partial route name matches) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View route names and numbers for all routes
                V3RouteResponse result = apiInstance.RoutesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoutesApi.RoutesOneOrMoreRoutes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RoutesOneOrMoreRoutesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View route names and numbers for all routes
    ApiResponse<V3RouteResponse> response = apiInstance.RoutesOneOrMoreRoutesWithHttpInfo(routeTypes, routeName, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoutesApi.RoutesOneOrMoreRoutesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeTypes** | [**List&lt;int&gt;?**](int.md) | Filter by route_type; values returned via RouteTypes API | [optional]  |
| **routeName** | **string?** | Filter by name  of route (accepts partial route name matches) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Route names and numbers for all routes of all route types. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="routesroutefromid"></a>
# **RoutesRouteFromId**
> V3RouteResponse RoutesRouteFromId (int routeId, bool? includeGeopath = null, DateTime? geopathUtc = null, string? token = null, string? devid = null, string? signature = null)

View route name and number for specific route ID

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RoutesRouteFromIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RoutesApi(config);
            var routeId = 56;  // int | Identifier of route; values returned by Departures, Directions and Disruptions APIs
            var includeGeopath = true;  // bool? | Indicates kif geopath data will be returned (default = false) (optional) 
            var geopathUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Filter geopaths by date (ISO 8601 UTC format) (default = current date) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View route name and number for specific route ID
                V3RouteResponse result = apiInstance.RoutesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RoutesApi.RoutesRouteFromId: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RoutesRouteFromIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View route name and number for specific route ID
    ApiResponse<V3RouteResponse> response = apiInstance.RoutesRouteFromIdWithHttpInfo(routeId, includeGeopath, geopathUtc, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RoutesApi.RoutesRouteFromIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeId** | **int** | Identifier of route; values returned by Departures, Directions and Disruptions APIs |  |
| **includeGeopath** | **bool?** | Indicates kif geopath data will be returned (default &#x3D; false) | [optional]  |
| **geopathUtc** | **DateTime?** | Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The route name and number for the specified route ID. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

