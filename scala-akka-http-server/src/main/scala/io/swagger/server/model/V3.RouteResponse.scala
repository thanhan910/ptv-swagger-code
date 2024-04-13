package io.swagger.server.model


/**
 * @param route 
 * @param status 
 */
case class V3.RouteResponse (
  route: Option[V3.RouteWithStatus],
  status: Option[V3.Status]
)

