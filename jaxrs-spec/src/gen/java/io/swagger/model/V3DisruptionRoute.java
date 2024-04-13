package io.swagger.model;

import io.swagger.model.V3DisruptionDirection;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3DisruptionRoute   {

  private @Valid Integer routeType = null;

  private @Valid Integer routeId = null;

  private @Valid String routeName = null;

  private @Valid String routeNumber = null;

  private @Valid String routeGtfsId = null;

  private @Valid V3DisruptionDirection direction = null;

  /**
   * Transport mode identifier
   **/
  public V3DisruptionRoute routeType(Integer routeType) {
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
   * Route identifier
   **/
  public V3DisruptionRoute routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(value = "Route identifier")
  @JsonProperty("route_id")

  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * Name of route
   **/
  public V3DisruptionRoute routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of route")
  @JsonProperty("route_name")

  public String getRouteName() {
    return routeName;
  }
  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  /**
   * Route number presented to public (i.e. not route_id)
   **/
  public V3DisruptionRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Route number presented to public (i.e. not route_id)")
  @JsonProperty("route_number")

  public String getRouteNumber() {
    return routeNumber;
  }
  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  /**
   * GTFS Identifer of the route
   **/
  public V3DisruptionRoute routeGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
    return this;
  }

  
  @ApiModelProperty(value = "GTFS Identifer of the route")
  @JsonProperty("route_gtfs_id")

  public String getRouteGtfsId() {
    return routeGtfsId;
  }
  public void setRouteGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
  }

  /**
   **/
  public V3DisruptionRoute direction(V3DisruptionDirection direction) {
    this.direction = direction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("direction")

  public V3DisruptionDirection getDirection() {
    return direction;
  }
  public void setDirection(V3DisruptionDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DisruptionRoute v3DisruptionRoute = (V3DisruptionRoute) o;
    return Objects.equals(routeType, v3DisruptionRoute.routeType) &&
        Objects.equals(routeId, v3DisruptionRoute.routeId) &&
        Objects.equals(routeName, v3DisruptionRoute.routeName) &&
        Objects.equals(routeNumber, v3DisruptionRoute.routeNumber) &&
        Objects.equals(routeGtfsId, v3DisruptionRoute.routeGtfsId) &&
        Objects.equals(direction, v3DisruptionRoute.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeType, routeId, routeName, routeNumber, routeGtfsId, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionRoute {\n");
    
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    routeGtfsId: ").append(toIndentedString(routeGtfsId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
