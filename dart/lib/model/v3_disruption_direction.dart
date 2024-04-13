part of swagger.api;

class V3DisruptionDirection {
  /* Route and direction of travel combination identifier */
  int routeDirectionId = null;
/* Direction of travel identifier */
  int directionId = null;
/* Name of direction of travel */
  String directionName = null;
/* Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services */
  String serviceTime = null;

  V3DisruptionDirection();

  @override
  String toString() {
    return 'V3DisruptionDirection[routeDirectionId=$routeDirectionId, directionId=$directionId, directionName=$directionName, serviceTime=$serviceTime, ]';
  }

  V3DisruptionDirection.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeDirectionId = json['route_direction_id'];
    directionId = json['direction_id'];
    directionName = json['direction_name'];
    serviceTime = json['service_time'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_direction_id': routeDirectionId,
      'direction_id': directionId,
      'direction_name': directionName,
      'service_time': serviceTime
     };
  }

  static List<V3DisruptionDirection> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionDirection>() : json.map((value) => new V3DisruptionDirection.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionDirection> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionDirection>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionDirection.fromJson(value));
    }
    return map;
  }
}
