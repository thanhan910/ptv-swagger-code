package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriReferenceDataDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriLineRefDirectionRefsDictionary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3SiriLineRefDirectionRefsDictionary   {
  @JsonProperty("direction_refs")
  @Valid
  private Map<String, List<V3SiriReferenceDataDetail>> directionRefs = null;

  @JsonProperty("unmatched_direction_refs")
  @Valid
  private Map<String, String> unmatchedDirectionRefs = null;

  public V3SiriLineRefDirectionRefsDictionary directionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  public V3SiriLineRefDirectionRefsDictionary putDirectionRefsItem(String key, List<V3SiriReferenceDataDetail> directionRefsItem) {
    if (this.directionRefs == null) {
      this.directionRefs = new HashMap<String, List<V3SiriReferenceDataDetail>>();
    }
    this.directionRefs.put(key, directionRefsItem);
    return this;
  }

  /**
   * Get directionRefs
   * @return directionRefs
   **/
  @Schema(description = "")
      @Valid
    public Map<String, List<V3SiriReferenceDataDetail>> getDirectionRefs() {
    return directionRefs;
  }

  public void setDirectionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
  }

  public V3SiriLineRefDirectionRefsDictionary unmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
    return this;
  }

  public V3SiriLineRefDirectionRefsDictionary putUnmatchedDirectionRefsItem(String key, String unmatchedDirectionRefsItem) {
    if (this.unmatchedDirectionRefs == null) {
      this.unmatchedDirectionRefs = new HashMap<String, String>();
    }
    this.unmatchedDirectionRefs.put(key, unmatchedDirectionRefsItem);
    return this;
  }

  /**
   * Get unmatchedDirectionRefs
   * @return unmatchedDirectionRefs
   **/
  @Schema(description = "")
  
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
    return Objects.equals(this.directionRefs, v3SiriLineRefDirectionRefsDictionary.directionRefs) &&
        Objects.equals(this.unmatchedDirectionRefs, v3SiriLineRefDirectionRefsDictionary.unmatchedDirectionRefs);
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
