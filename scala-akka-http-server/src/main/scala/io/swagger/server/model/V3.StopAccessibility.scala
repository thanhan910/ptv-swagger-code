package io.swagger.server.model


/**
 * @param lighting Indicates if there is lighting at the stop
 * @param platform_number Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
 * @param audio_customer_information Indicates if there is at least one audio customer information at the stop/platform
 * @param escalator Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param hearing_loop Indicates if there is a hearing loop facility at the stop/platform
 * @param lift Indicates if there is an elevator at the stop/platform
 * @param stairs Indicates if there are stairs available in the stop
 * @param stop_accessible Indicates if the stop is accessible
 * @param tactile_ground_surface_indicator Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
 * @param waiting_room Indicates if there is a general waiting area at the stop
 * @param wheelchair 
 */
case class V3.StopAccessibility (
  lighting: Option[Boolean],
  platform_number: Option[Int],
  audio_customer_information: Option[Boolean],
  escalator: Option[Boolean],
  hearing_loop: Option[Boolean],
  lift: Option[Boolean],
  stairs: Option[Boolean],
  stop_accessible: Option[Boolean],
  tactile_ground_surface_indicator: Option[Boolean],
  waiting_room: Option[Boolean],
  wheelchair: Option[V3.StopAccessibilityWheelchair]
)

