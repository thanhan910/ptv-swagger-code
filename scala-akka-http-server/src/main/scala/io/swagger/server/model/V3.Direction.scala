package io.swagger.server.model


/**
 * @param direction_id Direction of travel identifier
 * @param direction_name Name of direction of travel
 * @param route_id Route identifier
 * @param route_type Transport mode identifier
 */
case class V3.Direction (
  direction_id: Option[Int],
  direction_name: Option[String],
  route_id: Option[Int],
  route_type: Option[Int]
)

