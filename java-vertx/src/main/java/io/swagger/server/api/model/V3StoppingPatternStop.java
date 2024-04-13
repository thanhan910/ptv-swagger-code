package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3StopTicket;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StoppingPatternStop
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StoppingPatternStop   {
  private V3StopTicket stopTicket = null;

  private Float stopDistance = null;

  private String stopSuburb = null;

  private String stopName = null;

  private Integer stopId = null;

  private Integer routeType = null;

  private Float stopLatitude = null;

  private Float stopLongitude = null;

  private String stopLandmark = null;

  private Integer stopSequence = null;

  public V3StoppingPatternStop stopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
    return this;
  }

  /**
   * Get stopTicket
   * @return stopTicket
   **/
    public V3StopTicket getStopTicket() {
    return stopTicket;
  }

  public void setStopTicket(V3StopTicket stopTicket) {
    this.stopTicket = stopTicket;
  }

  public V3StoppingPatternStop stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

  /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   * @return stopDistance
   **/
    public Float getStopDistance() {
    return stopDistance;
  }

  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }

  public V3StoppingPatternStop stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

  /**
   * suburb of stop
   * @return stopSuburb
   **/
    public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3StoppingPatternStop stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

  /**
   * Name of stop
   * @return stopName
   **/
    public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3StoppingPatternStop stopId(Integer stopId) {
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

  public V3StoppingPatternStop routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
    public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3StoppingPatternStop stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

  /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
   **/
    public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3StoppingPatternStop stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

  /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
   **/
    public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3StoppingPatternStop stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }

  /**
   * Landmark in proximity of stop
   * @return stopLandmark
   **/
    public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3StoppingPatternStop stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

  /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
   **/
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
    return Objects.equals(this.stopTicket, v3StoppingPatternStop.stopTicket) &&
        Objects.equals(this.stopDistance, v3StoppingPatternStop.stopDistance) &&
        Objects.equals(this.stopSuburb, v3StoppingPatternStop.stopSuburb) &&
        Objects.equals(this.stopName, v3StoppingPatternStop.stopName) &&
        Objects.equals(this.stopId, v3StoppingPatternStop.stopId) &&
        Objects.equals(this.routeType, v3StoppingPatternStop.routeType) &&
        Objects.equals(this.stopLatitude, v3StoppingPatternStop.stopLatitude) &&
        Objects.equals(this.stopLongitude, v3StoppingPatternStop.stopLongitude) &&
        Objects.equals(this.stopLandmark, v3StoppingPatternStop.stopLandmark) &&
        Objects.equals(this.stopSequence, v3StoppingPatternStop.stopSequence);
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
