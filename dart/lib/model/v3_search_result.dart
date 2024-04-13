part of swagger.api;

class V3SearchResult {
  /* Train stations, tram stops, bus stops, regional coach stops or Night Bus stops */
  List<V3ResultStop> stops = [];
/* Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
  List<V3ResultRoute> routes = [];
/* myki ticket outlets */
  List<V3ResultOutlet> outlets = [];

  V3Status status = null;

  V3SearchResult();

  @override
  String toString() {
    return 'V3SearchResult[stops=$stops, routes=$routes, outlets=$outlets, status=$status, ]';
  }

  V3SearchResult.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stops = V3ResultStop.listFromJson(json['stops']);
    routes = V3ResultRoute.listFromJson(json['routes']);
    outlets = V3ResultOutlet.listFromJson(json['outlets']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'stops': stops,
      'routes': routes,
      'outlets': outlets,
      'status': status
     };
  }

  static List<V3SearchResult> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SearchResult>() : json.map((value) => new V3SearchResult.fromJson(value)).toList();
  }

  static Map<String, V3SearchResult> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SearchResult>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SearchResult.fromJson(value));
    }
    return map;
  }
}
