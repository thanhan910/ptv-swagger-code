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
import io.swagger.client.model.V3DisruptionRoute;
import io.swagger.client.model.V3DisruptionStop;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * V3Disruption
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T22:15:44.342351900+10:00[Australia/Sydney]")

public class V3Disruption {
  @SerializedName("disruption_id")
  private Long disruptionId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disruption_status")
  private String disruptionStatus = null;

  @SerializedName("disruption_type")
  private String disruptionType = null;

  @SerializedName("published_on")
  private OffsetDateTime publishedOn = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("from_date")
  private OffsetDateTime fromDate = null;

  @SerializedName("to_date")
  private OffsetDateTime toDate = null;

  @SerializedName("routes")
  private List<V3DisruptionRoute> routes = null;

  @SerializedName("stops")
  private List<V3DisruptionStop> stops = null;

  @SerializedName("colour")
  private String colour = null;

  @SerializedName("display_on_board")
  private Boolean displayOnBoard = null;

  @SerializedName("display_status")
  private Boolean displayStatus = null;

  public V3Disruption disruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
    return this;
  }

   /**
   * Disruption information identifier
   * @return disruptionId
  **/
  @Schema(description = "Disruption information identifier")
  public Long getDisruptionId() {
    return disruptionId;
  }

  public void setDisruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
  }

  public V3Disruption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Headline title summarising disruption information
   * @return title
  **/
  @Schema(description = "Headline title summarising disruption information")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public V3Disruption url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of relevant article on PTV website
   * @return url
  **/
  @Schema(description = "URL of relevant article on PTV website")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V3Disruption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the disruption
   * @return description
  **/
  @Schema(description = "Description of the disruption")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V3Disruption disruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
    return this;
  }

   /**
   * Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)
   * @return disruptionStatus
  **/
  @Schema(description = "Status of the disruption (e.g. \"Planned\", \"Current\")")
  public String getDisruptionStatus() {
    return disruptionStatus;
  }

  public void setDisruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
  }

  public V3Disruption disruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
    return this;
  }

   /**
   * Type of disruption
   * @return disruptionType
  **/
  @Schema(description = "Type of disruption")
  public String getDisruptionType() {
    return disruptionType;
  }

  public void setDisruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
  }

  public V3Disruption publishedOn(OffsetDateTime publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

   /**
   * Date and time disruption information is published on PTV website, in ISO 8601 UTC format
   * @return publishedOn
  **/
  @Schema(description = "Date and time disruption information is published on PTV website, in ISO 8601 UTC format")
  public OffsetDateTime getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(OffsetDateTime publishedOn) {
    this.publishedOn = publishedOn;
  }

  public V3Disruption lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
   * @return lastUpdated
  **/
  @Schema(description = "Date and time disruption information was last updated by PTV, in ISO 8601 UTC format")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public V3Disruption fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Date and time at which disruption begins, in ISO 8601 UTC format
   * @return fromDate
  **/
  @Schema(description = "Date and time at which disruption begins, in ISO 8601 UTC format")
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }

  public V3Disruption toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
   * @return toDate
  **/
  @Schema(description = "Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)")
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }

  public V3Disruption routes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3Disruption addRoutesItem(V3DisruptionRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<V3DisruptionRoute>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Route relevant to a disruption (if applicable)
   * @return routes
  **/
  @Schema(description = "Route relevant to a disruption (if applicable)")
  public List<V3DisruptionRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
  }

  public V3Disruption stops(List<V3DisruptionStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3Disruption addStopsItem(V3DisruptionStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<V3DisruptionStop>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * Stop relevant to a disruption (if applicable)
   * @return stops
  **/
  @Schema(description = "Stop relevant to a disruption (if applicable)")
  public List<V3DisruptionStop> getStops() {
    return stops;
  }

  public void setStops(List<V3DisruptionStop> stops) {
    this.stops = stops;
  }

  public V3Disruption colour(String colour) {
    this.colour = colour;
    return this;
  }

   /**
   * Get colour
   * @return colour
  **/
  @Schema(description = "")
  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public V3Disruption displayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
    return this;
  }

   /**
   * Get displayOnBoard
   * @return displayOnBoard
  **/
  @Schema(description = "")
  public Boolean isDisplayOnBoard() {
    return displayOnBoard;
  }

  public void setDisplayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
  }

  public V3Disruption displayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
    return this;
  }

   /**
   * Get displayStatus
   * @return displayStatus
  **/
  @Schema(description = "")
  public Boolean isDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Disruption v3Disruption = (V3Disruption) o;
    return Objects.equals(this.disruptionId, v3Disruption.disruptionId) &&
        Objects.equals(this.title, v3Disruption.title) &&
        Objects.equals(this.url, v3Disruption.url) &&
        Objects.equals(this.description, v3Disruption.description) &&
        Objects.equals(this.disruptionStatus, v3Disruption.disruptionStatus) &&
        Objects.equals(this.disruptionType, v3Disruption.disruptionType) &&
        Objects.equals(this.publishedOn, v3Disruption.publishedOn) &&
        Objects.equals(this.lastUpdated, v3Disruption.lastUpdated) &&
        Objects.equals(this.fromDate, v3Disruption.fromDate) &&
        Objects.equals(this.toDate, v3Disruption.toDate) &&
        Objects.equals(this.routes, v3Disruption.routes) &&
        Objects.equals(this.stops, v3Disruption.stops) &&
        Objects.equals(this.colour, v3Disruption.colour) &&
        Objects.equals(this.displayOnBoard, v3Disruption.displayOnBoard) &&
        Objects.equals(this.displayStatus, v3Disruption.displayStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionId, title, url, description, disruptionStatus, disruptionType, publishedOn, lastUpdated, fromDate, toDate, routes, stops, colour, displayOnBoard, displayStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Disruption {\n");
    
    sb.append("    disruptionId: ").append(toIndentedString(disruptionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disruptionStatus: ").append(toIndentedString(disruptionStatus)).append("\n");
    sb.append("    disruptionType: ").append(toIndentedString(disruptionType)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    displayOnBoard: ").append(toIndentedString(displayOnBoard)).append("\n");
    sb.append("    displayStatus: ").append(toIndentedString(displayStatus)).append("\n");
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
