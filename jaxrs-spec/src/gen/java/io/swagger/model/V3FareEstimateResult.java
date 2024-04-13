package io.swagger.model;

import io.swagger.model.V3PassengerFare;
import io.swagger.model.V3ZoneInfo;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3FareEstimateResult   {

  private @Valid Boolean isEarlyBird = null;

  private @Valid Boolean isJourneyInFreeTramZone = null;

  private @Valid Boolean isThisWeekendJourney = null;

  private @Valid V3ZoneInfo zoneInfo = null;

  private @Valid List<V3PassengerFare> passengerFares = new ArrayList<V3PassengerFare>();

  /**
   **/
  public V3FareEstimateResult isEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IsEarlyBird")

  public Boolean isIsEarlyBird() {
    return isEarlyBird;
  }
  public void setIsEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
  }

  /**
   **/
  public V3FareEstimateResult isJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IsJourneyInFreeTramZone")

  public Boolean isIsJourneyInFreeTramZone() {
    return isJourneyInFreeTramZone;
  }
  public void setIsJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
  }

  /**
   **/
  public V3FareEstimateResult isThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IsThisWeekendJourney")

  public Boolean isIsThisWeekendJourney() {
    return isThisWeekendJourney;
  }
  public void setIsThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
  }

  /**
   **/
  public V3FareEstimateResult zoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ZoneInfo")

  public V3ZoneInfo getZoneInfo() {
    return zoneInfo;
  }
  public void setZoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
  }

  /**
   **/
  public V3FareEstimateResult passengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PassengerFares")

  public List<V3PassengerFare> getPassengerFares() {
    return passengerFares;
  }
  public void setPassengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3FareEstimateResult v3FareEstimateResult = (V3FareEstimateResult) o;
    return Objects.equals(isEarlyBird, v3FareEstimateResult.isEarlyBird) &&
        Objects.equals(isJourneyInFreeTramZone, v3FareEstimateResult.isJourneyInFreeTramZone) &&
        Objects.equals(isThisWeekendJourney, v3FareEstimateResult.isThisWeekendJourney) &&
        Objects.equals(zoneInfo, v3FareEstimateResult.zoneInfo) &&
        Objects.equals(passengerFares, v3FareEstimateResult.passengerFares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEarlyBird, isJourneyInFreeTramZone, isThisWeekendJourney, zoneInfo, passengerFares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3FareEstimateResult {\n");
    
    sb.append("    isEarlyBird: ").append(toIndentedString(isEarlyBird)).append("\n");
    sb.append("    isJourneyInFreeTramZone: ").append(toIndentedString(isJourneyInFreeTramZone)).append("\n");
    sb.append("    isThisWeekendJourney: ").append(toIndentedString(isThisWeekendJourney)).append("\n");
    sb.append("    zoneInfo: ").append(toIndentedString(zoneInfo)).append("\n");
    sb.append("    passengerFares: ").append(toIndentedString(passengerFares)).append("\n");
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
