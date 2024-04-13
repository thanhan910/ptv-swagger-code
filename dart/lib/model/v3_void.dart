part of swagger.api;

class V3Void {
  
  V3Void();

  @override
  String toString() {
    return 'V3Void[]';
  }

  V3Void.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
     };
  }

  static List<V3Void> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Void>() : json.map((value) => new V3Void.fromJson(value)).toList();
  }

  static Map<String, V3Void> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Void>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Void.fromJson(value));
    }
    return map;
  }
}
