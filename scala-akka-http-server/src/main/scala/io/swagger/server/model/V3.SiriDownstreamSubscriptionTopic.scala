package io.swagger.server.model


/**
 * @param line_ref 
 * @param direction_ref 
 * @param route_type 
 */
case class V3.SiriDownstreamSubscriptionTopic (
  line_ref: Option[String],
  direction_ref: Option[Int],
  route_type: Option[Int]
)

