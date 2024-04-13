part of swagger.api;

class V3RouteDeparturesSpecificParameters {
  /* DEPRECATED - use `scheduled_timetables` instead */
  bool trainScheduledTimetables = null;
/* When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available. */
  bool scheduledTimetables = null;
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

  V3RouteDeparturesSpecificParameters();

  @override
  String toString() {
    return 'V3RouteDeparturesSpecificParameters[trainScheduledTimetables=$trainScheduledTimetables, scheduledTimetables=$scheduledTimetables, dateUtc=$dateUtc, maxResults=$maxResults, includeCancelled=$includeCancelled, lookBackwards=$lookBackwards, expand=$expand, includeGeopath=$includeGeopath, ]';
  }

  V3RouteDeparturesSpecificParameters.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    trainScheduledTimetables = json['train_scheduled_timetables'];
    scheduledTimetables = json['scheduled_timetables'];
    dateUtc = json['date_utc'] == null ? null : DateTime.parse(json['date_utc']);
    maxResults = json['max_results'];
    includeCancelled = json['include_cancelled'];
    lookBackwards = json['look_backwards'];
    expand = (json['expand'] as List).map((item) => item as String).toList();
    includeGeopath = json['include_geopath'];
  }

  Map<String, dynamic> toJson() {
    return {
      'train_scheduled_timetables': trainScheduledTimetables,
      'scheduled_timetables': scheduledTimetables,
      'date_utc': dateUtc == null ? '' : dateUtc.toUtc().toIso8601String(),
      'max_results': maxResults,
      'include_cancelled': includeCancelled,
      'look_backwards': lookBackwards,
      'expand': expand,
      'include_geopath': includeGeopath
     };
  }

  static List<V3RouteDeparturesSpecificParameters> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RouteDeparturesSpecificParameters>() : json.map((value) => new V3RouteDeparturesSpecificParameters.fromJson(value)).toList();
  }

  static Map<String, V3RouteDeparturesSpecificParameters> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RouteDeparturesSpecificParameters>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RouteDeparturesSpecificParameters.fromJson(value));
    }
    return map;
  }
}
