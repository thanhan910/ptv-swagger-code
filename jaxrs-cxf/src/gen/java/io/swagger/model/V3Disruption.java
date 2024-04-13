package io.swagger.model;

import io.swagger.model.V3DisruptionRoute;
import io.swagger.model.V3DisruptionStop;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;

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

public class V3Disruption   {
  
  @Schema(description = "Disruption information identifier")
 /**
   * Disruption information identifier  
  **/
  private Long disruptionId = null;
  
  @Schema(description = "Headline title summarising disruption information")
 /**
   * Headline title summarising disruption information  
  **/
  private String title = null;
  
  @Schema(description = "URL of relevant article on PTV website")
 /**
   * URL of relevant article on PTV website  
  **/
  private String url = null;
  
  @Schema(description = "Description of the disruption")
 /**
   * Description of the disruption  
  **/
  private String description = null;
  
  @Schema(description = "Status of the disruption (e.g. \"Planned\", \"Current\")")
 /**
   * Status of the disruption (e.g. \"Planned\", \"Current\")  
  **/
  private String disruptionStatus = null;
  
  @Schema(description = "Type of disruption")
 /**
   * Type of disruption  
  **/
  private String disruptionType = null;
  
  @Schema(description = "Date and time disruption information is published on PTV website, in ISO 8601 UTC format")
 /**
   * Date and time disruption information is published on PTV website, in ISO 8601 UTC format  
  **/
  private Date publishedOn = null;
  
  @Schema(description = "Date and time disruption information was last updated by PTV, in ISO 8601 UTC format")
 /**
   * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format  
  **/
  private Date lastUpdated = null;
  
  @Schema(description = "Date and time at which disruption begins, in ISO 8601 UTC format")
 /**
   * Date and time at which disruption begins, in ISO 8601 UTC format  
  **/
  private Date fromDate = null;
  
  @Schema(description = "Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)")
 /**
   * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)  
  **/
  private Date toDate = null;
  
  @Schema(description = "Route relevant to a disruption (if applicable)")
 /**
   * Route relevant to a disruption (if applicable)  
  **/
  private List<V3DisruptionRoute> routes = null;
  
  @Schema(description = "Stop relevant to a disruption (if applicable)")
 /**
   * Stop relevant to a disruption (if applicable)  
  **/
  private List<V3DisruptionStop> stops = null;
  
  @Schema(description = "")
  private String colour = null;
  
  @Schema(description = "")
  private Boolean displayOnBoard = null;
  
  @Schema(description = "")
  private Boolean displayStatus = null;
 /**
   * Disruption information identifier
   * @return disruptionId
  **/
  @JsonProperty("disruption_id")
  public Long getDisruptionId() {
    return disruptionId;
  }

  public void setDisruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
  }

  public V3Disruption disruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
    return this;
  }

 /**
   * Headline title summarising disruption information
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public V3Disruption title(String title) {
    this.title = title;
    return this;
  }

 /**
   * URL of relevant article on PTV website
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V3Disruption url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Description of the disruption
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V3Disruption description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)
   * @return disruptionStatus
  **/
  @JsonProperty("disruption_status")
  public String getDisruptionStatus() {
    return disruptionStatus;
  }

  public void setDisruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
  }

  public V3Disruption disruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
    return this;
  }

 /**
   * Type of disruption
   * @return disruptionType
  **/
  @JsonProperty("disruption_type")
  public String getDisruptionType() {
    return disruptionType;
  }

  public void setDisruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
  }

  public V3Disruption disruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
    return this;
  }

 /**
   * Date and time disruption information is published on PTV website, in ISO 8601 UTC format
   * @return publishedOn
  **/
  @JsonProperty("published_on")
  public Date getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(Date publishedOn) {
    this.publishedOn = publishedOn;
  }

  public V3Disruption publishedOn(Date publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

 /**
   * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
   * @return lastUpdated
  **/
  @JsonProperty("last_updated")
  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public V3Disruption lastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

 /**
   * Date and time at which disruption begins, in ISO 8601 UTC format
   * @return fromDate
  **/
  @JsonProperty("from_date")
  public Date getFromDate() {
    return fromDate;
  }

  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }

  public V3Disruption fromDate(Date fromDate) {
    this.fromDate = fromDate;
    return this;
  }

 /**
   * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
   * @return toDate
  **/
  @JsonProperty("to_date")
  public Date getToDate() {
    return toDate;
  }

  public void setToDate(Date toDate) {
    this.toDate = toDate;
  }

  public V3Disruption toDate(Date toDate) {
    this.toDate = toDate;
    return this;
  }

 /**
   * Route relevant to a disruption (if applicable)
   * @return routes
  **/
  @JsonProperty("routes")
  public List<V3DisruptionRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
  }

  public V3Disruption routes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3Disruption addRoutesItem(V3DisruptionRoute routesItem) {
    this.routes.add(routesItem);
    return this;
  }

 /**
   * Stop relevant to a disruption (if applicable)
   * @return stops
  **/
  @JsonProperty("stops")
  public List<V3DisruptionStop> getStops() {
    return stops;
  }

  public void setStops(List<V3DisruptionStop> stops) {
    this.stops = stops;
  }

  public V3Disruption stops(List<V3DisruptionStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3Disruption addStopsItem(V3DisruptionStop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Get colour
   * @return colour
  **/
  @JsonProperty("colour")
  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public V3Disruption colour(String colour) {
    this.colour = colour;
    return this;
  }

 /**
   * Get displayOnBoard
   * @return displayOnBoard
  **/
  @JsonProperty("display_on_board")
  public Boolean isDisplayOnBoard() {
    return displayOnBoard;
  }

  public void setDisplayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
  }

  public V3Disruption displayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
    return this;
  }

 /**
   * Get displayStatus
   * @return displayStatus
  **/
  @JsonProperty("display_status")
  public Boolean isDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
  }

  public V3Disruption displayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
