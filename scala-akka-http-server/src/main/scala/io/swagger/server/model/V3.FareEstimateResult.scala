package io.swagger.server.model


/**
 * @param IsEarlyBird 
 * @param IsJourneyInFreeTramZone 
 * @param IsThisWeekendJourney 
 * @param ZoneInfo 
 * @param PassengerFares 
 */
case class V3.FareEstimateResult (
  IsEarlyBird: Option[Boolean],
  IsJourneyInFreeTramZone: Option[Boolean],
  IsThisWeekendJourney: Option[Boolean],
  ZoneInfo: Option[V3.ZoneInfo],
  PassengerFares: Option[List[V3.PassengerFare]]
)

