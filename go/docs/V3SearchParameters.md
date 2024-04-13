# V3SearchParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RouteTypes** | **[]int32** | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] [default to null]
**Latitude** | **float32** | Filter by geographic coordinate of latitude | [optional] [default to null]
**Longitude** | **float32** | Filter by geographic coordinate of longitude | [optional] [default to null]
**MaxDistance** | **float32** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional] [default to null]
**IncludeAddresses** | **bool** | Placeholder for future development; currently unavailable | [optional] [default to null]
**IncludeOutlets** | **bool** | Indicates if outlets will be returned in response (default &#x3D; true) | [optional] [default to null]
**MatchStopBySuburb** | **bool** | Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional] [default to null]
**MatchRouteBySuburb** | **bool** | Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional] [default to null]
**MatchStopByGtfsStopId** | **bool** | Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

