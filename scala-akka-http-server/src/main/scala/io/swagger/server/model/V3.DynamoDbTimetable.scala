package io.swagger.server.model


/**
 * @param table_name Name of corresponding table in DynamoDB.
 * @param parser_version Parser verison
 * @param parser_mapping_version Diva Mapping Version used to load Parser into DynamoDB
 * @param pt_version PT version
 * @param pt_mapping_version Diva Mapping Version used to load PT into DynamoDB
 * @param transport_type A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
 * @param applicable_local_date Formated date string of applicable date
 * @param exists True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
 */
case class V3.DynamoDbTimetable (
  table_name: Option[String],
  parser_version: Option[Long],
  parser_mapping_version: Option[String],
  pt_version: Option[Long],
  pt_mapping_version: Option[String],
  transport_type: Option[Int],
  applicable_local_date: Option[String],
  exists: Option[Boolean]
)

