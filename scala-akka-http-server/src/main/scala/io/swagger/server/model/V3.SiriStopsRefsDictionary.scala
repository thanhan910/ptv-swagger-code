package io.swagger.server.model


/**
 * @param stop_point_refs 
 * @param unmatched_stop_point_refs 
 */
case class V3.SiriStopsRefsDictionary (
  stop_point_refs: Option[Map[String, V3.SiriReferenceDataDetail]],
  unmatched_stop_point_refs: Option[Map[String, String]]
)

