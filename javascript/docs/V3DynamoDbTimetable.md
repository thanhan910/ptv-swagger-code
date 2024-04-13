# PtvTimetableApiVersion3.V3DynamoDbTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** | Name of corresponding table in DynamoDB. | [optional] 
**parserVersion** | **Number** | Parser verison | [optional] 
**parserMappingVersion** | **String** | Diva Mapping Version used to load Parser into DynamoDB | [optional] 
**ptVersion** | **Number** | PT version | [optional] 
**ptMappingVersion** | **String** | Diva Mapping Version used to load PT into DynamoDB | [optional] 
**transportType** | **Number** | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) | [optional] 
**applicableLocalDate** | **String** | Formated date string of applicable date | [optional] 
**exists** | **Boolean** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. | [optional] 

<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum

* `_0` (value: `0`)
* `_1` (value: `1`)
* `_2` (value: `2`)
* `_3` (value: `3`)
* `_4` (value: `4`)

