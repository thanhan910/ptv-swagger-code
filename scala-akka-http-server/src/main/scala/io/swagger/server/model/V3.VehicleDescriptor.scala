package io.swagger.server.model


/**
 * @param operator Operator name of the vehicle such as \"Metro Trains Melbourne\", \"Yarra Trams\", \"Ventura Bus Line\", \"CDC\" or \"Sita Bus Lines\" . May be null/empty.  Only available for train, tram, v/line and some bus runs.
 * @param id Operator identifier of the vehicle such as \"26094\". May be null/empty. Only available for some tram and bus runs.
 * @param low_floor Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
 * @param air_conditioned Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
 * @param description Vehicle description such as \"6 Car Comeng\", \"6 Car Xtrapolis\", \"3 Car Comeng\", \"6 Car Siemens\", \"3 Car Siemens\". May be null/empty.  Only available for some metropolitan train runs.
 * @param supplier Supplier of vehicle descriptor data.
 * @param length The length of the vehicle. Applies to CIS - Metro Trains
 */
case class V3.VehicleDescriptor (
  operator: Option[String],
  id: Option[String],
  low_floor: Option[Boolean],
  air_conditioned: Option[Boolean],
  description: Option[String],
  supplier: Option[String],
  length: Option[String]
)

