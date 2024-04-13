package io.swagger.server.model


/**
 * @param direction_refs 
 * @param unmatched_direction_refs 
 */
case class V3.SiriLineRefDirectionRefsDictionary (
  direction_refs: Option[Map[String, List[V3.SiriReferenceDataDetail]]],
  unmatched_direction_refs: Option[Map[String, String]]
)

