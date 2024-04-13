package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3StopDepartureRequestRouteDirection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopDepartureRequest
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
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

    @JsonCreator
    public static RouteTypeEnum fromValue(String text) {
      for (RouteTypeEnum b : RouteTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("route_type")
  private RouteTypeEnum routeType = null;

  @JsonProperty("stop_id")
  private Integer stopId = null;

  @JsonProperty("max_results")
  private Integer maxResults = null;

  @JsonProperty("gtfs")
  private Boolean gtfs = null;

  @JsonProperty("route_directions")
  @Valid
  private List<V3StopDepartureRequestRouteDirection> routeDirections = new ArrayList<V3StopDepartureRequestRouteDirection>();

  public V3StopDepartureRequest routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Number identifying transport mode; values returned via RouteTypes API
   * @return routeType
  **/
  @Schema(description = "Number identifying transport mode; values returned via RouteTypes API")

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
  @Schema(description = "Identifier of stop; values returned by Stops API")

@Min(0) @Max(2147483647)   public Integer getStopId() {
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
  @Schema(description = "Maximum number of results returned")

@Min(0) @Max(2147483647)   public Integer getMaxResults() {
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
  @Schema(description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data")

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
  @Schema(required = true, description = "The route directions to find departures for at this stop.")
  @NotNull
  @Valid
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
