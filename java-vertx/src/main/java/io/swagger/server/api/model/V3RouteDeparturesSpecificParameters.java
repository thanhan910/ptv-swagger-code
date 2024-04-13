package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3RouteDeparturesSpecificParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3RouteDeparturesSpecificParameters   {
  private Boolean trainScheduledTimetables = null;

  private Boolean scheduledTimetables = null;

  private OffsetDateTime dateUtc = null;

  private Integer maxResults = null;

  private Boolean includeCancelled = null;

  private Boolean lookBackwards = null;

  /**
   * Gets or Sets expand
   */
  public enum ExpandEnum {
    ALL("All"),
    STOP("Stop"),
    ROUTE("Route"),
    RUN("Run"),
    DIRECTION("Direction"),
    DISRUPTION("Disruption"),
    VEHICLEDESCRIPTOR("VehicleDescriptor"),
    VEHICLEPOSITION("VehiclePosition"),
    NONE("None");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String value) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  
  private List<ExpandEnum> expand = null;

  private Boolean includeGeopath = null;

  public V3RouteDeparturesSpecificParameters trainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
    return this;
  }

  /**
   * DEPRECATED - use `scheduled_timetables` instead
   * @return trainScheduledTimetables
   **/
    public Boolean isTrainScheduledTimetables() {
    return trainScheduledTimetables;
  }

  public void setTrainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
  }

  public V3RouteDeparturesSpecificParameters scheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
    return this;
  }

  /**
   * When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
   * @return scheduledTimetables
   **/
    public Boolean isScheduledTimetables() {
    return scheduledTimetables;
  }

  public void setScheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
  }

  public V3RouteDeparturesSpecificParameters dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
   * @return dateUtc
   **/
    public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }

  public V3RouteDeparturesSpecificParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * Maximum number of results returned
   * @return maxResults
   **/
    public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public V3RouteDeparturesSpecificParameters includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

  /**
   * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
   * @return includeCancelled
   **/
    public Boolean isIncludeCancelled() {
    return includeCancelled;
  }

  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }

  public V3RouteDeparturesSpecificParameters lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

  /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
   * @return lookBackwards
   **/
    public Boolean isLookBackwards() {
    return lookBackwards;
  }

  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }

  public V3RouteDeparturesSpecificParameters expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3RouteDeparturesSpecificParameters addExpandItem(ExpandEnum expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<ExpandEnum>();
    }
    this.expand.add(expandItem);
    return this;
  }

  /**
   * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
   * @return expand
   **/
    public List<ExpandEnum> getExpand() {
    return expand;
  }

  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }

  public V3RouteDeparturesSpecificParameters includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

  /**
   * Indicates if the route geopath should be returned
   * @return includeGeopath
   **/
    public Boolean isIncludeGeopath() {
    return includeGeopath;
  }

  public void setIncludeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteDeparturesSpecificParameters v3RouteDeparturesSpecificParameters = (V3RouteDeparturesSpecificParameters) o;
    return Objects.equals(this.trainScheduledTimetables, v3RouteDeparturesSpecificParameters.trainScheduledTimetables) &&
        Objects.equals(this.scheduledTimetables, v3RouteDeparturesSpecificParameters.scheduledTimetables) &&
        Objects.equals(this.dateUtc, v3RouteDeparturesSpecificParameters.dateUtc) &&
        Objects.equals(this.maxResults, v3RouteDeparturesSpecificParameters.maxResults) &&
        Objects.equals(this.includeCancelled, v3RouteDeparturesSpecificParameters.includeCancelled) &&
        Objects.equals(this.lookBackwards, v3RouteDeparturesSpecificParameters.lookBackwards) &&
        Objects.equals(this.expand, v3RouteDeparturesSpecificParameters.expand) &&
        Objects.equals(this.includeGeopath, v3RouteDeparturesSpecificParameters.includeGeopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainScheduledTimetables, scheduledTimetables, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteDeparturesSpecificParameters {\n");
    
    sb.append("    trainScheduledTimetables: ").append(toIndentedString(trainScheduledTimetables)).append("\n");
    sb.append("    scheduledTimetables: ").append(toIndentedString(scheduledTimetables)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    includeCancelled: ").append(toIndentedString(includeCancelled)).append("\n");
    sb.append("    lookBackwards: ").append(toIndentedString(lookBackwards)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    includeGeopath: ").append(toIndentedString(includeGeopath)).append("\n");
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
