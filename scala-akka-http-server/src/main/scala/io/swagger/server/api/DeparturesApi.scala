package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.DeparturesResponse
import io.swagger.server.model.V3.ErrorResponse

class DeparturesApi(
    departuresService: DeparturesApiService,
    departuresMarshaller: DeparturesApiMarshaller
) {
  import departuresMarshaller._

  lazy val route: Route =
    path() { (routeType, stopId) => 
      get {
        parameters("platform_numbers".as[String].?, "direction_id".as[Int].?, "gtfs".as[Boolean].?, "date_utc".as[String].?, "max_results".as[Int].?, "include_cancelled".as[Boolean].?, "look_backwards".as[Boolean].?, "expand".as[String].?, "include_geopath".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature) =>
          
            
              
                
                  departuresService.departuresGetForStop(routeType = routeType, stopId = stopId, platformNumbers = platformNumbers, directionId = directionId, gtfs = gtfs, dateUtc = dateUtc, maxResults = maxResults, includeCancelled = includeCancelled, lookBackwards = lookBackwards, expand = expand, includeGeopath = includeGeopath, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeType, stopId, routeId) => 
      get {
        parameters("direction_id".as[Int].?, "gtfs".as[Boolean].?, "date_utc".as[String].?, "max_results".as[Int].?, "include_cancelled".as[Boolean].?, "look_backwards".as[Boolean].?, "expand".as[String].?, "include_geopath".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath, token, devid, signature) =>
          
            
              
                
                  departuresService.departuresGetForStopAndRoute(routeType = routeType, stopId = stopId, routeId = routeId, directionId = directionId, gtfs = gtfs, dateUtc = dateUtc, maxResults = maxResults, includeCancelled = includeCancelled, lookBackwards = lookBackwards, expand = expand, includeGeopath = includeGeopath, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait DeparturesApiService {

  def departuresGetForStop200(responseV3.DeparturesResponse: V3.DeparturesResponse)(implicit toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse]): Route =
    complete((200, responseV3.DeparturesResponse))
  def departuresGetForStop400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def departuresGetForStop403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Service departures from the specified stop for all routes of the specified route type; departures are timetabled and real-time (if applicable)., DataType: V3.DeparturesResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def departuresGetForStop(routeType: Int, stopId: Int, platformNumbers: Option[String], directionId: Option[Int], gtfs: Option[Boolean], dateUtc: Option[String], maxResults: Option[Int], includeCancelled: Option[Boolean], lookBackwards: Option[Boolean], expand: Option[String], includeGeopath: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def departuresGetForStopAndRoute200(responseV3.DeparturesResponse: V3.DeparturesResponse)(implicit toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse]): Route =
    complete((200, responseV3.DeparturesResponse))
  def departuresGetForStopAndRoute400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def departuresGetForStopAndRoute403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Service departures from the specified stop for the specified route (and route type); departures are timetabled and real-time (if applicable)., DataType: V3.DeparturesResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def departuresGetForStopAndRoute(routeType: Int, stopId: Int, routeId: String, directionId: Option[Int], gtfs: Option[Boolean], dateUtc: Option[String], maxResults: Option[Int], includeCancelled: Option[Boolean], lookBackwards: Option[Boolean], expand: Option[String], includeGeopath: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait DeparturesApiMarshaller {

  implicit def toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DeparturesResponse: ToEntityMarshaller[V3.DeparturesResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

