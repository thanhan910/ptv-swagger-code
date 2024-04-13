package io.swagger.server.model


/**
 * @param stops Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
 * @param disruptions Disruption information applicable to relevant routes or stops
 * @param geopath GeoPath for the route
 * @param status 
 */
case class V3.StopsOnRouteResponse (
  stops: Option[List[V3.StopOnRoute]],
  disruptions: Option[Map[String, V3.Disruption]],
  geopath: Option[List[Object]],
  status: Option[V3.Status]
)

