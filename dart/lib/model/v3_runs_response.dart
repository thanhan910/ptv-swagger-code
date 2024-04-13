part of swagger.api;

class V3RunsResponse {
  /* Individual trips/services of a route */
  List<V3Run> runs = [];

  V3Status status = null;

  V3RunsResponse();

  @override
  String toString() {
    return 'V3RunsResponse[runs=$runs, status=$status, ]';
  }

  V3RunsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    runs = V3Run.listFromJson(json['runs']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'runs': runs,
      'status': status
     };
  }

  static List<V3RunsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3RunsResponse>() : json.map((value) => new V3RunsResponse.fromJson(value)).toList();
  }

  static Map<String, V3RunsResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3RunsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3RunsResponse.fromJson(value));
    }
    return map;
  }
}
