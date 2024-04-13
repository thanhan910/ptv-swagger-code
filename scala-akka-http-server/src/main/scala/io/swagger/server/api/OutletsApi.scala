package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.OutletGeolocationResponse
import io.swagger.server.model.V3.OutletResponse

class OutletsApi(
    outletsService: OutletsApiService,
    outletsMarshaller: OutletsApiMarshaller
) {
  import outletsMarshaller._

  lazy val route: Route =
    path() { 
      get {
        parameters("max_results".as[Int].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (maxResults, token, devid, signature) =>
          
            
              
                
                  outletsService.outletsGetAllOutlets(maxResults = maxResults, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (latitude, longitude) => 
      get {
        parameters("max_distance".as[Double].?, "max_results".as[Int].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (maxDistance, maxResults, token, devid, signature) =>
          
            
              
                
                  outletsService.outletsGetOutletsByGeolocation(latitude = latitude, longitude = longitude, maxDistance = maxDistance, maxResults = maxResults, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait OutletsApiService {

  def outletsGetAllOutlets200(responseV3.OutletResponse: V3.OutletResponse)(implicit toEntityMarshallerV3.OutletResponse: ToEntityMarshaller[V3.OutletResponse]): Route =
    complete((200, responseV3.OutletResponse))
  def outletsGetAllOutlets400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def outletsGetAllOutlets403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Ticket outlets., DataType: V3.OutletResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def outletsGetAllOutlets(maxResults: Option[Int], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.OutletResponse: ToEntityMarshaller[V3.OutletResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def outletsGetOutletsByGeolocation200(responseV3.OutletGeolocationResponse: V3.OutletGeolocationResponse)(implicit toEntityMarshallerV3.OutletGeolocationResponse: ToEntityMarshaller[V3.OutletGeolocationResponse]): Route =
    complete((200, responseV3.OutletGeolocationResponse))
  def outletsGetOutletsByGeolocation400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def outletsGetOutletsByGeolocation403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Ticket outlets near the specified location., DataType: V3.OutletGeolocationResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def outletsGetOutletsByGeolocation(latitude: Float, longitude: Float, maxDistance: Option[Double], maxResults: Option[Int], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.OutletGeolocationResponse: ToEntityMarshaller[V3.OutletGeolocationResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait OutletsApiMarshaller {

  implicit def toEntityMarshallerV3.OutletResponse: ToEntityMarshaller[V3.OutletResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.OutletGeolocationResponse: ToEntityMarshaller[V3.OutletGeolocationResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

