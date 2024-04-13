package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3DisruptionDirection;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3DisruptionRoute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3DisruptionRoute   {
  private Integer routeType = null;

  private Integer routeId = null;

  private String routeName = null;

  private String routeNumber = null;

  private String routeGtfsId = null;

  private V3DisruptionDirection direction = null;

  public V3DisruptionRoute routeType(Integer routeType) {
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

  public V3DisruptionRoute routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * Route identifier
   * @return routeId
   **/
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
