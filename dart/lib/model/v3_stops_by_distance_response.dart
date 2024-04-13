part of swagger.api;

class V3StopsByDistanceResponse {
  /* Train stations, tram stops, bus stops, regional coach stops or Night Bus stops */
  List<V3StopGeosearch> stops = [];
/* Disruption information applicable to relevant routes or stops */
  Map<String, V3Disruption> disruptions = {};

  V3Status status = null;

  V3StopsByDistanceResponse();

  @override
  String toString() {
    return 'V3StopsByDistanceResponse[stops=$stops, disruptions=$disruptions, status=$status, ]';
  }

  V3StopsByDistanceResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stops = V3StopGeosearch.listFromJson(json['stops']);
    disruptions = V3Disruption.mapFromJson(json['disruptions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'stops': stops,
      'disruptions': disruptions,
      'status': status
     };
  }

  static List<V3StopsByDistanceResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopsByDistanceResponse>() : json.map((value) => new V3StopsByDistanceResponse.fromJson(value)).toList();
  }

  static Map<String, V3StopsByDistanceResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopsByDistanceResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopsByDistanceResponse.fromJson(value));
    }
    return map;
  }
}
