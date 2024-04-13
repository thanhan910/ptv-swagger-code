package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3BulkDeparturesStopResponse;
import io.swagger.server.api.model.V3BulkDeparturesUpdateResponse;
import io.swagger.server.api.model.V3Direction;
import io.swagger.server.api.model.V3Disruption;
import io.swagger.server.api.model.V3Run;
import io.swagger.server.api.model.V3Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3BulkDeparturesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3BulkDeparturesResponse   {
  
  private List<V3BulkDeparturesUpdateResponse> responses = null;

  
  private Map<String, V3BulkDeparturesStopResponse> stops = null;

  
  private List<Object> routes = null;

  
  private List<V3Run> runs = null;

  
  private List<V3Direction> directions = null;

  
  private Map<String, V3Disruption> disruptions = null;

  private V3Status status = null;

  public V3BulkDeparturesResponse responses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
    return this;
  }

  public V3BulkDeparturesResponse addResponsesItem(V3BulkDeparturesUpdateResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<V3BulkDeparturesUpdateResponse>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
   * @return responses
   **/
    public List<V3BulkDeparturesUpdateResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
  }

  public V3BulkDeparturesResponse stops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
    return this;
  }

  public V3BulkDeparturesResponse putStopsItem(String key, V3BulkDeparturesStopResponse stopsItem) {
    if (this.stops == null) {
      this.stops = new HashMap<String, V3BulkDeparturesStopResponse>();
    }
    this.stops.put(key, stopsItem);
    return this;
  }

  /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   * @return stops
   **/
    public Map<String, V3BulkDeparturesStopResponse> getStops() {
    return stops;
  }

  public void setStops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
  }

  public V3BulkDeparturesResponse routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3BulkDeparturesResponse addRoutesItem(Object routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<Object>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
   **/
    public List<Object> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  public V3BulkDeparturesResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3BulkDeparturesResponse addRunsItem(V3Run runsItem) {
    if (this.runs == null) {
      this.runs = new ArrayList<V3Run>();
    }
    this.runs.add(runsItem);
    return this;
  }

  /**
   * Individual trips/services of a route
   * @return runs
   **/
    public List<V3Run> getRuns() {
    return runs;
  }

  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  public V3BulkDeparturesResponse directions(List<V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  public V3BulkDeparturesResponse addDirectionsItem(V3Direction directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<V3Direction>();
    }
    this.directions.add(directionsItem);
    return this;
  }

  /**
   * Directions of travel of route
   * @return directions
   **/
    public List<V3Direction> getDirections() {
    return directions;
  }

  public void setDirections(List<V3Direction> directions) {
    this.directions = directions;
  }

  public V3BulkDeparturesResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3BulkDeparturesResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
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
    public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3BulkDeparturesResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
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
    return Objects.equals(this.responses, v3BulkDeparturesResponse.responses) &&
        Objects.equals(this.stops, v3BulkDeparturesResponse.stops) &&
        Objects.equals(this.routes, v3BulkDeparturesResponse.routes) &&
        Objects.equals(this.runs, v3BulkDeparturesResponse.runs) &&
        Objects.equals(this.directions, v3BulkDeparturesResponse.directions) &&
        Objects.equals(this.disruptions, v3BulkDeparturesResponse.disruptions) &&
        Objects.equals(this.status, v3BulkDeparturesResponse.status);
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
