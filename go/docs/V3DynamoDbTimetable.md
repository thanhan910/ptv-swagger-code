# V3DynamoDbTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TableName** | **string** | Name of corresponding table in DynamoDB. | [optional] [default to null]
**ParserVersion** | **int64** | Parser verison | [optional] [default to null]
**ParserMappingVersion** | **string** | Diva Mapping Version used to load Parser into DynamoDB | [optional] [default to null]
**PtVersion** | **int64** | PT version | [optional] [default to null]
**PtMappingVersion** | **string** | Diva Mapping Version used to load PT into DynamoDB | [optional] [default to null]
**TransportType** | **int32** | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) | [optional] [default to null]
**ApplicableLocalDate** | **string** | Formated date string of applicable date | [optional] [default to null]
**Exists** | **bool** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

