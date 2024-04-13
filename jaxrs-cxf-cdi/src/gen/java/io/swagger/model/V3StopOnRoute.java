package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopTicket;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3StopOnRoute   {
  private List<Long> disruptionIds = new ArrayList<Long>();
  private String stopSuburb = null;
  private Integer routeType = null;
  private Float stopLatitude = null;
  private Float stopLongitude = null;
  private Integer stopSequence = null;
  private V3StopTicket stopTicket = null;
  private Integer stopId = null;
  private String stopName = null;
  private String stopLandmark = null;

  /**
   * Disruption information identifier(s)
   **/
  public V3StopOnRoute disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  
  
  @Schema(description = "Disruption information identifier(s)")
  @JsonProperty("disruption_ids")
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }
  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  /**
   * suburb of stop
   **/
  public V3StopOnRoute stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  
  
  @Schema(description = "suburb of stop")
  @JsonProperty("stop_suburb")
  public String getStopSuburb() {
    return stopSuburb;
  }
  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  /**
   * Transport mode identifier
   **/
  public V3StopOnRoute routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
  
  @Schema(description = "Transport mode identifier")
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  /**
   * Geographic coordinate of latitude at stop
   **/
  public V3StopOnRoute stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of latitude at stop")
  @JsonProperty("stop_latitude")
  public Float getStopLatitude() {
    return stopLatitude;
  }
  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  /**
   * Geographic coordinate of longitude at stop
   **/
  public V3StopOnRoute stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  
  
  @Schema(description = "Geographic coordinate of longitude at stop")
  @JsonProperty("stop_longitude")
  public Float getStopLongitude() {
    return stopLongitude;
  }
  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   **/
  public V3StopOnRoute stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

  
  
  @Schema(description = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
  @JsonProperty("stop_sequence")
  public Integer getStopSequence() {
    return stopSequence;
  }
  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }

  /**
   **/
  public V3StopOnRoute stopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("stop_ticket")
  @Valid
  public V3StopTicket getStopTicket() {
    return stopTicket;
  }
  public void setStopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
  }

  /**
   * Stop identifier
   **/
  public V3StopOnRoute stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  
  @Schema(description = "Stop identifier")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Name of stop
   **/
  public V3StopOnRoute stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  
  
  @Schema(description = "Name of stop")
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }
  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  /**
   * Landmark in proximity of stop
   **/
  public V3StopOnRoute stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  
  
  @Schema(description = "Landmark in proximity of stop")
  @JsonProperty("stop_landmark")
  public String getStopLandmark() {
    return stopLandmark;
  }
  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopOnRoute v3StopOnRoute = (V3StopOnRoute) o;
    return Objects.equals(disruptionIds, v3StopOnRoute.disruptionIds) &&
        Objects.equals(stopSuburb, v3StopOnRoute.stopSuburb) &&
        Objects.equals(routeType, v3StopOnRoute.routeType) &&
        Objects.equals(stopLatitude, v3StopOnRoute.stopLatitude) &&
        Objects.equals(stopLongitude, v3StopOnRoute.stopLongitude) &&
        Objects.equals(stopSequence, v3StopOnRoute.stopSequence) &&
        Objects.equals(stopTicket, v3StopOnRoute.stopTicket) &&
        Objects.equals(stopId, v3StopOnRoute.stopId) &&
        Objects.equals(stopName, v3StopOnRoute.stopName) &&
        Objects.equals(stopLandmark, v3StopOnRoute.stopLandmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionIds, stopSuburb, routeType, stopLatitude, stopLongitude, stopSequence, stopTicket, stopId, stopName, stopLandmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopOnRoute {\n");
    
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
    sb.append("    stopTicket: ").append(toIndentedString(stopTicket)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
