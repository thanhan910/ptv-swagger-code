package io.swagger.server.model


/**
 * @param latitude Geographic coordinate of latitude at stop
 * @param longitude Geographic coordinate of longitude at stop
 */
case class V3.StopGps (
  latitude: Option[Float],
  longitude: Option[Float]
)

