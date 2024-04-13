part of swagger.api;

class V3SiriDownstreamSubscription {
  
  String subscriberRef = null;

  String subscriptionRef = null;

  int messageType = null;
  //enum messageTypeEnum {  0,  1,  };

  int siriFormat = null;
  //enum siriFormatEnum {  0,  1,  };

  String siriVersion = null;

  String consumerAddress = null;

  DateTime initialTerminationTime = null;

  DateTime validityPeriodStart = null;

  DateTime validityPeriodEnd = null;

  String previewInterval = null;

  List<V3SiriDownstreamSubscriptionTopic> topics = [];

  V3SiriDownstreamSubscription();

  @override
  String toString() {
    return 'V3SiriDownstreamSubscription[subscriberRef=$subscriberRef, subscriptionRef=$subscriptionRef, messageType=$messageType, siriFormat=$siriFormat, siriVersion=$siriVersion, consumerAddress=$consumerAddress, initialTerminationTime=$initialTerminationTime, validityPeriodStart=$validityPeriodStart, validityPeriodEnd=$validityPeriodEnd, previewInterval=$previewInterval, topics=$topics, ]';
  }

  V3SiriDownstreamSubscription.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    subscriberRef = json['subscriber_ref'];
    subscriptionRef = json['subscription_ref'];
    messageType = json['message_type'];
    siriFormat = json['siri_format'];
    siriVersion = json['siri_version'];
    consumerAddress = json['consumer_address'];
    initialTerminationTime = json['initial_termination_time'] == null ? null : DateTime.parse(json['initial_termination_time']);
    validityPeriodStart = json['validity_period_start'] == null ? null : DateTime.parse(json['validity_period_start']);
    validityPeriodEnd = json['validity_period_end'] == null ? null : DateTime.parse(json['validity_period_end']);
    previewInterval = json['preview_interval'];
    topics = V3SiriDownstreamSubscriptionTopic.listFromJson(json['topics']);
  }

  Map<String, dynamic> toJson() {
    return {
      'subscriber_ref': subscriberRef,
      'subscription_ref': subscriptionRef,
      'message_type': messageType,
      'siri_format': siriFormat,
      'siri_version': siriVersion,
      'consumer_address': consumerAddress,
      'initial_termination_time': initialTerminationTime == null ? '' : initialTerminationTime.toUtc().toIso8601String(),
      'validity_period_start': validityPeriodStart == null ? '' : validityPeriodStart.toUtc().toIso8601String(),
      'validity_period_end': validityPeriodEnd == null ? '' : validityPeriodEnd.toUtc().toIso8601String(),
      'preview_interval': previewInterval,
      'topics': topics
     };
  }

  static List<V3SiriDownstreamSubscription> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriDownstreamSubscription>() : json.map((value) => new V3SiriDownstreamSubscription.fromJson(value)).toList();
  }

  static Map<String, V3SiriDownstreamSubscription> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriDownstreamSubscription>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriDownstreamSubscription.fromJson(value));
    }
    return map;
  }
}
