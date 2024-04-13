part of swagger.api;

class V3DirectionWithDescription {
  
  String routeDirectionDescription = null;
/* Direction of travel identifier */
  int directionId = null;
/* Name of direction of travel */
  String directionName = null;
/* Route identifier */
  int routeId = null;
/* Transport mode identifier */
  int routeType = null;

  V3DirectionWithDescription();

  @override
  String toString() {
    return 'V3DirectionWithDescription[routeDirectionDescription=$routeDirectionDescription, directionId=$directionId, directionName=$directionName, routeId=$routeId, routeType=$routeType, ]';
  }

  V3DirectionWithDescription.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeDirectionDescription = json['route_direction_description'];
    directionId = json['direction_id'];
    directionName = json['direction_name'];
    routeId = json['route_id'];
    routeType = json['route_type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_direction_description': routeDirectionDescription,
      'direction_id': directionId,
      'direction_name': directionName,
      'route_id': routeId,
      'route_type': routeType
     };
  }

  static List<V3DirectionWithDescription> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DirectionWithDescription>() : json.map((value) => new V3DirectionWithDescription.fromJson(value)).toList();
  }

  static Map<String, V3DirectionWithDescription> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DirectionWithDescription>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DirectionWithDescription.fromJson(value));
    }
    return map;
  }
}
