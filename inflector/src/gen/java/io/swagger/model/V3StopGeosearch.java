package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3StopGeosearch   {
  @JsonProperty("disruption_ids")
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
  private List<Object> routes = null;
  @JsonProperty("stop_latitude")
  private Float stopLatitude = null;
  @JsonProperty("stop_longitude")
  private Float stopLongitude = null;
  @JsonProperty("stop_landmark")
  private String stopLandmark = null;
  @JsonProperty("stop_sequence")
  private Integer stopSequence = null;
  /**
   * Disruption information identifier(s)
   **/
  public V3StopGeosearch disruptionIds(List<Long> disruptionIds) {
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
   * Distance of stop from input location (in metres); returns 0 if no location is input
   **/
  public V3StopGeosearch stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

  
  @Schema(description = "Distance of stop from input location (in metres); returns 0 if no location is input")
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

  
  @Schema(description = "suburb of stop")
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

  
  @Schema(description = "Name of stop")
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

  
  @Schema(description = "Stop identifier")
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

  
  @Schema(description = "Transport mode identifier")
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

  
  @Schema(description = "List of routes travelling through the stop")
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
  public V3StopGeosearch stopLongitude(Float stopLongitude) {
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
   * Landmark in proximity of stop
   **/
  public V3StopGeosearch stopLandmark(String stopLandmark) {
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

  /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   **/
  public V3StopGeosearch stopSequence(Integer stopSequence) {
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
