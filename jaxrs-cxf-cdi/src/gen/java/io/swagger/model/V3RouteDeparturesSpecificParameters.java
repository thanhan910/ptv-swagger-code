package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3RouteDeparturesSpecificParameters   {
  private Boolean trainScheduledTimetables = null;
  private Boolean scheduledTimetables = null;
  private java.util.Date dateUtc = null;
  private Integer maxResults = null;
  private Boolean includeCancelled = null;
  private Boolean lookBackwards = null;
@XmlType(name="ExpandEnum")
@XmlEnum(String.class)
public enum ExpandEnum {

    @XmlEnumValue("All") ALL(String.valueOf("All")), @XmlEnumValue("Stop") STOP(String.valueOf("Stop")), @XmlEnumValue("Route") ROUTE(String.valueOf("Route")), @XmlEnumValue("Run") RUN(String.valueOf("Run")), @XmlEnumValue("Direction") DIRECTION(String.valueOf("Direction")), @XmlEnumValue("Disruption") DISRUPTION(String.valueOf("Disruption")), @XmlEnumValue("VehicleDescriptor") VEHICLEDESCRIPTOR(String.valueOf("VehicleDescriptor")), @XmlEnumValue("VehiclePosition") VEHICLEPOSITION(String.valueOf("VehiclePosition")), @XmlEnumValue("None") NONE(String.valueOf("None"));


    private String value;

    ExpandEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String v) {
        for (ExpandEnum b : ExpandEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private List<ExpandEnum> expand = new ArrayList<ExpandEnum>();
  private Boolean includeGeopath = null;

  /**
   * DEPRECATED - use &#x60;scheduled_timetables&#x60; instead
   **/
  public V3RouteDeparturesSpecificParameters trainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
    return this;
  }

  
  
  @Schema(description = "DEPRECATED - use `scheduled_timetables` instead")
  @JsonProperty("train_scheduled_timetables")
  public Boolean isTrainScheduledTimetables() {
    return trainScheduledTimetables;
  }
  public void setTrainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
  }

  /**
   * When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
   **/
  public V3RouteDeparturesSpecificParameters scheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
    return this;
  }

  
  
  @Schema(description = "When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.")
  @JsonProperty("scheduled_timetables")
  public Boolean isScheduledTimetables() {
    return scheduledTimetables;
  }
  public void setScheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
   **/
  public V3RouteDeparturesSpecificParameters dateUtc(java.util.Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  
  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
  @JsonProperty("date_utc")
  @Valid
  public java.util.Date getDateUtc() {
    return dateUtc;
  }
  public void setDateUtc(java.util.Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * Maximum number of results returned
   **/
  public V3RouteDeparturesSpecificParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  
  
  @Schema(description = "Maximum number of results returned")
  @JsonProperty("max_results")
  public Integer getMaxResults() {
    return maxResults;
  }
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  /**
   * Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
   **/
  public V3RouteDeparturesSpecificParameters includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

  
  
  @Schema(description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only")
  @JsonProperty("include_cancelled")
  public Boolean isIncludeCancelled() {
    return includeCancelled;
  }
  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }

  /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
   **/
  public V3RouteDeparturesSpecificParameters lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

  
  
  @Schema(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.")
  @JsonProperty("look_backwards")
  public Boolean isLookBackwards() {
    return lookBackwards;
  }
  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }

  /**
   * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
   **/
  public V3RouteDeparturesSpecificParameters expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  
  
  @Schema(description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")
  @JsonProperty("expand")
  public List<ExpandEnum> getExpand() {
    return expand;
  }
  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }

  /**
   * Indicates if the route geopath should be returned
   **/
  public V3RouteDeparturesSpecificParameters includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

  
  
  @Schema(description = "Indicates if the route geopath should be returned")
  @JsonProperty("include_geopath")
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
    return Objects.equals(trainScheduledTimetables, v3RouteDeparturesSpecificParameters.trainScheduledTimetables) &&
        Objects.equals(scheduledTimetables, v3RouteDeparturesSpecificParameters.scheduledTimetables) &&
        Objects.equals(dateUtc, v3RouteDeparturesSpecificParameters.dateUtc) &&
        Objects.equals(maxResults, v3RouteDeparturesSpecificParameters.maxResults) &&
        Objects.equals(includeCancelled, v3RouteDeparturesSpecificParameters.includeCancelled) &&
        Objects.equals(lookBackwards, v3RouteDeparturesSpecificParameters.lookBackwards) &&
        Objects.equals(expand, v3RouteDeparturesSpecificParameters.expand) &&
        Objects.equals(includeGeopath, v3RouteDeparturesSpecificParameters.includeGeopath);
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
