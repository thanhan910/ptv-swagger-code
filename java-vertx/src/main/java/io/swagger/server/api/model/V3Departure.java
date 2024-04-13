package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3Departure
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3Departure   {
  private Integer stopId = null;

  private Integer routeId = null;

  private Integer runId = null;

  private String runRef = null;

  private Integer directionId = null;

  
  private List<Long> disruptionIds = null;

  private OffsetDateTime scheduledDepartureUtc = null;

  private OffsetDateTime estimatedDepartureUtc = null;

  private Boolean atPlatform = null;

  private String platformNumber = null;

  private String flags = null;

  private Integer departureSequence = null;

  public V3Departure stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Stop identifier
   * @return stopId
   **/
    public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3Departure routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
   **/
    public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3Departure runId(Integer runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
   **/
    public Integer getRunId() {
    return runId;
  }

  public void setRunId(Integer runId) {
    this.runId = runId;
  }

  public V3Departure runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

  /**
   * Alphanumeric trip/service run identifier
   * @return runRef
   **/
    public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3Departure directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Direction of travel identifier
   * @return directionId
   **/
    public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3Departure disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3Departure addDisruptionIdsItem(Long disruptionIdsItem) {
    if (this.disruptionIds == null) {
      this.disruptionIds = new ArrayList<Long>();
    }
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

  /**
   * Disruption information identifier(s)
   * @return disruptionIds
   **/
    public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  public V3Departure scheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
    return this;
  }

  /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
   * @return scheduledDepartureUtc
   **/
    public OffsetDateTime getScheduledDepartureUtc() {
    return scheduledDepartureUtc;
  }

  public void setScheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
  }

  public V3Departure estimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
    return this;
  }

  /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format
   * @return estimatedDepartureUtc
   **/
    public OffsetDateTime getEstimatedDepartureUtc() {
    return estimatedDepartureUtc;
  }

  public void setEstimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
  }

  public V3Departure atPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
    return this;
  }

  /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
   * @return atPlatform
   **/
    public Boolean isAtPlatform() {
    return atPlatform;
  }

  public void setAtPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
  }

  public V3Departure platformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

  /**
   * Platform number at stop (metropolitan train only; returns null for other modes)
   * @return platformNumber
   **/
    public String getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
  }

  public V3Departure flags(String flags) {
    this.flags = flags;
    return this;
  }

  /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
   * @return flags
   **/
    public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }

  public V3Departure departureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
    return this;
  }

  /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
   * @return departureSequence
   **/
    public Integer getDepartureSequence() {
    return departureSequence;
  }

  public void setDepartureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Departure v3Departure = (V3Departure) o;
    return Objects.equals(this.stopId, v3Departure.stopId) &&
        Objects.equals(this.routeId, v3Departure.routeId) &&
        Objects.equals(this.runId, v3Departure.runId) &&
        Objects.equals(this.runRef, v3Departure.runRef) &&
        Objects.equals(this.directionId, v3Departure.directionId) &&
        Objects.equals(this.disruptionIds, v3Departure.disruptionIds) &&
        Objects.equals(this.scheduledDepartureUtc, v3Departure.scheduledDepartureUtc) &&
        Objects.equals(this.estimatedDepartureUtc, v3Departure.estimatedDepartureUtc) &&
        Objects.equals(this.atPlatform, v3Departure.atPlatform) &&
        Objects.equals(this.platformNumber, v3Departure.platformNumber) &&
        Objects.equals(this.flags, v3Departure.flags) &&
        Objects.equals(this.departureSequence, v3Departure.departureSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopId, routeId, runId, runRef, directionId, disruptionIds, scheduledDepartureUtc, estimatedDepartureUtc, atPlatform, platformNumber, flags, departureSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Departure {\n");
    
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runRef: ").append(toIndentedString(runRef)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    scheduledDepartureUtc: ").append(toIndentedString(scheduledDepartureUtc)).append("\n");
    sb.append("    estimatedDepartureUtc: ").append(toIndentedString(estimatedDepartureUtc)).append("\n");
    sb.append("    atPlatform: ").append(toIndentedString(atPlatform)).append("\n");
    sb.append("    platformNumber: ").append(toIndentedString(platformNumber)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    departureSequence: ").append(toIndentedString(departureSequence)).append("\n");
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
