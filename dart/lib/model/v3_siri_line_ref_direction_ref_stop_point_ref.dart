part of swagger.api;

class V3SiriLineRefDirectionRefStopPointRef {
  /* Siri LineRef */
  String lineRef = null;
/* Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound) */
  int directionRef = null;
  //enum directionRefEnum {  1,  2,  5,  10,  16,  32,  65,  130,  };
/* Siri StopPointRef */
  int stopPointRef = null;

  V3SiriLineRefDirectionRefStopPointRef();

  @override
  String toString() {
    return 'V3SiriLineRefDirectionRefStopPointRef[lineRef=$lineRef, directionRef=$directionRef, stopPointRef=$stopPointRef, ]';
  }

  V3SiriLineRefDirectionRefStopPointRef.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    lineRef = json['line_ref'];
    directionRef = json['direction_ref'];
    stopPointRef = json['stop_point_ref'];
  }

  Map<String, dynamic> toJson() {
    return {
      'line_ref': lineRef,
      'direction_ref': directionRef,
      'stop_point_ref': stopPointRef
     };
  }

  static List<V3SiriLineRefDirectionRefStopPointRef> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriLineRefDirectionRefStopPointRef>() : json.map((value) => new V3SiriLineRefDirectionRefStopPointRef.fromJson(value)).toList();
  }

  static Map<String, V3SiriLineRefDirectionRefStopPointRef> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriLineRefDirectionRefStopPointRef>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriLineRefDirectionRefStopPointRef.fromJson(value));
    }
    return map;
  }
}
