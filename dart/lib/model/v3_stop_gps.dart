part of swagger.api;

class V3StopGps {
  /* Geographic coordinate of latitude at stop */
  double latitude = null;
/* Geographic coordinate of longitude at stop */
  double longitude = null;

  V3StopGps();

  @override
  String toString() {
    return 'V3StopGps[latitude=$latitude, longitude=$longitude, ]';
  }

  V3StopGps.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    latitude = json['latitude'];
    longitude = json['longitude'];
  }

  Map<String, dynamic> toJson() {
    return {
      'latitude': latitude,
      'longitude': longitude
     };
  }

  static List<V3StopGps> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopGps>() : json.map((value) => new V3StopGps.fromJson(value)).toList();
  }

  static Map<String, V3StopGps> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopGps>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopGps.fromJson(value));
    }
    return map;
  }
}
