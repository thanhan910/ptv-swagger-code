package io.swagger.server.model


/**
 * @param runs Individual trips/services of a route
 * @param status 
 */
case class V3.RunsResponse (
  runs: Option[List[V3.Run]],
  status: Option[V3.Status]
)

