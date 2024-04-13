/*
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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V3StopModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-14T03:34:48.659724600+10:00[Australia/Sydney]")

public class V3StopModel {
  @SerializedName("stop_distance")
  private Float stopDistance = null;

  @SerializedName("stop_suburb")
  private String stopSuburb = null;

  @SerializedName("stop_name")
  private String stopName = null;

  @SerializedName("stop_id")
  private Integer stopId = null;

  @SerializedName("route_type")
  private Integer routeType = null;

  @SerializedName("stop_latitude")
  private Float stopLatitude = null;

  @SerializedName("stop_longitude")
  private Float stopLongitude = null;

  @SerializedName("stop_landmark")
  private String stopLandmark = null;

  @SerializedName("stop_sequence")
  private Integer stopSequence = null;

  public V3StopModel stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

   /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   * @return stopDistance
  **/
  @Schema(description = "Distance of stop from input location (in metres); returns 0 if no location is input")
  public Float getStopDistance() {
    return stopDistance;
  }

  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }

  public V3StopModel stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

   /**
   * suburb of stop
   * @return stopSuburb
  **/
  @Schema(description = "suburb of stop")
  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3StopModel stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

   /**
   * Name of stop
   * @return stopName
  **/
  @Schema(description = "Name of stop")
  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3StopModel stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

   /**
   * Stop identifier
   * @return stopId
  **/
  @Schema(description = "Stop identifier")
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3StopModel routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Transport mode identifier
   * @return routeType
  **/
  @Schema(description = "Transport mode identifier")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3StopModel stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

   /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @Schema(description = "Geographic coordinate of latitude at stop")
  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3StopModel stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

   /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @Schema(description = "Geographic coordinate of longitude at stop")
  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3StopModel stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

   /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @Schema(description = "Landmark in proximity of stop")
  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3StopModel stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

   /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
  **/
  @Schema(description = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
  public Integer getStopSequence() {
    return stopSequence;
  }

  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopModel v3StopModel = (V3StopModel) o;
    return Objects.equals(this.stopDistance, v3StopModel.stopDistance) &&
        Objects.equals(this.stopSuburb, v3StopModel.stopSuburb) &&
        Objects.equals(this.stopName, v3StopModel.stopName) &&
        Objects.equals(this.stopId, v3StopModel.stopId) &&
        Objects.equals(this.routeType, v3StopModel.routeType) &&
        Objects.equals(this.stopLatitude, v3StopModel.stopLatitude) &&
        Objects.equals(this.stopLongitude, v3StopModel.stopLongitude) &&
        Objects.equals(this.stopLandmark, v3StopModel.stopLandmark) &&
        Objects.equals(this.stopSequence, v3StopModel.stopSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopDistance, stopSuburb, stopName, stopId, routeType, stopLatitude, stopLongitude, stopLandmark, stopSequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopModel {\n");
    
    sb.append("    stopDistance: ").append(toIndentedString(stopDistance)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
