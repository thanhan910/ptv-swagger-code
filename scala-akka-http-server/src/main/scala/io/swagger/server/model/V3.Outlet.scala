package io.swagger.server.model


/**
 * @param outlet_slid_spid The SLID / SPID
 * @param outlet_name The location name of the outlet
 * @param outlet_business The business name of the outlet
 * @param outlet_latitude Geographic coordinate of latitude at outlet
 * @param outlet_longitude Geographic coordinate of longitude at outlet
 * @param outlet_suburb The city/municipality the outlet is in
 * @param outlet_postcode The postcode for the outlet
 * @param outlet_business_hour_mon The business hours on Monday
 * @param outlet_business_hour_tue The business hours on Tuesday
 * @param outlet_business_hour_wed The business hours on Wednesday
 * @param outlet_business_hour_thur The business hours on Thursday
 * @param outlet_business_hour_fri The business hours on Friday
 * @param outlet_business_hour_sat The business hours on Saturday
 * @param outlet_business_hour_sun The business hours on Sunday
 * @param outlet_notes Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.
 */
case class V3.Outlet (
  outlet_slid_spid: Option[String],
  outlet_name: Option[String],
  outlet_business: Option[String],
  outlet_latitude: Option[Float],
  outlet_longitude: Option[Float],
  outlet_suburb: Option[String],
  outlet_postcode: Option[Int],
  outlet_business_hour_mon: Option[String],
  outlet_business_hour_tue: Option[String],
  outlet_business_hour_wed: Option[String],
  outlet_business_hour_thur: Option[String],
  outlet_business_hour_fri: Option[String],
  outlet_business_hour_sat: Option[String],
  outlet_business_hour_sun: Option[String],
  outlet_notes: Option[String]
)

