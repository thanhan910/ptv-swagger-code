part of swagger.api;

class V3DisruptionResponse {
  
  V3Disruption disruption = null;

  V3Status status = null;

  V3DisruptionResponse();

  @override
  String toString() {
    return 'V3DisruptionResponse[disruption=$disruption, status=$status, ]';
  }

  V3DisruptionResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruption = new V3Disruption.fromJson(json['disruption']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption': disruption,
      'status': status
     };
  }

  static List<V3DisruptionResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionResponse>() : json.map((value) => new V3DisruptionResponse.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionResponse.fromJson(value));
    }
    return map;
  }
}
