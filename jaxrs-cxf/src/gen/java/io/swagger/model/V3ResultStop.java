package io.swagger.model;

import io.swagger.model.V3ResultRoute;
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

public class V3ResultStop   {
  
  @Schema(description = "Distance of stop from input location (in metres); returns 0 if no location is input")
 /**
   * Distance of stop from input location (in metres); returns 0 if no location is input  
  **/
  private Float stopDistance = null;
  
  @Schema(description = "suburb of stop")
 /**
   * suburb of stop  
  **/
  private String stopSuburb = null;
  
  @Schema(description = "Transport mode identifier")
 /**
   * Transport mode identifier  
  **/
  private Integer routeType = null;
  
  @Schema(description = "List of routes travelling through the stop")
 /**
   * List of routes travelling through the stop  
  **/
  private List<V3ResultRoute> routes = null;
  
  @Schema(description = "Geographic coordinate of latitude at stop")
 /**
   * Geographic coordinate of latitude at stop  
  **/
  private Float stopLatitude = null;
  
  @Schema(description = "Geographic coordinate of longitude at stop")
 /**
   * Geographic coordinate of longitude at stop  
  **/
  private Float stopLongitude = null;
  
  @Schema(description = "Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
 /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  
  **/
  private Integer stopSequence = null;
  
  @Schema(description = "Stop identifier")
 /**
   * Stop identifier  
  **/
  private Integer stopId = null;
  
  @Schema(description = "Name of stop")
 /**
   * Name of stop  
  **/
  private String stopName = null;
  
  @Schema(description = "Landmark in proximity of stop")
 /**
   * Landmark in proximity of stop  
  **/
  private String stopLandmark = null;
 /**
   * Distance of stop from input location (in metres); returns 0 if no location is input
   * @return stopDistance
  **/
  @JsonProperty("stop_distance")
  public Float getStopDistance() {
    return stopDistance;
  }

  public void setStopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
  }

  public V3ResultStop stopDistance(Float stopDistance) {
    this.stopDistance = stopDistance;
    return this;
  }

 /**
   * suburb of stop
   * @return stopSuburb
  **/
  @JsonProperty("stop_suburb")
  public String getStopSuburb() {
    return stopSuburb;
  }

  public void setStopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
  }

  public V3ResultStop stopSuburb(String stopSuburb) {
    this.stopSuburb = stopSuburb;
    return this;
  }

 /**
   * Transport mode identifier
   * @return routeType
  **/
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3ResultStop routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

 /**
   * List of routes travelling through the stop
   * @return routes
  **/
  @JsonProperty("routes")
  public List<V3ResultRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }

  public V3ResultStop routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3ResultStop addRoutesItem(V3ResultRoute routesItem) {
    this.routes.add(routesItem);
    return this;
  }

 /**
   * Geographic coordinate of latitude at stop
   * @return stopLatitude
  **/
  @JsonProperty("stop_latitude")
  public Float getStopLatitude() {
    return stopLatitude;
  }

  public void setStopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
  }

  public V3ResultStop stopLatitude(Float stopLatitude) {
    this.stopLatitude = stopLatitude;
    return this;
  }

 /**
   * Geographic coordinate of longitude at stop
   * @return stopLongitude
  **/
  @JsonProperty("stop_longitude")
  public Float getStopLongitude() {
    return stopLongitude;
  }

  public void setStopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
  }

  public V3ResultStop stopLongitude(Float stopLongitude) {
    this.stopLongitude = stopLongitude;
    return this;
  }

 /**
   * Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
   * @return stopSequence
  **/
  @JsonProperty("stop_sequence")
  public Integer getStopSequence() {
    return stopSequence;
  }

  public void setStopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
  }

  public V3ResultStop stopSequence(Integer stopSequence) {
    this.stopSequence = stopSequence;
    return this;
  }

 /**
   * Stop identifier
   * @return stopId
  **/
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }

  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  public V3ResultStop stopId(Integer stopId) {
    this.stopId = stopId;
    return this;
  }

 /**
   * Name of stop
   * @return stopName
  **/
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }

  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  public V3ResultStop stopName(String stopName) {
    this.stopName = stopName;
    return this;
  }

 /**
   * Landmark in proximity of stop
   * @return stopLandmark
  **/
  @JsonProperty("stop_landmark")
  public String getStopLandmark() {
    return stopLandmark;
  }

  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }

  public V3ResultStop stopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ResultStop {\n");
    
    sb.append("    stopDistance: ").append(toIndentedString(stopDistance)).append("\n");
    sb.append("    stopSuburb: ").append(toIndentedString(stopSuburb)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stopLatitude: ").append(toIndentedString(stopLatitude)).append("\n");
    sb.append("    stopLongitude: ").append(toIndentedString(stopLongitude)).append("\n");
    sb.append("    stopSequence: ").append(toIndentedString(stopSequence)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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
