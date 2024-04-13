package io.swagger.server.model


/**
 * @param max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default = 300)
 * @param max_results Maximum number of results returned (default = 30)
 */
case class V3.OutletGeolocationParameters (
  max_distance: Option[Double],
  max_results: Option[Int]
)

