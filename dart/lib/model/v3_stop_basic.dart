part of swagger.api;

class V3StopBasic {
  
  int stopId = null;

  String stopName = null;

  V3StopBasic();

  @override
  String toString() {
    return 'V3StopBasic[stopId=$stopId, stopName=$stopName, ]';
  }

  V3StopBasic.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopId = json['stop_id'];
    stopName = json['stop_name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_id': stopId,
      'stop_name': stopName
     };
  }

  static List<V3StopBasic> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopBasic>() : json.map((value) => new V3StopBasic.fromJson(value)).toList();
  }

  static Map<String, V3StopBasic> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopBasic>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopBasic.fromJson(value));
    }
    return map;
  }
}
