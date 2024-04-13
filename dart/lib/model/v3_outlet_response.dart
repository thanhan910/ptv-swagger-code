part of swagger.api;

class V3OutletResponse {
  /* myki ticket outlets */
  List<V3Outlet> outlets = [];

  V3Status status = null;

  V3OutletResponse();

  @override
  String toString() {
    return 'V3OutletResponse[outlets=$outlets, status=$status, ]';
  }

  V3OutletResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    outlets = V3Outlet.listFromJson(json['outlets']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'outlets': outlets,
      'status': status
     };
  }

  static List<V3OutletResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3OutletResponse>() : json.map((value) => new V3OutletResponse.fromJson(value)).toList();
  }

  static Map<String, V3OutletResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3OutletResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3OutletResponse.fromJson(value));
    }
    return map;
  }
}
