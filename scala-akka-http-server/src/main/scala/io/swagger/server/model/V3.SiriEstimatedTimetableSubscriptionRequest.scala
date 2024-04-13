package io.swagger.server.model

import java.util.Date

/**
 * @param preview_interval Siri Preview Interval
 * @param subscriber_ref Siri Subscriber Ref
 * @param subscription_ref Siri Subscription Ref - Unique to a Subscriber Ref
 * @param siri_format Siri Message Format 'xml' or 'json'
 * @param siri_version Siri Message Version '1.3' or '2.0'
 * @param consumer_address Siri Consumer Address - Baseline and Updates will be sent to this address
 * @param initial_termination_time Siri Initial Termination Time - Expiry of the subscription
 * @param topics 
 */
case class V3.SiriEstimatedTimetableSubscriptionRequest (
  preview_interval: String,
  subscriber_ref: String,
  subscription_ref: String,
  siri_format: Int,
  siri_version: String,
  consumer_address: String,
  initial_termination_time: Date,
  topics: List[V3.SiriSubscriptionTopic]
)

