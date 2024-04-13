part of swagger.api;

class V3FareEstimateResponse {
  
  V3FareEstimateResultStatus fareEstimateResultStatus = null;

  V3FareEstimateResult fareEstimateResult = null;

  V3FareEstimateResponse();

  @override
  String toString() {
    return 'V3FareEstimateResponse[fareEstimateResultStatus=$fareEstimateResultStatus, fareEstimateResult=$fareEstimateResult, ]';
  }

  V3FareEstimateResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    fareEstimateResultStatus = new V3FareEstimateResultStatus.fromJson(json['FareEstimateResultStatus']);
    fareEstimateResult = new V3FareEstimateResult.fromJson(json['FareEstimateResult']);
  }

  Map<String, dynamic> toJson() {
    return {
      'FareEstimateResultStatus': fareEstimateResultStatus,
      'FareEstimateResult': fareEstimateResult
     };
  }

  static List<V3FareEstimateResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3FareEstimateResponse>() : json.map((value) => new V3FareEstimateResponse.fromJson(value)).toList();
  }

  static Map<String, V3FareEstimateResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3FareEstimateResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3FareEstimateResponse.fromJson(value));
    }
    return map;
  }
}
