package io.swagger.server.model


/**
 * @param stop 
 * @param disruptions Disruption information applicable to relevant routes or stops
 * @param status 
 */
case class V3.StopResponse (
  stop: Option[V3.StopDetails],
  disruptions: Option[Map[String, V3.Disruption]],
  status: Option[V3.Status]
)

