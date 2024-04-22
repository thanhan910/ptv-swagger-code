# Ptv.Api.Client.Model.V3VehiclePosition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latitude** | **double** | Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. | [optional] 
**Longitude** | **double** | Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. | [optional] 
**Easting** | **double** | CIS - Metro Train Vehicle Location Easting coordinate | [optional] 
**Northing** | **double** | CIS - Metro Train Vehicle Location Northing coordinate | [optional] 
**Direction** | **string** | CIS - Metro Train Vehicle Location Direction | [optional] 
**Bearing** | **double** | Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. | [optional] 
**Supplier** | **string** | Supplier of vehicle position data. | [optional] 
**DatetimeUtc** | **DateTime** | Date and time that the vehicle position data was supplied. | [optional] 
**ExpiryTime** | **DateTime** | CIS - Metro Train Vehicle Location data expiry time | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

