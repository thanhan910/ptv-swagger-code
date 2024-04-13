part of swagger.api;

class V3ErrorResponse {
  /* Error message */
  String message = null;

  V3Status status = null;

  V3ErrorResponse();

  @override
  String toString() {
    return 'V3ErrorResponse[message=$message, status=$status, ]';
  }

  V3ErrorResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    message = json['message'];
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'message': message,
      'status': status
     };
  }

  static List<V3ErrorResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3ErrorResponse>() : json.map((value) => new V3ErrorResponse.fromJson(value)).toList();
  }

  static Map<String, V3ErrorResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3ErrorResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3ErrorResponse.fromJson(value));
    }
    return map;
  }
}
