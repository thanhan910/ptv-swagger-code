package io.swagger.server.model


/**
 * @param disruption_ids Disruption information identifier(s)
 * @param stop_suburb suburb of stop
 * @param route_type Transport mode identifier
 * @param stop_latitude Geographic coordinate of latitude at stop
 * @param stop_longitude Geographic coordinate of longitude at stop
 * @param stop_sequence Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
 * @param stop_ticket 
 * @param stop_id Stop identifier
 * @param stop_name Name of stop
 * @param stop_landmark Landmark in proximity of stop
 */
case class V3.StopOnRoute (
  disruption_ids: Option[List[Long]],
  stop_suburb: Option[String],
  route_type: Option[Int],
  stop_latitude: Option[Float],
  stop_longitude: Option[Float],
  stop_sequence: Option[Int],
  stop_ticket: Option[V3.StopTicket],
  stop_id: Option[Int],
  stop_name: Option[String],
  stop_landmark: Option[String]
)

