# V3VehiclePosition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **Double** | Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs. |  [optional]
**longitude** | **Double** | Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs. |  [optional]
**easting** | **Double** | CIS - Metro Train Vehicle Location Easting coordinate |  [optional]
**northing** | **Double** | CIS - Metro Train Vehicle Location Northing coordinate |  [optional]
**direction** | **String** | CIS - Metro Train Vehicle Location Direction |  [optional]
**bearing** | **Double** | Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs. |  [optional]
**supplier** | **String** | Supplier of vehicle position data. |  [optional]
**datetimeUtc** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time that the vehicle position data was supplied. |  [optional]
**expiryTime** | [**OffsetDateTime**](OffsetDateTime.md) | CIS - Metro Train Vehicle Location data expiry time |  [optional]
