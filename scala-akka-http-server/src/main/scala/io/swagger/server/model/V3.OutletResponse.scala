package io.swagger.server.model


/**
 * @param outlets myki ticket outlets
 * @param status 
 */
case class V3.OutletResponse (
  outlets: Option[List[V3.Outlet]],
  status: Option[V3.Status]
)

