# IO.Swagger.Api.DirectionsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DirectionsForDirection**](DirectionsApi.md#directionsfordirection) | **GET** /v3/directions/{direction_id} | View all routes for a direction of travel
[**DirectionsForDirectionAndType**](DirectionsApi.md#directionsfordirectionandtype) | **GET** /v3/directions/{direction_id}/route_type/{route_type} | View all routes of a particular type for a direction of travel
[**DirectionsForRoute**](DirectionsApi.md#directionsforroute) | **GET** /v3/directions/route/{route_id} | View directions that a route travels in

<a name="directionsfordirection"></a>
# **DirectionsForDirection**
> V3DirectionsResponse DirectionsForDirection (int? directionId, string token, string devid, string signature)

View all routes for a direction of travel

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DirectionsForDirectionExample
    {
        public void main()
        {

            var apiInstance = new DirectionsApi();
            var directionId = 56;  // int? | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all routes for a direction of travel
                V3DirectionsResponse result = apiInstance.DirectionsForDirection(directionId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForDirection: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **int?**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="directionsfordirectionandtype"></a>
# **DirectionsForDirectionAndType**
> V3DirectionsResponse DirectionsForDirectionAndType (int? directionId, int? routeType, string token, string devid, string signature)

View all routes of a particular type for a direction of travel

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DirectionsForDirectionAndTypeExample
    {
        public void main()
        {

            var apiInstance = new DirectionsApi();
            var directionId = 56;  // int? | Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
            var routeType = 56;  // int? | Number identifying transport mode; values returned via RouteTypes API
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all routes of a particular type for a direction of travel
                V3DirectionsResponse result = apiInstance.DirectionsForDirectionAndType(directionId, routeType, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForDirectionAndType: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directionId** | **int?**| Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | 
 **routeType** | **int?**| Number identifying transport mode; values returned via RouteTypes API | 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="directionsforroute"></a>
# **DirectionsForRoute**
> V3DirectionsResponse DirectionsForRoute (int? routeId, string token, string devid, string signature)

View directions that a route travels in

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DirectionsForRouteExample
    {
        public void main()
        {

            var apiInstance = new DirectionsApi();
            var routeId = 56;  // int? | Identifier of route; values returned by Routes API - v3/routes
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View directions that a route travels in
                V3DirectionsResponse result = apiInstance.DirectionsForRoute(routeId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsApi.DirectionsForRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int?**| Identifier of route; values returned by Routes API - v3/routes | 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DirectionsResponse**](V3DirectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

