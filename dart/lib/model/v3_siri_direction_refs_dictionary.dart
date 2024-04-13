part of swagger.api;

class V3SiriDirectionRefsDictionary {
  
  Map<String, V3SiriStopsRefsDictionary> directionRefs = {};

  V3SiriDirectionRefsDictionary();

  @override
  String toString() {
    return 'V3SiriDirectionRefsDictionary[directionRefs=$directionRefs, ]';
  }

  V3SiriDirectionRefsDictionary.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    directionRefs = V3SiriStopsRefsDictionary.mapFromJson(json['direction_refs']);
  }

  Map<String, dynamic> toJson() {
    return {
      'direction_refs': directionRefs
     };
  }

  static List<V3SiriDirectionRefsDictionary> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriDirectionRefsDictionary>() : json.map((value) => new V3SiriDirectionRefsDictionary.fromJson(value)).toList();
  }

  static Map<String, V3SiriDirectionRefsDictionary> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriDirectionRefsDictionary>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriDirectionRefsDictionary.fromJson(value));
    }
    return map;
  }
}
