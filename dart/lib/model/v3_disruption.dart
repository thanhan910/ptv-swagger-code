part of swagger.api;

class V3Disruption {
  /* Disruption information identifier */
  int disruptionId = null;
/* Headline title summarising disruption information */
  String title = null;
/* URL of relevant article on PTV website */
  String url = null;
/* Description of the disruption */
  String description = null;
/* Status of the disruption (e.g. \"Planned\", \"Current\") */
  String disruptionStatus = null;
/* Type of disruption */
  String disruptionType = null;
/* Date and time disruption information is published on PTV website, in ISO 8601 UTC format */
  DateTime publishedOn = null;
/* Date and time disruption information was last updated by PTV, in ISO 8601 UTC format */
  DateTime lastUpdated = null;
/* Date and time at which disruption begins, in ISO 8601 UTC format */
  DateTime fromDate = null;
/* Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown) */
  DateTime toDate = null;
/* Route relevant to a disruption (if applicable) */
  List<V3DisruptionRoute> routes = [];
/* Stop relevant to a disruption (if applicable) */
  List<V3DisruptionStop> stops = [];

  String colour = null;

  bool displayOnBoard = null;

  bool displayStatus = null;

  V3Disruption();

  @override
  String toString() {
    return 'V3Disruption[disruptionId=$disruptionId, title=$title, url=$url, description=$description, disruptionStatus=$disruptionStatus, disruptionType=$disruptionType, publishedOn=$publishedOn, lastUpdated=$lastUpdated, fromDate=$fromDate, toDate=$toDate, routes=$routes, stops=$stops, colour=$colour, displayOnBoard=$displayOnBoard, displayStatus=$displayStatus, ]';
  }

  V3Disruption.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptionId = json['disruption_id'];
    title = json['title'];
    url = json['url'];
    description = json['description'];
    disruptionStatus = json['disruption_status'];
    disruptionType = json['disruption_type'];
    publishedOn = json['published_on'] == null ? null : DateTime.parse(json['published_on']);
    lastUpdated = json['last_updated'] == null ? null : DateTime.parse(json['last_updated']);
    fromDate = json['from_date'] == null ? null : DateTime.parse(json['from_date']);
    toDate = json['to_date'] == null ? null : DateTime.parse(json['to_date']);
    routes = V3DisruptionRoute.listFromJson(json['routes']);
    stops = V3DisruptionStop.listFromJson(json['stops']);
    colour = json['colour'];
    displayOnBoard = json['display_on_board'];
    displayStatus = json['display_status'];
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption_id': disruptionId,
      'title': title,
      'url': url,
      'description': description,
      'disruption_status': disruptionStatus,
      'disruption_type': disruptionType,
      'published_on': publishedOn == null ? '' : publishedOn.toUtc().toIso8601String(),
      'last_updated': lastUpdated == null ? '' : lastUpdated.toUtc().toIso8601String(),
      'from_date': fromDate == null ? '' : fromDate.toUtc().toIso8601String(),
      'to_date': toDate == null ? '' : toDate.toUtc().toIso8601String(),
      'routes': routes,
      'stops': stops,
      'colour': colour,
      'display_on_board': displayOnBoard,
      'display_status': displayStatus
     };
  }

  static List<V3Disruption> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3Disruption>() : json.map((value) => new V3Disruption.fromJson(value)).toList();
  }

  static Map<String, V3Disruption> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3Disruption>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3Disruption.fromJson(value));
    }
    return map;
  }
}
