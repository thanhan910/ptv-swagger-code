part of swagger.api;

class V3ResultRoute {
  /* Name of route */
  String routeName = null;
/* Route number presented to public (nb. not route_id) */
  String routeNumber = null;
/* Transport mode identifier */
  int routeType = null;
/* Route identifier */
  int routeId = null;
/* GTFS Identifer of the route */
  String routeGtfsId = null;

  V3RouteServiceStatus routeServiceStatus = null;

  V3ResultRoute();

  @override
  String toString() {
    return 'V3ResultRoute[routeName=$routeName, routeNumber=$routeNumber, routeType=$routeType, routeId=$routeId, routeGtfsId=$routeGtfsId, routeServiceStatus=$routeServiceStatus, ]';
  }

  V3ResultRoute.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeName = json['route_name'];
    routeNumber = json['route_number'];
    routeType = json['route_type'];
    routeId = json['route_id'];
    routeGtfsId = json['route_gtfs_id'];
    routeServiceStatus = new V3RouteServiceStatus.fromJson(json['route_service_status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route_name': routeName,
      'route_number': routeNumber,
      'route_type': routeType,
      'route_id': routeId,
      'route_gtfs_id': routeGtfsId,
      'route_service_status': routeServiceStatus
     };
  }

  static List<V3ResultRoute> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3ResultRoute>() : json.map((value) => new V3ResultRoute.fromJson(value)).toList();
  }

  static Map<String, V3ResultRoute> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3ResultRoute>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3ResultRoute.fromJson(value));
    }
    return map;
  }
}
