package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.RouteResponse

class RoutesApi(
    routesService: RoutesApiService,
    routesMarshaller: RoutesApiMarshaller
) {
  import routesMarshaller._

  lazy val route: Route =
    path() { 
      get {
        parameters("route_types".as[String].?, "route_name".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (routeTypes, routeName, token, devid, signature) =>
          
            
              
                
                  routesService.routesOneOrMoreRoutes(routeTypes = routeTypes, routeName = routeName, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId) => 
      get {
        parameters("include_geopath".as[Boolean].?, "geopath_utc".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (includeGeopath, geopathUtc, token, devid, signature) =>
          
            
              
                
                  routesService.routesRouteFromId(routeId = routeId, includeGeopath = includeGeopath, geopathUtc = geopathUtc, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait RoutesApiService {

  def routesOneOrMoreRoutes200(responseV3.RouteResponse: V3.RouteResponse)(implicit toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse]): Route =
    complete((200, responseV3.RouteResponse))
  def routesOneOrMoreRoutes400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def routesOneOrMoreRoutes403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Route names and numbers for all routes of all route types., DataType: V3.RouteResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def routesOneOrMoreRoutes(routeTypes: Option[String], routeName: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def routesRouteFromId200(responseV3.RouteResponse: V3.RouteResponse)(implicit toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse]): Route =
    complete((200, responseV3.RouteResponse))
  def routesRouteFromId400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def routesRouteFromId403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: The route name and number for the specified route ID., DataType: V3.RouteResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def routesRouteFromId(routeId: Int, includeGeopath: Option[Boolean], geopathUtc: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait RoutesApiMarshaller {

  implicit def toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.RouteResponse: ToEntityMarshaller[V3.RouteResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

