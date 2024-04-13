package io.swagger.server.model


/**
 * @param departures Timetabled and real-time service departures
 * @param route_type Transport mode identifier
 * @param stop_id Stop identifier
 * @param requested_route_direction 
 * @param route_direction_status The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
 * @param route_direction 
 */
case class V3.BulkDeparturesUpdateResponse (
  departures: Option[List[V3.Departure]],
  route_type: Option[Int],
  stop_id: Option[Int],
  requested_route_direction: Option[V3.BulkDeparturesRouteDirectionResponse],
  route_direction_status: Option[Int],
  route_direction: Option[V3.BulkDeparturesRouteDirectionResponse]
)

