package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopAccessibilityWheelchair;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StopAccessibility   {
  private Boolean lighting = null;  private Integer platformNumber = null;  private Boolean audioCustomerInformation = null;  private Boolean escalator = null;  private Boolean hearingLoop = null;  private Boolean lift = null;  private Boolean stairs = null;  private Boolean stopAccessible = null;  private Boolean tactileGroundSurfaceIndicator = null;  private Boolean waitingRoom = null;  private V3StopAccessibilityWheelchair wheelchair = null;

  /**
   * Indicates if there is lighting at the stop
   **/
  
  @Schema(description = "Indicates if there is lighting at the stop")
  @JsonProperty("lighting")
  public Boolean isLighting() {
    return lighting;
  }
  public void setLighting(Boolean lighting) {
    this.lighting = lighting;
  }

  /**
   * Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
   **/
  
  @Schema(description = "Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)")
  @JsonProperty("platform_number")
  public Integer getPlatformNumber() {
    return platformNumber;
  }
  public void setPlatformNumber(Integer platformNumber) {
    this.platformNumber = platformNumber;
  }

  /**
   * Indicates if there is at least one audio customer information at the stop/platform
   **/
  
  @Schema(description = "Indicates if there is at least one audio customer information at the stop/platform")
  @JsonProperty("audio_customer_information")
  public Boolean isAudioCustomerInformation() {
    return audioCustomerInformation;
  }
  public void setAudioCustomerInformation(Boolean audioCustomerInformation) {
    this.audioCustomerInformation = audioCustomerInformation;
  }

  /**
   * Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
   **/
  
  @Schema(description = "Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)")
  @JsonProperty("escalator")
  public Boolean isEscalator() {
    return escalator;
  }
  public void setEscalator(Boolean escalator) {
    this.escalator = escalator;
  }

  /**
   * Indicates if there is a hearing loop facility at the stop/platform
   **/
  
  @Schema(description = "Indicates if there is a hearing loop facility at the stop/platform")
  @JsonProperty("hearing_loop")
  public Boolean isHearingLoop() {
    return hearingLoop;
  }
  public void setHearingLoop(Boolean hearingLoop) {
    this.hearingLoop = hearingLoop;
  }

  /**
   * Indicates if there is an elevator at the stop/platform
   **/
  
  @Schema(description = "Indicates if there is an elevator at the stop/platform")
  @JsonProperty("lift")
  public Boolean isLift() {
    return lift;
  }
  public void setLift(Boolean lift) {
    this.lift = lift;
  }

  /**
   * Indicates if there are stairs available in the stop
   **/
  
  @Schema(description = "Indicates if there are stairs available in the stop")
  @JsonProperty("stairs")
  public Boolean isStairs() {
    return stairs;
  }
  public void setStairs(Boolean stairs) {
    this.stairs = stairs;
  }

  /**
   * Indicates if the stop is accessible
   **/
  
  @Schema(description = "Indicates if the stop is accessible")
  @JsonProperty("stop_accessible")
  public Boolean isStopAccessible() {
    return stopAccessible;
  }
  public void setStopAccessible(Boolean stopAccessible) {
    this.stopAccessible = stopAccessible;
  }

  /**
   * Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
   **/
  
  @Schema(description = "Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop")
  @JsonProperty("tactile_ground_surface_indicator")
  public Boolean isTactileGroundSurfaceIndicator() {
    return tactileGroundSurfaceIndicator;
  }
  public void setTactileGroundSurfaceIndicator(Boolean tactileGroundSurfaceIndicator) {
    this.tactileGroundSurfaceIndicator = tactileGroundSurfaceIndicator;
  }

  /**
   * Indicates if there is a general waiting area at the stop
   **/
  
  @Schema(description = "Indicates if there is a general waiting area at the stop")
  @JsonProperty("waiting_room")
  public Boolean isWaitingRoom() {
    return waitingRoom;
  }
  public void setWaitingRoom(Boolean waitingRoom) {
    this.waitingRoom = waitingRoom;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("wheelchair")
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
    return Objects.equals(lighting, v3StopAccessibility.lighting) &&
        Objects.equals(platformNumber, v3StopAccessibility.platformNumber) &&
        Objects.equals(audioCustomerInformation, v3StopAccessibility.audioCustomerInformation) &&
        Objects.equals(escalator, v3StopAccessibility.escalator) &&
        Objects.equals(hearingLoop, v3StopAccessibility.hearingLoop) &&
        Objects.equals(lift, v3StopAccessibility.lift) &&
        Objects.equals(stairs, v3StopAccessibility.stairs) &&
        Objects.equals(stopAccessible, v3StopAccessibility.stopAccessible) &&
        Objects.equals(tactileGroundSurfaceIndicator, v3StopAccessibility.tactileGroundSurfaceIndicator) &&
        Objects.equals(waitingRoom, v3StopAccessibility.waitingRoom) &&
        Objects.equals(wheelchair, v3StopAccessibility.wheelchair);
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
