# Ptv.Api.Client.Model.V3SearchParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RouteTypes** | **List&lt;V3SearchParameters.RouteTypesEnum&gt;** | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] 
**Latitude** | **float** | Filter by geographic coordinate of latitude | [optional] 
**Longitude** | **float** | Filter by geographic coordinate of longitude | [optional] 
**MaxDistance** | **float** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional] 
**IncludeAddresses** | **bool** | Placeholder for future development; currently unavailable | [optional] 
**IncludeOutlets** | **bool** | Indicates if outlets will be returned in response (default &#x3D; true) | [optional] 
**MatchStopBySuburb** | **bool** | Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional] 
**MatchRouteBySuburb** | **bool** | Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional] 
**MatchStopByGtfsStopId** | **bool** | Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

