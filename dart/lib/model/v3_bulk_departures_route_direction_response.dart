part of swagger.api;

class V3BulkDeparturesRouteDirectionResponse {
  /* Route identifier */
  String routeId = null;
/* Direction of travel identifier */
  int directionId = null;
/* Name of direction of travel */
  String directionName = null;

  V3BulkDeparturesRouteDirectionResponse();

  @override
  String toString() {
    return 'V3BulkDeparturesRouteDirectionResponse[routeId=$routeId, directionId=$directionId, directionName=$directionName, ]';
  }

  V3BulkDeparturesRouteDirectionResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeId = json['route_id'];
    directionId = json['direction_id'];
    directionName = json['direction_name'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_id': routeId,
      'direction_id': directionId,
      'direction_name': directionName
     };
  }

  static List<V3BulkDeparturesRouteDirectionResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3BulkDeparturesRouteDirectionResponse>() : json.map((value) => new V3BulkDeparturesRouteDirectionResponse.fromJson(value)).toList();
  }

  static Map<String, V3BulkDeparturesRouteDirectionResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3BulkDeparturesRouteDirectionResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3BulkDeparturesRouteDirectionResponse.fromJson(value));
    }
    return map;
  }
}
