package io.swagger.server.model


/**
 * @param route_types Transport mode identifiers
 * @param status 
 */
case class V3.RouteTypesResponse (
  route_types: Option[List[V3.RouteType]],
  status: Option[V3.Status]
)

