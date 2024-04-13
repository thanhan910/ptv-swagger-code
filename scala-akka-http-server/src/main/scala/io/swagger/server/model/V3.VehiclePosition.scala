package io.swagger.server.model

import java.util.Date

/**
 * @param latitude Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
 * @param longitude Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
 * @param easting CIS - Metro Train Vehicle Location Easting coordinate
 * @param northing CIS - Metro Train Vehicle Location Northing coordinate
 * @param direction CIS - Metro Train Vehicle Location Direction
 * @param bearing Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
 * @param supplier Supplier of vehicle position data.
 * @param datetime_utc Date and time that the vehicle position data was supplied.
 * @param expiry_time CIS - Metro Train Vehicle Location data expiry time
 */
case class V3.VehiclePosition (
  latitude: Option[Double],
  longitude: Option[Double],
  easting: Option[Double],
  northing: Option[Double],
  direction: Option[String],
  bearing: Option[Double],
  supplier: Option[String],
  datetime_utc: Option[Date],
  expiry_time: Option[Date]
)

