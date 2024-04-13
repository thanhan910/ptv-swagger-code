package io.swagger.server.model


/**
 * @param MinZone 
 * @param MaxZone 
 * @param UniqueZones 
 */
case class V3.ZoneInfo (
  MinZone: Option[Int],
  MaxZone: Option[Int],
  UniqueZones: Option[List[Int]]
)

