# Ptv.Api.Client.Api.SearchApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchSearch**](SearchApi.md#searchsearch) | **GET** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term |

<a id="searchsearch"></a>
# **SearchSearch**
> V3SearchResult SearchSearch (string searchTerm, List<int>? routeTypes = null, float? latitude = null, float? longitude = null, float? maxDistance = null, bool? includeAddresses = null, bool? includeOutlets = null, bool? matchStopBySuburb = null, bool? matchRouteBySuburb = null, bool? matchStopByGtfsStopId = null, string? token = null, string? devid = null, string? signature = null)

View stops, routes and myki ticket outlets that match the search term

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ptv.Api.Client.Api;
using Ptv.Api.Client.Client;
using Ptv.Api.Client.Model;

namespace Example
{
    public class SearchSearchExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://timetableapi.ptv.vic.gov.au";
            var apiInstance = new SearchApi(config);
            var searchTerm = "searchTerm_example";  // string | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes)
            var routeTypes = new List<int>?(); // List<int>? | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) (optional) 
            var latitude = 3.4F;  // float? | Filter by geographic coordinate of latitude (optional) 
            var longitude = 3.4F;  // float? | Filter by geographic coordinate of longitude (optional) 
            var maxDistance = 3.4F;  // float? | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (optional) 
            var includeAddresses = true;  // bool? | Placeholder for future development; currently unavailable (optional) 
            var includeOutlets = true;  // bool? | Indicates if outlets will be returned in response (default = true) (optional) 
            var matchStopBySuburb = true;  // bool? | Indicates whether to find stops by suburbs in the search term (default = true) (optional) 
            var matchRouteBySuburb = true;  // bool? | Indicates whether to find routes by suburbs in the search term (default = true) (optional) 
            var matchStopByGtfsStopId = true;  // bool? | Indicates whether to search for stops according to a metlink stop ID (default = false) (optional) 
            var token = "token_example";  // string? | Please ignore (optional) 
            var devid = "devid_example";  // string? | Your developer id (optional) 
            var signature = "signature_example";  // string? | Authentication signature for request (optional) 

            try
            {
                // View stops, routes and myki ticket outlets that match the search term
                V3SearchResult result = apiInstance.SearchSearch(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SearchApi.SearchSearch: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchSearchWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // View stops, routes and myki ticket outlets that match the search term
    ApiResponse<V3SearchResult> response = apiInstance.SearchSearchWithHttpInfo(searchTerm, routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SearchApi.SearchSearchWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **searchTerm** | **string** | Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) |  |
| **routeTypes** | [**List&lt;int&gt;?**](int.md) | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional]  |
| **latitude** | **float?** | Filter by geographic coordinate of latitude | [optional]  |
| **longitude** | **float?** | Filter by geographic coordinate of longitude | [optional]  |
| **maxDistance** | **float?** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional]  |
| **includeAddresses** | **bool?** | Placeholder for future development; currently unavailable | [optional]  |
| **includeOutlets** | **bool?** | Indicates if outlets will be returned in response (default &#x3D; true) | [optional]  |
| **matchStopBySuburb** | **bool?** | Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional]  |
| **matchRouteBySuburb** | **bool?** | Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional]  |
| **matchStopByGtfsStopId** | **bool?** | Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional]  |
| **token** | **string?** | Please ignore | [optional]  |
| **devid** | **string?** | Your developer id | [optional]  |
| **signature** | **string?** | Authentication signature for request | [optional]  |

### Return type

[**V3SearchResult**](V3SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default). |  -  |
| **400** | Invalid Request |  -  |
| **403** | Access Denied |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

