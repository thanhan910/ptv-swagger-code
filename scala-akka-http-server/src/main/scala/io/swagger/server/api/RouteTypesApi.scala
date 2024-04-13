package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.RouteTypesResponse

class RouteTypesApi(
    routeTypesService: RouteTypesApiService,
    routeTypesMarshaller: RouteTypesApiMarshaller
) {
  import routeTypesMarshaller._

  lazy val route: Route =
    path() { 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  routeTypesService.routeTypesGetRouteTypes(token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait RouteTypesApiService {

  def routeTypesGetRouteTypes200(responseV3.RouteTypesResponse: V3.RouteTypesResponse)(implicit toEntityMarshallerV3.RouteTypesResponse: ToEntityMarshaller[V3.RouteTypesResponse]): Route =
    complete((200, responseV3.RouteTypesResponse))
  def routeTypesGetRouteTypes400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def routeTypesGetRouteTypes403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All route types (i.e. identifiers of transport modes) and their names., DataType: V3.RouteTypesResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def routeTypesGetRouteTypes(token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RouteTypesResponse: ToEntityMarshaller[V3.RouteTypesResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait RouteTypesApiMarshaller {

  implicit def toEntityMarshallerV3.RouteTypesResponse: ToEntityMarshaller[V3.RouteTypesResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

