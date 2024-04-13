package io.swagger.model;

import io.swagger.model.V3Departure;
import io.swagger.model.V3Direction;
import io.swagger.model.V3Disruption;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopModel;
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

public class V3DeparturesResponse   {
  
  @Schema(description = "Timetabled and real-time service departures")
 /**
   * Timetabled and real-time service departures  
  **/
  private List<V3Departure> departures = null;
  
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
 /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop  
  **/
  private Map<String, V3StopModel> stops = null;
  
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes  
  **/
  private Map<String, Object> routes = null;
  
  @Schema(description = "Individual trips/services of a route")
 /**
   * Individual trips/services of a route  
  **/
  private Map<String, V3Run> runs = null;
  
  @Schema(description = "Directions of travel of route")
 /**
   * Directions of travel of route  
  **/
  private Map<String, V3Direction> directions = null;
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
 /**
   * Disruption information applicable to relevant routes or stops  
  **/
  private Map<String, V3Disruption> disruptions = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Timetabled and real-time service departures
   * @return departures
  **/
  @JsonProperty("departures")
  public List<V3Departure> getDepartures() {
    return departures;
  }

  public void setDepartures(List<V3Departure> departures) {
    this.departures = departures;
  }

  public V3DeparturesResponse departures(List<V3Departure> departures) {
    this.departures = departures;
    return this;
  }

  public V3DeparturesResponse addDeparturesItem(V3Departure departuresItem) {
    this.departures.add(departuresItem);
    return this;
  }

 /**
   * A train station, tram stop, bus stop, regional coach stop or Night Bus stop
   * @return stops
  **/
  @JsonProperty("stops")
  public Map<String, V3StopModel> getStops() {
    return stops;
  }

  public void setStops(Map<String, V3StopModel> stops) {
    this.stops = stops;
  }

  public V3DeparturesResponse stops(Map<String, V3StopModel> stops) {
    this.stops = stops;
    return this;
  }

  public V3DeparturesResponse putStopsItem(String key, V3StopModel stopsItem) {
    this.stops.put(key, stopsItem);
    return this;
  }

 /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
  **/
  @JsonProperty("routes")
  public Map<String, Object> getRoutes() {
    return routes;
  }

  public void setRoutes(Map<String, Object> routes) {
    this.routes = routes;
  }

  public V3DeparturesResponse routes(Map<String, Object> routes) {
    this.routes = routes;
    return this;
  }

  public V3DeparturesResponse putRoutesItem(String key, Object routesItem) {
    this.routes.put(key, routesItem);
    return this;
  }

 /**
   * Individual trips/services of a route
   * @return runs
  **/
  @JsonProperty("runs")
  public Map<String, V3Run> getRuns() {
    return runs;
  }

  public void setRuns(Map<String, V3Run> runs) {
    this.runs = runs;
  }

  public V3DeparturesResponse runs(Map<String, V3Run> runs) {
    this.runs = runs;
    return this;
  }

  public V3DeparturesResponse putRunsItem(String key, V3Run runsItem) {
    this.runs.put(key, runsItem);
    return this;
  }

 /**
   * Directions of travel of route
   * @return directions
  **/
  @JsonProperty("directions")
  public Map<String, V3Direction> getDirections() {
    return directions;
  }

  public void setDirections(Map<String, V3Direction> directions) {
    this.directions = directions;
  }

  public V3DeparturesResponse directions(Map<String, V3Direction> directions) {
    this.directions = directions;
    return this;
  }

  public V3DeparturesResponse putDirectionsItem(String key, V3Direction directionsItem) {
    this.directions.put(key, directionsItem);
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

  public V3DeparturesResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3DeparturesResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
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

  public V3DeparturesResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
