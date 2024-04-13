package io.swagger.server.model


/**
 * @param version API Version number
 * @param health API system health status (0=offline, 1=online)
 */
case class V3.Status (
  version: Option[String],
  health: Option[Int]
)

