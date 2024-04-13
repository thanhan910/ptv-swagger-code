part of swagger.api;

class V3RouteWithStatus {
  
  V3RouteServiceStatus routeServiceStatus = null;
/* Transport mode identifier */
  int routeType = null;
/* Route identifier */
  int routeId = null;
/* Name of route */
  String routeName = null;
/* Route number presented to public (nb. not route_id) */
  String routeNumber = null;
/* GTFS Identifer of the route */
  String routeGtfsId = null;
/* GeoPath of the route */
  List<Object> geopath = [];

  V3RouteWithStatus();

  @override
  String toString() {
    return 'V3RouteWithStatus[routeServiceStatus=$routeServiceStatus, routeType=$routeType, routeId=$routeId, routeName=$routeName, routeNumber=$routeNumber, routeGtfsId=$routeGtfsId, geopath=$geopath, ]';
  }

  V3RouteWithStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeServiceStatus = new V3RouteServiceStatus.fromJson(json['route_service_status']);
    routeType = json['route_type'];
    routeId = json['route_id'];
    routeName = json['route_name'];
    routeNumber = json['route_number'];
    routeGtfsId = json['route_gtfs_id'];
    geopath = Object.listFromJson(json['geopath']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route_service_status': routeServiceStatus,
      'route_type': routeType,
      'route_id': routeId,
      'route_name': routeName,
      'route_number': routeNumber,
      'route_gtfs_id': routeGtfsId,
      'geopath': geopath
     };
  }

  static List<V3RouteWithStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteWithStatus>() : json.map((value) => new V3RouteWithStatus.fromJson(value)).toList();
  }

  static Map<String, V3RouteWithStatus> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteWithStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteWithStatus.fromJson(value));
    }
    return map;
  }
}
