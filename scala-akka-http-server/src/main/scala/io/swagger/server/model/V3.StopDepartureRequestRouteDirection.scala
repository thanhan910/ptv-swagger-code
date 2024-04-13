package io.swagger.server.model


/**
 * @param route_id Identifier of route; values returned by Routes API - v3/routes
 * @param direction_id Direction of travel identifier; values returned by Directions API - v3/directions
 * @param direction_name Name of direction of travel; values returned by Directions API - v3/directions
 */
case class V3.StopDepartureRequestRouteDirection (
  route_id: Option[String],
  direction_id: Option[Int],
  direction_name: String
)

