part of swagger.api;

class V3BulkDeparturesStopResponse {
  /* Name of stop */
  String stopName = null;
/* Stop identifier */
  int stopId = null;
/* Geographic coordinate of latitude at stop */
  double stopLatitude = null;
/* Geographic coordinate of longitude at stop */
  double stopLongitude = null;
/* suburb of stop */
  String stopSuburb = null;
/* Landmark in proximity of stop */
  String stopLandmark = null;

  V3BulkDeparturesStopResponse();

  @override
  String toString() {
    return 'V3BulkDeparturesStopResponse[stopName=$stopName, stopId=$stopId, stopLatitude=$stopLatitude, stopLongitude=$stopLongitude, stopSuburb=$stopSuburb, stopLandmark=$stopLandmark, ]';
  }

  V3BulkDeparturesStopResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopName = json['stop_name'];
    stopId = json['stop_id'];
    stopLatitude = json['stop_latitude'];
    stopLongitude = json['stop_longitude'];
    stopSuburb = json['stop_suburb'];
    stopLandmark = json['stop_landmark'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_name': stopName,
      'stop_id': stopId,
      'stop_latitude': stopLatitude,
      'stop_longitude': stopLongitude,
      'stop_suburb': stopSuburb,
      'stop_landmark': stopLandmark
     };
  }

  static List<V3BulkDeparturesStopResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3BulkDeparturesStopResponse>() : json.map((value) => new V3BulkDeparturesStopResponse.fromJson(value)).toList();
  }

  static Map<String, V3BulkDeparturesStopResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3BulkDeparturesStopResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3BulkDeparturesStopResponse.fromJson(value));
    }
    return map;
  }
}
