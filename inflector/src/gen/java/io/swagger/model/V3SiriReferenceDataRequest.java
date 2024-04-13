package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriLineRefDirectionRefStopPointRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3SiriReferenceDataRequest   {
  @JsonProperty("line_refs")
  private List<V3SiriLineRefDirectionRefStopPointRef> lineRefs = new ArrayList<V3SiriLineRefDirectionRefStopPointRef>();
  @JsonProperty("stop_point_refs")
  private List<Integer> stopPointRefs = null;
  @JsonProperty("date_utc")
  private Date dateUtc = null;
  @JsonProperty("mapping_version")
  private String mappingVersion = null;
  /**
   **/
  public V3SiriReferenceDataRequest lineRefs(List<V3SiriLineRefDirectionRefStopPointRef> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  
  @Schema(required = true, description = "")
  @JsonProperty("line_refs")
  public List<V3SiriLineRefDirectionRefStopPointRef> getLineRefs() {
    return lineRefs;
  }
  public void setLineRefs(List<V3SiriLineRefDirectionRefStopPointRef> lineRefs) {
    this.lineRefs = lineRefs;
  }

  /**
   * Siri StopPointRef
   **/
  public V3SiriReferenceDataRequest stopPointRefs(List<Integer> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
    return this;
  }

  
  @Schema(description = "Siri StopPointRef")
  @JsonProperty("stop_point_refs")
  public List<Integer> getStopPointRefs() {
    return stopPointRefs;
  }
  public void setStopPointRefs(List<Integer> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
   **/
  public V3SiriReferenceDataRequest dateUtc(Date dateUtc) {
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
   * DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load
   **/
  public V3SiriReferenceDataRequest mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  
  @Schema(required = true, description = "DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load")
  @JsonProperty("mapping_version")
  public String getMappingVersion() {
    return mappingVersion;
  }
  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriReferenceDataRequest v3SiriReferenceDataRequest = (V3SiriReferenceDataRequest) o;
    return Objects.equals(lineRefs, v3SiriReferenceDataRequest.lineRefs) &&
        Objects.equals(stopPointRefs, v3SiriReferenceDataRequest.stopPointRefs) &&
        Objects.equals(dateUtc, v3SiriReferenceDataRequest.dateUtc) &&
        Objects.equals(mappingVersion, v3SiriReferenceDataRequest.mappingVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRefs, stopPointRefs, dateUtc, mappingVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriReferenceDataRequest {\n");
    sb.append("    lineRefs: ").append(toIndentedString(lineRefs)).append("\n");
    sb.append("    stopPointRefs: ").append(toIndentedString(stopPointRefs)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
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
