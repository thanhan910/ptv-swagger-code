part of swagger.api;

class V3SiriSubscriptionTopic {
  /* Siri LineRef */
  String lineRef = null;
/* Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound) */
  int directionRef = null;
  //enum directionRefEnum {  1,  2,  5,  10,  16,  32,  65,  130,  };
/* Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider) */
  int routeType = null;
  //enum routeTypeEnum {  0,  1,  2,  3,  4,  };

  V3SiriSubscriptionTopic();

  @override
  String toString() {
    return 'V3SiriSubscriptionTopic[lineRef=$lineRef, directionRef=$directionRef, routeType=$routeType, ]';
  }

  V3SiriSubscriptionTopic.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    lineRef = json['line_ref'];
    directionRef = json['direction_ref'];
    routeType = json['route_type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'line_ref': lineRef,
      'direction_ref': directionRef,
      'route_type': routeType
     };
  }

  static List<V3SiriSubscriptionTopic> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriSubscriptionTopic>() : json.map((value) => new V3SiriSubscriptionTopic.fromJson(value)).toList();
  }

  static Map<String, V3SiriSubscriptionTopic> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriSubscriptionTopic>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriSubscriptionTopic.fromJson(value));
    }
    return map;
  }
}
