part of swagger.api;

class V3SiriLineRef {
  /* Siri LineRef */
  String lineRef = null;
/* Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound) */
  int directionRef = null;
  //enum directionRefEnum {  1,  2,  5,  10,  16,  32,  65,  130,  };

  V3SiriLineRef();

  @override
  String toString() {
    return 'V3SiriLineRef[lineRef=$lineRef, directionRef=$directionRef, ]';
  }

  V3SiriLineRef.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    lineRef = json['line_ref'];
    directionRef = json['direction_ref'];
  }

  Map<String, dynamic> toJson() {
    return {
      'line_ref': lineRef,
      'direction_ref': directionRef
     };
  }

  static List<V3SiriLineRef> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriLineRef>() : json.map((value) => new V3SiriLineRef.fromJson(value)).toList();
  }

  static Map<String, V3SiriLineRef> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriLineRef>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriLineRef.fromJson(value));
    }
    return map;
  }
}
