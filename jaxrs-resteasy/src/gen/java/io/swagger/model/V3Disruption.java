package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionRoute;
import io.swagger.model.V3DisruptionStop;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3Disruption   {
  private Long disruptionId = null;  private String title = null;  private String url = null;  private String description = null;  private String disruptionStatus = null;  private String disruptionType = null;  private Date publishedOn = null;  private Date lastUpdated = null;  private Date fromDate = null;  private Date toDate = null;  private List<V3DisruptionRoute> routes = new ArrayList<V3DisruptionRoute>();  private List<V3DisruptionStop> stops = new ArrayList<V3DisruptionStop>();  private String colour = null;  private Boolean displayOnBoard = null;  private Boolean displayStatus = null;

  /**
   * Disruption information identifier
   **/
  
  @Schema(description = "Disruption information identifier")
  @JsonProperty("disruption_id")
  public Long getDisruptionId() {
    return disruptionId;
  }
  public void setDisruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
  }

  /**
   * Headline title summarising disruption information
   **/
  
  @Schema(description = "Headline title summarising disruption information")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * URL of relevant article on PTV website
   **/
  
  @Schema(description = "URL of relevant article on PTV website")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Description of the disruption
   **/
  
  @Schema(description = "Description of the disruption")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)
   **/
  
  @Schema(description = "Status of the disruption (e.g. \"Planned\", \"Current\")")
  @JsonProperty("disruption_status")
  public String getDisruptionStatus() {
    return disruptionStatus;
  }
  public void setDisruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
  }

  /**
   * Type of disruption
   **/
  
  @Schema(description = "Type of disruption")
  @JsonProperty("disruption_type")
  public String getDisruptionType() {
    return disruptionType;
  }
  public void setDisruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
  }

  /**
   * Date and time disruption information is published on PTV website, in ISO 8601 UTC format
   **/
  
  @Schema(description = "Date and time disruption information is published on PTV website, in ISO 8601 UTC format")
  @JsonProperty("published_on")
  public Date getPublishedOn() {
    return publishedOn;
  }
  public void setPublishedOn(Date publishedOn) {
    this.publishedOn = publishedOn;
  }

  /**
   * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
   **/
  
  @Schema(description = "Date and time disruption information was last updated by PTV, in ISO 8601 UTC format")
  @JsonProperty("last_updated")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Date and time at which disruption begins, in ISO 8601 UTC format
   **/
  
  @Schema(description = "Date and time at which disruption begins, in ISO 8601 UTC format")
  @JsonProperty("from_date")
  public Date getFromDate() {
    return fromDate;
  }
  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
   **/
  
  @Schema(description = "Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)")
  @JsonProperty("to_date")
  public Date getToDate() {
    return toDate;
  }
  public void setToDate(Date toDate) {
    this.toDate = toDate;
  }

  /**
   * Route relevant to a disruption (if applicable)
   **/
  
  @Schema(description = "Route relevant to a disruption (if applicable)")
  @JsonProperty("routes")
  public List<V3DisruptionRoute> getRoutes() {
    return routes;
  }
  public void setRoutes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
  }

  /**
   * Stop relevant to a disruption (if applicable)
   **/
  
  @Schema(description = "Stop relevant to a disruption (if applicable)")
  @JsonProperty("stops")
  public List<V3DisruptionStop> getStops() {
    return stops;
  }
  public void setStops(List<V3DisruptionStop> stops) {
    this.stops = stops;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("colour")
  public String getColour() {
    return colour;
  }
  public void setColour(String colour) {
    this.colour = colour;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("display_on_board")
  public Boolean isDisplayOnBoard() {
    return displayOnBoard;
  }
  public void setDisplayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("display_status")
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
    return Objects.equals(disruptionId, v3Disruption.disruptionId) &&
        Objects.equals(title, v3Disruption.title) &&
        Objects.equals(url, v3Disruption.url) &&
        Objects.equals(description, v3Disruption.description) &&
        Objects.equals(disruptionStatus, v3Disruption.disruptionStatus) &&
        Objects.equals(disruptionType, v3Disruption.disruptionType) &&
        Objects.equals(publishedOn, v3Disruption.publishedOn) &&
        Objects.equals(lastUpdated, v3Disruption.lastUpdated) &&
        Objects.equals(fromDate, v3Disruption.fromDate) &&
        Objects.equals(toDate, v3Disruption.toDate) &&
        Objects.equals(routes, v3Disruption.routes) &&
        Objects.equals(stops, v3Disruption.stops) &&
        Objects.equals(colour, v3Disruption.colour) &&
        Objects.equals(displayOnBoard, v3Disruption.displayOnBoard) &&
        Objects.equals(displayStatus, v3Disruption.displayStatus);
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
