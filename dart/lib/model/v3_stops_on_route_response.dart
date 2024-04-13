part of swagger.api;

class V3StopsOnRouteResponse {
  /* Train stations, tram stops, bus stops, regional coach stops or Night Bus stops */
  List<V3StopOnRoute> stops = [];
/* Disruption information applicable to relevant routes or stops */
  Map<String, V3Disruption> disruptions = {};
/* GeoPath for the route */
  List<Object> geopath = [];

  V3Status status = null;

  V3StopsOnRouteResponse();

  @override
  String toString() {
    return 'V3StopsOnRouteResponse[stops=$stops, disruptions=$disruptions, geopath=$geopath, status=$status, ]';
  }

  V3StopsOnRouteResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stops = V3StopOnRoute.listFromJson(json['stops']);
    disruptions = V3Disruption.mapFromJson(json['disruptions']);
    geopath = Object.listFromJson(json['geopath']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'stops': stops,
      'disruptions': disruptions,
      'geopath': geopath,
      'status': status
     };
  }

  static List<V3StopsOnRouteResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopsOnRouteResponse>() : json.map((value) => new V3StopsOnRouteResponse.fromJson(value)).toList();
  }

  static Map<String, V3StopsOnRouteResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopsOnRouteResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopsOnRouteResponse.fromJson(value));
    }
    return map;
  }
}
