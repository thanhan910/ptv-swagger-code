package io.swagger.model;

import io.swagger.model.V3StopDepartureRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

public class V3BulkDeparturesRequest   {
  
  @Schema(required = true, description = "Collection of departure requests")
 /**
   * Collection of departure requests  
  **/
  private List<V3StopDepartureRequest> requests = new ArrayList<V3StopDepartureRequest>();
  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
 /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  
  **/
  private Date dateUtc = null;
  
  @Schema(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.")
 /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.  
  **/
  private Boolean lookBackwards = null;
  
  @Schema(description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only")
 /**
   * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only  
  **/
  private Boolean includeCancelled = null;
  
  @Schema(description = "Indicates if the route geopath should be returned")
 /**
   * Indicates if the route geopath should be returned  
  **/
  private Boolean includeGeopath = null;
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
  @Schema(description = "List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none")
 /**
   * List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none  
  **/
  private List<ExpandEnum> expand = null;
 /**
   * Collection of departure requests
   * @return requests
  **/
  @JsonProperty("requests")
  public List<V3StopDepartureRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
  }

  public V3BulkDeparturesRequest requests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
    return this;
  }

  public V3BulkDeparturesRequest addRequestsItem(V3StopDepartureRequest requestsItem) {
    this.requests.add(requestsItem);
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

  public V3BulkDeparturesRequest dateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
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

  public V3BulkDeparturesRequest lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
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

  public V3BulkDeparturesRequest includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
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

  public V3BulkDeparturesRequest includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

 /**
   * List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
   * @return expand
  **/
  @JsonProperty("expand")
  public List<ExpandEnum> getExpand() {
    return expand;
  }

  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }

  public V3BulkDeparturesRequest expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  public V3BulkDeparturesRequest addExpandItem(ExpandEnum expandItem) {
    this.expand.add(expandItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
