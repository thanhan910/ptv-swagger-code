part of swagger.api;

class V3DisruptionModesResponse {
  /* Transport mode identifiers */
  List<V3DisruptionMode> disruptionModes = [];

  V3Status status = null;

  V3DisruptionModesResponse();

  @override
  String toString() {
    return 'V3DisruptionModesResponse[disruptionModes=$disruptionModes, status=$status, ]';
  }

  V3DisruptionModesResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptionModes = V3DisruptionMode.listFromJson(json['disruption_modes']);
    status = new V3Status.fromJson(json['status']);
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption_modes': disruptionModes,
      'status': status
     };
  }

  static List<V3DisruptionModesResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionModesResponse>() : json.map((value) => new V3DisruptionModesResponse.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionModesResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionModesResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionModesResponse.fromJson(value));
    }
    return map;
  }
}
