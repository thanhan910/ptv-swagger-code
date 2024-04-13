package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopGeosearch   {

  private @Valid List<Long> disruptionIds = new ArrayList<Long>();

  private @Valid Float stopDistance = null;

  private @Valid String stopSuburb = null;

  private @Valid String stopName = null;

  private @Valid Integer stopId = null;

  private @Valid Integer routeType = null;

  private @Valid List<Object> routes = new ArrayList<Object>();

  private @Valid Float stopLatitude = null;

  private @Valid Float stopLongitude = null;

  private @Valid String stopLandmark = null;

  private @Valid Integer stopSequence = null;

  /**
   * Disruption information identifier(s)
   **/
  public V3StopGeosearch disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  
  @ApiModelProperty(value = "Disruption information identifier(s)")
  @JsonProperty("disruption_ids")

  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }
  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   **/
  public V3StopGeosearch stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

  
  @ApiModelProperty(value = "Distance of stop from input location (in metres); returns 0 if no location is input")
  @JsonProperty("stop_distance")

  public Float getStopDistance() {
    return stopDistance;
  }
  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }

  /**
   * suburb of stop
   **/
  public V3StopGeosearch stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  
  @ApiModelProperty(value = "suburb of stop")
  @JsonProperty("stop_suburb")

  public String getStopSuburb() {
    return stopSuburb;
  }
  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  /**
   * Name of stop
   **/
  public V3StopGeosearch stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of stop")
  @JsonProperty("stop_name")

  public String getStopName() {
    return stopName;
  }
  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  /**
   * Stop identifier
   **/
  public V3StopGeosearch stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  
  @ApiModelProperty(value = "Stop identifier")
  @JsonProperty("stop_id")

  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Transport mode identifier
   **/
  public V3StopGeosearch routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  
  @ApiModelProperty(value = "Transport mode identifier")
  @JsonProperty("route_type")

  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  /**
   * List of routes travelling through the stop
   **/
  public V3StopGeosearch routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  
  @ApiModelProperty(value = "List of routes travelling through the stop")
  @JsonProperty("routes")

  public List<Object> getRoutes() {
    return routes;
  }
  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  /**
   * Geographic coordinate of latitude at stop
   **/
  public V3StopGeosearch stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  
  @ApiModelProperty(value = "Geographic coordinate of latitude at stop")
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
  public V3StopGeosearch stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  
  @ApiModelProperty(value = "Geographic coordinate of longitude at stop")
  @JsonProperty("stop_longitude")

  public Float getStopLongitude() {
    return stopLongitude;
  }
  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  /**
   * Landmark in proximity of stop
   **/
  public V3StopGeosearch stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  
  @ApiModelProperty(value = "Landmark in proximity of stop")
  @JsonProperty("stop_landmark")

  public String getStopLandmark() {
    return stopLandmark;
  }
  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   **/
  public V3StopGeosearch stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

  
  @ApiModelProperty(value = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
  @JsonProperty("stop_sequence")

  public Integer getStopSequence() {
    return stopSequence;
  }
  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopGeosearch v3StopGeosearch = (V3StopGeosearch) o;
    return Objects.equals(disruptionIds, v3StopGeosearch.disruptionIds) &&
        Objects.equals(stopDistance, v3StopGeosearch.stopDistance) &&
        Objects.equals(stopSuburb, v3StopGeosearch.stopSuburb) &&
        Objects.equals(stopName, v3StopGeosearch.stopName) &&
        Objects.equals(stopId, v3StopGeosearch.stopId) &&
        Objects.equals(routeType, v3StopGeosearch.routeType) &&
        Objects.equals(routes, v3StopGeosearch.routes) &&
        Objects.equals(stopLatitude, v3StopGeosearch.stopLatitude) &&
        Objects.equals(stopLongitude, v3StopGeosearch.stopLongitude) &&
        Objects.equals(stopLandmark, v3StopGeosearch.stopLandmark) &&
        Objects.equals(stopSequence, v3StopGeosearch.stopSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionIds, stopDistance, stopSuburb, stopName, stopId, routeType, routes, stopLatitude, stopLongitude, stopLandmark, stopSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopGeosearch {\n");
    
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    stopDistance: ").append(toIndentedString(stopDistance)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
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
