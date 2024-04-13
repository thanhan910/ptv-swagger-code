part of swagger.api;

class V3StopPoint {
  
  int stopId = null;

  V3StopPoint();

  @override
  String toString() {
    return 'V3StopPoint[stopId=$stopId, ]';
  }

  V3StopPoint.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopId = json['stop_id'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_id': stopId
     };
  }

  static List<V3StopPoint> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopPoint>() : json.map((value) => new V3StopPoint.fromJson(value)).toList();
  }

  static Map<String, V3StopPoint> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopPoint>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopPoint.fromJson(value));
    }
    return map;
  }
}
