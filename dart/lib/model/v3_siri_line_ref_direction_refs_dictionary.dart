part of swagger.api;

class V3SiriLineRefDirectionRefsDictionary {
  
  Map<String, List<V3SiriReferenceDataDetail>> directionRefs = {};

  Map<String, String> unmatchedDirectionRefs = {};

  V3SiriLineRefDirectionRefsDictionary();

  @override
  String toString() {
    return 'V3SiriLineRefDirectionRefsDictionary[directionRefs=$directionRefs, unmatchedDirectionRefs=$unmatchedDirectionRefs, ]';
  }

  V3SiriLineRefDirectionRefsDictionary.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    directionRefs = List.mapFromJson(json['direction_refs']);
    unmatchedDirectionRefs = json['unmatched_direction_refs'];
  }

  Map<String, dynamic> toJson() {
    return {
      'direction_refs': directionRefs,
      'unmatched_direction_refs': unmatchedDirectionRefs
     };
  }

  static List<V3SiriLineRefDirectionRefsDictionary> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriLineRefDirectionRefsDictionary>() : json.map((value) => new V3SiriLineRefDirectionRefsDictionary.fromJson(value)).toList();
  }

  static Map<String, V3SiriLineRefDirectionRefsDictionary> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriLineRefDirectionRefsDictionary>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriLineRefDirectionRefsDictionary.fromJson(value));
    }
    return map;
  }
}
