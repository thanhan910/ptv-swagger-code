package io.swagger.server.model


/**
 * @param directions Directions of travel of route
 * @param status 
 */
case class V3.DirectionsResponse (
  directions: Option[List[V3.DirectionWithDescription]],
  status: Option[V3.Status]
)

