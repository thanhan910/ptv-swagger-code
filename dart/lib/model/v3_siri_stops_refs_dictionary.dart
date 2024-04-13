part of swagger.api;

class V3SiriStopsRefsDictionary {
  
  Map<String, V3SiriReferenceDataDetail> stopPointRefs = {};

  Map<String, String> unmatchedStopPointRefs = {};

  V3SiriStopsRefsDictionary();

  @override
  String toString() {
    return 'V3SiriStopsRefsDictionary[stopPointRefs=$stopPointRefs, unmatchedStopPointRefs=$unmatchedStopPointRefs, ]';
  }

  V3SiriStopsRefsDictionary.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stopPointRefs = V3SiriReferenceDataDetail.mapFromJson(json['stop_point_refs']);
    unmatchedStopPointRefs = json['unmatched_stop_point_refs'];
  }

  Map<String, dynamic> toJson() {
    return {
      'stop_point_refs': stopPointRefs,
      'unmatched_stop_point_refs': unmatchedStopPointRefs
     };
  }

  static List<V3SiriStopsRefsDictionary> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriStopsRefsDictionary>() : json.map((value) => new V3SiriStopsRefsDictionary.fromJson(value)).toList();
  }

  static Map<String, V3SiriStopsRefsDictionary> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriStopsRefsDictionary>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriStopsRefsDictionary.fromJson(value));
    }
    return map;
  }
}
