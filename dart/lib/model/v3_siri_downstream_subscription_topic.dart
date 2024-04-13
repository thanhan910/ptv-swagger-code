part of swagger.api;

class V3SiriDownstreamSubscriptionTopic {
  
  String lineRef = null;

  int directionRef = null;
  //enum directionRefEnum {  1,  2,  5,  10,  16,  32,  65,  130,  };

  int routeType = null;
  //enum routeTypeEnum {  0,  1,  2,  3,  4,  };

  V3SiriDownstreamSubscriptionTopic();

  @override
  String toString() {
    return 'V3SiriDownstreamSubscriptionTopic[lineRef=$lineRef, directionRef=$directionRef, routeType=$routeType, ]';
  }

  V3SiriDownstreamSubscriptionTopic.fromJson(Map<String, dynamic> json) {
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

  static List<V3SiriDownstreamSubscriptionTopic> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriDownstreamSubscriptionTopic>() : json.map((value) => new V3SiriDownstreamSubscriptionTopic.fromJson(value)).toList();
  }

  static Map<String, V3SiriDownstreamSubscriptionTopic> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriDownstreamSubscriptionTopic>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriDownstreamSubscriptionTopic.fromJson(value));
    }
    return map;
  }
}
