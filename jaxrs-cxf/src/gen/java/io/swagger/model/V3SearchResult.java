package io.swagger.model;

import io.swagger.model.V3ResultOutlet;
import io.swagger.model.V3ResultRoute;
import io.swagger.model.V3ResultStop;
import io.swagger.model.V3Status;
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

public class V3SearchResult   {
  
  @Schema(description = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
 /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops  
  **/
  private List<V3ResultStop> stops = null;
  
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes  
  **/
  private List<V3ResultRoute> routes = null;
  
  @Schema(description = "myki ticket outlets")
 /**
   * myki ticket outlets  
  **/
  private List<V3ResultOutlet> outlets = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   * @return stops
  **/
  @JsonProperty("stops")
  public List<V3ResultStop> getStops() {
    return stops;
  }

  public void setStops(List<V3ResultStop> stops) {
    this.stops = stops;
  }

  public V3SearchResult stops(List<V3ResultStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3SearchResult addStopsItem(V3ResultStop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
  **/
  @JsonProperty("routes")
  public List<V3ResultRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }

  public V3SearchResult routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3SearchResult addRoutesItem(V3ResultRoute routesItem) {
    this.routes.add(routesItem);
    return this;
  }

 /**
   * myki ticket outlets
   * @return outlets
  **/
  @JsonProperty("outlets")
  public List<V3ResultOutlet> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
  }

  public V3SearchResult outlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  public V3SearchResult addOutletsItem(V3ResultOutlet outletsItem) {
    this.outlets.add(outletsItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }

  public V3SearchResult status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SearchResult {\n");
    
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
