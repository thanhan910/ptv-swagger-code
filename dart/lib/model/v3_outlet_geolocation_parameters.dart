part of swagger.api;

class V3OutletGeolocationParameters {
  /* Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300) */
  double maxDistance = null;
/* Maximum number of results returned (default = 30) */
  int maxResults = null;

  V3OutletGeolocationParameters();

  @override
  String toString() {
    return 'V3OutletGeolocationParameters[maxDistance=$maxDistance, maxResults=$maxResults, ]';
  }

  V3OutletGeolocationParameters.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    maxDistance = json['max_distance'];
    maxResults = json['max_results'];
  }

  Map<String, dynamic> toJson() {
    return {
      'max_distance': maxDistance,
      'max_results': maxResults
     };
  }

  static List<V3OutletGeolocationParameters> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3OutletGeolocationParameters>() : json.map((value) => new V3OutletGeolocationParameters.fromJson(value)).toList();
  }

  static Map<String, V3OutletGeolocationParameters> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3OutletGeolocationParameters>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3OutletGeolocationParameters.fromJson(value));
    }
    return map;
  }
}
