part of swagger.api;

class V3DeparturesResponse {
  /* Timetabled and real-time service departures */
  List<V3Departure> departures = [];
/* A train station, tram stop, bus stop, regional coach stop or Night Bus stop */
  Map<String, V3StopModel> stops = {};
/* Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
  Map<String, Object> routes = {};
/* Individual trips/services of a route */
  Map<String, V3Run> runs = {};
/* Directions of travel of route */
  Map<String, V3Direction> directions = {};
/* Disruption information applicable to relevant routes or stops */
  Map<String, V3Disruption> disruptions = {};

  V3Status status = null;

  V3DeparturesResponse();

  @override
  String toString() {
    return 'V3DeparturesResponse[departures=$departures, stops=$stops, routes=$routes, runs=$runs, directions=$directions, disruptions=$disruptions, status=$status, ]';
  }

  V3DeparturesResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    departures = V3Departure.listFromJson(json['departures']);
    stops = V3StopModel.mapFromJson(json['stops']);
    routes = Object.mapFromJson(json['routes']);
    runs = V3Run.mapFromJson(json['runs']);
    directions = V3Direction.mapFromJson(json['directions']);
    disruptions = V3Disruption.mapFromJson(json['disruptions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'departures': departures,
      'stops': stops,
      'routes': routes,
      'runs': runs,
      'directions': directions,
      'disruptions': disruptions,
      'status': status
     };
  }

  static List<V3DeparturesResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DeparturesResponse>() : json.map((value) => new V3DeparturesResponse.fromJson(value)).toList();
  }

  static Map<String, V3DeparturesResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DeparturesResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DeparturesResponse.fromJson(value));
    }
    return map;
  }
}
