package io.swagger.model;

import io.swagger.model.V3BulkDeparturesStopResponse;
import io.swagger.model.V3BulkDeparturesUpdateResponse;
import io.swagger.model.V3Direction;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class V3BulkDeparturesResponse   {
  
  @Schema(description = "Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.")
 /**
   * Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.  
  **/
  private List<V3BulkDeparturesUpdateResponse> responses = null;
  
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
 /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop  
  **/
  private Map<String, V3BulkDeparturesStopResponse> stops = null;
  
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes  
  **/
  private List<Object> routes = null;
  
  @Schema(description = "Individual trips/services of a route")
 /**
   * Individual trips/services of a route  
  **/
  private List<V3Run> runs = null;
  
  @Schema(description = "Directions of travel of route")
 /**
   * Directions of travel of route  
  **/
  private List<V3Direction> directions = null;
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
 /**
   * Disruption information applicable to relevant routes or stops  
  **/
  private Map<String, V3Disruption> disruptions = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.
   * @return responses
  **/
  @JsonProperty("responses")
  public List<V3BulkDeparturesUpdateResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
  }

  public V3BulkDeparturesResponse responses(List<V3BulkDeparturesUpdateResponse> responses) {
    this.responses = responses;
    return this;
  }

  public V3BulkDeparturesResponse addResponsesItem(V3BulkDeparturesUpdateResponse responsesItem) {
    this.responses.add(responsesItem);
    return this;
  }

 /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   * @return stops
  **/
  @JsonProperty("stops")
  public Map<String, V3BulkDeparturesStopResponse> getStops() {
    return stops;
  }

  public void setStops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
  }

  public V3BulkDeparturesResponse stops(Map<String, V3BulkDeparturesStopResponse> stops) {
    this.stops = stops;
    return this;
  }

  public V3BulkDeparturesResponse putStopsItem(String key, V3BulkDeparturesStopResponse stopsItem) {
    this.stops.put(key, stopsItem);
    return this;
  }

 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
  **/
  @JsonProperty("routes")
  public List<Object> getRoutes() {
    return routes;
  }

  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  public V3BulkDeparturesResponse routes(List<Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3BulkDeparturesResponse addRoutesItem(Object routesItem) {
    this.routes.add(routesItem);
    return this;
  }

 /**
   * Individual trips/services of a route
   * @return runs
  **/
  @JsonProperty("runs")
  public List<V3Run> getRuns() {
    return runs;
  }

  public void setRuns(List<V3Run> runs) {
    this.runs = runs;
  }

  public V3BulkDeparturesResponse runs(List<V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3BulkDeparturesResponse addRunsItem(V3Run runsItem) {
    this.runs.add(runsItem);
    return this;
  }

 /**
   * Directions of travel of route
   * @return directions
  **/
  @JsonProperty("directions")
  public List<V3Direction> getDirections() {
    return directions;
  }

  public void setDirections(List<V3Direction> directions) {
    this.directions = directions;
  }

  public V3BulkDeparturesResponse directions(List<V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  public V3BulkDeparturesResponse addDirectionsItem(V3Direction directionsItem) {
    this.directions.add(directionsItem);
    return this;
  }

 /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
  **/
  @JsonProperty("disruptions")
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3BulkDeparturesResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3BulkDeparturesResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
    this.disruptions.put(key, disruptionsItem);
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

  public V3BulkDeparturesResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
