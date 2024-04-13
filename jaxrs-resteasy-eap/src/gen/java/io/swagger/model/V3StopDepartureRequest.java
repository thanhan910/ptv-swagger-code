package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3StopDepartureRequestRouteDirection;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RouteTypeEnum routeType = null;
  private Integer stopId = null;
  private Integer maxResults = null;
  private Boolean gtfs = null;
  private List<V3StopDepartureRequestRouteDirection> routeDirections = new ArrayList<V3StopDepartureRequestRouteDirection>();

  /**
   * Number identifying transport mode; values returned via RouteTypes API
   **/
  
  @Schema(description = "Number identifying transport mode; values returned via RouteTypes API")
  @JsonProperty("route_type")
  public RouteTypeEnum getRouteType() {
    return routeType;
  }
  public void setRouteType(RouteTypeEnum routeType) {
    this.routeType = routeType;
  }

  /**
   * Identifier of stop; values returned by Stops API
   * minimum: 0
   * maximum: 2147483647
   **/
  
  @Schema(description = "Identifier of stop; values returned by Stops API")
  @JsonProperty("stop_id")
  @Min(0)
  @Max(2147483647)
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Maximum number of results returned
   * minimum: 0
   * maximum: 2147483647
   **/
  
  @Schema(description = "Maximum number of results returned")
  @JsonProperty("max_results")
  @Min(0)
  @Max(2147483647)
  public Integer getMaxResults() {
    return maxResults;
  }
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  /**
   * Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data
   **/
  
  @Schema(description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data")
  @JsonProperty("gtfs")
  public Boolean isGtfs() {
    return gtfs;
  }
  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  /**
   * The route directions to find departures for at this stop.
   **/
  
  @Schema(required = true, description = "The route directions to find departures for at this stop.")
  @JsonProperty("route_directions")
  @NotNull
  public List<V3StopDepartureRequestRouteDirection> getRouteDirections() {
    return routeDirections;
  }
  public void setRouteDirections(List<V3StopDepartureRequestRouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopDepartureRequest v3StopDepartureRequest = (V3StopDepartureRequest) o;
    return Objects.equals(routeType, v3StopDepartureRequest.routeType) &&
        Objects.equals(stopId, v3StopDepartureRequest.stopId) &&
        Objects.equals(maxResults, v3StopDepartureRequest.maxResults) &&
        Objects.equals(gtfs, v3StopDepartureRequest.gtfs) &&
        Objects.equals(routeDirections, v3StopDepartureRequest.routeDirections);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
