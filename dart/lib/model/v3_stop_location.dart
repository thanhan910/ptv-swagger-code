part of swagger.api;

class V3StopLocation {
  
  V3StopGps gps = null;

  V3StopLocation();

  @override
  String toString() {
    return 'V3StopLocation[gps=$gps, ]';
  }

  V3StopLocation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    gps = new V3StopGps.fromJson(json['gps']);
  }

  Map<String, dynamic> toJson() {
    return {
      'gps': gps
     };
  }

  static List<V3StopLocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopLocation>() : json.map((value) => new V3StopLocation.fromJson(value)).toList();
  }

  static Map<String, V3StopLocation> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopLocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopLocation.fromJson(value));
    }
    return map;
  }
}
