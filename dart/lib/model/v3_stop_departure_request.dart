part of swagger.api;

class V3StopDepartureRequest {
  /* Number identifying transport mode; values returned via RouteTypes API */
  int routeType = null;
  //enum routeTypeEnum {  0,  1,  2,  3,  4,  };
/* Identifier of stop; values returned by Stops API */
  int stopId = null;
  //enum stopIdEnum {  0,  2147483647,  };
/* Maximum number of results returned */
  int maxResults = null;
  //enum maxResultsEnum {  0,  2147483647,  };
/* Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data */
  bool gtfs = null;
/* The route directions to find departures for at this stop. */
  List<V3StopDepartureRequestRouteDirection> routeDirections = [];

  V3StopDepartureRequest();

  @override
  String toString() {
    return 'V3StopDepartureRequest[routeType=$routeType, stopId=$stopId, maxResults=$maxResults, gtfs=$gtfs, routeDirections=$routeDirections, ]';
  }

  V3StopDepartureRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeType = json['route_type'];
    stopId = json['stop_id'];
    maxResults = json['max_results'];
    gtfs = json['gtfs'];
    routeDirections = V3StopDepartureRequestRouteDirection.listFromJson(json['route_directions']);
  }

  Map<String, dynamic> toJson() {
    return {
      'route_type': routeType,
      'stop_id': stopId,
      'max_results': maxResults,
      'gtfs': gtfs,
      'route_directions': routeDirections
     };
  }

  static List<V3StopDepartureRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopDepartureRequest>() : json.map((value) => new V3StopDepartureRequest.fromJson(value)).toList();
  }

  static Map<String, V3StopDepartureRequest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopDepartureRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopDepartureRequest.fromJson(value));
    }
    return map;
  }
}
