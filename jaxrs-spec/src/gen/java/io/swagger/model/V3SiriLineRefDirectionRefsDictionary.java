package io.swagger.model;

import io.swagger.model.V3SiriReferenceDataDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriLineRefDirectionRefsDictionary   {

  private @Valid Map<String, List<V3SiriReferenceDataDetail>> directionRefs = new HashMap<String, List<V3SiriReferenceDataDetail>>();

  private @Valid Map<String, String> unmatchedDirectionRefs = new HashMap<String, String>();

  /**
   **/
  public V3SiriLineRefDirectionRefsDictionary directionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("direction_refs")

  public Map<String, List<V3SiriReferenceDataDetail>> getDirectionRefs() {
    return directionRefs;
  }
  public void setDirectionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
  }

  /**
   **/
  public V3SiriLineRefDirectionRefsDictionary unmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("unmatched_direction_refs")

  public Map<String, String> getUnmatchedDirectionRefs() {
    return unmatchedDirectionRefs;
  }
  public void setUnmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
