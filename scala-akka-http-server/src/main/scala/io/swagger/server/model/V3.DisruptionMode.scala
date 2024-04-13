package io.swagger.server.model


/**
 * @param disruption_mode_name Name of disruption mode
 * @param disruption_mode Disruption mode identifier
 */
case class V3.DisruptionMode (
  disruption_mode_name: Option[String],
  disruption_mode: Option[Int]
)

