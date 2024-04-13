part of swagger.api;

class V3ResultStop {
  /* Distance of stop from input location (in metres); returns 0 if no location is input */
  double stopDistance = null;
/* suburb of stop */
  String stopSuburb = null;
/* Transport mode identifier */
  int routeType = null;
/* List of routes travelling through the stop */
  List<V3ResultRoute> routes = [];
/* Geographic coordinate of latitude at stop */
  double stopLatitude = null;
/* Geographic coordinate of longitude at stop */
  double stopLongitude = null;
/* Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
  int stopSequence = null;
/* Stop identifier */
  int stopId = null;
/* Name of stop */
  String stopName = null;
/* Landmark in proximity of stop */
  String stopLandmark = null;

  V3ResultStop();

  @override
  String toString() {
    return 'V3ResultStop[stopDistance=$stopDistance, stopSuburb=$stopSuburb, routeType=$routeType, routes=$routes, stopLatitude=$stopLatitude, stopLongitude=$stopLongitude, stopSequence=$stopSequence, stopId=$stopId, stopName=$stopName, stopLandmark=$stopLandmark, ]';
  }

  V3ResultStop.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopDistance = json['stop_distance'];
    stopSuburb = json['stop_suburb'];
    routeType = json['route_type'];
    routes = V3ResultRoute.listFromJson(json['routes']);
    stopLatitude = json['stop_latitude'];
    stopLongitude = json['stop_longitude'];
    stopSequence = json['stop_sequence'];
    stopId = json['stop_id'];
    stopName = json['stop_name'];
    stopLandmark = json['stop_landmark'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_distance': stopDistance,
      'stop_suburb': stopSuburb,
      'route_type': routeType,
      'routes': routes,
      'stop_latitude': stopLatitude,
      'stop_longitude': stopLongitude,
      'stop_sequence': stopSequence,
      'stop_id': stopId,
      'stop_name': stopName,
      'stop_landmark': stopLandmark
     };
  }

  static List<V3ResultStop> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3ResultStop>() : json.map((value) => new V3ResultStop.fromJson(value)).toList();
  }

  static Map<String, V3ResultStop> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3ResultStop>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3ResultStop.fromJson(value));
    }
    return map;
  }
}
