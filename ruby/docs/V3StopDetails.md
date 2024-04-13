# SwaggerClient::V3StopDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_ids** | **Array&lt;Integer&gt;** | Disruption information identifier(s) | [optional] 
**station_type** | **String** | Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train | [optional] 
**station_description** | **String** | The definition applicable to the station_type; returns null for V/Line train | [optional] 
**route_type** | **Integer** | Transport mode identifier | [optional] 
**stop_location** | [**V3StopLocation**](V3StopLocation.md) |  | [optional] 
**stop_amenities** | [**V3StopAmenityDetails**](V3StopAmenityDetails.md) |  | [optional] 
**stop_accessibility** | [**V3StopAccessibility**](V3StopAccessibility.md) |  | [optional] 
**stop_staffing** | [**V3StopStaffing**](V3StopStaffing.md) |  | [optional] 
**routes** | **Array&lt;Object&gt;** | Routes travelling through the stop | [optional] 
**stop_id** | **Integer** | Stop identifier | [optional] 
**stop_name** | **String** | Name of stop | [optional] 
**stop_landmark** | **String** | Landmark in proximity of stop | [optional] 

