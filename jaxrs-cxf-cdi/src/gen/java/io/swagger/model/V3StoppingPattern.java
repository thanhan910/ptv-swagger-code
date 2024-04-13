package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Direction;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3PatternDeparture;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.model.V3StoppingPatternStop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3StoppingPattern   {
  private List<V3Disruption> disruptions = new ArrayList<V3Disruption>();
  private List<V3PatternDeparture> departures = new ArrayList<V3PatternDeparture>();
  private Map<String, V3StoppingPatternStop> stops = new HashMap<String, V3StoppingPatternStop>();
  private Map<String, Object> routes = new HashMap<String, Object>();
  private Map<String, V3Run> runs = new HashMap<String, V3Run>();
  private Map<String, V3Direction> directions = new HashMap<String, V3Direction>();
  private V3Status status = null;

  /**
   * Disruption information applicable to relevant routes or stops
   **/
  public V3StoppingPattern disruptions(List<V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
  @JsonProperty("disruptions")
  @Valid
  public List<V3Disruption> getDisruptions() {
    return disruptions;
  }
  public void setDisruptions(List<V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  /**
   * Timetabled and real-time service departures
   **/
  public V3StoppingPattern departures(List<V3PatternDeparture> departures) {
    this.departures = departures;
    return this;
  }

  
  
  @Schema(description = "Timetabled and real-time service departures")
  @JsonProperty("departures")
  @Valid
  public List<V3PatternDeparture> getDepartures() {
    return departures;
  }
  public void setDepartures(List<V3PatternDeparture> departures) {
    this.departures = departures;
  }

  /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   **/
  public V3StoppingPattern stops(Map<String, V3StoppingPatternStop> stops) {
    this.stops = stops;
    return this;
  }

  
  
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
  @JsonProperty("stops")
  @Valid
  public Map<String, V3StoppingPatternStop> getStops() {
    return stops;
  }
  public void setStops(Map<String, V3StoppingPatternStop> stops) {
    this.stops = stops;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   **/
  public V3StoppingPattern routes(Map<String, Object> routes) {
    this.routes = routes;
    return this;
  }

  
  
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
  public V3StoppingPattern runs(Map<String, V3Run> runs) {
    this.runs = runs;
    return this;
  }

  
  
  @Schema(description = "Individual trips/services of a route")
  @JsonProperty("runs")
  @Valid
  public Map<String, V3Run> getRuns() {
    return runs;
  }
  public void setRuns(Map<String, V3Run> runs) {
    this.runs = runs;
  }

  /**
   * Directions of travel of route
   **/
  public V3StoppingPattern directions(Map<String, V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  
  
  @Schema(description = "Directions of travel of route")
  @JsonProperty("directions")
  @Valid
  public Map<String, V3Direction> getDirections() {
    return directions;
  }
  public void setDirections(Map<String, V3Direction> directions) {
    this.directions = directions;
  }

  /**
   **/
  public V3StoppingPattern status(V3Status status) {
    this.status = status;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("status")
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
    V3StoppingPattern v3StoppingPattern = (V3StoppingPattern) o;
    return Objects.equals(disruptions, v3StoppingPattern.disruptions) &&
        Objects.equals(departures, v3StoppingPattern.departures) &&
        Objects.equals(stops, v3StoppingPattern.stops) &&
        Objects.equals(routes, v3StoppingPattern.routes) &&
        Objects.equals(runs, v3StoppingPattern.runs) &&
        Objects.equals(directions, v3StoppingPattern.directions) &&
        Objects.equals(status, v3StoppingPattern.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, departures, stops, routes, runs, directions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StoppingPattern {\n");
    
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    departures: ").append(toIndentedString(departures)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
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
