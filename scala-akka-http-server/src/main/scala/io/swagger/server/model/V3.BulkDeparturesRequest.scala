package io.swagger.server.model

import java.util.Date

/**
 * @param requests Collection of departure requests
 * @param date_utc Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
 * @param look_backwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
 * @param include_cancelled Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
 * @param include_geopath Indicates if the route geopath should be returned
 * @param expand List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
 */
case class V3.BulkDeparturesRequest (
  requests: List[V3.StopDepartureRequest],
  date_utc: Option[Date],
  look_backwards: Option[Boolean],
  include_cancelled: Option[Boolean],
  include_geopath: Option[Boolean],
  expand: Option[List[String]]
)

