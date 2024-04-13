part of swagger.api;

class V3OutletGeolocationResponse {
  /* myki ticket outlets */
  List<V3OutletGeolocation> outlets = [];

  V3Status status = null;

  V3OutletGeolocationResponse();

  @override
  String toString() {
    return 'V3OutletGeolocationResponse[outlets=$outlets, status=$status, ]';
  }

  V3OutletGeolocationResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    outlets = V3OutletGeolocation.listFromJson(json['outlets']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'outlets': outlets,
      'status': status
     };
  }

  static List<V3OutletGeolocationResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3OutletGeolocationResponse>() : json.map((value) => new V3OutletGeolocationResponse.fromJson(value)).toList();
  }

  static Map<String, V3OutletGeolocationResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3OutletGeolocationResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3OutletGeolocationResponse.fromJson(value));
    }
    return map;
  }
}
