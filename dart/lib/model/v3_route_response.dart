part of swagger.api;

class V3RouteResponse {
  
  V3RouteWithStatus route = null;

  V3Status status = null;

  V3RouteResponse();

  @override
  String toString() {
    return 'V3RouteResponse[route=$route, status=$status, ]';
  }

  V3RouteResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    route = new V3RouteWithStatus.fromJson(json['route']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route': route,
      'status': status
     };
  }

  static List<V3RouteResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteResponse>() : json.map((value) => new V3RouteResponse.fromJson(value)).toList();
  }

  static Map<String, V3RouteResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteResponse.fromJson(value));
    }
    return map;
  }
}
