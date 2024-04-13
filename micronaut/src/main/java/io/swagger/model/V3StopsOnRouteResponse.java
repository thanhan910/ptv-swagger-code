package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopOnRoute;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3StopsOnRouteResponse
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3StopsOnRouteResponse   {
  @JsonProperty("stops")
  @Valid
  private List<V3StopOnRoute> stops = null;

  @JsonProperty("disruptions")
  @Valid
  private Map<String, V3Disruption> disruptions = null;

  @JsonProperty("geopath")
  @Valid
  private List<Object> geopath = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3StopsOnRouteResponse stops(List<V3StopOnRoute> stops) {
    this.stops = stops;
    return this;
  }

  public V3StopsOnRouteResponse addStopsItem(V3StopOnRoute stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<V3StopOnRoute>();
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
  public List<V3StopOnRoute> getStops() {
    return stops;
  }

  public void setStops(List<V3StopOnRoute> stops) {
    this.stops = stops;
  }

  public V3StopsOnRouteResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3StopsOnRouteResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
    if (this.disruptions == null) {
      this.disruptions = new HashMap<String, V3Disruption>();
    }
    this.disruptions.put(key, disruptionsItem);
    return this;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
  **/
  @Schema(description = "Disruption information applicable to relevant routes or stops")
  @Valid
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3StopsOnRouteResponse geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3StopsOnRouteResponse addGeopathItem(Object geopathItem) {
    if (this.geopath == null) {
      this.geopath = new ArrayList<Object>();
    }
    this.geopath.add(geopathItem);
    return this;
  }

  /**
   * GeoPath for the route
   * @return geopath
  **/
  @Schema(description = "GeoPath for the route")

  public List<Object> getGeopath() {
    return geopath;
  }

  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }

  public V3StopsOnRouteResponse status(V3Status status) {
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
    V3StopsOnRouteResponse v3StopsOnRouteResponse = (V3StopsOnRouteResponse) o;
    return Objects.equals(this.stops, v3StopsOnRouteResponse.stops) &&
        Objects.equals(this.disruptions, v3StopsOnRouteResponse.disruptions) &&
        Objects.equals(this.geopath, v3StopsOnRouteResponse.geopath) &&
        Objects.equals(this.status, v3StopsOnRouteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stops, disruptions, geopath, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopsOnRouteResponse {\n");
    
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    geopath: ").append(toIndentedString(geopath)).append("\n");
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
