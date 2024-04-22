/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V3Direction;
import io.swagger.client.model.V3Disruption;
import io.swagger.client.model.V3PatternDeparture;
import io.swagger.client.model.V3Run;
import io.swagger.client.model.V3Status;
import io.swagger.client.model.V3StoppingPatternStop;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V3StoppingPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:22:49.642+10:00")
public class V3StoppingPattern {
  @SerializedName("disruptions")
  private List<V3Disruption> disruptions = null;

  @SerializedName("departures")
  private List<V3PatternDeparture> departures = null;

  @SerializedName("stops")
  private Map<String, V3StoppingPatternStop> stops = null;

  @SerializedName("routes")
  private Map<String, Object> routes = null;

  @SerializedName("runs")
  private Map<String, V3Run> runs = null;

  @SerializedName("directions")
  private Map<String, V3Direction> directions = null;

  @SerializedName("status")
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
  @ApiModelProperty(value = "Disruption information applicable to relevant routes or stops")
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
  @ApiModelProperty(value = "Timetabled and real-time service departures")
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
  @ApiModelProperty(value = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
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
  @ApiModelProperty(value = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
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
  @ApiModelProperty(value = "Individual trips/services of a route")
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
  @ApiModelProperty(value = "Directions of travel of route")
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
   * API Status / Metadata
   * @return status
  **/
  @ApiModelProperty(value = "API Status / Metadata")
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

