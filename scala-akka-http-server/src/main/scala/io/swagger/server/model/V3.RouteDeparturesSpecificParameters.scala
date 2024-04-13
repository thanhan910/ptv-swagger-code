package io.swagger.server.model

import java.util.Date

/**
 * @param train_scheduled_timetables DEPRECATED - use `scheduled_timetables` instead
 * @param scheduled_timetables When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
 * @param date_utc Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
 * @param max_results Maximum number of results returned
 * @param include_cancelled Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
 * @param look_backwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
 * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
 * @param include_geopath Indicates if the route geopath should be returned
 */
case class V3.RouteDeparturesSpecificParameters (
  train_scheduled_timetables: Option[Boolean],
  scheduled_timetables: Option[Boolean],
  date_utc: Option[Date],
  max_results: Option[Int],
  include_cancelled: Option[Boolean],
  look_backwards: Option[Boolean],
  expand: Option[List[String]],
  include_geopath: Option[Boolean]
)

