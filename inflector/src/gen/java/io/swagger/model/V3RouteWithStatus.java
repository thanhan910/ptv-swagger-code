package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3RouteServiceStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3RouteWithStatus   {
  @JsonProperty("route_service_status")
  private V3RouteServiceStatus routeServiceStatus = null;
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
  @JsonProperty("geopath")
  private List<Object> geopath = null;
  /**
   **/
  public V3RouteWithStatus routeServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("route_service_status")
  public V3RouteServiceStatus getRouteServiceStatus() {
    return routeServiceStatus;
  }
  public void setRouteServiceStatus(V3RouteServiceStatus routeServiceStatus) {
    this.routeServiceStatus = routeServiceStatus;
  }

  /**
   * Transport mode identifier
   **/
  public V3RouteWithStatus routeType(Integer routeType) {
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
  public V3RouteWithStatus routeId(Integer routeId) {
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
   * Name of route
   **/
  public V3RouteWithStatus routeName(String routeName) {
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
  public V3RouteWithStatus routeNumber(String routeNumber) {
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
   * GTFS Identifer of the route
   **/
  public V3RouteWithStatus routeGtfsId(String routeGtfsId) {
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
   * GeoPath of the route
   **/
  public V3RouteWithStatus geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  
  @Schema(description = "GeoPath of the route")
  @JsonProperty("geopath")
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
    return Objects.equals(routeServiceStatus, v3RouteWithStatus.routeServiceStatus) &&
        Objects.equals(routeType, v3RouteWithStatus.routeType) &&
        Objects.equals(routeId, v3RouteWithStatus.routeId) &&
        Objects.equals(routeName, v3RouteWithStatus.routeName) &&
        Objects.equals(routeNumber, v3RouteWithStatus.routeNumber) &&
        Objects.equals(routeGtfsId, v3RouteWithStatus.routeGtfsId) &&
        Objects.equals(geopath, v3RouteWithStatus.geopath);
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
