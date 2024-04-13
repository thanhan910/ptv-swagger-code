package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3RouteServiceStatus;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3ResultRoute   {
  private String routeName = null;
  private String routeNumber = null;
  private Integer routeType = null;
  private Integer routeId = null;
  private String routeGtfsId = null;
  private V3RouteServiceStatus routeServiceStatus = null;

  /**
   * Name of route
   **/
  public V3ResultRoute routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

  
  
  @Schema(description = "Name of route")
  @JsonProperty("route_name")
  public String getRouteName() {
    return routeName;
  }
  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  /**
   * Route number presented to public (nb. not route_id)
   **/
  public V3ResultRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

  
  
  @Schema(description = "Route number presented to public (nb. not route_id)")
  @JsonProperty("route_number")
  public String getRouteNumber() {
    return routeNumber;
  }
  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  /**
   * Transport mode identifier
   **/
  public V3ResultRoute routeType(Integer routeType) {
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
   * Route identifier
   **/
  public V3ResultRoute routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  
  
  @Schema(description = "Route identifier")
  @JsonProperty("route_id")
  public Integer getRouteId() {
    return routeId;
  }
  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  /**
   * GTFS Identifer of the route
   **/
  public V3ResultRoute routeGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
    return this;
  }

  
  
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
  public V3ResultRoute routeServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("route_service_status")
  @Valid
  public V3RouteServiceStatus getRouteServiceStatus() {
    return routeServiceStatus;
  }
  public void setRouteServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ResultRoute v3ResultRoute = (V3ResultRoute) o;
    return Objects.equals(routeName, v3ResultRoute.routeName) &&
        Objects.equals(routeNumber, v3ResultRoute.routeNumber) &&
        Objects.equals(routeType, v3ResultRoute.routeType) &&
        Objects.equals(routeId, v3ResultRoute.routeId) &&
        Objects.equals(routeGtfsId, v3ResultRoute.routeGtfsId) &&
        Objects.equals(routeServiceStatus, v3ResultRoute.routeServiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeName, routeNumber, routeType, routeId, routeGtfsId, routeServiceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ResultRoute {\n");
    
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeGtfsId: ").append(toIndentedString(routeGtfsId)).append("\n");
    sb.append("    routeServiceStatus: ").append(toIndentedString(routeServiceStatus)).append("\n");
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
