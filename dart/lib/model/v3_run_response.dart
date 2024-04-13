part of swagger.api;

class V3RunResponse {
  
  V3Run run = null;

  V3Status status = null;

  V3RunResponse();

  @override
  String toString() {
    return 'V3RunResponse[run=$run, status=$status, ]';
  }

  V3RunResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    run = new V3Run.fromJson(json['run']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'run': run,
      'status': status
     };
  }

  static List<V3RunResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RunResponse>() : json.map((value) => new V3RunResponse.fromJson(value)).toList();
  }

  static Map<String, V3RunResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RunResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RunResponse.fromJson(value));
    }
    return map;
  }
}
