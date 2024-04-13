package io.swagger.server.model


/**
 * @param route_type Number identifying transport mode; values returned via RouteTypes API
 * @param stop_id Identifier of stop; values returned by Stops API
 * @param max_results Maximum number of results returned
 * @param gtfs Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data
 * @param route_directions The route directions to find departures for at this stop.
 */
case class V3.StopDepartureRequest (
  route_type: Option[Int],
  stop_id: Option[Int],
  max_results: Option[Int],
  gtfs: Option[Boolean],
  route_directions: List[V3.StopDepartureRequestRouteDirection]
)

