package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriReferenceDataDetail;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3SiriStopsRefsDictionary   {
  private Map<String, V3SiriReferenceDataDetail> stopPointRefs = new HashMap<String, V3SiriReferenceDataDetail>();
  private Map<String, String> unmatchedStopPointRefs = new HashMap<String, String>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_point_refs")
  public Map<String, V3SiriReferenceDataDetail> getStopPointRefs() {
    return stopPointRefs;
  }
  public void setStopPointRefs(Map<String, V3SiriReferenceDataDetail> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("unmatched_stop_point_refs")
  public Map<String, String> getUnmatchedStopPointRefs() {
    return unmatchedStopPointRefs;
  }
  public void setUnmatchedStopPointRefs(Map<String, String> unmatchedStopPointRefs) {
    this.unmatchedStopPointRefs = unmatchedStopPointRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriStopsRefsDictionary v3SiriStopsRefsDictionary = (V3SiriStopsRefsDictionary) o;
    return Objects.equals(stopPointRefs, v3SiriStopsRefsDictionary.stopPointRefs) &&
        Objects.equals(unmatchedStopPointRefs, v3SiriStopsRefsDictionary.unmatchedStopPointRefs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
