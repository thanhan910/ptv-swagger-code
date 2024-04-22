# V3VehiclePosition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **float** | Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. | [optional] 
**longitude** | **float** | Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. | [optional] 
**easting** | **float** | CIS - Metro Train Vehicle Location Easting coordinate | [optional] 
**northing** | **float** | CIS - Metro Train Vehicle Location Northing coordinate | [optional] 
**direction** | **str** | CIS - Metro Train Vehicle Location Direction | [optional] 
**bearing** | **float** | Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. | [optional] 
**supplier** | **str** | Supplier of vehicle position data. | [optional] 
**datetime_utc** | **datetime** | Date and time that the vehicle position data was supplied. | [optional] 
**expiry_time** | **datetime** | CIS - Metro Train Vehicle Location data expiry time | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


