part of swagger.api;

class V3StopResponse {
  
  V3StopDetails stop = null;
/* Disruption information applicable to relevant routes or stops */
  Map<String, V3Disruption> disruptions = {};

  V3Status status = null;

  V3StopResponse();

  @override
  String toString() {
    return 'V3StopResponse[stop=$stop, disruptions=$disruptions, status=$status, ]';
  }

  V3StopResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stop = new V3StopDetails.fromJson(json['stop']);
    disruptions = V3Disruption.mapFromJson(json['disruptions']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'stop': stop,
      'disruptions': disruptions,
      'status': status
     };
  }

  static List<V3StopResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3StopResponse>() : json.map((value) => new V3StopResponse.fromJson(value)).toList();
  }

  static Map<String, V3StopResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3StopResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3StopResponse.fromJson(value));
    }
    return map;
  }
}
