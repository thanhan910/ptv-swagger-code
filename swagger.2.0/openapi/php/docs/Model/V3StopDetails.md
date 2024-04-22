# # V3StopDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_ids** | **int[]** | Disruption information identifier(s) | [optional]
**station_type** | **string** | Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train | [optional]
**station_description** | **string** | The definition applicable to the station_type; returns null for V/Line train | [optional]
**route_type** | **int** | Transport mode identifier | [optional]
**stop_location** | [**\OpenAPI\Client\Model\V3StopLocation**](V3StopLocation.md) |  | [optional]
**stop_amenities** | [**\OpenAPI\Client\Model\V3StopAmenityDetails**](V3StopAmenityDetails.md) |  | [optional]
**stop_accessibility** | [**\OpenAPI\Client\Model\V3StopAccessibility**](V3StopAccessibility.md) |  | [optional]
**stop_staffing** | [**\OpenAPI\Client\Model\V3StopStaffing**](V3StopStaffing.md) |  | [optional]
**routes** | **object[]** | Routes travelling through the stop | [optional]
**stop_id** | **int** | Stop identifier | [optional]
**stop_name** | **string** | Name of stop | [optional]
**stop_landmark** | **string** | Landmark in proximity of stop | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
