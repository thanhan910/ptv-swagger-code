# SwaggerClient::V3SearchParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**route_types** | **Array&lt;Integer&gt;** | Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) | [optional] 
**latitude** | **Float** | Filter by geographic coordinate of latitude | [optional] 
**longitude** | **Float** | Filter by geographic coordinate of longitude | [optional] 
**max_distance** | **Float** | Filter by maximum distance (in metres) from location specified via latitude and longitude parameters | [optional] 
**include_addresses** | **BOOLEAN** | Placeholder for future development; currently unavailable | [optional] 
**include_outlets** | **BOOLEAN** | Indicates if outlets will be returned in response (default &#x3D; true) | [optional] 
**match_stop_by_suburb** | **BOOLEAN** | Indicates whether to find stops by suburbs in the search term (default &#x3D; true) | [optional] 
**match_route_by_suburb** | **BOOLEAN** | Indicates whether to find routes by suburbs in the search term (default &#x3D; true) | [optional] 
**match_stop_by_gtfs_stop_id** | **BOOLEAN** | Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) | [optional] 

