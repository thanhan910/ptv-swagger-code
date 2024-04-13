package io.swagger.model;

import io.swagger.model.V3PassengerFare;
import io.swagger.model.V3ZoneInfo;
import java.util.ArrayList;
import java.util.List;

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

public class V3FareEstimateResult   {
  
  @Schema(description = "")
  private Boolean isEarlyBird = null;
  
  @Schema(description = "")
  private Boolean isJourneyInFreeTramZone = null;
  
  @Schema(description = "")
  private Boolean isThisWeekendJourney = null;
  
  @Schema(description = "")
  private V3ZoneInfo zoneInfo = null;
  
  @Schema(description = "")
  private List<V3PassengerFare> passengerFares = null;
 /**
   * Get isEarlyBird
   * @return isEarlyBird
  **/
  @JsonProperty("IsEarlyBird")
  public Boolean isIsEarlyBird() {
    return isEarlyBird;
  }

  public void setIsEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
  }

  public V3FareEstimateResult isEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
    return this;
  }

 /**
   * Get isJourneyInFreeTramZone
   * @return isJourneyInFreeTramZone
  **/
  @JsonProperty("IsJourneyInFreeTramZone")
  public Boolean isIsJourneyInFreeTramZone() {
    return isJourneyInFreeTramZone;
  }

  public void setIsJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
  }

  public V3FareEstimateResult isJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
    return this;
  }

 /**
   * Get isThisWeekendJourney
   * @return isThisWeekendJourney
  **/
  @JsonProperty("IsThisWeekendJourney")
  public Boolean isIsThisWeekendJourney() {
    return isThisWeekendJourney;
  }

  public void setIsThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
  }

  public V3FareEstimateResult isThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
    return this;
  }

 /**
   * Get zoneInfo
   * @return zoneInfo
  **/
  @JsonProperty("ZoneInfo")
  public V3ZoneInfo getZoneInfo() {
    return zoneInfo;
  }

  public void setZoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
  }

  public V3FareEstimateResult zoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
    return this;
  }

 /**
   * Get passengerFares
   * @return passengerFares
  **/
  @JsonProperty("PassengerFares")
  public List<V3PassengerFare> getPassengerFares() {
    return passengerFares;
  }

  public void setPassengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
  }

  public V3FareEstimateResult passengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
    return this;
  }

  public V3FareEstimateResult addPassengerFaresItem(V3PassengerFare passengerFaresItem) {
    this.passengerFares.add(passengerFaresItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
