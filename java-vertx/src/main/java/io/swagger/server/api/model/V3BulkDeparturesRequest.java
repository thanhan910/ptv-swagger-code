package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.V3StopDepartureRequest;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3BulkDeparturesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3BulkDeparturesRequest   {
  
  private List<V3StopDepartureRequest> requests = new ArrayList<V3StopDepartureRequest>();

  private OffsetDateTime dateUtc = null;

  private Boolean lookBackwards = null;

  private Boolean includeCancelled = null;

  private Boolean includeGeopath = null;

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

  public V3BulkDeparturesRequest requests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
    return this;
  }

  public V3BulkDeparturesRequest addRequestsItem(V3StopDepartureRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Collection of departure requests
   * @return requests
   **/
    public List<V3StopDepartureRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
  }

  public V3BulkDeparturesRequest dateUtc(OffsetDateTime dateUtc) {
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

  public V3BulkDeparturesRequest lookBackwards(Boolean lookBackwards) {
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

  public V3BulkDeparturesRequest includeCancelled(Boolean includeCancelled) {
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

  public V3BulkDeparturesRequest includeGeopath(Boolean includeGeopath) {
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

  public V3BulkDeparturesRequest expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3BulkDeparturesRequest addExpandItem(ExpandEnum expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<ExpandEnum>();
    }
    this.expand.add(expandItem);
    return this;
  }

  /**
   * List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
   * @return expand
   **/
    public List<ExpandEnum> getExpand() {
    return expand;
  }

  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesRequest v3BulkDeparturesRequest = (V3BulkDeparturesRequest) o;
    return Objects.equals(this.requests, v3BulkDeparturesRequest.requests) &&
        Objects.equals(this.dateUtc, v3BulkDeparturesRequest.dateUtc) &&
        Objects.equals(this.lookBackwards, v3BulkDeparturesRequest.lookBackwards) &&
        Objects.equals(this.includeCancelled, v3BulkDeparturesRequest.includeCancelled) &&
        Objects.equals(this.includeGeopath, v3BulkDeparturesRequest.includeGeopath) &&
        Objects.equals(this.expand, v3BulkDeparturesRequest.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, dateUtc, lookBackwards, includeCancelled, includeGeopath, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesRequest {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    lookBackwards: ").append(toIndentedString(lookBackwards)).append("\n");
    sb.append("    includeCancelled: ").append(toIndentedString(includeCancelled)).append("\n");
    sb.append("    includeGeopath: ").append(toIndentedString(includeGeopath)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
