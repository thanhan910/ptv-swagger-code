part of swagger.api;

class V3BulkDeparturesResponse {
  /* Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. */
  List<V3BulkDeparturesUpdateResponse> responses = [];
/* A train station, tram stop, bus stop, regional coach stop or Night Bus stop */
  Map<String, V3BulkDeparturesStopResponse> stops = {};
/* Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
  List<Object> routes = [];
/* Individual trips/services of a route */
  List<V3Run> runs = [];
/* Directions of travel of route */
  List<V3Direction> directions = [];
/* Disruption information applicable to relevant routes or stops */
  Map<String, V3Disruption> disruptions = {};

  V3Status status = null;

  V3BulkDeparturesResponse();

  @override
  String toString() {
    return 'V3BulkDeparturesResponse[responses=$responses, stops=$stops, routes=$routes, runs=$runs, directions=$directions, disruptions=$disruptions, status=$status, ]';
  }

  V3BulkDeparturesResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    responses = V3BulkDeparturesUpdateResponse.listFromJson(json['responses']);
    stops = V3BulkDeparturesStopResponse.mapFromJson(json['stops']);
    routes = Object.listFromJson(json['routes']);
    runs = V3Run.listFromJson(json['runs']);
    directions = V3Direction.listFromJson(json['directions']);
    disruptions = V3Disruption.mapFromJson(json['disruptions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'responses': responses,
      'stops': stops,
      'routes': routes,
      'runs': runs,
      'directions': directions,
      'disruptions': disruptions,
      'status': status
     };
  }

  static List<V3BulkDeparturesResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3BulkDeparturesResponse>() : json.map((value) => new V3BulkDeparturesResponse.fromJson(value)).toList();
  }

  static Map<String, V3BulkDeparturesResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3BulkDeparturesResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3BulkDeparturesResponse.fromJson(value));
    }
    return map;
  }
}
