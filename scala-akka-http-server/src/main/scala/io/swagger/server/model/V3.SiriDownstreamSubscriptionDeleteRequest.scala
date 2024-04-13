package io.swagger.server.model


/**
 * @param subscriber_ref Siri Subscriber Ref
 * @param subscription_ref Siri Subscription Reference(s) - Unique to a Subscriber Ref.  If `null`, then all subscriptions will be terminated for the referenced Subscriber.
 */
case class V3.SiriDownstreamSubscriptionDeleteRequest (
  subscriber_ref: String,
  subscription_ref: Option[List[String]]
)

