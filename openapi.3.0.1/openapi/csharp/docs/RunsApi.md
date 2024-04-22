# Ptv.Api.Client.Api.RunsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**RunsForRoute**](RunsApi.md#runsforroute) | **GET** /v3/runs/route/{route_id} | View all trip/service runs for a specific route ID |
| [**RunsForRouteAndRouteType**](RunsApi.md#runsforrouteandroutetype) | **GET** /v3/runs/route/{route_id}/route_type/{route_type} | View all trip/service runs for a specific route ID and route type |
| [**RunsForRun**](RunsApi.md#runsforrun) | **GET** /v3/runs/{run_ref} | View all trip/service runs for a specific run_ref |
| [**RunsForRunAndRouteType**](RunsApi.md#runsforrunandroutetype) | **GET** /v3/runs/{run_ref}/route_type/{route_type} | View the trip/service run for a specific run_ref and route type |

<a id="runsforroute"></a>
# **RunsForRoute**
> V3RunsResponse RunsForRoute (int routeId, List<string>? expand = null, DateTime? dateUtc = null, string? token = null, string? devid = null, string? signature = null)

View all trip/service runs for a specific route ID

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RunsForRouteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RunsApi(config);
            var routeId = 56;  // int | Identifier of route; values returned by Routes API - v3/routes.
            var expand = new List<string>?(); // List<string>? | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. (optional) 
            var dateUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Date of the request. (optional - defaults to now) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all trip/service runs for a specific route ID
                V3RunsResponse result = apiInstance.RunsForRoute(routeId, expand, dateUtc, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RunsApi.RunsForRoute: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RunsForRouteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all trip/service runs for a specific route ID
    ApiResponse<V3RunsResponse> response = apiInstance.RunsForRouteWithHttpInfo(routeId, expand, dateUtc, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RunsApi.RunsForRouteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeId** | **int** | Identifier of route; values returned by Routes API - v3/routes. |  |
| **expand** | [**List&lt;string&gt;?**](string.md) | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. | [optional]  |
| **dateUtc** | **DateTime?** | Date of the request. (optional - defaults to now) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All trip/service run details for the specified route ID. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="runsforrouteandroutetype"></a>
# **RunsForRouteAndRouteType**
> V3RunsResponse RunsForRouteAndRouteType (int routeId, int routeType, List<string> expand, DateTime? dateUtc = null, string? token = null, string? devid = null, string? signature = null)

View all trip/service runs for a specific route ID and route type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RunsForRouteAndRouteTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RunsApi(config);
            var routeId = 56;  // int | Identifier of route; values returned by Routes API - v3/routes.
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All.
            var dateUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Date of the request. (optional - defaults to now) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all trip/service runs for a specific route ID and route type
                V3RunsResponse result = apiInstance.RunsForRouteAndRouteType(routeId, routeType, expand, dateUtc, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RunsApi.RunsForRouteAndRouteType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RunsForRouteAndRouteTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all trip/service runs for a specific route ID and route type
    ApiResponse<V3RunsResponse> response = apiInstance.RunsForRouteAndRouteTypeWithHttpInfo(routeId, routeType, expand, dateUtc, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RunsApi.RunsForRouteAndRouteTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeId** | **int** | Identifier of route; values returned by Routes API - v3/routes. |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **expand** | [**List&lt;string&gt;**](string.md) | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is All. |  |
| **dateUtc** | **DateTime?** | Date of the request. (optional - defaults to now) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All trip/service run details for the specified route ID and route type. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="runsforrun"></a>
# **RunsForRun**
> V3RunsResponse RunsForRun (string runRef, List<string> expand, DateTime? dateUtc = null, bool? includeGeopath = null, string? token = null, string? devid = null, string? signature = null)

View all trip/service runs for a specific run_ref

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RunsForRunExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RunsApi(config);
            var runRef = "runRef_example";  // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
            var dateUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Date of the request. (optional - defaults to now) (optional) 
            var includeGeopath = true;  // bool? | Indicates if geopath data will be returned (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all trip/service runs for a specific run_ref
                V3RunsResponse result = apiInstance.RunsForRun(runRef, expand, dateUtc, includeGeopath, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RunsApi.RunsForRun: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RunsForRunWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all trip/service runs for a specific run_ref
    ApiResponse<V3RunsResponse> response = apiInstance.RunsForRunWithHttpInfo(runRef, expand, dateUtc, includeGeopath, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RunsApi.RunsForRunWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runRef** | **string** | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |  |
| **expand** | [**List&lt;string&gt;**](string.md) | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. |  |
| **dateUtc** | **DateTime?** | Date of the request. (optional - defaults to now) | [optional]  |
| **includeGeopath** | **bool?** | Indicates if geopath data will be returned (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RunsResponse**](V3RunsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All trip/service run details for the specified run_ref. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="runsforrunandroutetype"></a>
# **RunsForRunAndRouteType**
> V3RunResponse RunsForRunAndRouteType (string runRef, int routeType, List<string> expand, DateTime? dateUtc = null, bool? includeGeopath = null, string? token = null, string? devid = null, string? signature = null)

View the trip/service run for a specific run_ref and route type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class RunsForRunAndRouteTypeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new RunsApi(config);
            var runRef = "runRef_example";  // string | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead.
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None.
            var dateUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Date of the request. (optional - defaults to now) (optional) 
            var includeGeopath = true;  // bool? | Indicates if geopath data will be returned (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View the trip/service run for a specific run_ref and route type
                V3RunResponse result = apiInstance.RunsForRunAndRouteType(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RunsApi.RunsForRunAndRouteType: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RunsForRunAndRouteTypeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View the trip/service run for a specific run_ref and route type
    ApiResponse<V3RunResponse> response = apiInstance.RunsForRunAndRouteTypeWithHttpInfo(runRef, routeType, expand, dateUtc, includeGeopath, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RunsApi.RunsForRunAndRouteTypeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **runRef** | **string** | The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **expand** | [**List&lt;string&gt;**](string.md) | List of objects to be returned in full (i.e. expanded) - options include: All, VehiclePosition, VehicleDescriptor, or None. Default is None. |  |
| **dateUtc** | **DateTime?** | Date of the request. (optional - defaults to now) | [optional]  |
| **includeGeopath** | **bool?** | Indicates if geopath data will be returned (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3RunResponse**](V3RunResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The trip/service run details for the run_ref and route type specified. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

