part of swagger.api;

class V3DirectionsResponse {
  /* Directions of travel of route */
  List<V3DirectionWithDescription> directions = [];

  V3Status status = null;

  V3DirectionsResponse();

  @override
  String toString() {
    return 'V3DirectionsResponse[directions=$directions, status=$status, ]';
  }

  V3DirectionsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    directions = V3DirectionWithDescription.listFromJson(json['directions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'directions': directions,
      'status': status
     };
  }

  static List<V3DirectionsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DirectionsResponse>() : json.map((value) => new V3DirectionsResponse.fromJson(value)).toList();
  }

  static Map<String, V3DirectionsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DirectionsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DirectionsResponse.fromJson(value));
    }
    return map;
  }
}
