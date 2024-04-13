part of swagger.api;

class V3SiriEstimatedTimetableSubscriptionRequest {
  /* Siri Preview Interval */
  String previewInterval = null;
/* Siri Subscriber Ref */
  String subscriberRef = null;
/* Siri Subscription Ref - Unique to a Subscriber Ref */
  String subscriptionRef = null;
/* Siri Message Format 'xml' or 'json' */
  int siriFormat = null;
  //enum siriFormatEnum {  0,  1,  };
/* Siri Message Version '1.3' or '2.0' */
  String siriVersion = null;
/* Siri Consumer Address - Baseline and Updates will be sent to this address */
  String consumerAddress = null;
/* Siri Initial Termination Time - Expiry of the subscription */
  DateTime initialTerminationTime = null;

  List<V3SiriSubscriptionTopic> topics = [];

  V3SiriEstimatedTimetableSubscriptionRequest();

  @override
  String toString() {
    return 'V3SiriEstimatedTimetableSubscriptionRequest[previewInterval=$previewInterval, subscriberRef=$subscriberRef, subscriptionRef=$subscriptionRef, siriFormat=$siriFormat, siriVersion=$siriVersion, consumerAddress=$consumerAddress, initialTerminationTime=$initialTerminationTime, topics=$topics, ]';
  }

  V3SiriEstimatedTimetableSubscriptionRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    previewInterval = json['preview_interval'];
    subscriberRef = json['subscriber_ref'];
    subscriptionRef = json['subscription_ref'];
    siriFormat = json['siri_format'];
    siriVersion = json['siri_version'];
    consumerAddress = json['consumer_address'];
    initialTerminationTime = json['initial_termination_time'] == null ? null : DateTime.parse(json['initial_termination_time']);
    topics = V3SiriSubscriptionTopic.listFromJson(json['topics']);
  }

  Map<String, dynamic> toJson() {
    return {
      'preview_interval': previewInterval,
      'subscriber_ref': subscriberRef,
      'subscription_ref': subscriptionRef,
      'siri_format': siriFormat,
      'siri_version': siriVersion,
      'consumer_address': consumerAddress,
      'initial_termination_time': initialTerminationTime == null ? '' : initialTerminationTime.toUtc().toIso8601String(),
      'topics': topics
     };
  }

  static List<V3SiriEstimatedTimetableSubscriptionRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriEstimatedTimetableSubscriptionRequest>() : json.map((value) => new V3SiriEstimatedTimetableSubscriptionRequest.fromJson(value)).toList();
  }

  static Map<String, V3SiriEstimatedTimetableSubscriptionRequest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriEstimatedTimetableSubscriptionRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriEstimatedTimetableSubscriptionRequest.fromJson(value));
    }
    return map;
  }
}
