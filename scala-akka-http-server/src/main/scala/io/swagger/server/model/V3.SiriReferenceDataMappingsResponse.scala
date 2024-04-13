package io.swagger.server.model


/**
 * @param mapping_version 
 * @param line_refs SIRI LineRef
 * @param stop_point_refs 
 * @param status 
 */
case class V3.SiriReferenceDataMappingsResponse (
  mapping_version: Option[String],
  line_refs: Option[Map[String, V3.SiriDirectionRefsDictionary]],
  stop_point_refs: Option[Map[String, V3.StopPoint]],
  status: Option[V3.Status]
)

