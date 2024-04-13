package io.swagger.server.model


/**
 * @param accessible_ramp 
 * @param parking Indicates if there is at least one accessible parking spot at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param telephone Indicates if there is at least one accessible telephone at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param toilet Indicates if there is at least one accessible toilet at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param low_ticket_counter Indicates if there is at least one low ticket counter at the stop that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
 * @param manouvering Indicates if there is a space for mobility device to board on or off a transport mode
 * @param raised_platform Indicates if there is a raised platform to board a train
 * @param ramp Indicates if there are ramps (&lt;1:14) at the stop/platform
 * @param secondary_path Indicates if there is a path beyond the stop which is accessible
 * @param raised_platform_shelther Indicates if there is shelter near the raised platform
 * @param steep_ramp Indicates if there are ramps (&gt;1:14) at the stop/platform
 */
case class V3.StopAccessibilityWheelchair (
  accessible_ramp: Option[Boolean],
  parking: Option[Boolean],
  telephone: Option[Boolean],
  toilet: Option[Boolean],
  low_ticket_counter: Option[Boolean],
  manouvering: Option[Boolean],
  raised_platform: Option[Boolean],
  ramp: Option[Boolean],
  secondary_path: Option[Boolean],
  raised_platform_shelther: Option[Boolean],
  steep_ramp: Option[Boolean]
)

