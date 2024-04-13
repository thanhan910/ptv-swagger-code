part of swagger.api;

class V3BulkDeparturesUpdateResponse {
  /* Timetabled and real-time service departures */
  List<V3Departure> departures = [];
/* Transport mode identifier */
  int routeType = null;
/* Stop identifier */
  int stopId = null;

  V3BulkDeparturesRouteDirectionResponse requestedRouteDirection = null;
/* The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied. */
  int routeDirectionStatus = null;
  //enum routeDirectionStatusEnum {  0,  1,  };

  V3BulkDeparturesRouteDirectionResponse routeDirection = null;

  V3BulkDeparturesUpdateResponse();

  @override
  String toString() {
    return 'V3BulkDeparturesUpdateResponse[departures=$departures, routeType=$routeType, stopId=$stopId, requestedRouteDirection=$requestedRouteDirection, routeDirectionStatus=$routeDirectionStatus, routeDirection=$routeDirection, ]';
  }

  V3BulkDeparturesUpdateResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    departures = V3Departure.listFromJson(json['departures']);
    routeType = json['route_type'];
    stopId = json['stop_id'];
    requestedRouteDirection = new V3BulkDeparturesRouteDirectionResponse.fromJson(json['requested_route_direction']);
    routeDirectionStatus = json['route_direction_status'];
    routeDirection = new V3BulkDeparturesRouteDirectionResponse.fromJson(json['route_direction']);
  }

  Map<String, dynamic> toJson() {
    return {
      'departures': departures,
      'route_type': routeType,
      'stop_id': stopId,
      'requested_route_direction': requestedRouteDirection,
      'route_direction_status': routeDirectionStatus,
      'route_direction': routeDirection
     };
  }

  static List<V3BulkDeparturesUpdateResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3BulkDeparturesUpdateResponse>() : json.map((value) => new V3BulkDeparturesUpdateResponse.fromJson(value)).toList();
  }

  static Map<String, V3BulkDeparturesUpdateResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3BulkDeparturesUpdateResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3BulkDeparturesUpdateResponse.fromJson(value));
    }
    return map;
  }
}
