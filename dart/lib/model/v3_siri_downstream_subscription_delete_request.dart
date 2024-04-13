part of swagger.api;

class V3SiriDownstreamSubscriptionDeleteRequest {
  /* Siri Subscriber Ref */
  String subscriberRef = null;
/* Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber. */
  List<String> subscriptionRef = [];

  V3SiriDownstreamSubscriptionDeleteRequest();

  @override
  String toString() {
    return 'V3SiriDownstreamSubscriptionDeleteRequest[subscriberRef=$subscriberRef, subscriptionRef=$subscriptionRef, ]';
  }

  V3SiriDownstreamSubscriptionDeleteRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    subscriberRef = json['subscriber_ref'];
    subscriptionRef = (json['subscription_ref'] as List).map((item) => item as String).toList();
  }

  Map<String, dynamic> toJson() {
    return {
      'subscriber_ref': subscriberRef,
      'subscription_ref': subscriptionRef
     };
  }

  static List<V3SiriDownstreamSubscriptionDeleteRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriDownstreamSubscriptionDeleteRequest>() : json.map((value) => new V3SiriDownstreamSubscriptionDeleteRequest.fromJson(value)).toList();
  }

  static Map<String, V3SiriDownstreamSubscriptionDeleteRequest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriDownstreamSubscriptionDeleteRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriDownstreamSubscriptionDeleteRequest.fromJson(value));
    }
    return map;
  }
}
