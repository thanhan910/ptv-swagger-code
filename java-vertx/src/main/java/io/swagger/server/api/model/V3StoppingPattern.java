package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3Direction;
import io.swagger.server.api.model.V3Disruption;
import io.swagger.server.api.model.V3PatternDeparture;
import io.swagger.server.api.model.V3Run;
import io.swagger.server.api.model.V3Status;
import io.swagger.server.api.model.V3StoppingPatternStop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StoppingPattern
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StoppingPattern   {
  
  private List<V3Disruption> disruptions = null;

  
  private List<V3PatternDeparture> departures = null;

  
  private Map<String, V3StoppingPatternStop> stops = null;

  
  private Map<String, Object> routes = null;

  
  private Map<String, V3Run> runs = null;

  
  private Map<String, V3Direction> directions = null;

  private V3Status status = null;

  public V3StoppingPattern disruptions(List<V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3StoppingPattern addDisruptionsItem(V3Disruption disruptionsItem) {
    if (this.disruptions == null) {
      this.disruptions = new ArrayList<V3Disruption>();
    }
    this.disruptions.add(disruptionsItem);
    return this;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
   **/
    public List<V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(List<V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3StoppingPattern departures(List<V3PatternDeparture> departures) {
    this.departures = departures;
    return this;
  }

  public V3StoppingPattern addDeparturesItem(V3PatternDeparture departuresItem) {
    if (this.departures == null) {
      this.departures = new ArrayList<V3PatternDeparture>();
    }
    this.departures.add(departuresItem);
    return this;
  }

  /**
   * Timetabled and real-time service departures
   * @return departures
   **/
    public List<V3PatternDeparture> getDepartures() {
    return departures;
  }

  public void setDepartures(List<V3PatternDeparture> departures) {
    this.departures = departures;
  }

  public V3StoppingPattern stops(Map<String, V3StoppingPatternStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3StoppingPattern putStopsItem(String key, V3StoppingPatternStop stopsItem) {
    if (this.stops == null) {
      this.stops = new HashMap<String, V3StoppingPatternStop>();
    }
    this.stops.put(key, stopsItem);
    return this;
  }

  /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   * @return stops
   **/
    public Map<String, V3StoppingPatternStop> getStops() {
    return stops;
  }

  public void setStops(Map<String, V3StoppingPatternStop> stops) {
    this.stops = stops;
  }

  public V3StoppingPattern routes(Map<String, Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3StoppingPattern putRoutesItem(String key, Object routesItem) {
    if (this.routes == null) {
      this.routes = new HashMap<String, Object>();
    }
    this.routes.put(key, routesItem);
    return this;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
   **/
    public Map<String, Object> getRoutes() {
    return routes;
  }

  public void setRoutes(Map<String, Object> routes) {
    this.routes = routes;
  }

  public V3StoppingPattern runs(Map<String, V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3StoppingPattern putRunsItem(String key, V3Run runsItem) {
    if (this.runs == null) {
      this.runs = new HashMap<String, V3Run>();
    }
    this.runs.put(key, runsItem);
    return this;
  }

  /**
   * Individual trips/services of a route
   * @return runs
   **/
    public Map<String, V3Run> getRuns() {
    return runs;
  }

  public void setRuns(Map<String, V3Run> runs) {
    this.runs = runs;
  }

  public V3StoppingPattern directions(Map<String, V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  public V3StoppingPattern putDirectionsItem(String key, V3Direction directionsItem) {
    if (this.directions == null) {
      this.directions = new HashMap<String, V3Direction>();
    }
    this.directions.put(key, directionsItem);
    return this;
  }

  /**
   * Directions of travel of route
   * @return directions
   **/
    public Map<String, V3Direction> getDirections() {
    return directions;
  }

  public void setDirections(Map<String, V3Direction> directions) {
    this.directions = directions;
  }

  public V3StoppingPattern status(V3Status status) {
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
    V3StoppingPattern v3StoppingPattern = (V3StoppingPattern) o;
    return Objects.equals(this.disruptions, v3StoppingPattern.disruptions) &&
        Objects.equals(this.departures, v3StoppingPattern.departures) &&
        Objects.equals(this.stops, v3StoppingPattern.stops) &&
        Objects.equals(this.routes, v3StoppingPattern.routes) &&
        Objects.equals(this.runs, v3StoppingPattern.runs) &&
        Objects.equals(this.directions, v3StoppingPattern.directions) &&
        Objects.equals(this.status, v3StoppingPattern.status);
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
