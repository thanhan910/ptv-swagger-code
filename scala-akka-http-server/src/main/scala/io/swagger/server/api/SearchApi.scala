package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.V3.ErrorResponse
import io.swagger.server.model.V3.SearchResult

class SearchApi(
    searchService: SearchApiService,
    searchMarshaller: SearchApiMarshaller
) {
  import searchMarshaller._

  lazy val route: Route =
    path() { (searchTerm) => 
      get {
        parameters("route_types".as[String].?, "latitude".as[Float].?, "longitude".as[Float].?, "max_distance".as[Float].?, "include_addresses".as[Boolean].?, "include_outlets".as[Boolean].?, "match_stop_by_suburb".as[Boolean].?, "match_route_by_suburb".as[Boolean].?, "match_stop_by_gtfs_stop_id".as[Boolean].?, "token".as[String].?, "devid".as[String].?, "signature".as[String].?) { (routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId, token, devid, signature) =>
          
            
              
                
                  searchService.searchSearch(searchTerm = searchTerm, routeTypes = routeTypes, latitude = latitude, longitude = longitude, maxDistance = maxDistance, includeAddresses = includeAddresses, includeOutlets = includeOutlets, matchStopBySuburb = matchStopBySuburb, matchRouteBySuburb = matchRouteBySuburb, matchStopByGtfsStopId = matchStopByGtfsStopId, token = token, devid = devid, signature = signature)
               
             
           
         
        }
      }
    }
}

trait SearchApiService {

  def searchSearch200(responseV3.SearchResult: V3.SearchResult)(implicit toEntityMarshallerV3.SearchResult: ToEntityMarshaller[V3.SearchResult]): Route =
    complete((200, responseV3.SearchResult))
  def searchSearch400(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((400, responseV3.ErrorResponse))
  def searchSearch403(responseV3.ErrorResponse: V3.ErrorResponse)(implicit toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route =
    complete((403, responseV3.ErrorResponse))
  /**
   * Code: 200, Message: Stops, routes and myki ticket outlets that contain the search term (note: stops and routes are ordered by route_type by default)., DataType: V3.SearchResult
   * Code: 400, Message: Invalid Request, DataType: V3.ErrorResponse
   * Code: 403, Message: Access Denied, DataType: V3.ErrorResponse
   */
  def searchSearch(searchTerm: String, routeTypes: Option[String], latitude: Option[Float], longitude: Option[Float], maxDistance: Option[Float], includeAddresses: Option[Boolean], includeOutlets: Option[Boolean], matchStopBySuburb: Option[Boolean], matchRouteBySuburb: Option[Boolean], matchStopByGtfsStopId: Option[Boolean], token: Option[String], devid: Option[String], signature: Option[String])
      (implicit toEntityMarshallerV3.SearchResult: ToEntityMarshaller[V3.SearchResult], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse], toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]): Route

}

trait SearchApiMarshaller {

  implicit def toEntityMarshallerV3.SearchResult: ToEntityMarshaller[V3.SearchResult]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

  implicit def toEntityMarshallerV3.ErrorResponse: ToEntityMarshaller[V3.ErrorResponse]

}

