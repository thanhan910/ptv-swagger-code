package io.swagger.server.model


/**
 * @param disruption 
 * @param status 
 */
case class V3.DisruptionResponse (
  disruption: Option[V3.Disruption],
  status: Option[V3.Status]
)

