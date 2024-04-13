# SwaggerClient::V3VehiclePosition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **Float** | Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. | [optional] 
**longitude** | **Float** | Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. | [optional] 
**easting** | **Float** | CIS - Metro Train Vehicle Location Easting coordinate | [optional] 
**northing** | **Float** | CIS - Metro Train Vehicle Location Northing coordinate | [optional] 
**direction** | **String** | CIS - Metro Train Vehicle Location Direction | [optional] 
**bearing** | **Float** | Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. | [optional] 
**supplier** | **String** | Supplier of vehicle position data. | [optional] 
**datetime_utc** | **DateTime** | Date and time that the vehicle position data was supplied. | [optional] 
**expiry_time** | **DateTime** | CIS - Metro Train Vehicle Location data expiry time | [optional] 

