package io.swagger.server.model


/**
 * @param route_service_status 
 * @param route_type Transport mode identifier
 * @param route_id Route identifier
 * @param route_name Name of route
 * @param route_number Route number presented to public (nb. not route_id)
 * @param route_gtfs_id GTFS Identifer of the route
 * @param geopath GeoPath of the route
 */
case class V3.RouteWithStatus (
  route_service_status: Option[V3.RouteServiceStatus],
  route_type: Option[Int],
  route_id: Option[Int],
  route_name: Option[String],
  route_number: Option[String],
  route_gtfs_id: Option[String],
  geopath: Option[List[Object]]
)

