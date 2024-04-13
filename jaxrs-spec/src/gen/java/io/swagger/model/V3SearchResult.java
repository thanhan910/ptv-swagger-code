package io.swagger.model;

import io.swagger.model.V3ResultOutlet;
import io.swagger.model.V3ResultRoute;
import io.swagger.model.V3ResultStop;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SearchResult   {

  private @Valid List<V3ResultStop> stops = new ArrayList<V3ResultStop>();

  private @Valid List<V3ResultRoute> routes = new ArrayList<V3ResultRoute>();

  private @Valid List<V3ResultOutlet> outlets = new ArrayList<V3ResultOutlet>();

  private @Valid V3Status status = null;

  /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   **/
  public V3SearchResult stops(List<V3ResultStop> stops) {
    this.stops = stops;
    return this;
  }

  
  @ApiModelProperty(value = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
  @JsonProperty("stops")

  public List<V3ResultStop> getStops() {
    return stops;
  }
  public void setStops(List<V3ResultStop> stops) {
    this.stops = stops;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   **/
  public V3SearchResult routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  
  @ApiModelProperty(value = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
  @JsonProperty("routes")

  public List<V3ResultRoute> getRoutes() {
    return routes;
  }
  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }

  /**
   * myki ticket outlets
   **/
  public V3SearchResult outlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  
  @ApiModelProperty(value = "myki ticket outlets")
  @JsonProperty("outlets")

  public List<V3ResultOutlet> getOutlets() {
    return outlets;
  }
  public void setOutlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
  }

  /**
   **/
  public V3SearchResult status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SearchResult v3SearchResult = (V3SearchResult) o;
    return Objects.equals(stops, v3SearchResult.stops) &&
        Objects.equals(routes, v3SearchResult.routes) &&
        Objects.equals(outlets, v3SearchResult.outlets) &&
        Objects.equals(status, v3SearchResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stops, routes, outlets, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
