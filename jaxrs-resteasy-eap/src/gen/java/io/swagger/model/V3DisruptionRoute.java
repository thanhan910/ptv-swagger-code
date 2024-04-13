package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionDirection;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3DisruptionRoute   {
  private Integer routeType = null;
  private Integer routeId = null;
  private String routeName = null;
  private String routeNumber = null;
  private String routeGtfsId = null;
  private V3DisruptionDirection direction = null;

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
   * Route identifier
   **/
  
  @Schema(description = "Route identifier")
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
  
  @Schema(description = "Name of route")
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
  
  @Schema(description = "Route number presented to public (i.e. not route_id)")
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
  
  @Schema(description = "GTFS Identifer of the route")
  @JsonProperty("route_gtfs_id")
  public String getRouteGtfsId() {
    return routeGtfsId;
  }
  public void setRouteGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("direction")
  public V3DisruptionDirection getDirection() {
    return direction;
  }
  public void setDirection(V3DisruptionDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
