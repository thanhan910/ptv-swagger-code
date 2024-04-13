package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopModel   {

  private @Valid Float stopDistance = null;

  private @Valid String stopSuburb = null;

  private @Valid String stopName = null;

  private @Valid Integer stopId = null;

  private @Valid Integer routeType = null;

  private @Valid Float stopLatitude = null;

  private @Valid Float stopLongitude = null;

  private @Valid String stopLandmark = null;

  private @Valid Integer stopSequence = null;

  /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   **/
  public V3StopModel stopDistance(Float stopDistance) {
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
  public V3StopModel stopSuburb(String stopSuburb) {
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
  public V3StopModel stopName(String stopName) {
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
  public V3StopModel stopId(Integer stopId) {
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
  public V3StopModel routeType(Integer routeType) {
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
   * Geographic coordinate of latitude at stop
   **/
  public V3StopModel stopLatitude(Float stopLatitude) {
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
  public V3StopModel stopLongitude(Float stopLongitude) {
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
  public V3StopModel stopLandmark(String stopLandmark) {
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
  public V3StopModel stopSequence(Integer stopSequence) {
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
    V3StopModel v3StopModel = (V3StopModel) o;
    return Objects.equals(stopDistance, v3StopModel.stopDistance) &&
        Objects.equals(stopSuburb, v3StopModel.stopSuburb) &&
        Objects.equals(stopName, v3StopModel.stopName) &&
        Objects.equals(stopId, v3StopModel.stopId) &&
        Objects.equals(routeType, v3StopModel.routeType) &&
        Objects.equals(stopLatitude, v3StopModel.stopLatitude) &&
        Objects.equals(stopLongitude, v3StopModel.stopLongitude) &&
        Objects.equals(stopLandmark, v3StopModel.stopLandmark) &&
        Objects.equals(stopSequence, v3StopModel.stopSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopDistance, stopSuburb, stopName, stopId, routeType, stopLatitude, stopLongitude, stopLandmark, stopSequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopModel {\n");
    
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
