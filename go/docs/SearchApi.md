# {{classname}}

All URIs are relative to *https://timetableapi.ptv.vic.gov.au/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchSearch**](SearchApi.md#SearchSearch) | **Get** /v3/search/{search_term} | View stops, routes and myki ticket outlets that match the search term

# **SearchSearch**
> V3SearchResult SearchSearch(ctx, searchTerm, optional)
View stops, routes and myki ticket outlets that match the search term

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **searchTerm** | **string**| Search text (note: if search text is numeric and/or less than 3 characters, the API will only return routes) | 
 **optional** | ***SearchApiSearchSearchOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a SearchApiSearchSearchOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **routeTypes** | [**optional.Interface of []int32**](int32.md)| Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | 
 **latitude** | **optional.Float32**| Filter by geographic coordinate of latitude | 
 **longitude** | **optional.Float32**| Filter by geographic coordinate of longitude | 
 **maxDistance** | **optional.Float32**| Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | 
 **includeAddresses** | **optional.Bool**| Placeholder for future development; currently unavailable | 
 **includeOutlets** | **optional.Bool**| Indicates if outlets will be returned in response (default &#x3D; true) | 
 **matchStopBySuburb** | **optional.Bool**| Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | 
 **matchRouteBySuburb** | **optional.Bool**| Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | 
 **matchStopByGtfsStopId** | **optional.Bool**| Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | 
 **token** | **optional.String**| Please ignore | 
 **devid** | **optional.String**| Your developer id | 
 **signature** | **optional.String**| Authentication signature for request | 

### Return type

[**V3SearchResult**](V3.SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

