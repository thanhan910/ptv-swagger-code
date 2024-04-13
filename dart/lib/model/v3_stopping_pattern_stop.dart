part of swagger.api;

class V3StoppingPatternStop {
  
  V3StopTicket stopTicket = null;
/* Distance of stop from input location (in metres); returns 0 if no location is input */
  double stopDistance = null;
/* suburb of stop */
  String stopSuburb = null;
/* Name of stop */
  String stopName = null;
/* Stop identifier */
  int stopId = null;
/* Transport mode identifier */
  int routeType = null;
/* Geographic coordinate of latitude at stop */
  double stopLatitude = null;
/* Geographic coordinate of longitude at stop */
  double stopLongitude = null;
/* Landmark in proximity of stop */
  String stopLandmark = null;
/* Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. */
  int stopSequence = null;

  V3StoppingPatternStop();

  @override
  String toString() {
    return 'V3StoppingPatternStop[stopTicket=$stopTicket, stopDistance=$stopDistance, stopSuburb=$stopSuburb, stopName=$stopName, stopId=$stopId, routeType=$routeType, stopLatitude=$stopLatitude, stopLongitude=$stopLongitude, stopLandmark=$stopLandmark, stopSequence=$stopSequence, ]';
  }

  V3StoppingPatternStop.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopTicket = new V3StopTicket.fromJson(json['stop_ticket']);
    stopDistance = json['stop_distance'];
    stopSuburb = json['stop_suburb'];
    stopName = json['stop_name'];
    stopId = json['stop_id'];
    routeType = json['route_type'];
    stopLatitude = json['stop_latitude'];
    stopLongitude = json['stop_longitude'];
    stopLandmark = json['stop_landmark'];
    stopSequence = json['stop_sequence'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_ticket': stopTicket,
      'stop_distance': stopDistance,
      'stop_suburb': stopSuburb,
      'stop_name': stopName,
      'stop_id': stopId,
      'route_type': routeType,
      'stop_latitude': stopLatitude,
      'stop_longitude': stopLongitude,
      'stop_landmark': stopLandmark,
      'stop_sequence': stopSequence
     };
  }

  static List<V3StoppingPatternStop> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StoppingPatternStop>() : json.map((value) => new V3StoppingPatternStop.fromJson(value)).toList();
  }

  static Map<String, V3StoppingPatternStop> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StoppingPatternStop>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StoppingPatternStop.fromJson(value));
    }
    return map;
  }
}
