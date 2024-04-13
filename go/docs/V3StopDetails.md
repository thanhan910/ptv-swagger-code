# V3StopDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisruptionIds** | **[]int64** | Disruption information identifier(s) | [optional] [default to null]
**StationType** | **string** | Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train | [optional] [default to null]
**StationDescription** | **string** | The definition applicable to the station_type; returns null for V/Line train | [optional] [default to null]
**RouteType** | **int32** | Transport mode identifier | [optional] [default to null]
**StopLocation** | [***V3StopLocation**](V3.StopLocation.md) |  | [optional] [default to null]
**StopAmenities** | [***V3StopAmenityDetails**](V3.StopAmenityDetails.md) |  | [optional] [default to null]
**StopAccessibility** | [***V3StopAccessibility**](V3.StopAccessibility.md) |  | [optional] [default to null]
**StopStaffing** | [***V3StopStaffing**](V3.StopStaffing.md) |  | [optional] [default to null]
**Routes** | [**[]interface{}**](interface{}.md) | Routes travelling through the stop | [optional] [default to null]
**StopId** | **int32** | Stop identifier | [optional] [default to null]
**StopName** | **string** | Name of stop | [optional] [default to null]
**StopLandmark** | **string** | Landmark in proximity of stop | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

