package io.swagger.model;

import io.swagger.model.V3StopAccessibilityWheelchair;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3StopAccessibility   {
  
  @Schema(description = "Indicates if there is lighting at the stop")
 /**
   * Indicates if there is lighting at the stop  
  **/
  private Boolean lighting = null;
  
  @Schema(description = "Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)")
 /**
   * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)  
  **/
  private Integer platformNumber = null;
  
  @Schema(description = "Indicates if there is at least one audio customer information at the stop/platform")
 /**
   * Indicates if there is at least one audio customer information at the stop/platform  
  **/
  private Boolean audioCustomerInformation = null;
  
  @Schema(description = "Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
 /**
   * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  
  **/
  private Boolean escalator = null;
  
  @Schema(description = "Indicates if there is a hearing loop facility at the stop/platform")
 /**
   * Indicates if there is a hearing loop facility at the stop/platform  
  **/
  private Boolean hearingLoop = null;
  
  @Schema(description = "Indicates if there is an elevator at the stop/platform")
 /**
   * Indicates if there is an elevator at the stop/platform  
  **/
  private Boolean lift = null;
  
  @Schema(description = "Indicates if there are stairs available in the stop")
 /**
   * Indicates if there are stairs available in the stop  
  **/
  private Boolean stairs = null;
  
  @Schema(description = "Indicates if the stop is accessible")
 /**
   * Indicates if the stop is accessible  
  **/
  private Boolean stopAccessible = null;
  
  @Schema(description = "Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop")
 /**
   * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop  
  **/
  private Boolean tactileGroundSurfaceIndicator = null;
  
  @Schema(description = "Indicates if there is a general waiting area at the stop")
 /**
   * Indicates if there is a general waiting area at the stop  
  **/
  private Boolean waitingRoom = null;
  
  @Schema(description = "")
  private V3StopAccessibilityWheelchair wheelchair = null;
 /**
   * Indicates if there is lighting at the stop
   * @return lighting
  **/
  @JsonProperty("lighting")
  public Boolean isLighting() {
    return lighting;
  }

  public void setLighting(Boolean lighting) {
    this.lighting = lighting;
  }

  public V3StopAccessibility lighting(Boolean lighting) {
    this.lighting = lighting;
    return this;
  }

 /**
   * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
   * @return platformNumber
  **/
  @JsonProperty("platform_number")
  public Integer getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
  }

  public V3StopAccessibility platformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

 /**
   * Indicates if there is at least one audio customer information at the stop/platform
   * @return audioCustomerInformation
  **/
  @JsonProperty("audio_customer_information")
  public Boolean isAudioCustomerInformation() {
    return audioCustomerInformation;
  }

  public void setAudioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
  }

  public V3StopAccessibility audioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
    return this;
  }

 /**
   * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   * @return escalator
  **/
  @JsonProperty("escalator")
  public Boolean isEscalator() {
    return escalator;
  }

  public void setEscalator(Boolean escalator) {
    this.escalator = escalator;
  }

  public V3StopAccessibility escalator(Boolean escalator) {
    this.escalator = escalator;
    return this;
  }

 /**
   * Indicates if there is a hearing loop facility at the stop/platform
   * @return hearingLoop
  **/
  @JsonProperty("hearing_loop")
  public Boolean isHearingLoop() {
    return hearingLoop;
  }

  public void setHearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
  }

  public V3StopAccessibility hearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
    return this;
  }

 /**
   * Indicates if there is an elevator at the stop/platform
   * @return lift
  **/
  @JsonProperty("lift")
  public Boolean isLift() {
    return lift;
  }

  public void setLift(Boolean lift) {
    this.lift = lift;
  }

  public V3StopAccessibility lift(Boolean lift) {
    this.lift = lift;
    return this;
  }

 /**
   * Indicates if there are stairs available in the stop
   * @return stairs
  **/
  @JsonProperty("stairs")
  public Boolean isStairs() {
    return stairs;
  }

  public void setStairs(Boolean stairs) {
    this.stairs = stairs;
  }

  public V3StopAccessibility stairs(Boolean stairs) {
    this.stairs = stairs;
    return this;
  }

 /**
   * Indicates if the stop is accessible
   * @return stopAccessible
  **/
  @JsonProperty("stop_accessible")
  public Boolean isStopAccessible() {
    return stopAccessible;
  }

  public void setStopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
  }

  public V3StopAccessibility stopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
    return this;
  }

 /**
   * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
   * @return tactileGroundSurfaceIndicator
  **/
  @JsonProperty("tactile_ground_surface_indicator")
  public Boolean isTactileGroundSurfaceIndicator() {
    return tactileGroundSurfaceIndicator;
  }

  public void setTactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
  }

  public V3StopAccessibility tactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
    return this;
  }

 /**
   * Indicates if there is a general waiting area at the stop
   * @return waitingRoom
  **/
  @JsonProperty("waiting_room")
  public Boolean isWaitingRoom() {
    return waitingRoom;
  }

  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }

  public V3StopAccessibility waitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
    return this;
  }

 /**
   * Get wheelchair
   * @return wheelchair
  **/
  @JsonProperty("wheelchair")
  public V3StopAccessibilityWheelchair getWheelchair() {
    return wheelchair;
  }

  public void setWheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
  }

  public V3StopAccessibility wheelchair(V3StopAccessibilityWheelchair wheelchair) {
    this.wheelchair = wheelchair;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
