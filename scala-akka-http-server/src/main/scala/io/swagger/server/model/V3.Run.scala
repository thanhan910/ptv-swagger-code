package io.swagger.server.model


/**
 * @param run_id Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
 * @param run_ref Alphanumeric trip/service run identifier
 * @param route_id Route identifier
 * @param route_type Transport mode identifier
 * @param final_stop_id stop_id of final stop of run
 * @param destination_name Name of destination of run
 * @param status Status of metropolitan train run; returns \"scheduled\" for other modes
 * @param direction_id Direction of travel identifier
 * @param run_sequence Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
 * @param express_stop_count The number of remaining skipped/express stations for the run/service from a stop
 * @param vehicle_position 
 * @param vehicle_descriptor 
 * @param geopath Geopath of the route
 */
case class V3.Run (
  run_id: Option[Int],
  run_ref: Option[String],
  route_id: Option[Int],
  route_type: Option[Int],
  final_stop_id: Option[Int],
  destination_name: Option[String],
  status: Option[String],
  direction_id: Option[Int],
  run_sequence: Option[Int],
  express_stop_count: Option[Int],
  vehicle_position: Option[V3.VehiclePosition],
  vehicle_descriptor: Option[V3.VehicleDescriptor],
  geopath: Option[List[Object]]
)

