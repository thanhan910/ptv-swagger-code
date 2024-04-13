package io.swagger.server.model


/**
 * @param stop_name Name of stop
 * @param stop_id Stop identifier
 * @param stop_latitude Geographic coordinate of latitude at stop
 * @param stop_longitude Geographic coordinate of longitude at stop
 * @param stop_suburb suburb of stop
 * @param stop_landmark Landmark in proximity of stop
 */
case class V3.BulkDeparturesStopResponse (
  stop_name: Option[String],
  stop_id: Option[Int],
  stop_latitude: Option[Float],
  stop_longitude: Option[Float],
  stop_suburb: Option[String],
  stop_landmark: Option[String]
)

