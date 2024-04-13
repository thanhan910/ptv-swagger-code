package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import java.util.Date
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.FareEstimateResponse

class FareEstimateApi(
    fareEstimateService: FareEstimateApiService,
    fareEstimateMarshaller: FareEstimateApiMarshaller
) {
  import fareEstimateMarshaller._

  lazy val route: Route =
    path() { (minZone, maxZone) => 
      get {
        parameters("journey_touch_on_utc".as[String].?, "journey_touch_off_utc".as[String].?, "is_journey_in_free_tram_zone".as[Boolean].?, "travelled_route_types".as[String].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature) =>
          
            
              
                
                  fareEstimateService.fareEstimateGetFareEstimateByZone(minZone = minZone, maxZone = maxZone, journeyTouchOnUtc = journeyTouchOnUtc, journeyTouchOffUtc = journeyTouchOffUtc, isJourneyInFreeTramZone = isJourneyInFreeTramZone, travelledRouteTypes = travelledRouteTypes, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait FareEstimateApiService {

  def fareEstimateGetFareEstimateByZone200(responseV3.FareEstimateResponse: V3.FareEstimateResponse)(implicit toEntityMarshallerV3.FareEstimateResponse: ToEntityMarshaller[V3.FareEstimateResponse]): Route =
    complete((200, responseV3.FareEstimateResponse))
  def fareEstimateGetFareEstimateByZone400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def fareEstimateGetFareEstimateByZone403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Resultant set fare estimates, DataType: V3.FareEstimateResponse
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def fareEstimateGetFareEstimateByZone(minZone: Int, maxZone: Int, journeyTouchOnUtc: Option[String], journeyTouchOffUtc: Option[String], isJourneyInFreeTramZone: Option[Boolean], travelledRouteTypes: Option[String], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.FareEstimateResponse: ToEntityMarshaller[V3.FareEstimateResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait FareEstimateApiMarshaller {

  implicit def toEntityMarshallerV3.FareEstimateResponse: ToEntityMarshaller[V3.FareEstimateResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

