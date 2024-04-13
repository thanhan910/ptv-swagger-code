package io.swagger.server.model

import java.util.Date

/**
 * @param disruption_id Disruption information identifier
 * @param title Headline title summarising disruption information
 * @param url URL of relevant article on PTV website
 * @param description Description of the disruption
 * @param disruption_status Status of the disruption (e.g. \"Planned\", \"Current\")
 * @param disruption_type Type of disruption
 * @param published_on Date and time disruption information is published on PTV website, in ISO 8601 UTC format
 * @param last_updated Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
 * @param from_date Date and time at which disruption begins, in ISO 8601 UTC format
 * @param to_date Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
 * @param routes Route relevant to a disruption (if applicable)
 * @param stops Stop relevant to a disruption (if applicable)
 * @param colour 
 * @param display_on_board 
 * @param display_status 
 */
case class V3.Disruption (
  disruption_id: Option[Long],
  title: Option[String],
  url: Option[String],
  description: Option[String],
  disruption_status: Option[String],
  disruption_type: Option[String],
  published_on: Option[Date],
  last_updated: Option[Date],
  from_date: Option[Date],
  to_date: Option[Date],
  routes: Option[List[V3.DisruptionRoute]],
  stops: Option[List[V3.DisruptionStop]],
  colour: Option[String],
  display_on_board: Option[Boolean],
  display_status: Option[Boolean]
)

