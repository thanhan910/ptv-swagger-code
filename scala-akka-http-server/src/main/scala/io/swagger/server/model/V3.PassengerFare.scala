package io.swagger.server.model

import java.math.BigDecimal

/**
 * @param PassengerType 
 * @param Fare2HourPeak 
 * @param Fare2HourOffPeak 
 * @param FareDailyPeak 
 * @param FareDailyOffPeak 
 * @param Pass7Days 
 * @param Pass28To69DayPerDay 
 * @param Pass70PlusDayPerDay 
 * @param WeekendCap 
 * @param HolidayCap 
 */
case class V3.PassengerFare (
  PassengerType: Option[String],
  Fare2HourPeak: Option[BigDecimal],
  Fare2HourOffPeak: Option[BigDecimal],
  FareDailyPeak: Option[BigDecimal],
  FareDailyOffPeak: Option[BigDecimal],
  Pass7Days: Option[BigDecimal],
  Pass28To69DayPerDay: Option[BigDecimal],
  Pass70PlusDayPerDay: Option[BigDecimal],
  WeekendCap: Option[BigDecimal],
  HolidayCap: Option[BigDecimal]
)

