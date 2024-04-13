part of swagger.api;

class V3SiriProductionTimetableSubscriptionRequest {
  /* Siri Start Time of the Validity Period */
  DateTime startTime = null;
/* Siri End Time of the Validity Period */
  DateTime endTime = null;
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

  V3SiriProductionTimetableSubscriptionRequest();

  @override
  String toString() {
    return 'V3SiriProductionTimetableSubscriptionRequest[startTime=$startTime, endTime=$endTime, subscriberRef=$subscriberRef, subscriptionRef=$subscriptionRef, siriFormat=$siriFormat, siriVersion=$siriVersion, consumerAddress=$consumerAddress, initialTerminationTime=$initialTerminationTime, topics=$topics, ]';
  }

  V3SiriProductionTimetableSubscriptionRequest.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    startTime = json['start_time'] == null ? null : DateTime.parse(json['start_time']);
    endTime = json['end_time'] == null ? null : DateTime.parse(json['end_time']);
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
      'start_time': startTime == null ? '' : startTime.toUtc().toIso8601String(),
      'end_time': endTime == null ? '' : endTime.toUtc().toIso8601String(),
      'subscriber_ref': subscriberRef,
      'subscription_ref': subscriptionRef,
      'siri_format': siriFormat,
      'siri_version': siriVersion,
      'consumer_address': consumerAddress,
      'initial_termination_time': initialTerminationTime == null ? '' : initialTerminationTime.toUtc().toIso8601String(),
      'topics': topics
     };
  }

  static List<V3SiriProductionTimetableSubscriptionRequest> listFromJson(List<dynamic> json) {
    return json == null ? new List<V3SiriProductionTimetableSubscriptionRequest>() : json.map((value) => new V3SiriProductionTimetableSubscriptionRequest.fromJson(value)).toList();
  }

  static Map<String, V3SiriProductionTimetableSubscriptionRequest> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, V3SiriProductionTimetableSubscriptionRequest>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new V3SiriProductionTimetableSubscriptionRequest.fromJson(value));
    }
    return map;
  }
}
