package io.swagger.server.model


/**
 * @param ticket_type Indicates the ticket type for the stop (myki, paper or both)
 * @param zone Description of the zone
 * @param is_free_fare_zone Indicates whether the stop is inside the free fare zone
 * @param ticket_machine 
 * @param ticket_checks 
 * @param vline_reservation 
 * @param ticket_zones 
 */
case class V3.StopTicket (
  ticket_type: Option[String],
  zone: Option[String],
  is_free_fare_zone: Option[Boolean],
  ticket_machine: Option[Boolean],
  ticket_checks: Option[Boolean],
  vline_reservation: Option[Boolean],
  ticket_zones: Option[List[Int]]
)

