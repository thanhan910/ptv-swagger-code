package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriReferenceDataDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriStopsRefsDictionary
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3SiriStopsRefsDictionary   {
  @JsonProperty("stop_point_refs")
  @Valid
  private Map<String, V3SiriReferenceDataDetail> stopPointRefs = null;

  @JsonProperty("unmatched_stop_point_refs")
  @Valid
  private Map<String, String> unmatchedStopPointRefs = null;

  public V3SiriStopsRefsDictionary stopPointRefs(Map<String, V3SiriReferenceDataDetail> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
    return this;
  }

  public V3SiriStopsRefsDictionary putStopPointRefsItem(String key, V3SiriReferenceDataDetail stopPointRefsItem) {
    if (this.stopPointRefs == null) {
      this.stopPointRefs = new HashMap<String, V3SiriReferenceDataDetail>();
    }
    this.stopPointRefs.put(key, stopPointRefsItem);
    return this;
  }

  /**
   * Get stopPointRefs
   * @return stopPointRefs
  **/
  @Schema(readOnly = true, description = "")
  @Valid
  public Map<String, V3SiriReferenceDataDetail> getStopPointRefs() {
    return stopPointRefs;
  }

  public void setStopPointRefs(Map<String, V3SiriReferenceDataDetail> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  public V3SiriStopsRefsDictionary unmatchedStopPointRefs(Map<String, String> unmatchedStopPointRefs) {
    this.unmatchedStopPointRefs = unmatchedStopPointRefs;
    return this;
  }

  public V3SiriStopsRefsDictionary putUnmatchedStopPointRefsItem(String key, String unmatchedStopPointRefsItem) {
    if (this.unmatchedStopPointRefs == null) {
      this.unmatchedStopPointRefs = new HashMap<String, String>();
    }
    this.unmatchedStopPointRefs.put(key, unmatchedStopPointRefsItem);
    return this;
  }

  /**
   * Get unmatchedStopPointRefs
   * @return unmatchedStopPointRefs
  **/
  @Schema(readOnly = true, description = "")

  public Map<String, String> getUnmatchedStopPointRefs() {
    return unmatchedStopPointRefs;
  }

  public void setUnmatchedStopPointRefs(Map<String, String> unmatchedStopPointRefs) {
    this.unmatchedStopPointRefs = unmatchedStopPointRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriStopsRefsDictionary v3SiriStopsRefsDictionary = (V3SiriStopsRefsDictionary) o;
    return Objects.equals(this.stopPointRefs, v3SiriStopsRefsDictionary.stopPointRefs) &&
        Objects.equals(this.unmatchedStopPointRefs, v3SiriStopsRefsDictionary.unmatchedStopPointRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPointRefs, unmatchedStopPointRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriStopsRefsDictionary {\n");
    
    sb.append("    stopPointRefs: ").append(toIndentedString(stopPointRefs)).append("\n");
    sb.append("    unmatchedStopPointRefs: ").append(toIndentedString(unmatchedStopPointRefs)).append("\n");
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
