part of swagger.api;

class V3StopDepartureRequestRouteDirection {
  /* Identifier of route; values returned by Routes API - v3/routes */
  String routeId = null;
/* Direction of travel identifier; values returned by Directions API - v3/directions */
  int directionId = null;
  //enum directionIdEnum {  0,  2147483647,  };
/* Name of direction of travel; values returned by Directions API - v3/directions */
  String directionName = null;

  V3StopDepartureRequestRouteDirection();

  @override
  String toString() {
    return 'V3StopDepartureRequestRouteDirection[routeId=$routeId, directionId=$directionId, directionName=$directionName, ]';
  }

  V3StopDepartureRequestRouteDirection.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeId = json['route_id'];
    directionId = json['direction_id'];
    directionName = json['direction_name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_id': routeId,
      'direction_id': directionId,
      'direction_name': directionName
     };
  }

  static List<V3StopDepartureRequestRouteDirection> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopDepartureRequestRouteDirection>() : json.map((value) => new V3StopDepartureRequestRouteDirection.fromJson(value)).toList();
  }

  static Map<String, V3StopDepartureRequestRouteDirection> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopDepartureRequestRouteDirection>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopDepartureRequestRouteDirection.fromJson(value));
    }
    return map;
  }
}
