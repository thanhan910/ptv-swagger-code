package io.swagger.server.model


/**
 * @param stops Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
 * @param routes Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
 * @param outlets myki ticket outlets
 * @param status 
 */
case class V3.SearchResult (
  stops: Option[List[V3.ResultStop]],
  routes: Option[List[V3.ResultRoute]],
  outlets: Option[List[V3.ResultOutlet]],
  status: Option[V3.Status]
)

