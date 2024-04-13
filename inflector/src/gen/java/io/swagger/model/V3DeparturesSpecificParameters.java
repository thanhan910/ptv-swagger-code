package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3DeparturesSpecificParameters   {
  @JsonProperty("direction_id")
  private Integer directionId = null;
  @JsonProperty("gtfs")
  private Boolean gtfs = null;
  @JsonProperty("date_utc")
  private Date dateUtc = null;
  @JsonProperty("max_results")
  private Integer maxResults = null;
  @JsonProperty("include_cancelled")
  private Boolean includeCancelled = null;
  @JsonProperty("look_backwards")
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

    @Override
    @JsonValue
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
  @JsonProperty("expand")
  private List<ExpandEnum> expand = null;
  @JsonProperty("include_geopath")
  private Boolean includeGeopath = null;
  /**
   * Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
   **/
  public V3DeparturesSpecificParameters directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
  @Schema(description = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}")
  @JsonProperty("direction_id")
  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Indicates that stop_id parameter will accept \"GTFS stop_id\" data
   **/
  public V3DeparturesSpecificParameters gtfs(Boolean gtfs) {
    this.gtfs = gtfs;
    return this;
  }

  
  @Schema(description = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data")
  @JsonProperty("gtfs")
  public Boolean isGtfs() {
    return gtfs;
  }
  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
   **/
  public V3DeparturesSpecificParameters dateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
  @JsonProperty("date_utc")
  public Date getDateUtc() {
    return dateUtc;
  }
  public void setDateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * Maximum number of results returned
   **/
  public V3DeparturesSpecificParameters maxResults(Integer maxResults) {
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
   * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
   **/
  public V3DeparturesSpecificParameters includeCancelled(Boolean includeCancelled) {
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
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
   **/
  public V3DeparturesSpecificParameters lookBackwards(Boolean lookBackwards) {
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
  public V3DeparturesSpecificParameters expand(List<ExpandEnum> expand) {
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
  public V3DeparturesSpecificParameters includeGeopath(Boolean includeGeopath) {
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
    V3DeparturesSpecificParameters v3DeparturesSpecificParameters = (V3DeparturesSpecificParameters) o;
    return Objects.equals(directionId, v3DeparturesSpecificParameters.directionId) &&
        Objects.equals(gtfs, v3DeparturesSpecificParameters.gtfs) &&
        Objects.equals(dateUtc, v3DeparturesSpecificParameters.dateUtc) &&
        Objects.equals(maxResults, v3DeparturesSpecificParameters.maxResults) &&
        Objects.equals(includeCancelled, v3DeparturesSpecificParameters.includeCancelled) &&
        Objects.equals(lookBackwards, v3DeparturesSpecificParameters.lookBackwards) &&
        Objects.equals(expand, v3DeparturesSpecificParameters.expand) &&
        Objects.equals(includeGeopath, v3DeparturesSpecificParameters.includeGeopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DeparturesSpecificParameters {\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    gtfs: ").append(toIndentedString(gtfs)).append("\n");
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
