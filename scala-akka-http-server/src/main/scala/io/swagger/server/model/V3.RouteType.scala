package io.swagger.server.model


/**
 * @param route_type_name Name of transport mode
 * @param route_type Transport mode identifier
 */
case class V3.RouteType (
  route_type_name: Option[String],
  route_type: Option[Int]
)

