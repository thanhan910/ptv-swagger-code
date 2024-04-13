part of swagger.api;

class V3SiriDownstreamSubscriptionResponse {
  /* The Data Horizon of Chronos */
  DateTime validUntil = null;

  V3SiriDownstreamSubscriptionResponse();

  @override
  String toString() {
    return 'V3SiriDownstreamSubscriptionResponse[validUntil=$validUntil, ]';
  }

  V3SiriDownstreamSubscriptionResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    validUntil = json['valid_until'] == null ? null : DateTime.parse(json['valid_until']);
  }

  Map<String, dynamic> toJson() {
    return {
      'valid_until': validUntil == null ? '' : validUntil.toUtc().toIso8601String()
     };
  }

  static List<V3SiriDownstreamSubscriptionResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriDownstreamSubscriptionResponse>() : json.map((value) => new V3SiriDownstreamSubscriptionResponse.fromJson(value)).toList();
  }

  static Map<String, V3SiriDownstreamSubscriptionResponse> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriDownstreamSubscriptionResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriDownstreamSubscriptionResponse.fromJson(value));
    }
    return map;
  }
}
