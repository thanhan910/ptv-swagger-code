package io.swagger.model;

import io.swagger.model.V3StopModel;
import java.util.ArrayList;
import java.util.Date;
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

public class V3PatternDeparture   {
  
  @Schema(description = "The stops to be skipped following the current departure in order.")
 /**
   * The stops to be skipped following the current departure in order.  
  **/
  private List<V3StopModel> skippedStops = null;
  
  @Schema(description = "Stop identifier")
 /**
   * Stop identifier  
  **/
  private Integer stopId = null;
  
  @Schema(description = "Route identifier")
 /**
   * Route identifier  
  **/
  private Integer routeId = null;
  
  @Schema(description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
 /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric  
  **/
  private Integer runId = null;
  
  @Schema(description = "Alphanumeric trip/service run identifier")
 /**
   * Alphanumeric trip/service run identifier  
  **/
  private String runRef = null;
  
  @Schema(description = "Direction of travel identifier")
 /**
   * Direction of travel identifier  
  **/
  private Integer directionId = null;
  
  @Schema(description = "Disruption information identifier(s)")
 /**
   * Disruption information identifier(s)  
  **/
  private List<Long> disruptionIds = null;
  
  @Schema(description = "Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format")
 /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format  
  **/
  private Date scheduledDepartureUtc = null;
  
  @Schema(description = "Real-time estimate of departure time and date in ISO 8601 UTC format")
 /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format  
  **/
  private Date estimatedDepartureUtc = null;
  
  @Schema(description = "Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes")
 /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes  
  **/
  private Boolean atPlatform = null;
  
  @Schema(description = "Platform number at stop (metropolitan train only; returns null for other modes)")
 /**
   * Platform number at stop (metropolitan train only; returns null for other modes)  
  **/
  private String platformNumber = null;
  
  @Schema(description = "Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)")
 /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)  
  **/
  private String flags = null;
  
  @Schema(description = "Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4")
 /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4  
  **/
  private Integer departureSequence = null;
 /**
   * The stops to be skipped following the current departure in order.
   * @return skippedStops
  **/
  @JsonProperty("skipped_stops")
  public List<V3StopModel> getSkippedStops() {
    return skippedStops;
  }

  public void setSkippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
  }

  public V3PatternDeparture skippedStops(List<V3StopModel> skippedStops) {
    this.skippedStops = skippedStops;
    return this;
  }

  public V3PatternDeparture addSkippedStopsItem(V3StopModel skippedStopsItem) {
    this.skippedStops.add(skippedStopsItem);
    return this;
  }

 /**
   * Stop identifier
   * @return stopId
  **/
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3PatternDeparture stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Route identifier
   * @return routeId
  **/
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3PatternDeparture routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

 /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
  **/
  @JsonProperty("run_id")
  public Integer getRunId() {
    return runId;
  }


 /**
   * Alphanumeric trip/service run identifier
   * @return runRef
  **/
  @JsonProperty("run_ref")
  public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3PatternDeparture runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

 /**
   * Direction of travel identifier
   * @return directionId
  **/
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3PatternDeparture directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

 /**
   * Disruption information identifier(s)
   * @return disruptionIds
  **/
  @JsonProperty("disruption_ids")
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }

  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  public V3PatternDeparture disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3PatternDeparture addDisruptionIdsItem(Long disruptionIdsItem) {
    this.disruptionIds.add(disruptionIdsItem);
    return this;
  }

 /**
   * Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
   * @return scheduledDepartureUtc
  **/
  @JsonProperty("scheduled_departure_utc")
  public Date getScheduledDepartureUtc() {
    return scheduledDepartureUtc;
  }

  public void setScheduledDepartureUtc(Date scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
  }

  public V3PatternDeparture scheduledDepartureUtc(Date scheduledDepartureUtc) {
    this.scheduledDepartureUtc = scheduledDepartureUtc;
    return this;
  }

 /**
   * Real-time estimate of departure time and date in ISO 8601 UTC format
   * @return estimatedDepartureUtc
  **/
  @JsonProperty("estimated_departure_utc")
  public Date getEstimatedDepartureUtc() {
    return estimatedDepartureUtc;
  }

  public void setEstimatedDepartureUtc(Date estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
  }

  public V3PatternDeparture estimatedDepartureUtc(Date estimatedDepartureUtc) {
    this.estimatedDepartureUtc = estimatedDepartureUtc;
    return this;
  }

 /**
   * Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
   * @return atPlatform
  **/
  @JsonProperty("at_platform")
  public Boolean isAtPlatform() {
    return atPlatform;
  }

  public void setAtPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
  }

  public V3PatternDeparture atPlatform(Boolean atPlatform) {
    this.atPlatform = atPlatform;
    return this;
  }

 /**
   * Platform number at stop (metropolitan train only; returns null for other modes)
   * @return platformNumber
  **/
  @JsonProperty("platform_number")
  public String getPlatformNumber() {
    return platformNumber;
  }

  public void setPlatformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
  }

  public V3PatternDeparture platformNumber(String platformNumber) {
    this.platformNumber = platformNumber;
    return this;
  }

 /**
   * Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
   * @return flags
  **/
  @JsonProperty("flags")
  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }

  public V3PatternDeparture flags(String flags) {
    this.flags = flags;
    return this;
  }

 /**
   * Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
   * @return departureSequence
  **/
  @JsonProperty("departure_sequence")
  public Integer getDepartureSequence() {
    return departureSequence;
  }

  public void setDepartureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
  }

  public V3PatternDeparture departureSequence(Integer departureSequence) {
    this.departureSequence = departureSequence;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
