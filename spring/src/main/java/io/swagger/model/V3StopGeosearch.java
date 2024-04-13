package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopGeosearch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3StopGeosearch   {
  @JsonProperty("disruption_ids")
  @Valid
  private List<Long> disruptionIds = null;

  @JsonProperty("stop_distance")
  private Float stopDistance = null;

  @JsonProperty("stop_suburb")
  private String stopSuburb = null;

  @JsonProperty("stop_name")
  private String stopName = null;

  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("route_type")
  private Integer routeType = null;

  @JsonProperty("routes")
  @Valid
  private List<Object> routes = null;

  @JsonProperty("stop_latitude")
  private Float stopLatitude = null;

  @JsonProperty("stop_longitude")
  private Float stopLongitude = null;

  @JsonProperty("stop_landmark")
  private String stopLandmark = null;

  @JsonProperty("stop_sequence")
  private Integer stopSequence = null;

  public V3StopGeosearch disruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
    return this;
  }

  public V3StopGeosearch addDisruptionIdsItem(Long disruptionIdsItem) {
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

  public V3StopGeosearch stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

  /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   * @return stopDistance
   **/
  @Schema(description = "Distance of stop from input location (in metres); returns 0 if no location is input")
  
    public Float getStopDistance() {
    return stopDistance;
  }

  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }

  public V3StopGeosearch stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  /**
   * suburb of stop
   * @return stopSuburb
   **/
  @Schema(description = "suburb of stop")
  
    public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3StopGeosearch stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  /**
   * Name of stop
   * @return stopName
   **/
  @Schema(description = "Name of stop")
  
    public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3StopGeosearch stopId(Integer stopId) {
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

  public V3StopGeosearch routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
  @Schema(description = "Transport mode identifier")
  
    public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3StopGeosearch routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3StopGeosearch addRoutesItem(Object routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<Object>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * List of routes travelling through the stop
   * @return routes
   **/
  @Schema(description = "List of routes travelling through the stop")
  
    public List<Object> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  public V3StopGeosearch stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
   **/
  @Schema(description = "Geographic coordinate of latitude at stop")
  
    public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3StopGeosearch stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
   **/
  @Schema(description = "Geographic coordinate of longitude at stop")
  
    public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3StopGeosearch stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  /**
   * Landmark in proximity of stop
   * @return stopLandmark
   **/
  @Schema(description = "Landmark in proximity of stop")
  
    public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3StopGeosearch stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

  /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
   **/
  @Schema(description = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
  
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
    return Objects.equals(this.disruptionIds, v3StopGeosearch.disruptionIds) &&
        Objects.equals(this.stopDistance, v3StopGeosearch.stopDistance) &&
        Objects.equals(this.stopSuburb, v3StopGeosearch.stopSuburb) &&
        Objects.equals(this.stopName, v3StopGeosearch.stopName) &&
        Objects.equals(this.stopId, v3StopGeosearch.stopId) &&
        Objects.equals(this.routeType, v3StopGeosearch.routeType) &&
        Objects.equals(this.routes, v3StopGeosearch.routes) &&
        Objects.equals(this.stopLatitude, v3StopGeosearch.stopLatitude) &&
        Objects.equals(this.stopLongitude, v3StopGeosearch.stopLongitude) &&
        Objects.equals(this.stopLandmark, v3StopGeosearch.stopLandmark) &&
        Objects.equals(this.stopSequence, v3StopGeosearch.stopSequence);
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
