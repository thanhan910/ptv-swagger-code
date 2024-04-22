# Ptv.Api.Client.Api.StopsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**StopsStopDetails**](StopsApi.md#stopsstopdetails) | **GET** /v3/stops/{stop_id}/route_type/{route_type} | View facilities at a specific stop (Metro and V/Line stations only) |
| [**StopsStopsByGeolocation**](StopsApi.md#stopsstopsbygeolocation) | **GET** /v3/stops/location/{latitude},{longitude} | View all stops near a specific location |
| [**StopsStopsForRoute**](StopsApi.md#stopsstopsforroute) | **GET** /v3/stops/route/{route_id}/route_type/{route_type} | View all stops on a specific route |

<a id="stopsstopdetails"></a>
# **StopsStopDetails**
> V3StopResponse StopsStopDetails (int stopId, int routeType, bool? stopLocation = null, bool? stopAmenities = null, bool? stopAccessibility = null, bool? stopContact = null, bool? stopTicket = null, bool? gtfs = null, bool? stopStaffing = null, bool? stopDisruptions = null, string? token = null, string? devid = null, string? signature = null)

View facilities at a specific stop (Metro and V/Line stations only)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class StopsStopDetailsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new StopsApi(config);
            var stopId = 56;  // int | Identifier of stop; values returned by Stops API
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var stopLocation = true;  // bool? | Indicates if stop location information will be returned (default = false) (optional) 
            var stopAmenities = true;  // bool? | Indicates if stop amenity information will be returned (default = false) (optional) 
            var stopAccessibility = true;  // bool? | Indicates if stop accessibility information will be returned (default = false) (optional) 
            var stopContact = true;  // bool? | Indicates if stop contact information will be returned (default = false) (optional) 
            var stopTicket = true;  // bool? | Indicates if stop ticket information will be returned (default = false) (optional) 
            var gtfs = true;  // bool? | Incdicates whether the stop_id is a GTFS ID or not (optional) 
            var stopStaffing = true;  // bool? | Indicates if stop staffing information will be returned (default = false) (optional) 
            var stopDisruptions = true;  // bool? | Indicates if stop disruption information will be returned (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View facilities at a specific stop (Metro and V/Line stations only)
                V3StopResponse result = apiInstance.StopsStopDetails(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StopsApi.StopsStopDetails: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StopsStopDetailsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View facilities at a specific stop (Metro and V/Line stations only)
    ApiResponse<V3StopResponse> response = apiInstance.StopsStopDetailsWithHttpInfo(stopId, routeType, stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StopsApi.StopsStopDetailsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **stopId** | **int** | Identifier of stop; values returned by Stops API |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **stopLocation** | **bool?** | Indicates if stop location information will be returned (default &#x3D; false) | [optional]  |
| **stopAmenities** | **bool?** | Indicates if stop amenity information will be returned (default &#x3D; false) | [optional]  |
| **stopAccessibility** | **bool?** | Indicates if stop accessibility information will be returned (default &#x3D; false) | [optional]  |
| **stopContact** | **bool?** | Indicates if stop contact information will be returned (default &#x3D; false) | [optional]  |
| **stopTicket** | **bool?** | Indicates if stop ticket information will be returned (default &#x3D; false) | [optional]  |
| **gtfs** | **bool?** | Incdicates whether the stop_id is a GTFS ID or not | [optional]  |
| **stopStaffing** | **bool?** | Indicates if stop staffing information will be returned (default &#x3D; false) | [optional]  |
| **stopDisruptions** | **bool?** | Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3StopResponse**](V3StopResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stop location, amenity and accessibility facility information for the specified stop (metropolitan and V/Line stations only). |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="stopsstopsbygeolocation"></a>
# **StopsStopsByGeolocation**
> V3StopsByDistanceResponse StopsStopsByGeolocation (float latitude, float longitude, List<int>? routeTypes = null, int? maxResults = null, double? maxDistance = null, bool? stopDisruptions = null, string? token = null, string? devid = null, string? signature = null)

View all stops near a specific location

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class StopsStopsByGeolocationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new StopsApi(config);
            var latitude = 3.4F;  // float | Geographic coordinate of latitude
            var longitude = 3.4F;  // float | Geographic coordinate of longitude
            var routeTypes = new List<int>?(); // List<int>? | Filter by route_type; values returned via RouteTypes API (optional) 
            var maxResults = 56;  // int? | Maximum number of results returned (default = 30) (optional) 
            var maxDistance = 1.2D;  // double? | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) (optional) 
            var stopDisruptions = true;  // bool? | Indicates if stop disruption information will be returned (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all stops near a specific location
                V3StopsByDistanceResponse result = apiInstance.StopsStopsByGeolocation(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StopsApi.StopsStopsByGeolocation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StopsStopsByGeolocationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all stops near a specific location
    ApiResponse<V3StopsByDistanceResponse> response = apiInstance.StopsStopsByGeolocationWithHttpInfo(latitude, longitude, routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StopsApi.StopsStopsByGeolocationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **latitude** | **float** | Geographic coordinate of latitude |  |
| **longitude** | **float** | Geographic coordinate of longitude |  |
| **routeTypes** | [**List&lt;int&gt;?**](int.md) | Filter by route_type; values returned via RouteTypes API | [optional]  |
| **maxResults** | **int?** | Maximum number of results returned (default &#x3D; 30) | [optional]  |
| **maxDistance** | **double?** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional]  |
| **stopDisruptions** | **bool?** | Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3StopsByDistanceResponse**](V3StopsByDistanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All stops near the specified location. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="stopsstopsforroute"></a>
# **StopsStopsForRoute**
> V3StopsOnRouteResponse StopsStopsForRoute (int routeId, int routeType, int? directionId = null, bool? stopDisruptions = null, bool? includeGeopath = null, DateTime? geopathUtc = null, string? token = null, string? devid = null, string? signature = null)

View all stops on a specific route

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class StopsStopsForRouteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new StopsApi(config);
            var routeId = 56;  // int | Identifier of route; values returned by Routes API - v3/routes
            var routeType = 0;  // int | Number identifying transport mode; values returned via RouteTypes API
            var directionId = 56;  // int? | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. (optional) 
            var stopDisruptions = true;  // bool? | Indicates if stop disruption information will be returned (default = false) (optional) 
            var includeGeopath = true;  // bool? | Indicates if geopath data will be returned (default = false) (optional) 
            var geopathUtc = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime? | Filter geopaths by date (ISO 8601 UTC format) (default = current date) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View all stops on a specific route
                V3StopsOnRouteResponse result = apiInstance.StopsStopsForRoute(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling StopsApi.StopsStopsForRoute: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the StopsStopsForRouteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View all stops on a specific route
    ApiResponse<V3StopsOnRouteResponse> response = apiInstance.StopsStopsForRouteWithHttpInfo(routeId, routeType, directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling StopsApi.StopsStopsForRouteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **routeId** | **int** | Identifier of route; values returned by Routes API - v3/routes |  |
| **routeType** | **int** | Number identifying transport mode; values returned via RouteTypes API |  |
| **directionId** | **int?** | An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response. | [optional]  |
| **stopDisruptions** | **bool?** | Indicates if stop disruption information will be returned (default &#x3D; false) | [optional]  |
| **includeGeopath** | **bool?** | Indicates if geopath data will be returned (default &#x3D; false) | [optional]  |
| **geopathUtc** | **DateTime?** | Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3StopsOnRouteResponse**](V3StopsOnRouteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All stops on the specified route. |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

