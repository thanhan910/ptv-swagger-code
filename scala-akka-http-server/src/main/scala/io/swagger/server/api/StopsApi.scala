package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.StopResponse
import io.swagger.server.model.V3.StopsByDistanceResponse
import io.swagger.server.model.V3.StopsOnRouteResponse

class StopsApi(
    stopsService: StopsApiService,
    stopsMarshaller: StopsApiMarshaller
) {
  import stopsMarshaller._

  lazy val route: Route =
    path() { (stopId, routeType) => 
      get {
        parameters("stop_location".as[Boolean].?, "stop_amenities".as[Boolean].?, "stop_accessibility".as[Boolean].?, "stop_contact".as[Boolean].?, "stop_ticket".as[Boolean].?, "gtfs".as[Boolean].?, "stop_staffing".as[Boolean].?, "stop_disruptions".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (stopLocation, stopAmenities, stopAccessibility, stopContact, stopTicket, gtfs, stopStaffing, stopDisruptions, token, devid, signature) =>
          
            
              
                
                  stopsService.stopsStopDetails(stopId = stopId, routeType = routeType, stopLocation = stopLocation, stopAmenities = stopAmenities, stopAccessibility = stopAccessibility, stopContact = stopContact, stopTicket = stopTicket, gtfs = gtfs, stopStaffing = stopStaffing, stopDisruptions = stopDisruptions, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (latitude, longitude) => 
      get {
        parameters("route_types".as[String].?, "max_results".as[Int].?, "max_distance".as[Double].?, "stop_disruptions".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (routeTypes, maxResults, maxDistance, stopDisruptions, token, devid, signature) =>
          
            
              
                
                  stopsService.stopsStopsByGeolocation(latitude = latitude, longitude = longitude, routeTypes = routeTypes, maxResults = maxResults, maxDistance = maxDistance, stopDisruptions = stopDisruptions, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId, routeType) => 
      get {
        parameters("direction_id".as[Int].?, "stop_disruptions".as[Boolean].?, "include_geopath".as[Boolean].?, "geopath_utc".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (directionId, stopDisruptions, includeGeopath, geopathUtc, token, devid, signature) =>
          
            
              
                
                  stopsService.stopsStopsForRoute(routeId = routeId, routeType = routeType, directionId = directionId, stopDisruptions = stopDisruptions, includeGeopath = includeGeopath, geopathUtc = geopathUtc, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait StopsApiService {

  def stopsStopDetails200(responseV3.StopResponse: V3.StopResponse)(implicit toEntityMarshallerV3.StopResponse: ToEntityMarshaller[V3.StopResponse]): Route =
    complete((200, responseV3.StopResponse))
  def stopsStopDetails400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def stopsStopDetails403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Stop location, amenity and accessibility facility information for the specified stop (metropolitan and V/Line stations only)., DataType: V3.StopResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def stopsStopDetails(stopId: Int, routeType: Int, stopLocation: Option[Boolean], stopAmenities: Option[Boolean], stopAccessibility: Option[Boolean], stopContact: Option[Boolean], stopTicket: Option[Boolean], gtfs: Option[Boolean], stopStaffing: Option[Boolean], stopDisruptions: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.StopResponse: ToEntityMarshaller[V3.StopResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def stopsStopsByGeolocation200(responseV3.StopsByDistanceResponse: V3.StopsByDistanceResponse)(implicit toEntityMarshallerV3.StopsByDistanceResponse: ToEntityMarshaller[V3.StopsByDistanceResponse]): Route =
    complete((200, responseV3.StopsByDistanceResponse))
  def stopsStopsByGeolocation400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def stopsStopsByGeolocation403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All stops near the specified location., DataType: V3.StopsByDistanceResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def stopsStopsByGeolocation(latitude: Float, longitude: Float, routeTypes: Option[String], maxResults: Option[Int], maxDistance: Option[Double], stopDisruptions: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.StopsByDistanceResponse: ToEntityMarshaller[V3.StopsByDistanceResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def stopsStopsForRoute200(responseV3.StopsOnRouteResponse: V3.StopsOnRouteResponse)(implicit toEntityMarshallerV3.StopsOnRouteResponse: ToEntityMarshaller[V3.StopsOnRouteResponse]): Route =
    complete((200, responseV3.StopsOnRouteResponse))
  def stopsStopsForRoute400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def stopsStopsForRoute403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All stops on the specified route., DataType: V3.StopsOnRouteResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def stopsStopsForRoute(routeId: Int, routeType: Int, directionId: Option[Int], stopDisruptions: Option[Boolean], includeGeopath: Option[Boolean], geopathUtc: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.StopsOnRouteResponse: ToEntityMarshaller[V3.StopsOnRouteResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait StopsApiMarshaller {

  implicit def toEntityMarshallerV3.StopResponse: ToEntityMarshaller[V3.StopResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.StopsByDistanceResponse: ToEntityMarshaller[V3.StopsByDistanceResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.StopsOnRouteResponse: ToEntityMarshaller[V3.StopsOnRouteResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

