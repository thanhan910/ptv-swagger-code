# IO.Swagger.Model.V3StopDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisruptionIds** | **List&lt;long?&gt;** | Disruption information identifier(s) | [optional] 
**StationType** | **string** | Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train | [optional] 
**StationDescription** | **string** | The definition applicable to the station_type; returns null for V/Line train | [optional] 
**RouteType** | **int?** | Transport mode identifier | [optional] 
**StopLocation** | [**V3StopLocation**](V3StopLocation.md) |  | [optional] 
**StopAmenities** | [**V3StopAmenityDetails**](V3StopAmenityDetails.md) |  | [optional] 
**StopAccessibility** | [**V3StopAccessibility**](V3StopAccessibility.md) |  | [optional] 
**StopStaffing** | [**V3StopStaffing**](V3StopStaffing.md) |  | [optional] 
**Routes** | **List&lt;Object&gt;** | Routes travelling through the stop | [optional] 
**StopId** | **int?** | Stop identifier | [optional] 
**StopName** | **string** | Name of stop | [optional] 
**StopLandmark** | **string** | Landmark in proximity of stop | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

