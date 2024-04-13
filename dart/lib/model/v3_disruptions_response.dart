part of swagger.api;

class V3DisruptionsResponse {
  
  V3Disruptions disruptions = null;

  V3Status status = null;

  V3DisruptionsResponse();

  @override
  String toString() {
    return 'V3DisruptionsResponse[disruptions=$disruptions, status=$status, ]';
  }

  V3DisruptionsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptions = new V3Disruptions.fromJson(json['disruptions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'disruptions': disruptions,
      'status': status
     };
  }

  static List<V3DisruptionsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionsResponse>() : json.map((value) => new V3DisruptionsResponse.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionsResponse.fromJson(value));
    }
    return map;
  }
}
