part of swagger.api;

class V3DeparturesBroadParameters {
  /* Filter by platform number at stop */
  List<int> platformNumbers = [];
/* Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} */
  int directionId = null;
/* Indicates that stop_id parameter will accept \"GTFS stop_id\" data */
  bool gtfs = null;
/* Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time) */
  DateTime dateUtc = null;
/* Maximum number of results returned */
  int maxResults = null;
/* Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only */
  bool includeCancelled = null;
/* Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0. */
  bool lookBackwards = null;
/* List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information. */
  List<String> expand = null;
  //enum expandEnum {  All,  Stop,  Route,  Run,  Direction,  Disruption,  VehicleDescriptor,  VehiclePosition,  None,  };
/* Indicates if the route geopath should be returned */
  bool includeGeopath = null;

  V3DeparturesBroadParameters();

  @override
  String toString() {
    return 'V3DeparturesBroadParameters[platformNumbers=$platformNumbers, directionId=$directionId, gtfs=$gtfs, dateUtc=$dateUtc, maxResults=$maxResults, includeCancelled=$includeCancelled, lookBackwards=$lookBackwards, expand=$expand, includeGeopath=$includeGeopath, ]';
  }

  V3DeparturesBroadParameters.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    platformNumbers = (json['platform_numbers'] as List).map((item) => item as int).toList();
    directionId = json['direction_id'];
    gtfs = json['gtfs'];
    dateUtc = json['date_utc'] == null ? null : DateTime.parse(json['date_utc']);
    maxResults = json['max_results'];
    includeCancelled = json['include_cancelled'];
    lookBackwards = json['look_backwards'];
    expand = (json['expand'] as List).map((item) => item as String).toList();
    includeGeopath = json['include_geopath'];
  }

  Map<String, dynamic> toJson() {
    return {
      'platform_numbers': platformNumbers,
      'direction_id': directionId,
      'gtfs': gtfs,
      'date_utc': dateUtc == null ? '' : dateUtc.toUtc().toIso8601String(),
      'max_results': maxResults,
      'include_cancelled': includeCancelled,
      'look_backwards': lookBackwards,
      'expand': expand,
      'include_geopath': includeGeopath
     };
  }

  static List<V3DeparturesBroadParameters> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DeparturesBroadParameters>() : json.map((value) => new V3DeparturesBroadParameters.fromJson(value)).toList();
  }

  static Map<String, V3DeparturesBroadParameters> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DeparturesBroadParameters>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DeparturesBroadParameters.fromJson(value));
    }
    return map;
  }
}
