package io.swagger.server.model

import java.util.Date

/**
 * @param skipped_stops The stops to be skipped following the current departure in order.
 * @param stop_id Stop identifier
 * @param route_id Route identifier
 * @param run_id Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
 * @param run_ref Alphanumeric trip/service run identifier
 * @param direction_id Direction of travel identifier
 * @param disruption_ids Disruption information identifier(s)
 * @param scheduled_departure_utc Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
 * @param estimated_departure_utc Real-time estimate of departure time and date in ISO 8601 UTC format
 * @param at_platform Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
 * @param platform_number Platform number at stop (metropolitan train only; returns null for other modes)
 * @param flags Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
 * @param departure_sequence Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
 */
case class V3.PatternDeparture (
  skipped_stops: Option[List[V3.StopModel]],
  stop_id: Option[Int],
  route_id: Option[Int],
  run_id: Option[Int],
  run_ref: Option[String],
  direction_id: Option[Int],
  disruption_ids: Option[List[Long]],
  scheduled_departure_utc: Option[Date],
  estimated_departure_utc: Option[Date],
  at_platform: Option[Boolean],
  platform_number: Option[String],
  flags: Option[String],
  departure_sequence: Option[Int]
)

