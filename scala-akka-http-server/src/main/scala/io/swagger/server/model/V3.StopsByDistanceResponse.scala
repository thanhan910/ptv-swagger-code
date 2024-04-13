package io.swagger.server.model


/**
 * @param stops Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
 * @param disruptions Disruption information applicable to relevant routes or stops
 * @param status 
 */
case class V3.StopsByDistanceResponse (
  stops: Option[List[V3.StopGeosearch]],
  disruptions: Option[Map[String, V3.Disruption]],
  status: Option[V3.Status]
)

