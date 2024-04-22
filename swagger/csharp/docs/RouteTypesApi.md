# IO.Swagger.Api.RouteTypesApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RouteTypesGetRouteTypes**](RouteTypesApi.md#routetypesgetroutetypes) | **GET** /v3/route_types | View all route types and their names


<a name="routetypesgetroutetypes"></a>
# **RouteTypesGetRouteTypes**
> V3RouteTypesResponse RouteTypesGetRouteTypes (string token = null, string devid = null, string signature = null)

View all route types and their names

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RouteTypesGetRouteTypesExample
    {
        public void main()
        {
            var apiInstance = new RouteTypesApi();
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // View all route types and their names
                V3RouteTypesResponse result = apiInstance.RouteTypesGetRouteTypes(token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling RouteTypesApi.RouteTypesGetRouteTypes: " + e.Message );
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

[**V3RouteTypesResponse**](V3RouteTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

