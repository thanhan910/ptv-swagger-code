package io.swagger.server.model


/**
 * @param disruption_ids Disruption information identifier(s)
 * @param stop_distance Distance of stop from input location (in metres); returns 0 if no location is input
 * @param stop_suburb suburb of stop
 * @param stop_name Name of stop
 * @param stop_id Stop identifier
 * @param route_type Transport mode identifier
 * @param routes List of routes travelling through the stop
 * @param stop_latitude Geographic coordinate of latitude at stop
 * @param stop_longitude Geographic coordinate of longitude at stop
 * @param stop_landmark Landmark in proximity of stop
 * @param stop_sequence Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
 */
case class V3.StopGeosearch (
  disruption_ids: Option[List[Long]],
  stop_distance: Option[Float],
  stop_suburb: Option[String],
  stop_name: Option[String],
  stop_id: Option[Int],
  route_type: Option[Int],
  routes: Option[List[Object]],
  stop_latitude: Option[Float],
  stop_longitude: Option[Float],
  stop_landmark: Option[String],
  stop_sequence: Option[Int]
)

