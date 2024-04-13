package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3StopAccessibilityWheelchair;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StopAccessibility
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StopAccessibility   {
  private Boolean lighting = null;

  private Integer platformNumber = null;

  private Boolean audioCustomerInformation = null;

  private Boolean escalator = null;

  private Boolean hearingLoop = null;

  private Boolean lift = null;

  private Boolean stairs = null;

  private Boolean stopAccessible = null;

  private Boolean tactileGroundSurfaceIndicator = null;

  private Boolean waitingRoom = null;

  private V3StopAccessibilityWheelchair wheelchair = null;

  public V3StopAccessibility lighting(Boolean lighting) {
    this.lighting = lighting;
    return this;
  }

  /**
   * Indicates if there is lighting at the stop
   * @return lighting
   **/
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
