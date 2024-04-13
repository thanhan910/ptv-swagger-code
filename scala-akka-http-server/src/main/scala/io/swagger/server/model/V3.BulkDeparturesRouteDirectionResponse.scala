package io.swagger.server.model


/**
 * @param route_id Route identifier
 * @param direction_id Direction of travel identifier
 * @param direction_name Name of direction of travel
 */
case class V3.BulkDeparturesRouteDirectionResponse (
  route_id: Option[String],
  direction_id: Option[Int],
  direction_name: Option[String]
)

