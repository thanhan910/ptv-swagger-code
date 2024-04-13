package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionRoute;
import io.swagger.model.V3DisruptionStop;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3Disruption
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3Disruption   {
  @JsonProperty("disruption_id")
  private Long disruptionId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("disruption_status")
  private String disruptionStatus = null;

  @JsonProperty("disruption_type")
  private String disruptionType = null;

  @JsonProperty("published_on")
  private OffsetDateTime publishedOn = null;

  @JsonProperty("last_updated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("from_date")
  private OffsetDateTime fromDate = null;

  @JsonProperty("to_date")
  private OffsetDateTime toDate = null;

  @JsonProperty("routes")
  @Valid
  private List<V3DisruptionRoute> routes = null;

  @JsonProperty("stops")
  @Valid
  private List<V3DisruptionStop> stops = null;

  @JsonProperty("colour")
  private String colour = null;

  @JsonProperty("display_on_board")
  private Boolean displayOnBoard = null;

  @JsonProperty("display_status")
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
   * Status of the disruption (e.g. \"Planned\", \"Current\")
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

  @Valid
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

  @Valid
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

  @Valid
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

  @Valid
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
  @Valid
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
  @Valid
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
