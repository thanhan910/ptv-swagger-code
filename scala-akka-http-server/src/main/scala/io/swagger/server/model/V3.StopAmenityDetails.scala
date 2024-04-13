package io.swagger.server.model


/**
 * @param toilet Indicates if there is a public toilet at or near the stop
 * @param taxi_rank Indicates if there is a taxi rank at or near the stop
 * @param car_parking The number of free car parking spots at the stop
 * @param cctv Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
 */
case class V3.StopAmenityDetails (
  toilet: Option[Boolean],
  taxi_rank: Option[Boolean],
  car_parking: Option[String],
  cctv: Option[Boolean]
)

