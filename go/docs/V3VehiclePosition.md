# V3VehiclePosition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latitude** | **float64** | Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. | [optional] [default to null]
**Longitude** | **float64** | Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. | [optional] [default to null]
**Easting** | **float64** | CIS - Metro Train Vehicle Location Easting coordinate | [optional] [default to null]
**Northing** | **float64** | CIS - Metro Train Vehicle Location Northing coordinate | [optional] [default to null]
**Direction** | **string** | CIS - Metro Train Vehicle Location Direction | [optional] [default to null]
**Bearing** | **float64** | Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. | [optional] [default to null]
**Supplier** | **string** | Supplier of vehicle position data. | [optional] [default to null]
**DatetimeUtc** | [**time.Time**](time.Time.md) | Date and time that the vehicle position data was supplied. | [optional] [default to null]
**ExpiryTime** | [**time.Time**](time.Time.md) | CIS - Metro Train Vehicle Location data expiry time | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

