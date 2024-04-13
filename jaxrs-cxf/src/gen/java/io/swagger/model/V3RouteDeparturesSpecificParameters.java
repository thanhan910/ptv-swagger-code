package io.swagger.model;

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

public class V3RouteDeparturesSpecificParameters   {
  
  @Schema(description = "DEPRECATED - use `scheduled_timetables` instead")
 /**
   * DEPRECATED - use `scheduled_timetables` instead  
  **/
  private Boolean trainScheduledTimetables = null;
  
  @Schema(description = "When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.")
 /**
   * When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.  
  **/
  private Boolean scheduledTimetables = null;
  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
 /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  
  **/
  private Date dateUtc = null;
  
  @Schema(description = "Maximum number of results returned")
 /**
   * Maximum number of results returned  
  **/
  private Integer maxResults = null;
  
  @Schema(description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only")
 /**
   * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only  
  **/
  private Boolean includeCancelled = null;
  
  @Schema(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.")
 /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.  
  **/
  private Boolean lookBackwards = null;
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
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ExpandEnum fromValue(String text) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }  
  @Schema(description = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")
 /**
   * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.  
  **/
  private List<ExpandEnum> expand = null;
  
  @Schema(description = "Indicates if the route geopath should be returned")
 /**
   * Indicates if the route geopath should be returned  
  **/
  private Boolean includeGeopath = null;
 /**
   * DEPRECATED - use &#x60;scheduled_timetables&#x60; instead
   * @return trainScheduledTimetables
  **/
  @JsonProperty("train_scheduled_timetables")
  public Boolean isTrainScheduledTimetables() {
    return trainScheduledTimetables;
  }

  public void setTrainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
  }

  public V3RouteDeparturesSpecificParameters trainScheduledTimetables(Boolean trainScheduledTimetables) {
    this.trainScheduledTimetables = trainScheduledTimetables;
    return this;
  }

 /**
   * When set to true, all timetable information returned by Chronos will be sourced from the scheduled timetables,  while when set to false (default state), the operational timetables will be used where available.
   * @return scheduledTimetables
  **/
  @JsonProperty("scheduled_timetables")
  public Boolean isScheduledTimetables() {
    return scheduledTimetables;
  }

  public void setScheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
  }

  public V3RouteDeparturesSpecificParameters scheduledTimetables(Boolean scheduledTimetables) {
    this.scheduledTimetables = scheduledTimetables;
    return this;
  }

 /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
   * @return dateUtc
  **/
  @JsonProperty("date_utc")
  public Date getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  public V3RouteDeparturesSpecificParameters dateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

 /**
   * Maximum number of results returned
   * @return maxResults
  **/
  @JsonProperty("max_results")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public V3RouteDeparturesSpecificParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

 /**
   * Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
   * @return includeCancelled
  **/
  @JsonProperty("include_cancelled")
  public Boolean isIncludeCancelled() {
    return includeCancelled;
  }

  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }

  public V3RouteDeparturesSpecificParameters includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

 /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
   * @return lookBackwards
  **/
  @JsonProperty("look_backwards")
  public Boolean isLookBackwards() {
    return lookBackwards;
  }

  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }

  public V3RouteDeparturesSpecificParameters lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

 /**
   * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
   * @return expand
  **/
  @JsonProperty("expand")
  public List<ExpandEnum> getExpand() {
    return expand;
  }

  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }

  public V3RouteDeparturesSpecificParameters expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3RouteDeparturesSpecificParameters addExpandItem(ExpandEnum expandItem) {
    this.expand.add(expandItem);
    return this;
  }

 /**
   * Indicates if the route geopath should be returned
   * @return includeGeopath
  **/
  @JsonProperty("include_geopath")
  public Boolean isIncludeGeopath() {
    return includeGeopath;
  }

  public void setIncludeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
  }

  public V3RouteDeparturesSpecificParameters includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
