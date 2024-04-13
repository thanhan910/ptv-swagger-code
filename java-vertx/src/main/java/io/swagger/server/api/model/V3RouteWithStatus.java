package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3RouteServiceStatus;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3RouteWithStatus
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3RouteWithStatus   {
  private V3RouteServiceStatus routeServiceStatus = null;

  private Integer routeType = null;

  private Integer routeId = null;

  private String routeName = null;

  private String routeNumber = null;

  private String routeGtfsId = null;

  
  private List<Object> geopath = null;

  public V3RouteWithStatus routeServiceStatus(V3RouteServiceStatus routeServiceStatus) {
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

  public V3RouteWithStatus routeType(Integer routeType) {
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

  public V3RouteWithStatus routeId(Integer routeId) {
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

  public V3RouteWithStatus routeName(String routeName) {
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

  public V3RouteWithStatus routeNumber(String routeNumber) {
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

  public V3RouteWithStatus routeGtfsId(String routeGtfsId) {
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

  public V3RouteWithStatus geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3RouteWithStatus addGeopathItem(Object geopathItem) {
    if (this.geopath == null) {
      this.geopath = new ArrayList<Object>();
    }
    this.geopath.add(geopathItem);
    return this;
  }

  /**
   * GeoPath of the route
   * @return geopath
   **/
    public List<Object> getGeopath() {
    return geopath;
  }

  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteWithStatus v3RouteWithStatus = (V3RouteWithStatus) o;
    return Objects.equals(this.routeServiceStatus, v3RouteWithStatus.routeServiceStatus) &&
        Objects.equals(this.routeType, v3RouteWithStatus.routeType) &&
        Objects.equals(this.routeId, v3RouteWithStatus.routeId) &&
        Objects.equals(this.routeName, v3RouteWithStatus.routeName) &&
        Objects.equals(this.routeNumber, v3RouteWithStatus.routeNumber) &&
        Objects.equals(this.routeGtfsId, v3RouteWithStatus.routeGtfsId) &&
        Objects.equals(this.geopath, v3RouteWithStatus.geopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeServiceStatus, routeType, routeId, routeName, routeNumber, routeGtfsId, geopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteWithStatus {\n");
    
    sb.append("    routeServiceStatus: ").append(toIndentedString(routeServiceStatus)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeName: ").append(toIndentedString(routeName)).append("\n");
    sb.append("    routeNumber: ").append(toIndentedString(routeNumber)).append("\n");
    sb.append("    routeGtfsId: ").append(toIndentedString(routeGtfsId)).append("\n");
    sb.append("    geopath: ").append(toIndentedString(geopath)).append("\n");
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
