# V3SearchParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**routeTypes** | [**List&lt;RouteTypesEnum&gt;**](#List&lt;RouteTypesEnum&gt;) | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) |  [optional]
**latitude** | **Float** | Filter by geographic coordinate of latitude |  [optional]
**longitude** | **Float** | Filter by geographic coordinate of longitude |  [optional]
**maxDistance** | **Float** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters |  [optional]
**includeAddresses** | **Boolean** | Placeholder for future development; currently unavailable |  [optional]
**includeOutlets** | **Boolean** | Indicates if outlets will be returned in response (default &#x3D; true) |  [optional]
**matchStopBySuburb** | **Boolean** | Indicates whether to find stops by suburbs in the search term (default &#x3D; true) |  [optional]
**matchRouteBySuburb** | **Boolean** | Indicates whether to find routes by suburbs in the search term (default &#x3D; true) |  [optional]
**matchStopByGtfsStopId** | **Boolean** | Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) |  [optional]

<a name="List<RouteTypesEnum>"></a>
## Enum: List&lt;RouteTypesEnum&gt;
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
