part of swagger.api;

class V3DisruptionMode {
  /* Name of disruption mode */
  String disruptionModeName = null;
/* Disruption mode identifier */
  int disruptionMode = null;

  V3DisruptionMode();

  @override
  String toString() {
    return 'V3DisruptionMode[disruptionModeName=$disruptionModeName, disruptionMode=$disruptionMode, ]';
  }

  V3DisruptionMode.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    disruptionModeName = json['disruption_mode_name'];
    disruptionMode = json['disruption_mode'];
  }

  Map<String, dynamic> toJson() {
    return {
      'disruption_mode_name': disruptionModeName,
      'disruption_mode': disruptionMode
     };
  }

  static List<V3DisruptionMode> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3DisruptionMode>() : json.map((value) => new V3DisruptionMode.fromJson(value)).toList();
  }

  static Map<String, V3DisruptionMode> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3DisruptionMode>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3DisruptionMode.fromJson(value));
    }
    return map;
  }
}
