package io.swagger.server.model


/**
 * @param route_direction_id Route and direction of travel combination identifier
 * @param direction_id Direction of travel identifier
 * @param direction_name Name of direction of travel
 * @param service_time Time of service to which disruption applies, in 24 hour clock format (HH:MM:SS) AEDT/AEST; returns null if disruption applies to multiple (or no) services
 */
case class V3.DisruptionDirection (
  route_direction_id: Option[Int],
  direction_id: Option[Int],
  direction_name: Option[String],
  service_time: Option[String]
)

