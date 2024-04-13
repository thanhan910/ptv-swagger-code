package io.swagger.server.model


/**
 * @param run 
 * @param status 
 */
case class V3.RunResponse (
  run: Option[V3.Run],
  status: Option[V3.Status]
)

