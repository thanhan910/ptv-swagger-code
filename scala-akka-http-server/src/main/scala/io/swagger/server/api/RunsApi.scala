package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.RunResponse
import io.swagger.server.model.V3.RunsResponse

class RunsApi(
    runsService: RunsApiService,
    runsMarshaller: RunsApiMarshaller
) {
  import runsMarshaller._

  lazy val route: Route =
    path() { (routeId) => 
      get {
        parameters("expand".as[String].?, "date_utc".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (expand, dateUtc, token, devid, signature) =>
          
            
              
                
                  runsService.runsForRoute(routeId = routeId, expand = expand, dateUtc = dateUtc, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (routeId, routeType) => 
      get {
        parameters("expand".as[String], "date_utc".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (expand, dateUtc, token, devid, signature) =>
          
            
              
                
                  runsService.runsForRouteAndRouteType(routeId = routeId, routeType = routeType, expand = expand, dateUtc = dateUtc, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (runRef) => 
      get {
        parameters("expand".as[String], "date_utc".as[String].?, "include_geopath".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (expand, dateUtc, includeGeopath, token, devid, signature) =>
          
            
              
                
                  runsService.runsForRun(runRef = runRef, expand = expand, dateUtc = dateUtc, includeGeopath = includeGeopath, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    } ~
    path() { (runRef, routeType) => 
      get {
        parameters("expand".as[String], "date_utc".as[String].?, "include_geopath".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (expand, dateUtc, includeGeopath, token, devid, signature) =>
          
            
              
                
                  runsService.runsForRunAndRouteType(runRef = runRef, routeType = routeType, expand = expand, dateUtc = dateUtc, includeGeopath = includeGeopath, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait RunsApiService {

  def runsForRoute200(responseV3.RunsResponse: V3.RunsResponse)(implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]): Route =
    complete((200, responseV3.RunsResponse))
  def runsForRoute400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def runsForRoute403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All trip/service run details for the specified route ID., DataType: V3.RunsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def runsForRoute(routeId: Int, expand: Option[String], dateUtc: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def runsForRouteAndRouteType200(responseV3.RunsResponse: V3.RunsResponse)(implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]): Route =
    complete((200, responseV3.RunsResponse))
  def runsForRouteAndRouteType400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def runsForRouteAndRouteType403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All trip/service run details for the specified route ID and route type., DataType: V3.RunsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def runsForRouteAndRouteType(routeId: Int, routeType: Int, expand: String, dateUtc: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def runsForRun200(responseV3.RunsResponse: V3.RunsResponse)(implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]): Route =
    complete((200, responseV3.RunsResponse))
  def runsForRun400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def runsForRun403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: All trip/service run details for the specified run_ref., DataType: V3.RunsResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def runsForRun(runRef: String, expand: String, dateUtc: Option[String], includeGeopath: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

  def runsForRunAndRouteType200(responseV3.RunResponse: V3.RunResponse)(implicit toEntityMarshallerV3.RunResponse: ToEntityMarshaller[V3.RunResponse]): Route =
    complete((200, responseV3.RunResponse))
  def runsForRunAndRouteType400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def runsForRunAndRouteType403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: The trip/service run details for the run_ref and route type specified., DataType: V3.RunResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def runsForRunAndRouteType(runRef: String, routeType: Int, expand: String, dateUtc: Option[String], includeGeopath: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.RunResponse: ToEntityMarshaller[V3.RunResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait RunsApiMarshaller {

  implicit def toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.RunsResponse: ToEntityMarshaller[V3.RunsResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.RunResponse: ToEntityMarshaller[V3.RunResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

