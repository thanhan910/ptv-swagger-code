# SwaggerClient::V3DynamoDbTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**table_name** | **String** | Name of corresponding table in DynamoDB. | [optional] 
**parser_version** | **Integer** | Parser verison | [optional] 
**parser_mapping_version** | **String** | Diva Mapping Version used to load Parser into DynamoDB | [optional] 
**pt_version** | **Integer** | PT version | [optional] 
**pt_mapping_version** | **String** | Diva Mapping Version used to load PT into DynamoDB | [optional] 
**transport_type** | **Integer** | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) | [optional] 
**applicable_local_date** | **String** | Formated date string of applicable date | [optional] 
**exists** | **BOOLEAN** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. | [optional] 

