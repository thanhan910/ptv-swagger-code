# IO.Swagger.Model.V3DynamoDbTimetable
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TableName** | **string** | Name of corresponding table in DynamoDB. | [optional] 
**ParserVersion** | **long?** | Parser verison | [optional] 
**ParserMappingVersion** | **string** | Diva Mapping Version used to load Parser into DynamoDB | [optional] 
**PtVersion** | **long?** | PT version | [optional] 
**PtMappingVersion** | **string** | Diva Mapping Version used to load PT into DynamoDB | [optional] 
**TransportType** | **int?** | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) | [optional] 
**ApplicableLocalDate** | **string** | Formated date string of applicable date | [optional] 
**Exists** | **bool?** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

