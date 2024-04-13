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
public class V3SiriLineRefDirectionRefsDictionary   {
  private Map<String, List<V3SiriReferenceDataDetail>> directionRefs = new HashMap<String, List<V3SiriReferenceDataDetail>>();
  private Map<String, String> unmatchedDirectionRefs = new HashMap<String, String>();

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("direction_refs")
  public Map<String, List<V3SiriReferenceDataDetail>> getDirectionRefs() {
    return directionRefs;
  }
  public void setDirectionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("unmatched_direction_refs")
  public Map<String, String> getUnmatchedDirectionRefs() {
    return unmatchedDirectionRefs;
  }
  public void setUnmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefDirectionRefsDictionary v3SiriLineRefDirectionRefsDictionary = (V3SiriLineRefDirectionRefsDictionary) o;
    return Objects.equals(directionRefs, v3SiriLineRefDirectionRefsDictionary.directionRefs) &&
        Objects.equals(unmatchedDirectionRefs, v3SiriLineRefDirectionRefsDictionary.unmatchedDirectionRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionRefs, unmatchedDirectionRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefDirectionRefsDictionary {\n");
    
    sb.append("    directionRefs: ").append(toIndentedString(directionRefs)).append("\n");
    sb.append("    unmatchedDirectionRefs: ").append(toIndentedString(unmatchedDirectionRefs)).append("\n");
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
