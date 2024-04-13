package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3PassengerFare;
import io.swagger.model.V3ZoneInfo;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3FareEstimateResult   {
  private Boolean isEarlyBird = null;  private Boolean isJourneyInFreeTramZone = null;  private Boolean isThisWeekendJourney = null;  private V3ZoneInfo zoneInfo = null;  private List<V3PassengerFare> passengerFares = new ArrayList<V3PassengerFare>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("IsEarlyBird")
  public Boolean isIsEarlyBird() {
    return isEarlyBird;
  }
  public void setIsEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("IsJourneyInFreeTramZone")
  public Boolean isIsJourneyInFreeTramZone() {
    return isJourneyInFreeTramZone;
  }
  public void setIsJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("IsThisWeekendJourney")
  public Boolean isIsThisWeekendJourney() {
    return isThisWeekendJourney;
  }
  public void setIsThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ZoneInfo")
  public V3ZoneInfo getZoneInfo() {
    return zoneInfo;
  }
  public void setZoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
  }

  /**
   **/
  
  @Schema(description = "")
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
