package io.swagger.server.model


/**
 * @param line_ref Siri LineRef
 * @param direction_ref Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
 */
case class V3.SiriLineRef (
  line_ref: String,
  direction_ref: Option[Int]
)

