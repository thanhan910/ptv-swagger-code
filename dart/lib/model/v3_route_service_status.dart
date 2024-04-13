part of swagger.api;

class V3RouteServiceStatus {
  
  String description = null;

  DateTime timestamp = null;

  V3RouteServiceStatus();

  @override
  String toString() {
    return 'V3RouteServiceStatus[description=$description, timestamp=$timestamp, ]';
  }

  V3RouteServiceStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    description = json['description'];
    timestamp = json['timestamp'] == null ? null : DateTime.parse(json['timestamp']);
  }

  Map<String, dynamic> toJson() {
    return {
      'description': description,
      'timestamp': timestamp == null ? '' : timestamp.toUtc().toIso8601String()
     };
  }

  static List<V3RouteServiceStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteServiceStatus>() : json.map((value) => new V3RouteServiceStatus.fromJson(value)).toList();
  }

  static Map<String, V3RouteServiceStatus> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteServiceStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteServiceStatus.fromJson(value));
    }
    return map;
  }
}
