part of swagger.api;

class V3Direction {
  /* Direction of travel identifier */
  int directionId = null;
/* Name of direction of travel */
  String directionName = null;
/* Route identifier */
  int routeId = null;
/* Transport mode identifier */
  int routeType = null;

  V3Direction();

  @override
  String toString() {
    return 'V3Direction[directionId=$directionId, directionName=$directionName, routeId=$routeId, routeType=$routeType, ]';
  }

  V3Direction.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    directionId = json['direction_id'];
    directionName = json['direction_name'];
    routeId = json['route_id'];
    routeType = json['route_type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'direction_id': directionId,
      'direction_name': directionName,
      'route_id': routeId,
      'route_type': routeType
     };
  }

  static List<V3Direction> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Direction>() : json.map((value) => new V3Direction.fromJson(value)).toList();
  }

  static Map<String, V3Direction> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Direction>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Direction.fromJson(value));
    }
    return map;
  }
}
