package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionDirection;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3DisruptionRoute
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3DisruptionRoute   {
  @JsonProperty("route_type")
  private Integer routeType = null;

  @JsonProperty("route_id")
  private Integer routeId = null;

  @JsonProperty("route_name")
  private String routeName = null;

  @JsonProperty("route_number")
  private String routeNumber = null;

  @JsonProperty("route_gtfs_id")
  private String routeGtfsId = null;

  @JsonProperty("direction")
  private V3DisruptionDirection direction = null;

  public V3DisruptionRoute routeType(Integer routeType) {
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

  public V3DisruptionRoute routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
  **/
  @Schema(description = "Route identifier")

  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3DisruptionRoute routeName(String routeName) {
    this.routeName = routeName;
    return this;
  }

  /**
   * Name of route
   * @return routeName
  **/
  @Schema(description = "Name of route")

  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  public V3DisruptionRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

  /**
   * Route number presented to public (i.e. not route_id)
   * @return routeNumber
  **/
  @Schema(description = "Route number presented to public (i.e. not route_id)")

  public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  public V3DisruptionRoute routeGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
    return this;
  }

  /**
   * GTFS Identifer of the route
   * @return routeGtfsId
  **/
  @Schema(description = "GTFS Identifer of the route")

  public String getRouteGtfsId() {
    return routeGtfsId;
  }

  public void setRouteGtfsId(String routeGtfsId) {
    this.routeGtfsId = routeGtfsId;
  }

  public V3DisruptionRoute direction(V3DisruptionDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @Schema(description = "")

  @Valid
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
    return Objects.equals(this.routeType, v3DisruptionRoute.routeType) &&
        Objects.equals(this.routeId, v3DisruptionRoute.routeId) &&
        Objects.equals(this.routeName, v3DisruptionRoute.routeName) &&
        Objects.equals(this.routeNumber, v3DisruptionRoute.routeNumber) &&
        Objects.equals(this.routeGtfsId, v3DisruptionRoute.routeGtfsId) &&
        Objects.equals(this.direction, v3DisruptionRoute.direction);
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
