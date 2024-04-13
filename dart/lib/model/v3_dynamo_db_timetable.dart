part of swagger.api;

class V3DynamoDbTimetable {
  /* Name of corresponding table in DynamoDB. */
  String tableName = null;
/* Parser verison */
  int parserVersion = null;
/* Diva Mapping Version used to load Parser into DynamoDB */
  String parserMappingVersion = null;
/* PT version */
  int ptVersion = null;
/* Diva Mapping Version used to load PT into DynamoDB */
  String ptMappingVersion = null;
/* A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider) */
  int transportType = null;
  //enum transportTypeEnum {  0,  1,  2,  3,  4,  };
/* Formated date string of applicable date */
  String applicableLocalDate = null;
/* True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type. */
  bool exists = null;

  V3DynamoDbTimetable();

  @override
  String toString() {
    return 'V3DynamoDbTimetable[tableName=$tableName, parserVersion=$parserVersion, parserMappingVersion=$parserMappingVersion, ptVersion=$ptVersion, ptMappingVersion=$ptMappingVersion, transportType=$transportType, applicableLocalDate=$applicableLocalDate, exists=$exists, ]';
  }

  V3DynamoDbTimetable.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    tableName = json['table_name'];
    parserVersion = json['parser_version'];
    parserMappingVersion = json['parser_mapping_version'];
    ptVersion = json['pt_version'];
    ptMappingVersion = json['pt_mapping_version'];
    transportType = json['transport_type'];
    applicableLocalDate = json['applicable_local_date'];
    exists = json['exists'];
  }

  Map<String, dynamic> toJson() {
    return {
      'table_name': tableName,
      'parser_version': parserVersion,
      'parser_mapping_version': parserMappingVersion,
      'pt_version': ptVersion,
      'pt_mapping_version': ptMappingVersion,
      'transport_type': transportType,
      'applicable_local_date': applicableLocalDate,
      'exists': exists
     };
  }

  static List<V3DynamoDbTimetable> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DynamoDbTimetable>() : json.map((value) => new V3DynamoDbTimetable.fromJson(value)).toList();
  }

  static Map<String, V3DynamoDbTimetable> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DynamoDbTimetable>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DynamoDbTimetable.fromJson(value));
    }
    return map;
  }
}
