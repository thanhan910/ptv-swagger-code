# IO.Swagger.Api.OutletsApi

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OutletsGetAllOutlets**](OutletsApi.md#outletsgetalloutlets) | **GET** /v3/outlets | List all ticket outlets
[**OutletsGetOutletsByGeolocation**](OutletsApi.md#outletsgetoutletsbygeolocation) | **GET** /v3/outlets/location/{latitude},{longitude} | List ticket outlets near a specific location

<a name="outletsgetalloutlets"></a>
# **OutletsGetAllOutlets**
> V3OutletResponse OutletsGetAllOutlets (int? maxResults, string token, string devid, string signature)

List all ticket outlets

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class OutletsGetAllOutletsExample
    {
        public void main()
        {

            var apiInstance = new OutletsApi();
            var maxResults = 56;  // int? | Maximum number of results returned (default = 30) (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // List all ticket outlets
                V3OutletResponse result = apiInstance.OutletsGetAllOutlets(maxResults, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OutletsApi.OutletsGetAllOutlets: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **int?**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3OutletResponse**](V3OutletResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="outletsgetoutletsbygeolocation"></a>
# **OutletsGetOutletsByGeolocation**
> V3OutletGeolocationResponse OutletsGetOutletsByGeolocation (float? latitude, float? longitude, double? maxDistance, int? maxResults, string token, string devid, string signature)

List ticket outlets near a specific location

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class OutletsGetOutletsByGeolocationExample
    {
        public void main()
        {

            var apiInstance = new OutletsApi();
            var latitude = 3.4;  // float? | Geographic coordinate of latitude
            var longitude = 3.4;  // float? | Geographic coordinate of longitude
            var maxDistance = 1.2;  // double? | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) (optional) 
            var maxResults = 56;  // int? | Maximum number of results returned (default = 30) (optional) 
            var token = token_example;  // string | Please ignore (optional) 
            var devid = devid_example;  // string | Your developer id (optional) 
            var signature = signature_example;  // string | Authentication signature for request (optional) 

            try
            {
                // List ticket outlets near a specific location
                V3OutletGeolocationResponse result = apiInstance.OutletsGetOutletsByGeolocation(latitude, longitude, maxDistance, maxResults, token, devid, signature);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OutletsApi.OutletsGetOutletsByGeolocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **float?**| Geographic coordinate of latitude | 
 **longitude** | **float?**| Geographic coordinate of longitude | 
 **maxDistance** | **double?**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) | [optional] 
 **maxResults** | **int?**| Maximum number of results returned (default &#x3D; 30) | [optional] 
 **token** | **string**| Please ignore | [optional] 
 **devid** | **string**| Your developer id | [optional] 
 **signature** | **string**| Authentication signature for request | [optional] 

### Return type

[**V3OutletGeolocationResponse**](V3OutletGeolocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

