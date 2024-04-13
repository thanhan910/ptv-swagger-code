package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Departure;
import io.swagger.model.V3Direction;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopModel;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3DeparturesResponse   {
  private List<V3Departure> departures = new ArrayList<V3Departure>();
  private Map<String, V3StopModel> stops = new HashMap<String, V3StopModel>();
  private Map<String, Object> routes = new HashMap<String, Object>();
  private Map<String, V3Run> runs = new HashMap<String, V3Run>();
  private Map<String, V3Direction> directions = new HashMap<String, V3Direction>();
  private Map<String, V3Disruption> disruptions = new HashMap<String, V3Disruption>();
  private V3Status status = null;

  /**
   * Timetabled and real-time service departures
   **/
  
  @Schema(description = "Timetabled and real-time service departures")
  @JsonProperty("departures")
  public List<V3Departure> getDepartures() {
    return departures;
  }
  public void setDepartures(List<V3Departure> departures) {
    this.departures = departures;
  }

  /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   **/
  
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
  @JsonProperty("stops")
  public Map<String, V3StopModel> getStops() {
    return stops;
  }
  public void setStops(Map<String, V3StopModel> stops) {
    this.stops = stops;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   **/
  
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
  @JsonProperty("routes")
  public Map<String, Object> getRoutes() {
    return routes;
  }
  public void setRoutes(Map<String, Object> routes) {
    this.routes = routes;
  }

  /**
   * Individual trips/services of a route
   **/
  
  @Schema(description = "Individual trips/services of a route")
  @JsonProperty("runs")
  public Map<String, V3Run> getRuns() {
    return runs;
  }
  public void setRuns(Map<String, V3Run> runs) {
    this.runs = runs;
  }

  /**
   * Directions of travel of route
   **/
  
  @Schema(description = "Directions of travel of route")
  @JsonProperty("directions")
  public Map<String, V3Direction> getDirections() {
    return directions;
  }
  public void setDirections(Map<String, V3Direction> directions) {
    this.directions = directions;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   **/
  
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
  
  @Schema(description = "")
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DeparturesResponse v3DeparturesResponse = (V3DeparturesResponse) o;
    return Objects.equals(departures, v3DeparturesResponse.departures) &&
        Objects.equals(stops, v3DeparturesResponse.stops) &&
        Objects.equals(routes, v3DeparturesResponse.routes) &&
        Objects.equals(runs, v3DeparturesResponse.runs) &&
        Objects.equals(directions, v3DeparturesResponse.directions) &&
        Objects.equals(disruptions, v3DeparturesResponse.disruptions) &&
        Objects.equals(status, v3DeparturesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departures, stops, routes, runs, directions, disruptions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DeparturesResponse {\n");
    
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
