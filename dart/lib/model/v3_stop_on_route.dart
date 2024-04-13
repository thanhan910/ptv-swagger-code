part of swagger.api;

class V3StopOnRoute {
  /* Disruption information identifier(s) */
  List<int> disruptionIds = [];
/* suburb of stop */
  String stopSuburb = null;
/* Transport mode identifier */
  int routeType = null;
/* Geographic coordinate of latitude at stop */
  double stopLatitude = null;
/* Geographic coordinate of longitude at stop */
  double stopLongitude = null;
/* Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
  int stopSequence = null;

  V3StopTicket stopTicket = null;
/* Stop identifier */
  int stopId = null;
/* Name of stop */
  String stopName = null;
/* Landmark in proximity of stop */
  String stopLandmark = null;

  V3StopOnRoute();

  @override
  String toString() {
    return 'V3StopOnRoute[disruptionIds=$disruptionIds, stopSuburb=$stopSuburb, routeType=$routeType, stopLatitude=$stopLatitude, stopLongitude=$stopLongitude, stopSequence=$stopSequence, stopTicket=$stopTicket, stopId=$stopId, stopName=$stopName, stopLandmark=$stopLandmark, ]';
  }

  V3StopOnRoute.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptionIds = (json['disruption_ids'] as List).map((item) => item as int).toList();
    stopSuburb = json['stop_suburb'];
    routeType = json['route_type'];
    stopLatitude = json['stop_latitude'];
    stopLongitude = json['stop_longitude'];
    stopSequence = json['stop_sequence'];
    stopTicket = new V3StopTicket.fromJson(json['stop_ticket']);
    stopId = json['stop_id'];
    stopName = json['stop_name'];
    stopLandmark = json['stop_landmark'];
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption_ids': disruptionIds,
      'stop_suburb': stopSuburb,
      'route_type': routeType,
      'stop_latitude': stopLatitude,
      'stop_longitude': stopLongitude,
      'stop_sequence': stopSequence,
      'stop_ticket': stopTicket,
      'stop_id': stopId,
      'stop_name': stopName,
      'stop_landmark': stopLandmark
     };
  }

  static List<V3StopOnRoute> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopOnRoute>() : json.map((value) => new V3StopOnRoute.fromJson(value)).toList();
  }

  static Map<String, V3StopOnRoute> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopOnRoute>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopOnRoute.fromJson(value));
    }
    return map;
  }
}
