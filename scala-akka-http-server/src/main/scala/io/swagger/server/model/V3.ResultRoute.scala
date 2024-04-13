package io.swagger.server.model


/**
 * @param route_name Name of route
 * @param route_number Route number presented to public (nb. not route_id)
 * @param route_type Transport mode identifier
 * @param route_id Route identifier
 * @param route_gtfs_id GTFS Identifer of the route
 * @param route_service_status 
 */
case class V3.ResultRoute (
  route_name: Option[String],
  route_number: Option[String],
  route_type: Option[Int],
  route_id: Option[Int],
  route_gtfs_id: Option[String],
  route_service_status: Option[V3.RouteServiceStatus]
)

