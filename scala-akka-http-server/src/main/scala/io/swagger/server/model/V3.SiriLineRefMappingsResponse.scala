package io.swagger.server.model


/**
 * @param mapping_version 
 * @param line_refs 
 * @param status 
 */
case class V3.SiriLineRefMappingsResponse (
  mapping_version: Option[String],
  line_refs: Option[Map[String, V3.SiriLineRefDirectionRefsDictionary]],
  status: Option[V3.Status]
)

