package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.StoppingPattern

class PatternsApi(
    patternsService: PatternsApiService,
    patternsMarshaller: PatternsApiMarshaller
) {
  import patternsMarshaller._

  lazy val route: Route =
    path() { (runRef, routeType) => 
      get {
        parameters("expand".as[String], "stop_id".as[Int].?, "date_utc".as[String].?, "include_skipped_stops".as[Boolean].?, "include_geopath".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (expand, stopId, dateUtc, includeSkippedStops, includeGeopath, token, devid, signature) =>
          
            
              
                
                  patternsService.patternsGetPatternByRun(runRef = runRef, routeType = routeType, expand = expand, stopId = stopId, dateUtc = dateUtc, includeSkippedStops = includeSkippedStops, includeGeopath = includeGeopath, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait PatternsApiService {

  def patternsGetPatternByRun200(responseV3.StoppingPattern: V3.StoppingPattern)(implicit toEntityMarshallerV3.StoppingPattern: ToEntityMarshaller[V3.StoppingPattern]): Route =
    complete((200, responseV3.StoppingPattern))
  def patternsGetPatternByRun400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def patternsGetPatternByRun403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: The stopping pattern of the specified run_ref and route type. (NOTE: the departure sequence field should be used to sort departures in chronological order, however it is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4), DataType: V3.StoppingPattern
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def patternsGetPatternByRun(runRef: String, routeType: Int, expand: String, stopId: Option[Int], dateUtc: Option[String], includeSkippedStops: Option[Boolean], includeGeopath: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.StoppingPattern: ToEntityMarshaller[V3.StoppingPattern], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait PatternsApiMarshaller {

  implicit def toEntityMarshallerV3.StoppingPattern: ToEntityMarshaller[V3.StoppingPattern]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

