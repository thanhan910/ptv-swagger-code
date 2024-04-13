package io.swagger.server.model


/**
 * @param disruption_modes Transport mode identifiers
 * @param status 
 */
case class V3.DisruptionModesResponse (
  disruption_modes: Option[List[V3.DisruptionMode]],
  status: Option[V3.Status]
)

