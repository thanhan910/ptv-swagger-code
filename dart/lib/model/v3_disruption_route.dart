part of swagger.api;

class V3DisruptionRoute {
  /* Transport mode identifier */
  int routeType = null;
/* Route identifier */
  int routeId = null;
/* Name of route */
  String routeName = null;
/* Route number presented to public (i.e. not route_id) */
  String routeNumber = null;
/* GTFS Identifer of the route */
  String routeGtfsId = null;

  V3DisruptionDirection direction = null;

  V3DisruptionRoute();

  @override
  String toString() {
    return 'V3DisruptionRoute[routeType=$routeType, routeId=$routeId, routeName=$routeName, routeNumber=$routeNumber, routeGtfsId=$routeGtfsId, direction=$direction, ]';
  }

  V3DisruptionRoute.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeType = json['route_type'];
    routeId = json['route_id'];
    routeName = json['route_name'];
    routeNumber = json['route_number'];
    routeGtfsId = json['route_gtfs_id'];
    direction = new V3DisruptionDirection.fromJson(json['direction']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route_type': routeType,
      'route_id': routeId,
      'route_name': routeName,
      'route_number': routeNumber,
      'route_gtfs_id': routeGtfsId,
      'direction': direction
     };
  }

  static List<V3DisruptionRoute> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionRoute>() : json.map((value) => new V3DisruptionRoute.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionRoute> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionRoute>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionRoute.fromJson(value));
    }
    return map;
  }
}
