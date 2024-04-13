package io.swagger.server.model


/**
 * @param responses Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
 * @param stops A train station, tram stop, bus stop, regional coach stop or Night Bus stop
 * @param routes Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
 * @param runs Individual trips/services of a route
 * @param directions Directions of travel of route
 * @param disruptions Disruption information applicable to relevant routes or stops
 * @param status 
 */
case class V3.BulkDeparturesResponse (
  responses: Option[List[V3.BulkDeparturesUpdateResponse]],
  stops: Option[Map[String, V3.BulkDeparturesStopResponse]],
  routes: Option[List[Object]],
  runs: Option[List[V3.Run]],
  directions: Option[List[V3.Direction]],
  disruptions: Option[Map[String, V3.Disruption]],
  status: Option[V3.Status]
)

