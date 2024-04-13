part of swagger.api;

class V3OutletParameters {
  /* Maximum number of results returned (default = 30) */
  int maxResults = null;

  V3OutletParameters();

  @override
  String toString() {
    return 'V3OutletParameters[maxResults=$maxResults, ]';
  }

  V3OutletParameters.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    maxResults = json['max_results'];
  }

  Map<String, dynamic> toJson() {
    return {
      'max_results': maxResults
     };
  }

  static List<V3OutletParameters> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3OutletParameters>() : json.map((value) => new V3OutletParameters.fromJson(value)).toList();
  }

  static Map<String, V3OutletParameters> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3OutletParameters>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3OutletParameters.fromJson(value));
    }
    return map;
  }
}
