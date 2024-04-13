# IO.Swagger.Api.RoutesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RoutesOneOrMoreRoutes**](RoutesApi.md#routesoneormoreroutes) | **GET** /v3/routes | View route names and numbers for all routes
[**RoutesRouteFromId**](RoutesApi.md#routesroutefromid) | **GET** /v3/routes/{route_id} | View route name and number for specific route ID

<a name="routesoneormoreroutes"></a>
# **RoutesOneOrMoreRoutes**
> V3RouteResponse RoutesOneOrMoreRoutes (List<int?> routeTypes, string routeName, string token, string devid, string signature)

View route names and numbers for all routes

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RoutesOneOrMoreRoutesExample
    {
        public void main()
        {

            var apiInstance = new RoutesApi();
            var routeTypes = new List<int?>(); // List<int?> | Filter by route_type; values returned via RouteTypes API (optional) 
            var routeName = routeName_example;  // string | Filter by name  of route (accepts partial route name matches) (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View route names and numbers for all routes
                V3RouteResponse result = apiInstance.RoutesOneOrMoreRoutes(routeTypes, routeName, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.RoutesOneOrMoreRoutes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeTypes** | [**List<int?>**](int?.md)| Filter by route_type; values returned via RouteTypes API | [optional] 
 **routeName** | **string**| Filter by name  of route (accepts partial route name matches) | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="routesroutefromid"></a>
# **RoutesRouteFromId**
> V3RouteResponse RoutesRouteFromId (int? routeId, bool? includeGeopath, DateTime? geopathUtc, string token, string devid, string signature)

View route name and number for specific route ID

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RoutesRouteFromIdExample
    {
        public void main()
        {

            var apiInstance = new RoutesApi();
            var routeId = 56;  // int? | Identifier of route; values returned by Departures, Directions and Disruptions APIs
            var includeGeopath = true;  // bool? | Indicates kif geopath data will be returned (default = false) (optional) 
            var geopathUtc = 2013-10-20T19:20:30+01:00;  // DateTime? | Filter geopaths by date (ISO 8601 UTC format) (default = current date) (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View route name and number for specific route ID
                V3RouteResponse result = apiInstance.RoutesRouteFromId(routeId, includeGeopath, geopathUtc, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RoutesApi.RoutesRouteFromId: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | **int?**| Identifier of route; values returned by Departures, Directions and Disruptions APIs | 
 **includeGeopath** | **bool?**| Indicates kif geopath data will be returned (default &#x3D; false) | [optional] 
 **geopathUtc** | **DateTime?**| Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3RouteResponse**](V3RouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

