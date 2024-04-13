part of swagger.api;

class V3DisruptionStop {
  
  int stopId = null;

  String stopName = null;

  V3DisruptionStop();

  @override
  String toString() {
    return 'V3DisruptionStop[stopId=$stopId, stopName=$stopName, ]';
  }

  V3DisruptionStop.fromJson(Map<String, dynamic> json) {
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

  static List<V3DisruptionStop> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionStop>() : json.map((value) => new V3DisruptionStop.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionStop> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionStop>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionStop.fromJson(value));
    }
    return map;
  }
}
