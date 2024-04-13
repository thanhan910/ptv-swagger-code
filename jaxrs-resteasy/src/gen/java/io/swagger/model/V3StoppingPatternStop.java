package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopTicket;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StoppingPatternStop   {
  private V3StopTicket stopTicket = null;  private Float stopDistance = null;  private String stopSuburb = null;  private String stopName = null;  private Integer stopId = null;  private Integer routeType = null;  private Float stopLatitude = null;  private Float stopLongitude = null;  private String stopLandmark = null;  private Integer stopSequence = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_ticket")
  public V3StopTicket getStopTicket() {
    return stopTicket;
  }
  public void setStopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
  }

  /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   **/
  
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
    V3StoppingPatternStop v3StoppingPatternStop = (V3StoppingPatternStop) o;
    return Objects.equals(stopTicket, v3StoppingPatternStop.stopTicket) &&
        Objects.equals(stopDistance, v3StoppingPatternStop.stopDistance) &&
        Objects.equals(stopSuburb, v3StoppingPatternStop.stopSuburb) &&
        Objects.equals(stopName, v3StoppingPatternStop.stopName) &&
        Objects.equals(stopId, v3StoppingPatternStop.stopId) &&
        Objects.equals(routeType, v3StoppingPatternStop.routeType) &&
        Objects.equals(stopLatitude, v3StoppingPatternStop.stopLatitude) &&
        Objects.equals(stopLongitude, v3StoppingPatternStop.stopLongitude) &&
        Objects.equals(stopLandmark, v3StoppingPatternStop.stopLandmark) &&
        Objects.equals(stopSequence, v3StoppingPatternStop.stopSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopTicket, stopDistance, stopSuburb, stopName, stopId, routeType, stopLatitude, stopLongitude, stopLandmark, stopSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StoppingPatternStop {\n");
    
    sb.append("    stopTicket: ").append(toIndentedString(stopTicket)).append("\n");
    sb.append("    stopDistance: ").append(toIndentedString(stopDistance)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
