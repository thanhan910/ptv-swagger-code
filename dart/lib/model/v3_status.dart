part of swagger.api;

class V3Status {
  /* API Version number */
  String version = null;
/* API system health status (0=offline, 1=online) */
  int health = null;
  //enum healthEnum {  0,  1,  };

  V3Status();

  @override
  String toString() {
    return 'V3Status[version=$version, health=$health, ]';
  }

  V3Status.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    version = json['version'];
    health = json['health'];
  }

  Map<String, dynamic> toJson() {
    return {
      'version': version,
      'health': health
     };
  }

  static List<V3Status> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Status>() : json.map((value) => new V3Status.fromJson(value)).toList();
  }

  static Map<String, V3Status> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Status>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Status.fromJson(value));
    }
    return map;
  }
}
