/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.V3.DirectionsResponse
import io.swagger.client.model.V3.ErrorResponse
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class DirectionsApi(
  val defBasePath: String = "https://timetableapi.ptv.vic.gov.au/",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DirectionsApiAsyncHelper(client, config)

  /**
   * View all routes for a direction of travel
   * 
   *
   * @param directionId Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return V3.DirectionsResponse
   */
  def directionsForDirection(directionId: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Option[V3.DirectionsResponse] = {
    val await = Try(Await.result(directionsForDirectionAsync(directionId, token, devid, signature), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * View all routes for a direction of travel asynchronously
   * 
   *
   * @param directionId Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return Future(V3.DirectionsResponse)
   */
  def directionsForDirectionAsync(directionId: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Future[V3.DirectionsResponse] = {
      helper.directionsForDirection(directionId, token, devid, signature)
  }

  /**
   * View all routes of a particular type for a direction of travel
   * 
   *
   * @param directionId Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} 
   * @param routeType Number identifying transport mode; values returned via RouteTypes API 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return V3.DirectionsResponse
   */
  def directionsForDirectionAndType(directionId: Integer, routeType: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Option[V3.DirectionsResponse] = {
    val await = Try(Await.result(directionsForDirectionAndTypeAsync(directionId, routeType, token, devid, signature), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * View all routes of a particular type for a direction of travel asynchronously
   * 
   *
   * @param directionId Identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id} 
   * @param routeType Number identifying transport mode; values returned via RouteTypes API 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return Future(V3.DirectionsResponse)
   */
  def directionsForDirectionAndTypeAsync(directionId: Integer, routeType: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Future[V3.DirectionsResponse] = {
      helper.directionsForDirectionAndType(directionId, routeType, token, devid, signature)
  }

  /**
   * View directions that a route travels in
   * 
   *
   * @param routeId Identifier of route; values returned by Routes API - v3/routes 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return V3.DirectionsResponse
   */
  def directionsForRoute(routeId: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Option[V3.DirectionsResponse] = {
    val await = Try(Await.result(directionsForRouteAsync(routeId, token, devid, signature), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * View directions that a route travels in asynchronously
   * 
   *
   * @param routeId Identifier of route; values returned by Routes API - v3/routes 
   * @param token Please ignore (optional)
   * @param devid Your developer id (optional)
   * @param signature Authentication signature for request (optional)
   * @return Future(V3.DirectionsResponse)
   */
  def directionsForRouteAsync(routeId: Integer, token: Option[String] = None, devid: Option[String] = None, signature: Option[String] = None): Future[V3.DirectionsResponse] = {
      helper.directionsForRoute(routeId, token, devid, signature)
  }

}

class DirectionsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def directionsForDirection(directionId: Integer,
    token: Option[String] = None,
    devid: Option[String] = None,
    signature: Option[String] = None
    )(implicit reader: ClientResponseReader[V3.DirectionsResponse]): Future[V3.DirectionsResponse] = {
    // create path and map variables
    val path = (addFmt("/v3/directions/{direction_id}")
      replaceAll("\\{" + "direction_id" + "\\}", directionId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    token match {
      case Some(param) => queryParams += "token" -> param.toString
      case _ => queryParams
    }
    devid match {
      case Some(param) => queryParams += "devid" -> param.toString
      case _ => queryParams
    }
    signature match {
      case Some(param) => queryParams += "signature" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def directionsForDirectionAndType(directionId: Integer,
    routeType: Integer,
    token: Option[String] = None,
    devid: Option[String] = None,
    signature: Option[String] = None
    )(implicit reader: ClientResponseReader[V3.DirectionsResponse]): Future[V3.DirectionsResponse] = {
    // create path and map variables
    val path = (addFmt("/v3/directions/{direction_id}/route_type/{route_type}")
      replaceAll("\\{" + "direction_id" + "\\}", directionId.toString)
      replaceAll("\\{" + "route_type" + "\\}", routeType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    token match {
      case Some(param) => queryParams += "token" -> param.toString
      case _ => queryParams
    }
    devid match {
      case Some(param) => queryParams += "devid" -> param.toString
      case _ => queryParams
    }
    signature match {
      case Some(param) => queryParams += "signature" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def directionsForRoute(routeId: Integer,
    token: Option[String] = None,
    devid: Option[String] = None,
    signature: Option[String] = None
    )(implicit reader: ClientResponseReader[V3.DirectionsResponse]): Future[V3.DirectionsResponse] = {
    // create path and map variables
    val path = (addFmt("/v3/directions/route/{route_id}")
      replaceAll("\\{" + "route_id" + "\\}", routeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    token match {
      case Some(param) => queryParams += "token" -> param.toString
      case _ => queryParams
    }
    devid match {
      case Some(param) => queryParams += "devid" -> param.toString
      case _ => queryParams
    }
    signature match {
      case Some(param) => queryParams += "signature" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
