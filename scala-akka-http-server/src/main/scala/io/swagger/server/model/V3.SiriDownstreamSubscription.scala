package io.swagger.server.model

import java.util.Date

/**
 * @param subscriber_ref 
 * @param subscription_ref 
 * @param message_type 
 * @param siri_format 
 * @param siri_version 
 * @param consumer_address 
 * @param initial_termination_time 
 * @param validity_period_start 
 * @param validity_period_end 
 * @param preview_interval 
 * @param topics 
 */
case class V3.SiriDownstreamSubscription (
  subscriber_ref: Option[String],
  subscription_ref: Option[String],
  message_type: Option[Int],
  siri_format: Option[Int],
  siri_version: Option[String],
  consumer_address: Option[String],
  initial_termination_time: Option[Date],
  validity_period_start: Option[Date],
  validity_period_end: Option[Date],
  preview_interval: Option[String],
  topics: Option[List[V3.SiriDownstreamSubscriptionTopic]]
)

