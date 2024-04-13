package io.swagger.server.model


/**
 * @param line_ref Siri LineRef
 * @param direction_ref Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
 * @param route_type Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)
 */
case class V3.SiriSubscriptionTopic (
  line_ref: String,
  direction_ref: Option[Int],
  route_type: Int
)

