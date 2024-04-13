part of swagger.api;

class V3RouteTypesResponse {
  /* Transport mode identifiers */
  List<V3RouteType> routeTypes = [];

  V3Status status = null;

  V3RouteTypesResponse();

  @override
  String toString() {
    return 'V3RouteTypesResponse[routeTypes=$routeTypes, status=$status, ]';
  }

  V3RouteTypesResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeTypes = V3RouteType.listFromJson(json['route_types']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route_types': routeTypes,
      'status': status
     };
  }

  static List<V3RouteTypesResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteTypesResponse>() : json.map((value) => new V3RouteTypesResponse.fromJson(value)).toList();
  }

  static Map<String, V3RouteTypesResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteTypesResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteTypesResponse.fromJson(value));
    }
    return map;
  }
}
