package io.swagger.server.model


/**
 * @param timetables 
 * @param status 
 */
case class V3.DynamoDbTimetablesReponse (
  timetables: Option[List[V3.DynamoDbTimetable]],
  status: Option[V3.Status]
)

