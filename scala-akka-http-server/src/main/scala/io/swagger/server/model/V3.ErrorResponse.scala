package io.swagger.server.model


/**
 * An error response
 *
 * @param message Error message
 * @param status 
 */
case class V3.ErrorResponse (
  message: Option[String],
  status: Option[V3.Status]
)

