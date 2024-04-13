package io.swagger.server.model


/**
 * @param outlets myki ticket outlets
 * @param status 
 */
case class V3.OutletGeolocationResponse (
  outlets: Option[List[V3.OutletGeolocation]],
  status: Option[V3.Status]
)

