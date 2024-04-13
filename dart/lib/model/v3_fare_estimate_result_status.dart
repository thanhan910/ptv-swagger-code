part of swagger.api;

class V3FareEstimateResultStatus {
  
  int statusCode = null;

  String message = null;

  V3FareEstimateResultStatus();

  @override
  String toString() {
    return 'V3FareEstimateResultStatus[statusCode=$statusCode, message=$message, ]';
  }

  V3FareEstimateResultStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    statusCode = json['StatusCode'];
    message = json['Message'];
  }

  Map<String, dynamic> toJson() {
    return {
      'StatusCode': statusCode,
      'Message': message
     };
  }

  static List<V3FareEstimateResultStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3FareEstimateResultStatus>() : json.map((value) => new V3FareEstimateResultStatus.fromJson(value)).toList();
  }

  static Map<String, V3FareEstimateResultStatus> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3FareEstimateResultStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3FareEstimateResultStatus.fromJson(value));
    }
    return map;
  }
}
