part of swagger.api;

class V3RouteType {
  /* Name of transport mode */
  String routeTypeName = null;
/* Transport mode identifier */
  int routeType = null;

  V3RouteType();

  @override
  String toString() {
    return 'V3RouteType[routeTypeName=$routeTypeName, routeType=$routeType, ]';
  }

  V3RouteType.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeTypeName = json['route_type_name'];
    routeType = json['route_type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_type_name': routeTypeName,
      'route_type': routeType
     };
  }

  static List<V3RouteType> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteType>() : json.map((value) => new V3RouteType.fromJson(value)).toList();
  }

  static Map<String, V3RouteType> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteType>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteType.fromJson(value));
    }
    return map;
  }
}
