part of swagger.api;

class V3Departure {
  /* Stop identifier */
  int stopId = null;
/* Route identifier */
  int routeId = null;
/* Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric */
  int runId = null;
/* Alphanumeric trip/service run identifier */
  String runRef = null;
/* Direction of travel identifier */
  int directionId = null;
/* Disruption information identifier(s) */
  List<int> disruptionIds = [];
/* Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format */
  DateTime scheduledDepartureUtc = null;
/* Real-time estimate of departure time and date in ISO 8601 UTC format */
  DateTime estimatedDepartureUtc = null;
/* Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes */
  bool atPlatform = null;
/* Platform number at stop (metropolitan train only; returns null for other modes) */
  String platformNumber = null;
/* Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag) */
  String flags = null;
/* Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4 */
  int departureSequence = null;

  V3Departure();

  @override
  String toString() {
    return 'V3Departure[stopId=$stopId, routeId=$routeId, runId=$runId, runRef=$runRef, directionId=$directionId, disruptionIds=$disruptionIds, scheduledDepartureUtc=$scheduledDepartureUtc, estimatedDepartureUtc=$estimatedDepartureUtc, atPlatform=$atPlatform, platformNumber=$platformNumber, flags=$flags, departureSequence=$departureSequence, ]';
  }

  V3Departure.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopId = json['stop_id'];
    routeId = json['route_id'];
    runId = json['run_id'];
    runRef = json['run_ref'];
    directionId = json['direction_id'];
    disruptionIds = (json['disruption_ids'] as List).map((item) => item as int).toList();
    scheduledDepartureUtc = json['scheduled_departure_utc'] == null ? null : DateTime.parse(json['scheduled_departure_utc']);
    estimatedDepartureUtc = json['estimated_departure_utc'] == null ? null : DateTime.parse(json['estimated_departure_utc']);
    atPlatform = json['at_platform'];
    platformNumber = json['platform_number'];
    flags = json['flags'];
    departureSequence = json['departure_sequence'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_id': stopId,
      'route_id': routeId,
      'run_id': runId,
      'run_ref': runRef,
      'direction_id': directionId,
      'disruption_ids': disruptionIds,
      'scheduled_departure_utc': scheduledDepartureUtc == null ? '' : scheduledDepartureUtc.toUtc().toIso8601String(),
      'estimated_departure_utc': estimatedDepartureUtc == null ? '' : estimatedDepartureUtc.toUtc().toIso8601String(),
      'at_platform': atPlatform,
      'platform_number': platformNumber,
      'flags': flags,
      'departure_sequence': departureSequence
     };
  }

  static List<V3Departure> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Departure>() : json.map((value) => new V3Departure.fromJson(value)).toList();
  }

  static Map<String, V3Departure> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Departure>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Departure.fromJson(value));
    }
    return map;
  }
}
