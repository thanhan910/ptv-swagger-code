package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3ResultOutlet;
import io.swagger.model.V3ResultRoute;
import io.swagger.model.V3ResultStop;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SearchResult
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3SearchResult   {
  @JsonProperty("stops")
  @Valid
  private List<V3ResultStop> stops = null;

  @JsonProperty("routes")
  @Valid
  private List<V3ResultRoute> routes = null;

  @JsonProperty("outlets")
  @Valid
  private List<V3ResultOutlet> outlets = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3SearchResult stops(List<V3ResultStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3SearchResult addStopsItem(V3ResultStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<V3ResultStop>();
    }
    this.stops.add(stopsItem);
    return this;
  }

  /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   * @return stops
  **/
  @Schema(description = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
  @Valid
  public List<V3ResultStop> getStops() {
    return stops;
  }

  public void setStops(List<V3ResultStop> stops) {
    this.stops = stops;
  }

  public V3SearchResult routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3SearchResult addRoutesItem(V3ResultRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<V3ResultRoute>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
  **/
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
  @Valid
  public List<V3ResultRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }

  public V3SearchResult outlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  public V3SearchResult addOutletsItem(V3ResultOutlet outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<V3ResultOutlet>();
    }
    this.outlets.add(outletsItem);
    return this;
  }

  /**
   * myki ticket outlets
   * @return outlets
  **/
  @Schema(description = "myki ticket outlets")
  @Valid
  public List<V3ResultOutlet> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
  }

  public V3SearchResult status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @Schema(description = "")

  @Valid
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
    return Objects.equals(this.stops, v3SearchResult.stops) &&
        Objects.equals(this.routes, v3SearchResult.routes) &&
        Objects.equals(this.outlets, v3SearchResult.outlets) &&
        Objects.equals(this.status, v3SearchResult.status);
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
