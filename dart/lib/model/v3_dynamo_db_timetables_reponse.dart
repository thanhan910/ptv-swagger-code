part of swagger.api;

class V3DynamoDbTimetablesReponse {
  
  List<V3DynamoDbTimetable> timetables = [];

  V3Status status = null;

  V3DynamoDbTimetablesReponse();

  @override
  String toString() {
    return 'V3DynamoDbTimetablesReponse[timetables=$timetables, status=$status, ]';
  }

  V3DynamoDbTimetablesReponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    timetables = V3DynamoDbTimetable.listFromJson(json['timetables']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'timetables': timetables,
      'status': status
     };
  }

  static List<V3DynamoDbTimetablesReponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DynamoDbTimetablesReponse>() : json.map((value) => new V3DynamoDbTimetablesReponse.fromJson(value)).toList();
  }

  static Map<String, V3DynamoDbTimetablesReponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DynamoDbTimetablesReponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DynamoDbTimetablesReponse.fromJson(value));
    }
    return map;
  }
}
