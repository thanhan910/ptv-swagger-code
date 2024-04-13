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
 * V3DeparturesBroadParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3DeparturesBroadParameters   {
  
  private List<Integer> platformNumbers = null;

  private Integer directionId = null;

  private Boolean gtfs = null;

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

  public V3DeparturesBroadParameters platformNumbers(List<Integer> platformNumbers) {
    this.platformNumbers = platformNumbers;
    return this;
  }

  public V3DeparturesBroadParameters addPlatformNumbersItem(Integer platformNumbersItem) {
    if (this.platformNumbers == null) {
      this.platformNumbers = new ArrayList<Integer>();
    }
    this.platformNumbers.add(platformNumbersItem);
    return this;
  }

  /**
   * Filter by platform number at stop
   * @return platformNumbers
   **/
    public List<Integer> getPlatformNumbers() {
    return platformNumbers;
  }

  public void setPlatformNumbers(List<Integer> platformNumbers) {
    this.platformNumbers = platformNumbers;
  }

  public V3DeparturesBroadParameters directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  /**
   * Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
   * @return directionId
   **/
    public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3DeparturesBroadParameters gtfs(Boolean gtfs) {
    this.gtfs = gtfs;
    return this;
  }

  /**
   * Indicates that stop_id parameter will accept \"GTFS stop_id\" data
   * @return gtfs
   **/
    public Boolean isGtfs() {
    return gtfs;
  }

  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  public V3DeparturesBroadParameters dateUtc(OffsetDateTime dateUtc) {
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

  public V3DeparturesBroadParameters maxResults(Integer maxResults) {
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

  public V3DeparturesBroadParameters includeCancelled(Boolean includeCancelled) {
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

  public V3DeparturesBroadParameters lookBackwards(Boolean lookBackwards) {
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

  public V3DeparturesBroadParameters expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3DeparturesBroadParameters addExpandItem(ExpandEnum expandItem) {
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

  public V3DeparturesBroadParameters includeGeopath(Boolean includeGeopath) {
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
    V3DeparturesBroadParameters v3DeparturesBroadParameters = (V3DeparturesBroadParameters) o;
    return Objects.equals(this.platformNumbers, v3DeparturesBroadParameters.platformNumbers) &&
        Objects.equals(this.directionId, v3DeparturesBroadParameters.directionId) &&
        Objects.equals(this.gtfs, v3DeparturesBroadParameters.gtfs) &&
        Objects.equals(this.dateUtc, v3DeparturesBroadParameters.dateUtc) &&
        Objects.equals(this.maxResults, v3DeparturesBroadParameters.maxResults) &&
        Objects.equals(this.includeCancelled, v3DeparturesBroadParameters.includeCancelled) &&
        Objects.equals(this.lookBackwards, v3DeparturesBroadParameters.lookBackwards) &&
        Objects.equals(this.expand, v3DeparturesBroadParameters.expand) &&
        Objects.equals(this.includeGeopath, v3DeparturesBroadParameters.includeGeopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DeparturesBroadParameters {\n");
    
    sb.append("    platformNumbers: ").append(toIndentedString(platformNumbers)).append("\n");
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
