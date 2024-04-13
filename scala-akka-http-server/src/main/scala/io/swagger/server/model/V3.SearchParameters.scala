package io.swagger.server.model


/**
 * @param route_types Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
 * @param latitude Filter by geographic coordinate of latitude
 * @param longitude Filter by geographic coordinate of longitude
 * @param max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
 * @param include_addresses Placeholder for future development; currently unavailable
 * @param include_outlets Indicates if outlets will be returned in response (default = true)
 * @param match_stop_by_suburb Indicates whether to find stops by suburbs in the search term (default = true)
 * @param match_route_by_suburb Indicates whether to find routes by suburbs in the search term (default = true)
 * @param match_stop_by_gtfs_stop_id Indicates whether to search for stops according to a metlink stop ID (default = false)
 */
case class V3.SearchParameters (
  route_types: Option[List[Int]],
  latitude: Option[Float],
  longitude: Option[Float],
  max_distance: Option[Float],
  include_addresses: Option[Boolean],
  include_outlets: Option[Boolean],
  match_stop_by_suburb: Option[Boolean],
  match_route_by_suburb: Option[Boolean],
  match_stop_by_gtfs_stop_id: Option[Boolean]
)

