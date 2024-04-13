package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriLineRefDirectionRefStopPointRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriReferenceDataRequest
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3SiriReferenceDataRequest   {
  @JsonProperty("line_refs")
  @Valid
  private List<V3SiriLineRefDirectionRefStopPointRef> lineRefs = new ArrayList<V3SiriLineRefDirectionRefStopPointRef>();

  @JsonProperty("stop_point_refs")
  @Valid
  private List<Integer> stopPointRefs = null;

  @JsonProperty("date_utc")
  private OffsetDateTime dateUtc = null;

  @JsonProperty("mapping_version")
  private String mappingVersion = null;

  public V3SiriReferenceDataRequest lineRefs(List<V3SiriLineRefDirectionRefStopPointRef> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  public V3SiriReferenceDataRequest addLineRefsItem(V3SiriLineRefDirectionRefStopPointRef lineRefsItem) {
    this.lineRefs.add(lineRefsItem);
    return this;
  }

  /**
   * Get lineRefs
   * @return lineRefs
  **/
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<V3SiriLineRefDirectionRefStopPointRef> getLineRefs() {
    return lineRefs;
  }

  public void setLineRefs(List<V3SiriLineRefDirectionRefStopPointRef> lineRefs) {
    this.lineRefs = lineRefs;
  }

  public V3SiriReferenceDataRequest stopPointRefs(List<Integer> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
    return this;
  }

  public V3SiriReferenceDataRequest addStopPointRefsItem(Integer stopPointRefsItem) {
    if (this.stopPointRefs == null) {
      this.stopPointRefs = new ArrayList<Integer>();
    }
    this.stopPointRefs.add(stopPointRefsItem);
    return this;
  }

  /**
   * Siri StopPointRef
   * @return stopPointRefs
  **/
  @Schema(description = "Siri StopPointRef")

  public List<Integer> getStopPointRefs() {
    return stopPointRefs;
  }

  public void setStopPointRefs(List<Integer> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  public V3SiriReferenceDataRequest dateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
   * @return dateUtc
  **/
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")

  @Valid
  public OffsetDateTime getDateUtc() {
    return dateUtc;
  }

  public void setDateUtc(OffsetDateTime dateUtc) {
    this.dateUtc = dateUtc;
  }

  public V3SiriReferenceDataRequest mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  /**
   * DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load
   * @return mappingVersion
  **/
  @Schema(required = true, description = "DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load")
  @NotNull

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
    return Objects.equals(this.lineRefs, v3SiriReferenceDataRequest.lineRefs) &&
        Objects.equals(this.stopPointRefs, v3SiriReferenceDataRequest.stopPointRefs) &&
        Objects.equals(this.dateUtc, v3SiriReferenceDataRequest.dateUtc) &&
        Objects.equals(this.mappingVersion, v3SiriReferenceDataRequest.mappingVersion);
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
