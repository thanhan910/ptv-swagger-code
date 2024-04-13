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
import io.swagger.client.model.V3StopAccessibilityWheelchair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V3StopAccessibility
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-14T03:34:48.659724600+10:00[Australia/Sydney]")

public class V3StopAccessibility {
  @SerializedName("lighting")
  private Boolean lighting = null;

  @SerializedName("platform_number")
  private Integer platformNumber = null;

  @SerializedName("audio_customer_information")
  private Boolean audioCustomerInformation = null;

  @SerializedName("escalator")
  private Boolean escalator = null;

  @SerializedName("hearing_loop")
  private Boolean hearingLoop = null;

  @SerializedName("lift")
  private Boolean lift = null;

  @SerializedName("stairs")
  private Boolean stairs = null;

  @SerializedName("stop_accessible")
  private Boolean stopAccessible = null;

  @SerializedName("tactile_ground_surface_indicator")
  private Boolean tactileGroundSurfaceIndicator = null;

  @SerializedName("waiting_room")
  private Boolean waitingRoom = null;

  @SerializedName("wheelchair")
  private V3StopAccessibilityWheelchair wheelchair = null;

  public V3StopAccessibility lighting(Boolean lighting) {
    this.lighting = lighting;
    return this;
  }

   /**
   * Indicates if there is lighting at the stop
   * @return lighting
  **/
  @Schema(description = "Indicates if there is lighting at the stop")
  public Boolean isLighting() {
    return lighting;
  }

  public void setLighting(Boolean lighting) {
    this.lighting = lighting;
  }

  public V3StopAccessibility platformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

   /**
   * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
   * @return platformNumber
  **/
  @Schema(description = "Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)")
  public Integer getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
  }

  public V3StopAccessibility audioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
    return this;
  }

   /**
   * Indicates if there is at least one audio customer information at the stop/platform
   * @return audioCustomerInformation
  **/
  @Schema(description = "Indicates if there is at least one audio customer information at the stop/platform")
  public Boolean isAudioCustomerInformation() {
    return audioCustomerInformation;
  }

  public void setAudioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
  }

  public V3StopAccessibility escalator(Boolean escalator) {
    this.escalator = escalator;
    return this;
  }

   /**
   * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return escalator
  **/
  @Schema(description = "Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  public Boolean isEscalator() {
    return escalator;
  }

  public void setEscalator(Boolean escalator) {
    this.escalator = escalator;
  }

  public V3StopAccessibility hearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
    return this;
  }

   /**
   * Indicates if there is a hearing loop facility at the stop/platform
   * @return hearingLoop
  **/
  @Schema(description = "Indicates if there is a hearing loop facility at the stop/platform")
  public Boolean isHearingLoop() {
    return hearingLoop;
  }

  public void setHearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
  }

  public V3StopAccessibility lift(Boolean lift) {
    this.lift = lift;
    return this;
  }

   /**
   * Indicates if there is an elevator at the stop/platform
   * @return lift
  **/
  @Schema(description = "Indicates if there is an elevator at the stop/platform")
  public Boolean isLift() {
    return lift;
  }

  public void setLift(Boolean lift) {
    this.lift = lift;
  }

  public V3StopAccessibility stairs(Boolean stairs) {
    this.stairs = stairs;
    return this;
  }

   /**
   * Indicates if there are stairs available in the stop
   * @return stairs
  **/
  @Schema(description = "Indicates if there are stairs available in the stop")
  public Boolean isStairs() {
    return stairs;
  }

  public void setStairs(Boolean stairs) {
    this.stairs = stairs;
  }

  public V3StopAccessibility stopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
    return this;
  }

   /**
   * Indicates if the stop is accessible
   * @return stopAccessible
  **/
  @Schema(description = "Indicates if the stop is accessible")
  public Boolean isStopAccessible() {
    return stopAccessible;
  }

  public void setStopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
  }

  public V3StopAccessibility tactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
    return this;
  }

   /**
   * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
   * @return tactileGroundSurfaceIndicator
  **/
  @Schema(description = "Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop")
  public Boolean isTactileGroundSurfaceIndicator() {
    return tactileGroundSurfaceIndicator;
  }

  public void setTactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
  }

  public V3StopAccessibility waitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
    return this;
  }

   /**
   * Indicates if there is a general waiting area at the stop
   * @return waitingRoom
  **/
  @Schema(description = "Indicates if there is a general waiting area at the stop")
  public Boolean isWaitingRoom() {
    return waitingRoom;
  }

  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }

  public V3StopAccessibility wheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
    return this;
  }

   /**
   * Get wheelchair
   * @return wheelchair
  **/
  @Schema(description = "")
  public V3StopAccessibilityWheelchair getWheelchair() {
    return wheelchair;
  }

  public void setWheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopAccessibility v3StopAccessibility = (V3StopAccessibility) o;
    return Objects.equals(this.lighting, v3StopAccessibility.lighting) &&
        Objects.equals(this.platformNumber, v3StopAccessibility.platformNumber) &&
        Objects.equals(this.audioCustomerInformation, v3StopAccessibility.audioCustomerInformation) &&
        Objects.equals(this.escalator, v3StopAccessibility.escalator) &&
        Objects.equals(this.hearingLoop, v3StopAccessibility.hearingLoop) &&
        Objects.equals(this.lift, v3StopAccessibility.lift) &&
        Objects.equals(this.stairs, v3StopAccessibility.stairs) &&
        Objects.equals(this.stopAccessible, v3StopAccessibility.stopAccessible) &&
        Objects.equals(this.tactileGroundSurfaceIndicator, v3StopAccessibility.tactileGroundSurfaceIndicator) &&
        Objects.equals(this.waitingRoom, v3StopAccessibility.waitingRoom) &&
        Objects.equals(this.wheelchair, v3StopAccessibility.wheelchair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lighting, platformNumber, audioCustomerInformation, escalator, hearingLoop, lift, stairs, stopAccessible, tactileGroundSurfaceIndicator, waitingRoom, wheelchair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopAccessibility {\n");
    
    sb.append("    lighting: ").append(toIndentedString(lighting)).append("\n");
    sb.append("    platformNumber: ").append(toIndentedString(platformNumber)).append("\n");
    sb.append("    audioCustomerInformation: ").append(toIndentedString(audioCustomerInformation)).append("\n");
    sb.append("    escalator: ").append(toIndentedString(escalator)).append("\n");
    sb.append("    hearingLoop: ").append(toIndentedString(hearingLoop)).append("\n");
    sb.append("    lift: ").append(toIndentedString(lift)).append("\n");
    sb.append("    stairs: ").append(toIndentedString(stairs)).append("\n");
    sb.append("    stopAccessible: ").append(toIndentedString(stopAccessible)).append("\n");
    sb.append("    tactileGroundSurfaceIndicator: ").append(toIndentedString(tactileGroundSurfaceIndicator)).append("\n");
    sb.append("    waitingRoom: ").append(toIndentedString(waitingRoom)).append("\n");
    sb.append("    wheelchair: ").append(toIndentedString(wheelchair)).append("\n");
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
