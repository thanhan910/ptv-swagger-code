part of swagger.api;

class V3SiriReferenceDataDetail {
  
  int routeId = null;
/* Route number */
  String routeNumberShort = null;

  int directionId = null;
/* Authority (Upstream SIRI provider) of a route and direction */
  int trackingSupplierId = null;

  int routeType = null;

  V3SiriReferenceDataDetail();

  @override
  String toString() {
    return 'V3SiriReferenceDataDetail[routeId=$routeId, routeNumberShort=$routeNumberShort, directionId=$directionId, trackingSupplierId=$trackingSupplierId, routeType=$routeType, ]';
  }

  V3SiriReferenceDataDetail.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    routeId = json['route_id'];
    routeNumberShort = json['route_number_short'];
    directionId = json['direction_id'];
    trackingSupplierId = json['tracking_supplier_id'];
    routeType = json['route_type'];
  }

  Map<String, dynamic> toJson() {
    return {
      'route_id': routeId,
      'route_number_short': routeNumberShort,
      'direction_id': directionId,
      'tracking_supplier_id': trackingSupplierId,
      'route_type': routeType
     };
  }

  static List<V3SiriReferenceDataDetail> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriReferenceDataDetail>() : json.map((value) => new V3SiriReferenceDataDetail.fromJson(value)).toList();
  }

  static Map<String, V3SiriReferenceDataDetail> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriReferenceDataDetail>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriReferenceDataDetail.fromJson(value));
    }
    return map;
  }
}
