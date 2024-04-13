package io.swagger.server.model


/**
 * @param line_ref Siri LineRef
 * @param direction_ref Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
 * @param stop_point_ref Siri StopPointRef
 */
case class V3.SiriLineRefDirectionRefStopPointRef (
  line_ref: String,
  direction_ref: Int,
  stop_point_ref: Int
)

