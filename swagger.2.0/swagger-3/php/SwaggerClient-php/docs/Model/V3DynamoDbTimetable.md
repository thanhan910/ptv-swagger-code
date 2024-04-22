# V3DynamoDbTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_name** | **string** | Name of corresponding table in DynamoDB. | [optional] 
**parser_version** | **int** | Parser verison | [optional] 
**parser_mapping_version** | **string** | Diva Mapping Version used to load Parser into DynamoDB | [optional] 
**pt_version** | **int** | PT version | [optional] 
**pt_mapping_version** | **string** | Diva Mapping Version used to load PT into DynamoDB | [optional] 
**transport_type** | **int** | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) | [optional] 
**applicable_local_date** | **string** | Formated date string of applicable date | [optional] 
**exists** | **bool** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

