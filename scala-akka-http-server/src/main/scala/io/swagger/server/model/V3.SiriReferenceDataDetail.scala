package io.swagger.server.model


/**
 * @param route_id 
 * @param route_number_short Route number
 * @param direction_id 
 * @param tracking_supplier_id Authority (Upstream SIRI provider) of a route and direction
 * @param route_type 
 */
case class V3.SiriReferenceDataDetail (
  route_id: Option[Int],
  route_number_short: Option[String],
  direction_id: Option[Int],
  tracking_supplier_id: Option[Int],
  route_type: Option[Int]
)

