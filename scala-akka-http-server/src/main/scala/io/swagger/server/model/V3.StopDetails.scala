package io.swagger.server.model


/**
 * @param disruption_ids Disruption information identifier(s)
 * @param station_type Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
 * @param station_description The definition applicable to the station_type; returns null for V/Line train
 * @param route_type Transport mode identifier
 * @param stop_location 
 * @param stop_amenities 
 * @param stop_accessibility 
 * @param stop_staffing 
 * @param routes Routes travelling through the stop
 * @param stop_id Stop identifier
 * @param stop_name Name of stop
 * @param stop_landmark Landmark in proximity of stop
 */
case class V3.StopDetails (
  disruption_ids: Option[List[Long]],
  station_type: Option[String],
  station_description: Option[String],
  route_type: Option[Int],
  stop_location: Option[V3.StopLocation],
  stop_amenities: Option[V3.StopAmenityDetails],
  stop_accessibility: Option[V3.StopAccessibility],
  stop_staffing: Option[V3.StopStaffing],
  routes: Option[List[Object]],
  stop_id: Option[Int],
  stop_name: Option[String],
  stop_landmark: Option[String]
)

