package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3PassengerFare;
import io.swagger.server.api.model.V3ZoneInfo;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3FareEstimateResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3FareEstimateResult   {
  private Boolean isEarlyBird = null;

  private Boolean isJourneyInFreeTramZone = null;

  private Boolean isThisWeekendJourney = null;

  private V3ZoneInfo zoneInfo = null;

  
  private List<V3PassengerFare> passengerFares = null;

  public V3FareEstimateResult isEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
    return this;
  }

  /**
   * Get isEarlyBird
   * @return isEarlyBird
   **/
    public Boolean isIsEarlyBird() {
    return isEarlyBird;
  }

  public void setIsEarlyBird(Boolean isEarlyBird) {
    this.isEarlyBird = isEarlyBird;
  }

  public V3FareEstimateResult isJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
    return this;
  }

  /**
   * Get isJourneyInFreeTramZone
   * @return isJourneyInFreeTramZone
   **/
    public Boolean isIsJourneyInFreeTramZone() {
    return isJourneyInFreeTramZone;
  }

  public void setIsJourneyInFreeTramZone(Boolean isJourneyInFreeTramZone) {
    this.isJourneyInFreeTramZone = isJourneyInFreeTramZone;
  }

  public V3FareEstimateResult isThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
    return this;
  }

  /**
   * Get isThisWeekendJourney
   * @return isThisWeekendJourney
   **/
    public Boolean isIsThisWeekendJourney() {
    return isThisWeekendJourney;
  }

  public void setIsThisWeekendJourney(Boolean isThisWeekendJourney) {
    this.isThisWeekendJourney = isThisWeekendJourney;
  }

  public V3FareEstimateResult zoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
    return this;
  }

  /**
   * Get zoneInfo
   * @return zoneInfo
   **/
    public V3ZoneInfo getZoneInfo() {
    return zoneInfo;
  }

  public void setZoneInfo(V3ZoneInfo zoneInfo) {
    this.zoneInfo = zoneInfo;
  }

  public V3FareEstimateResult passengerFares(List<V3PassengerFare> passengerFares) {
    this.passengerFares = passengerFares;
    return this;
  }

  public V3FareEstimateResult addPassengerFaresItem(V3PassengerFare passengerFaresItem) {
    if (this.passengerFares == null) {
      this.passengerFares = new ArrayList<V3PassengerFare>();
    }
    this.passengerFares.add(passengerFaresItem);
    return this;
  }

  /**
   * Get passengerFares
   * @return passengerFares
   **/
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
    return Objects.equals(this.isEarlyBird, v3FareEstimateResult.isEarlyBird) &&
        Objects.equals(this.isJourneyInFreeTramZone, v3FareEstimateResult.isJourneyInFreeTramZone) &&
        Objects.equals(this.isThisWeekendJourney, v3FareEstimateResult.isThisWeekendJourney) &&
        Objects.equals(this.zoneInfo, v3FareEstimateResult.zoneInfo) &&
        Objects.equals(this.passengerFares, v3FareEstimateResult.passengerFares);
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
