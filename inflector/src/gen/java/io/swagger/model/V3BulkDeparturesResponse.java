package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3BulkDeparturesStopResponse;
import io.swagger.model.V3BulkDeparturesUpdateResponse;
import io.swagger.model.V3Direction;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3BulkDeparturesResponse   {
  @JsonProperty("responses")
  private List<V3BulkDeparturesUpdateResponse> responses = null;
  @JsonProperty("stops")
  private Map<String, V3BulkDeparturesStopResponse> stops = null;
  @JsonProperty("routes")
  private List<Object> routes = null;
  @JsonProperty("runs")
  private List<V3Run> runs = null;
  @JsonProperty("directions")
  private List<V3Direction> directions = null;
  @JsonProperty("disruptions")
  private Map<String, V3Disruption> disruptions = null;
  @JsonProperty("status")
  private V3Status status = null;
  /**
   * Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
   **/
  public V3BulkDeparturesResponse responses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
    return this;
  }

  
  @Schema(description = "Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.")
  @JsonProperty("responses")
  public List<V3BulkDeparturesUpdateResponse> getResponses() {
    return responses;
  }
  public void setResponses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
  }

  /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   **/
  public V3BulkDeparturesResponse stops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
    return this;
  }

  
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
  @JsonProperty("stops")
  public Map<String, V3BulkDeparturesStopResponse> getStops() {
    return stops;
  }
  public void setStops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   **/
  public V3BulkDeparturesResponse routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
  @JsonProperty("routes")
  public List<Object> getRoutes() {
    return routes;
  }
  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  /**
   * Individual trips/services of a route
   **/
  public V3BulkDeparturesResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  
  @Schema(description = "Individual trips/services of a route")
  @JsonProperty("runs")
  public List<V3Run> getRuns() {
    return runs;
  }
  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  /**
   * Directions of travel of route
   **/
  public V3BulkDeparturesResponse directions(List<V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  
  @Schema(description = "Directions of travel of route")
  @JsonProperty("directions")
  public List<V3Direction> getDirections() {
    return directions;
  }
  public void setDirections(List<V3Direction> directions) {
    this.directions = directions;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   **/
  public V3BulkDeparturesResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
  @JsonProperty("disruptions")
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }
  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  /**
   **/
  public V3BulkDeparturesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @Schema(description = "")
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
    V3BulkDeparturesResponse v3BulkDeparturesResponse = (V3BulkDeparturesResponse) o;
    return Objects.equals(responses, v3BulkDeparturesResponse.responses) &&
        Objects.equals(stops, v3BulkDeparturesResponse.stops) &&
        Objects.equals(routes, v3BulkDeparturesResponse.routes) &&
        Objects.equals(runs, v3BulkDeparturesResponse.runs) &&
        Objects.equals(directions, v3BulkDeparturesResponse.directions) &&
        Objects.equals(disruptions, v3BulkDeparturesResponse.disruptions) &&
        Objects.equals(status, v3BulkDeparturesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responses, stops, routes, runs, directions, disruptions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesResponse {\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
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
