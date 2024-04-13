package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopModel;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3PatternDeparture   {
  private List<V3StopModel> skippedStops = new ArrayList<V3StopModel>();  private Integer stopId = null;  private Integer routeId = null;  private Integer runId = null;  private String runRef = null;  private Integer directionId = null;  private List<Long> disruptionIds = new ArrayList<Long>();  private Date scheduledDepartureUtc = null;  private Date estimatedDepartureUtc = null;  private Boolean atPlatform = null;  private String platformNumber = null;  private String flags = null;  private Integer departureSequence = null;

  /**
   * The stops to be skipped following the current departure in order.
   **/
  
  @Schema(description = "The stops to be skipped following the current departure in order.")
  @JsonProperty("skipped_stops")
  public List<V3StopModel> getSkippedStops() {
    return skippedStops;
  }
  public void setSkippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
  }

  /**
   * Stop identifier
   **/
  
  @Schema(description = "Stop identifier")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Route identifier
   **/
  
  @Schema(description = "Route identifier")
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   **/
  
  @Schema(description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
  @JsonProperty("run_id")
  public Integer getRunId() {
    return runId;
  }
  public void setRunId(Integer runId) {
    this.runId = runId;
  }

  /**
   * Alphanumeric trip/service run identifier
   **/
  
  @Schema(description = "Alphanumeric trip/service run identifier")
  @JsonProperty("run_ref")
  public String getRunRef() {
    return runRef;
  }
  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  /**
   * Direction of travel identifier
   **/
  
  @Schema(description = "Direction of travel identifier")
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Disruption information identifier(s)
   **/
  
  @Schema(description = "Disruption information identifier(s)")
  @JsonProperty("disruption_ids")
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }
  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
   **/
  
  @Schema(description = "Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format")
  @JsonProperty("scheduled_departure_utc")
  public Date getScheduledDepartureUtc() {
    return scheduledDepartureUtc;
  }
  public void setScheduledDepartureUtc(Date scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
  }

  /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format
   **/
  
  @Schema(description = "Real-time estimate of departure time and date in ISO 8601 UTC format")
  @JsonProperty("estimated_departure_utc")
  public Date getEstimatedDepartureUtc() {
    return estimatedDepartureUtc;
  }
  public void setEstimatedDepartureUtc(Date estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
  }

  /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
   **/
  
  @Schema(description = "Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes")
  @JsonProperty("at_platform")
  public Boolean isAtPlatform() {
    return atPlatform;
  }
  public void setAtPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
  }

  /**
   * Platform number at stop (metropolitan train only; returns null for other modes)
   **/
  
  @Schema(description = "Platform number at stop (metropolitan train only; returns null for other modes)")
  @JsonProperty("platform_number")
  public String getPlatformNumber() {
    return platformNumber;
  }
  public void setPlatformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
  }

  /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
   **/
  
  @Schema(description = "Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)")
  @JsonProperty("flags")
  public String getFlags() {
    return flags;
  }
  public void setFlags(String flags) {
    this.flags = flags;
  }

  /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
   **/
  
  @Schema(description = "Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4")
  @JsonProperty("departure_sequence")
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
    V3PatternDeparture v3PatternDeparture = (V3PatternDeparture) o;
    return Objects.equals(skippedStops, v3PatternDeparture.skippedStops) &&
        Objects.equals(stopId, v3PatternDeparture.stopId) &&
        Objects.equals(routeId, v3PatternDeparture.routeId) &&
        Objects.equals(runId, v3PatternDeparture.runId) &&
        Objects.equals(runRef, v3PatternDeparture.runRef) &&
        Objects.equals(directionId, v3PatternDeparture.directionId) &&
        Objects.equals(disruptionIds, v3PatternDeparture.disruptionIds) &&
        Objects.equals(scheduledDepartureUtc, v3PatternDeparture.scheduledDepartureUtc) &&
        Objects.equals(estimatedDepartureUtc, v3PatternDeparture.estimatedDepartureUtc) &&
        Objects.equals(atPlatform, v3PatternDeparture.atPlatform) &&
        Objects.equals(platformNumber, v3PatternDeparture.platformNumber) &&
        Objects.equals(flags, v3PatternDeparture.flags) &&
        Objects.equals(departureSequence, v3PatternDeparture.departureSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skippedStops, stopId, routeId, runId, runRef, directionId, disruptionIds, scheduledDepartureUtc, estimatedDepartureUtc, atPlatform, platformNumber, flags, departureSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PatternDeparture {\n");
    
    sb.append("    skippedStops: ").append(toIndentedString(skippedStops)).append("\n");
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
