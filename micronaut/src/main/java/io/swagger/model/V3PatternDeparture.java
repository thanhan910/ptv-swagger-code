package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3PatternDeparture
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3PatternDeparture   {
  @JsonProperty("skipped_stops")
  @Valid
  private List<V3StopModel> skippedStops = null;

  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("route_id")
  private Integer routeId = null;

  @JsonProperty("run_id")
  private Integer runId = null;

  @JsonProperty("run_ref")
  private String runRef = null;

  @JsonProperty("direction_id")
  private Integer directionId = null;

  @JsonProperty("disruption_ids")
  @Valid
  private List<Long> disruptionIds = null;

  @JsonProperty("scheduled_departure_utc")
  private OffsetDateTime scheduledDepartureUtc = null;

  @JsonProperty("estimated_departure_utc")
  private OffsetDateTime estimatedDepartureUtc = null;

  @JsonProperty("at_platform")
  private Boolean atPlatform = null;

  @JsonProperty("platform_number")
  private String platformNumber = null;

  @JsonProperty("flags")
  private String flags = null;

  @JsonProperty("departure_sequence")
  private Integer departureSequence = null;

  public V3PatternDeparture skippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
    return this;
  }

  public V3PatternDeparture addSkippedStopsItem(V3StopModel skippedStopsItem) {
    if (this.skippedStops == null) {
      this.skippedStops = new ArrayList<V3StopModel>();
    }
    this.skippedStops.add(skippedStopsItem);
    return this;
  }

  /**
   * The stops to be skipped following the current departure in order.
   * @return skippedStops
  **/
  @Schema(description = "The stops to be skipped following the current departure in order.")
  @Valid
  public List<V3StopModel> getSkippedStops() {
    return skippedStops;
  }

  public void setSkippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
  }

  public V3PatternDeparture stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Stop identifier
   * @return stopId
  **/
  @Schema(description = "Stop identifier")

  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3PatternDeparture routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
  **/
  @Schema(description = "Route identifier")

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3PatternDeparture runId(Integer runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
  **/
  @Schema(readOnly = true, description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")

  public Integer getRunId() {
    return runId;
  }

  public void setRunId(Integer runId) {
    this.runId = runId;
  }

  public V3PatternDeparture runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

  /**
   * Alphanumeric trip/service run identifier
   * @return runRef
  **/
  @Schema(description = "Alphanumeric trip/service run identifier")

  public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3PatternDeparture directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Direction of travel identifier
   * @return directionId
  **/
  @Schema(description = "Direction of travel identifier")

  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3PatternDeparture disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3PatternDeparture addDisruptionIdsItem(Long disruptionIdsItem) {
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
  @Schema(description = "Disruption information identifier(s)")

  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  public V3PatternDeparture scheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
    return this;
  }

  /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
   * @return scheduledDepartureUtc
  **/
  @Schema(description = "Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format")

  @Valid
  public OffsetDateTime getScheduledDepartureUtc() {
    return scheduledDepartureUtc;
  }

  public void setScheduledDepartureUtc(OffsetDateTime scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
  }

  public V3PatternDeparture estimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
    return this;
  }

  /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format
   * @return estimatedDepartureUtc
  **/
  @Schema(description = "Real-time estimate of departure time and date in ISO 8601 UTC format")

  @Valid
  public OffsetDateTime getEstimatedDepartureUtc() {
    return estimatedDepartureUtc;
  }

  public void setEstimatedDepartureUtc(OffsetDateTime estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
  }

  public V3PatternDeparture atPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
    return this;
  }

  /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
   * @return atPlatform
  **/
  @Schema(description = "Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes")

  public Boolean isAtPlatform() {
    return atPlatform;
  }

  public void setAtPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
  }

  public V3PatternDeparture platformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

  /**
   * Platform number at stop (metropolitan train only; returns null for other modes)
   * @return platformNumber
  **/
  @Schema(description = "Platform number at stop (metropolitan train only; returns null for other modes)")

  public String getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
  }

  public V3PatternDeparture flags(String flags) {
    this.flags = flags;
    return this;
  }

  /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
   * @return flags
  **/
  @Schema(description = "Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)")

  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }

  public V3PatternDeparture departureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
    return this;
  }

  /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
   * @return departureSequence
  **/
  @Schema(description = "Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4")

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
    return Objects.equals(this.skippedStops, v3PatternDeparture.skippedStops) &&
        Objects.equals(this.stopId, v3PatternDeparture.stopId) &&
        Objects.equals(this.routeId, v3PatternDeparture.routeId) &&
        Objects.equals(this.runId, v3PatternDeparture.runId) &&
        Objects.equals(this.runRef, v3PatternDeparture.runRef) &&
        Objects.equals(this.directionId, v3PatternDeparture.directionId) &&
        Objects.equals(this.disruptionIds, v3PatternDeparture.disruptionIds) &&
        Objects.equals(this.scheduledDepartureUtc, v3PatternDeparture.scheduledDepartureUtc) &&
        Objects.equals(this.estimatedDepartureUtc, v3PatternDeparture.estimatedDepartureUtc) &&
        Objects.equals(this.atPlatform, v3PatternDeparture.atPlatform) &&
        Objects.equals(this.platformNumber, v3PatternDeparture.platformNumber) &&
        Objects.equals(this.flags, v3PatternDeparture.flags) &&
        Objects.equals(this.departureSequence, v3PatternDeparture.departureSequence);
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
