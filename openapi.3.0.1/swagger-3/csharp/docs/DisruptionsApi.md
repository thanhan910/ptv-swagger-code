# IO.Swagger.Api.DisruptionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DisruptionsGetAllDisruptions**](DisruptionsApi.md#disruptionsgetalldisruptions) | **GET** /v3/disruptions | View all disruptions for all route types
[**DisruptionsGetDisruptionById**](DisruptionsApi.md#disruptionsgetdisruptionbyid) | **GET** /v3/disruptions/{disruption_id} | View a specific disruption
[**DisruptionsGetDisruptionModes**](DisruptionsApi.md#disruptionsgetdisruptionmodes) | **GET** /v3/disruptions/modes | Get all disruption modes
[**DisruptionsGetDisruptionsByRoute**](DisruptionsApi.md#disruptionsgetdisruptionsbyroute) | **GET** /v3/disruptions/route/{route_id} | View all disruptions for a particular route
[**DisruptionsGetDisruptionsByRouteAndStop**](DisruptionsApi.md#disruptionsgetdisruptionsbyrouteandstop) | **GET** /v3/disruptions/route/{route_id}/stop/{stop_id} | View all disruptions for a particular route and stop
[**DisruptionsGetDisruptionsByStop**](DisruptionsApi.md#disruptionsgetdisruptionsbystop) | **GET** /v3/disruptions/stop/{stop_id} | View all disruptions for a particular stop

<a name="disruptionsgetalldisruptions"></a>
# **DisruptionsGetAllDisruptions**
> V3DisruptionsResponse DisruptionsGetAllDisruptions (List<int?> routeTypes = null, List<int?> disruptionModes = null, string disruptionStatus = null, string token = null, string devid = null, string signature = null)

View all disruptions for all route types

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetAllDisruptionsExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var routeTypes = new List<int?>(); // List<int?> | Filter by route_type; values returned via RouteTypes API (optional) 
            var disruptionModes = new List<int?>(); // List<int?> | Filter by disruption_mode; values returned via v3/disruptions/modes API (optional) 
            var disruptionStatus = disruptionStatus_example;  // string | Filter by status of disruption (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all disruptions for all route types
                V3DisruptionsResponse result = apiInstance.DisruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetAllDisruptions: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**List&lt;int?&gt;**](int?.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **disruptionModes** | [**List&lt;int?&gt;**](int?.md)| Filter by disruption_mode; values returned via v3/disruptions/modes API | [optional] 
 **disruptionStatus** | **string**| Filter by status of disruption | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="disruptionsgetdisruptionbyid"></a>
# **DisruptionsGetDisruptionById**
> V3DisruptionResponse DisruptionsGetDisruptionById (long? disruptionId, string token = null, string devid = null, string signature = null)

View a specific disruption

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetDisruptionByIdExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var disruptionId = 789;  // long? | Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View a specific disruption
                V3DisruptionResponse result = apiInstance.DisruptionsGetDisruptionById(disruptionId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetDisruptionById: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disruptionId** | **long?**| Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id} | 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionResponse**](V3DisruptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="disruptionsgetdisruptionmodes"></a>
# **DisruptionsGetDisruptionModes**
> V3DisruptionModesResponse DisruptionsGetDisruptionModes (string token = null, string devid = null, string signature = null)

Get all disruption modes

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetDisruptionModesExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // Get all disruption modes
                V3DisruptionModesResponse result = apiInstance.DisruptionsGetDisruptionModes(token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetDisruptionModes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionModesResponse**](V3DisruptionModesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="disruptionsgetdisruptionsbyroute"></a>
# **DisruptionsGetDisruptionsByRoute**
> V3DisruptionsResponse DisruptionsGetDisruptionsByRoute (int? routeId, string disruptionStatus = null, string token = null, string devid = null, string signature = null)

View all disruptions for a particular route

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetDisruptionsByRouteExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var routeId = 56;  // int? | Identifier of route; values returned by Routes API - v3/routes
            var disruptionStatus = disruptionStatus_example;  // string | Filter by status of disruption (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all disruptions for a particular route
                V3DisruptionsResponse result = apiInstance.DisruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetDisruptionsByRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int?**| Identifier of route; values returned by Routes API - v3/routes | 
 **disruptionStatus** | **string**| Filter by status of disruption | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="disruptionsgetdisruptionsbyrouteandstop"></a>
# **DisruptionsGetDisruptionsByRouteAndStop**
> V3DisruptionsResponse DisruptionsGetDisruptionsByRouteAndStop (int? routeId, int? stopId, string disruptionStatus = null, string token = null, string devid = null, string signature = null)

View all disruptions for a particular route and stop

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetDisruptionsByRouteAndStopExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var routeId = 56;  // int? | Identifier of route; values returned by Routes API - v3/routes
            var stopId = 56;  // int? | Identifier of stop; values returned by Stops API - v3/stops
            var disruptionStatus = disruptionStatus_example;  // string | Filter by status of disruption (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all disruptions for a particular route and stop
                V3DisruptionsResponse result = apiInstance.DisruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetDisruptionsByRouteAndStop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int?**| Identifier of route; values returned by Routes API - v3/routes | 
 **stopId** | **int?**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruptionStatus** | **string**| Filter by status of disruption | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="disruptionsgetdisruptionsbystop"></a>
# **DisruptionsGetDisruptionsByStop**
> V3DisruptionsResponse DisruptionsGetDisruptionsByStop (int? stopId, string disruptionStatus = null, string token = null, string devid = null, string signature = null)

View all disruptions for a particular stop

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DisruptionsGetDisruptionsByStopExample
    {
        public void main()
        {
            var apiInstance = new DisruptionsApi();
            var stopId = 56;  // int? | Identifier of stop; values returned by Stops API - v3/stops
            var disruptionStatus = disruptionStatus_example;  // string | Filter by status of disruption (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all disruptions for a particular stop
                V3DisruptionsResponse result = apiInstance.DisruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DisruptionsApi.DisruptionsGetDisruptionsByStop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stopId** | **int?**| Identifier of stop; values returned by Stops API - v3/stops | 
 **disruptionStatus** | **string**| Filter by status of disruption | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DisruptionsResponse**](V3DisruptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
