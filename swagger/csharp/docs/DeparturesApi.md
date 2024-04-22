# IO.Swagger.Api.DeparturesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeparturesGetForStop**](DeparturesApi.md#departuresgetforstop) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id} | View departures for all routes from a stop
[**DeparturesGetForStopAndRoute**](DeparturesApi.md#departuresgetforstopandroute) | **GET** /v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id} | View departures for a specific route from a stop

<a name="departuresgetforstop"></a>
# **DeparturesGetForStop**
> V3DeparturesResponse DeparturesGetForStop (int? routeType, int? stopId, List<int?> platformNumbers = null, int? directionId = null, bool? gtfs = null, DateTime? dateUtc = null, int? maxResults = null, bool? includeCancelled = null, bool? lookBackwards = null, List<string> expand = null, bool? includeGeopath = null, string token = null, string devid = null, string signature = null)

View departures for all routes from a stop

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeparturesGetForStopExample
    {
        public void main()
        {
            var apiInstance = new DeparturesApi();
            var routeType = 56;  // int? | Number identifying transport mode; values returned via RouteTypes API
            var stopId = 56;  // int? | Identifier of stop; values returned by Stops API
            var platformNumbers = new List<int?>(); // List<int?> | Filter by platform number at stop (optional) 
            var directionId = 56;  // int? | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional) 
            var gtfs = true;  // bool? | Indicates that stop_id parameter will accept \"GTFS stop_id\" data (optional) 
            var dateUtc = 2013-10-20T19:20:30+01:00;  // DateTime? | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) (optional) 
            var maxResults = 56;  // int? | Maximum number of results returned (optional) 
            var includeCancelled = true;  // bool? | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only (optional) 
            var lookBackwards = true;  // bool? | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. (optional) 
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional) 
            var includeGeopath = true;  // bool? | Indicates if the route geopath should be returned (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View departures for all routes from a stop
                V3DeparturesResponse result = apiInstance.DeparturesGetForStop(routeType, stopId, platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeparturesApi.DeparturesGetForStop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **int?**| Number identifying transport mode; values returned via RouteTypes API | 
 **stopId** | **int?**| Identifier of stop; values returned by Stops API | 
 **platformNumbers** | [**List&lt;int?&gt;**](int?.md)| Filter by platform number at stop | [optional] 
 **directionId** | **int?**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
 **gtfs** | **bool?**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
 **dateUtc** | **DateTime?**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
 **maxResults** | **int?**| Maximum number of results returned | [optional] 
 **includeCancelled** | **bool?**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
 **lookBackwards** | **bool?**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
 **expand** | [**List&lt;string&gt;**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
 **includeGeopath** | **bool?**| Indicates if the route geopath should be returned | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="departuresgetforstopandroute"></a>
# **DeparturesGetForStopAndRoute**
> V3DeparturesResponse DeparturesGetForStopAndRoute (int? routeType, int? stopId, string routeId, int? directionId = null, bool? gtfs = null, DateTime? dateUtc = null, int? maxResults = null, bool? includeCancelled = null, bool? lookBackwards = null, List<string> expand = null, bool? includeGeopath = null, string token = null, string devid = null, string signature = null)

View departures for a specific route from a stop

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeparturesGetForStopAndRouteExample
    {
        public void main()
        {
            var apiInstance = new DeparturesApi();
            var routeType = 56;  // int? | Number identifying transport mode; values returned via RouteTypes API
            var stopId = 56;  // int? | Identifier of stop; values returned by Stops API
            var routeId = routeId_example;  // string | Identifier of route; values returned by Routes API - v3/routes
            var directionId = 56;  // int? | Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} (optional) 
            var gtfs = true;  // bool? | Indicates that stop_id parameter will accept \"GTFS stop_id\" data (optional) 
            var dateUtc = 2013-10-20T19:20:30+01:00;  // DateTime? | Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) (optional) 
            var maxResults = 56;  // int? | Maximum number of results returned (optional) 
            var includeCancelled = true;  // bool? | Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only (optional) 
            var lookBackwards = true;  // bool? | Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. (optional) 
            var expand = new List<string>(); // List<string> | List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. (optional) 
            var includeGeopath = true;  // bool? | Indicates if the route geopath should be returned (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View departures for a specific route from a stop
                V3DeparturesResponse result = apiInstance.DeparturesGetForStopAndRoute(routeType, stopId, routeId, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeparturesApi.DeparturesGetForStopAndRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeType** | **int?**| Number identifying transport mode; values returned via RouteTypes API | 
 **stopId** | **int?**| Identifier of stop; values returned by Stops API | 
 **routeId** | **string**| Identifier of route; values returned by Routes API - v3/routes | 
 **directionId** | **int?**| Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} | [optional] 
 **gtfs** | **bool?**| Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data | [optional] 
 **dateUtc** | **DateTime?**| Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) | [optional] 
 **maxResults** | **int?**| Maximum number of results returned | [optional] 
 **includeCancelled** | **bool?**| Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only | [optional] 
 **lookBackwards** | **bool?**| Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. | [optional] 
 **expand** | [**List&lt;string&gt;**](string.md)| List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. | [optional] 
 **includeGeopath** | **bool?**| Indicates if the route geopath should be returned | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3DeparturesResponse**](V3DeparturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
