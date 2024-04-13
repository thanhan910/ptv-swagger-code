package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.V3StopDepartureRequestRouteDirection;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StopDepartureRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StopDepartureRequest   {
  /**
   * Number identifying transport mode; values returned via RouteTypes API
   */
  public enum RouteTypeEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4);

    private Integer value;

    RouteTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RouteTypeEnum fromValue(Integer value) {
      for (RouteTypeEnum b : RouteTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private RouteTypeEnum routeType = null;

  private Integer stopId = null;

  private Integer maxResults = null;

  private Boolean gtfs = null;

  
  private List<V3StopDepartureRequestRouteDirection> routeDirections = new ArrayList<V3StopDepartureRequestRouteDirection>();

  public V3StopDepartureRequest routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Number identifying transport mode; values returned via RouteTypes API
   * @return routeType
   **/
    public RouteTypeEnum getRouteType() {
    return routeType;
  }

  public void setRouteType(RouteTypeEnum routeType) {
    this.routeType = routeType;
  }

  public V3StopDepartureRequest stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

  /**
   * Identifier of stop; values returned by Stops API
   * minimum: 0
   * maximum: 2147483647
   * @return stopId
   **/
    public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3StopDepartureRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Maximum number of results returned
   * minimum: 0
   * maximum: 2147483647
   * @return maxResults
   **/
    public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public V3StopDepartureRequest gtfs(Boolean gtfs) {
    this.gtfs = gtfs;
    return this;
  }

  /**
   * Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data
   * @return gtfs
   **/
    public Boolean isGtfs() {
    return gtfs;
  }

  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  public V3StopDepartureRequest routeDirections(List<V3StopDepartureRequestRouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
    return this;
  }

  public V3StopDepartureRequest addRouteDirectionsItem(V3StopDepartureRequestRouteDirection routeDirectionsItem) {
    this.routeDirections.add(routeDirectionsItem);
    return this;
  }

  /**
   * The route directions to find departures for at this stop.
   * @return routeDirections
   **/
    public List<V3StopDepartureRequestRouteDirection> getRouteDirections() {
    return routeDirections;
  }

  public void setRouteDirections(List<V3StopDepartureRequestRouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopDepartureRequest v3StopDepartureRequest = (V3StopDepartureRequest) o;
    return Objects.equals(this.routeType, v3StopDepartureRequest.routeType) &&
        Objects.equals(this.stopId, v3StopDepartureRequest.stopId) &&
        Objects.equals(this.maxResults, v3StopDepartureRequest.maxResults) &&
        Objects.equals(this.gtfs, v3StopDepartureRequest.gtfs) &&
        Objects.equals(this.routeDirections, v3StopDepartureRequest.routeDirections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeType, stopId, maxResults, gtfs, routeDirections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopDepartureRequest {\n");
    
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    gtfs: ").append(toIndentedString(gtfs)).append("\n");
    sb.append("    routeDirections: ").append(toIndentedString(routeDirections)).append("\n");
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
