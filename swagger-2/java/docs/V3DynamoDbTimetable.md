
# V3DynamoDbTimetable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tableName** | **String** | Name of corresponding table in DynamoDB. |  [optional]
**parserVersion** | **Long** | Parser verison |  [optional]
**parserMappingVersion** | **String** | Diva Mapping Version used to load Parser into DynamoDB |  [optional]
**ptVersion** | **Long** | PT version |  [optional]
**ptMappingVersion** | **String** | Diva Mapping Version used to load PT into DynamoDB |  [optional]
**transportType** | [**TransportTypeEnum**](#TransportTypeEnum) | A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) |  [optional]
**applicableLocalDate** | **String** | Formated date string of applicable date |  [optional]
**exists** | **Boolean** | True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. |  [optional]


<a name="TransportTypeEnum"></a>
## Enum: TransportTypeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4



