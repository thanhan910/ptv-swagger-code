package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.V3.DisruptionModesResponse
import io.swagger.server.model.V3.DisruptionResponse
import io.swagger.server.model.V3.DisruptionsResponse
import io.swagger.server.model.V3.ErrorResponse

class DisruptionsApi(
    disruptionsService: DisruptionsApiService,
    disruptionsMarshaller: DisruptionsApiMarshaller
) {
  import disruptionsMarshaller._

  lazy val route: Route =
    path() { 
      get {
        parameters("route_types".as[String].?, "disruption_modes".as[String].?, "disruption_status".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (routeTypes, disruptionModes, disruptionStatus, token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetAllDisruptions(routeTypes = routeTypes, disruptionModes = disruptionModes, disruptionStatus = disruptionStatus, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (disruptionId) => 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetDisruptionById(disruptionId = disruptionId, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { 
      get {
        parameters("token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetDisruptionModes(token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId) => 
      get {
        parameters("disruption_status".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (disruptionStatus, token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetDisruptionsByRoute(routeId = routeId, disruptionStatus = disruptionStatus, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId, stopId) => 
      get {
        parameters("disruption_status".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (disruptionStatus, token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetDisruptionsByRouteAndStop(routeId = routeId, stopId = stopId, disruptionStatus = disruptionStatus, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (stopId) => 
      get {
        parameters("disruption_status".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (disruptionStatus, token, devid, signature) =>
          
            
              
                
                  disruptionsService.disruptionsGetDisruptionsByStop(stopId = stopId, disruptionStatus = disruptionStatus, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait DisruptionsApiService {

  def disruptionsGetAllDisruptions200(responseV3.DisruptionsResponse: V3.DisruptionsResponse)(implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]): Route =
    complete((200, responseV3.DisruptionsResponse))
  def disruptionsGetAllDisruptions400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetAllDisruptions403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All disruption information for all route types., DataType: V3.DisruptionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetAllDisruptions(routeTypes: Option[String], disruptionModes: Option[String], disruptionStatus: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def disruptionsGetDisruptionById200(responseV3.DisruptionResponse: V3.DisruptionResponse)(implicit toEntityMarshallerV3.DisruptionResponse: ToEntityMarshaller[V3.DisruptionResponse]): Route =
    complete((200, responseV3.DisruptionResponse))
  def disruptionsGetDisruptionById400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetDisruptionById403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Disruption information for the specified disruption ID., DataType: V3.DisruptionResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetDisruptionById(disruptionId: Long, token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionResponse: ToEntityMarshaller[V3.DisruptionResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def disruptionsGetDisruptionModes200(responseV3.DisruptionModesResponse: V3.DisruptionModesResponse)(implicit toEntityMarshallerV3.DisruptionModesResponse: ToEntityMarshaller[V3.DisruptionModesResponse]): Route =
    complete((200, responseV3.DisruptionModesResponse))
  def disruptionsGetDisruptionModes400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetDisruptionModes403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Disruption specific modes, DataType: V3.DisruptionModesResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetDisruptionModes(token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionModesResponse: ToEntityMarshaller[V3.DisruptionModesResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def disruptionsGetDisruptionsByRoute200(responseV3.DisruptionsResponse: V3.DisruptionsResponse)(implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]): Route =
    complete((200, responseV3.DisruptionsResponse))
  def disruptionsGetDisruptionsByRoute400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetDisruptionsByRoute403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All disruption information (if any exists) for the specified route., DataType: V3.DisruptionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetDisruptionsByRoute(routeId: Int, disruptionStatus: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def disruptionsGetDisruptionsByRouteAndStop200(responseV3.DisruptionsResponse: V3.DisruptionsResponse)(implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]): Route =
    complete((200, responseV3.DisruptionsResponse))
  def disruptionsGetDisruptionsByRouteAndStop400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetDisruptionsByRouteAndStop403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All disruption information (if any exists) for the specified route and stop., DataType: V3.DisruptionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetDisruptionsByRouteAndStop(routeId: Int, stopId: Int, disruptionStatus: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def disruptionsGetDisruptionsByStop200(responseV3.DisruptionsResponse: V3.DisruptionsResponse)(implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]): Route =
    complete((200, responseV3.DisruptionsResponse))
  def disruptionsGetDisruptionsByStop400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def disruptionsGetDisruptionsByStop403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All disruption information (if any exists) for the specified stop., DataType: V3.DisruptionsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def disruptionsGetDisruptionsByStop(stopId: Int, disruptionStatus: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait DisruptionsApiMarshaller {

  implicit def toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DisruptionResponse: ToEntityMarshaller[V3.DisruptionResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DisruptionModesResponse: ToEntityMarshaller[V3.DisruptionModesResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.DisruptionsResponse: ToEntityMarshaller[V3.DisruptionsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

