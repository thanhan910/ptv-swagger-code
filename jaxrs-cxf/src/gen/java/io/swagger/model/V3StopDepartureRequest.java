package io.swagger.model;

import io.swagger.model.V3StopDepartureRequestRouteDirection;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3StopDepartureRequest   {
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
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
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
  @Schema(description = "Number identifying transport mode; values returned via RouteTypes API")
 /**
   * Number identifying transport mode; values returned via RouteTypes API  
  **/
  private RouteTypeEnum routeType = null;
  
  @Schema(description = "Identifier of stop; values returned by Stops API")
 /**
   * Identifier of stop; values returned by Stops API  
  **/
  private Integer stopId = null;
  
  @Schema(description = "Maximum number of results returned")
 /**
   * Maximum number of results returned  
  **/
  private Integer maxResults = null;
  
  @Schema(description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data")
 /**
   * Indicates that stop_id parameter will accept \"GTFS stop_id\" data and route_directions[x].route_id parameters will accept route_gtfs_id data  
  **/
  private Boolean gtfs = null;
  
  @Schema(required = true, description = "The route directions to find departures for at this stop.")
 /**
   * The route directions to find departures for at this stop.  
  **/
  private List<V3StopDepartureRequestRouteDirection> routeDirections = new ArrayList<V3StopDepartureRequestRouteDirection>();
 /**
   * Number identifying transport mode; values returned via RouteTypes API
   * @return routeType
  **/
  @JsonProperty("route_type")
  public Integer getRouteType() {
    if (routeType == null) {
      return null;
    }
    return routeType.getValue();
  }

  public void setRouteType(RouteTypeEnum routeType) {
    this.routeType = routeType;
  }

  public V3StopDepartureRequest routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * Identifier of stop; values returned by Stops API
   * minimum: 0
   * maximum: 2147483647
   * @return stopId
  **/
  @JsonProperty("stop_id")
 @Min(0) @Max(2147483647)  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3StopDepartureRequest stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Maximum number of results returned
   * minimum: 0
   * maximum: 2147483647
   * @return maxResults
  **/
  @JsonProperty("max_results")
 @Min(0) @Max(2147483647)  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public V3StopDepartureRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

 /**
   * Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data and route_directions[x].route_id parameters will accept route_gtfs_id data
   * @return gtfs
  **/
  @JsonProperty("gtfs")
  public Boolean isGtfs() {
    return gtfs;
  }

  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  public V3StopDepartureRequest gtfs(Boolean gtfs) {
    this.gtfs = gtfs;
    return this;
  }

 /**
   * The route directions to find departures for at this stop.
   * @return routeDirections
  **/
  @JsonProperty("route_directions")
  @NotNull
  public List<V3StopDepartureRequestRouteDirection> getRouteDirections() {
    return routeDirections;
  }

  public void setRouteDirections(List<V3StopDepartureRequestRouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
  }

  public V3StopDepartureRequest routeDirections(List<V3StopDepartureRequestRouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
    return this;
  }

  public V3StopDepartureRequest addRouteDirectionsItem(V3StopDepartureRequestRouteDirection routeDirectionsItem) {
    this.routeDirections.add(routeDirectionsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
