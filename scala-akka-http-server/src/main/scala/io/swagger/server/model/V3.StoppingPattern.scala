package io.swagger.server.model


/**
 * @param disruptions Disruption information applicable to relevant routes or stops
 * @param departures Timetabled and real-time service departures
 * @param stops A train station, tram stop, bus stop, regional coach stop or Night Bus stop
 * @param routes Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
 * @param runs Individual trips/services of a route
 * @param directions Directions of travel of route
 * @param status 
 */
case class V3.StoppingPattern (
  disruptions: Option[List[V3.Disruption]],
  departures: Option[List[V3.PatternDeparture]],
  stops: Option[Map[String, V3.StoppingPatternStop]],
  routes: Option[Map[String, Object]],
  runs: Option[Map[String, V3.Run]],
  directions: Option[Map[String, V3.Direction]],
  status: Option[V3.Status]
)

