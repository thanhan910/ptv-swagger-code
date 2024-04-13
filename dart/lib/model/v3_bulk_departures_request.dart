part of swagger.api;

class V3BulkDeparturesRequest {
  /* Collection of departure requests */
  List<V3StopDepartureRequest> requests = [];
/* Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) */
  DateTime dateUtc = null;
/* Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. */
  bool lookBackwards = null;
/* Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only */
  bool includeCancelled = null;
/* Indicates if the route geopath should be returned */
  bool includeGeopath = null;
/* List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none */
  List<String> expand = null;
  //enum expandEnum {  All,  Stop,  Route,  Run,  Direction,  Disruption,  VehicleDescriptor,  VehiclePosition,  None,  };

  V3BulkDeparturesRequest();

  @override
  String toString() {
    return 'V3BulkDeparturesRequest[requests=$requests, dateUtc=$dateUtc, lookBackwards=$lookBackwards, includeCancelled=$includeCancelled, includeGeopath=$includeGeopath, expand=$expand, ]';
  }

  V3BulkDeparturesRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    requests = V3StopDepartureRequest.listFromJson(json['requests']);
    dateUtc = json['date_utc'] == null ? null : DateTime.parse(json['date_utc']);
    lookBackwards = json['look_backwards'];
    includeCancelled = json['include_cancelled'];
    includeGeopath = json['include_geopath'];
    expand = (json['expand'] as List).map((item) => item as String).toList();
  }

  Map<String, dynamic> toJson() {
    return {
      'requests': requests,
      'date_utc': dateUtc == null ? '' : dateUtc.toUtc().toIso8601String(),
      'look_backwards': lookBackwards,
      'include_cancelled': includeCancelled,
      'include_geopath': includeGeopath,
      'expand': expand
     };
  }

  static List<V3BulkDeparturesRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3BulkDeparturesRequest>() : json.map((value) => new V3BulkDeparturesRequest.fromJson(value)).toList();
  }

  static Map<String, V3BulkDeparturesRequest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3BulkDeparturesRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3BulkDeparturesRequest.fromJson(value));
    }
    return map;
  }
}
