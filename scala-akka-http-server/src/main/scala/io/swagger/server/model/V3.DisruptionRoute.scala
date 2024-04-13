package io.swagger.server.model


/**
 * @param route_type Transport mode identifier
 * @param route_id Route identifier
 * @param route_name Name of route
 * @param route_number Route number presented to public (i.e. not route_id)
 * @param route_gtfs_id GTFS Identifer of the route
 * @param direction 
 */
case class V3.DisruptionRoute (
  route_type: Option[Int],
  route_id: Option[Int],
  route_name: Option[String],
  route_number: Option[String],
  route_gtfs_id: Option[String],
  direction: Option[V3.DisruptionDirection]
)

