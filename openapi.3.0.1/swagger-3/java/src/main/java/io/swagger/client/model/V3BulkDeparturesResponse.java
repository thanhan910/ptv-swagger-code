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
import io.swagger.client.model.V3BulkDeparturesStopResponse;
import io.swagger.client.model.V3BulkDeparturesUpdateResponse;
import io.swagger.client.model.V3Direction;
import io.swagger.client.model.V3Disruption;
import io.swagger.client.model.V3Run;
import io.swagger.client.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * V3BulkDeparturesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T22:16:54.146562100+10:00[Australia/Sydney]")

public class V3BulkDeparturesResponse {
  @SerializedName("responses")
  private List<V3BulkDeparturesUpdateResponse> responses = null;

  @SerializedName("stops")
  private Map<String, V3BulkDeparturesStopResponse> stops = null;

  @SerializedName("routes")
  private List<Object> routes = null;

  @SerializedName("runs")
  private List<V3Run> runs = null;

  @SerializedName("directions")
  private List<V3Direction> directions = null;

  @SerializedName("disruptions")
  private Map<String, V3Disruption> disruptions = null;

  @SerializedName("status")
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
  @Schema(description = "Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid.")
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
  @Schema(description = "A train station, tram stop, bus stop, regional coach stop or Night Bus stop")
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
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
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
  @Schema(description = "Individual trips/services of a route")
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
  @Schema(description = "Directions of travel of route")
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
  @Schema(description = "Disruption information applicable to relevant routes or stops")
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
  @Schema(description = "")
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
