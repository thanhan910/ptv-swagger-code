part of swagger.api;

class V3StoppingPattern {
  /* Disruption information applicable to relevant routes or stops */
  List<V3Disruption> disruptions = [];
/* Timetabled and real-time service departures */
  List<V3PatternDeparture> departures = [];
/* A train station, tram stop, bus stop, regional coach stop or Night Bus stop */
  Map<String, V3StoppingPatternStop> stops = {};
/* Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
  Map<String, Object> routes = {};
/* Individual trips/services of a route */
  Map<String, V3Run> runs = {};
/* Directions of travel of route */
  Map<String, V3Direction> directions = {};

  V3Status status = null;

  V3StoppingPattern();

  @override
  String toString() {
    return 'V3StoppingPattern[disruptions=$disruptions, departures=$departures, stops=$stops, routes=$routes, runs=$runs, directions=$directions, status=$status, ]';
  }

  V3StoppingPattern.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptions = V3Disruption.listFromJson(json['disruptions']);
    departures = V3PatternDeparture.listFromJson(json['departures']);
    stops = V3StoppingPatternStop.mapFromJson(json['stops']);
    routes = Object.mapFromJson(json['routes']);
    runs = V3Run.mapFromJson(json['runs']);
    directions = V3Direction.mapFromJson(json['directions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'disruptions': disruptions,
      'departures': departures,
      'stops': stops,
      'routes': routes,
      'runs': runs,
      'directions': directions,
      'status': status
     };
  }

  static List<V3StoppingPattern> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StoppingPattern>() : json.map((value) => new V3StoppingPattern.fromJson(value)).toList();
  }

  static Map<String, V3StoppingPattern> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StoppingPattern>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StoppingPattern.fromJson(value));
    }
    return map;
  }
}
