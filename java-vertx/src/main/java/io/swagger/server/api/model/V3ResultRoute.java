package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3RouteServiceStatus;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3ResultRoute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3ResultRoute   {
  private String routeName = null;

  private String routeNumber = null;

  private Integer routeType = null;

  private Integer routeId = null;

  private String routeGtfsId = null;

  private V3RouteServiceStatus routeServiceStatus = null;

  public V3ResultRoute routeName(String routeName) {
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

  public V3ResultRoute routeNumber(String routeNumber) {
    this.routeNumber = routeNumber;
    return this;
  }

  /**
   * Route number presented to public (nb. not route_id)
   * @return routeNumber
   **/
    public String getRouteNumber() {
    return routeNumber;
  }

  public void setRouteNumber(String routeNumber) {
    this.routeNumber = routeNumber;
  }

  public V3ResultRoute routeType(Integer routeType) {
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

  public V3ResultRoute routeId(Integer routeId) {
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

  public V3ResultRoute routeGtfsId(String routeGtfsId) {
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

  public V3ResultRoute routeServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
    return this;
  }

  /**
   * Get routeServiceStatus
   * @return routeServiceStatus
   **/
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
    return Objects.equals(this.routeName, v3ResultRoute.routeName) &&
        Objects.equals(this.routeNumber, v3ResultRoute.routeNumber) &&
        Objects.equals(this.routeType, v3ResultRoute.routeType) &&
        Objects.equals(this.routeId, v3ResultRoute.routeId) &&
        Objects.equals(this.routeGtfsId, v3ResultRoute.routeGtfsId) &&
        Objects.equals(this.routeServiceStatus, v3ResultRoute.routeServiceStatus);
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
