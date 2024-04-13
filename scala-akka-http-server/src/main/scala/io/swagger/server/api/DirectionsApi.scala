package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.V3.DirectionsResponse
import io.swagger.server.model.V3.ErrorResponse

class DirectionsApi(
    directionsService: DirectionsApiService,
    directionsMarshaller: DirectionsApiMarshaller
) {
  import directionsMarshaller._

  lazy val route: Route =
    path() { (directionId) => 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  directionsService.directionsForDirection(directionId = directionId, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (directionId, routeType) => 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  directionsService.directionsForDirectionAndType(directionId = directionId, routeType = routeType, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId) => 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  directionsService.directionsForRoute(routeId = routeId, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait DirectionsApiService {

  def directionsForDirection200(responseV3.DirectionsResponse: V3.DirectionsResponse)(implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]): Route =
    complete((200, responseV3.DirectionsResponse))
  def directionsForDirection400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def directionsForDirection403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All routes that travel in the specified direction., DataType: V3.DirectionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def directionsForDirection(directionId: Int, token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def directionsForDirectionAndType200(responseV3.DirectionsResponse: V3.DirectionsResponse)(implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]): Route =
    complete((200, responseV3.DirectionsResponse))
  def directionsForDirectionAndType400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def directionsForDirectionAndType403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All routes of the specified route type that travel in the specified direction., DataType: V3.DirectionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def directionsForDirectionAndType(directionId: Int, routeType: Int, token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def directionsForRoute200(responseV3.DirectionsResponse: V3.DirectionsResponse)(implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]): Route =
    complete((200, responseV3.DirectionsResponse))
  def directionsForRoute400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def directionsForRoute403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: The directions that a specified route travels in., DataType: V3.DirectionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def directionsForRoute(routeId: Int, token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait DirectionsApiMarshaller {

  implicit def toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DirectionsResponse: ToEntityMarshaller[V3.DirectionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

