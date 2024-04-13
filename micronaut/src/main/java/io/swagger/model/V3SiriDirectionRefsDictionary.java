package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriStopsRefsDictionary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriDirectionRefsDictionary
 */
@Validated
@Introspected
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicronautCodegen", date = "2024-04-14T03:36:01.894111500+10:00[Australia/Sydney]")
public class V3SiriDirectionRefsDictionary   {
  @JsonProperty("direction_refs")
  @Valid
  private Map<String, V3SiriStopsRefsDictionary> directionRefs = null;

  public V3SiriDirectionRefsDictionary directionRefs(Map<String, V3SiriStopsRefsDictionary> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  public V3SiriDirectionRefsDictionary putDirectionRefsItem(String key, V3SiriStopsRefsDictionary directionRefsItem) {
    if (this.directionRefs == null) {
      this.directionRefs = new HashMap<String, V3SiriStopsRefsDictionary>();
    }
    this.directionRefs.put(key, directionRefsItem);
    return this;
  }

  /**
   * Get directionRefs
   * @return directionRefs
  **/
  @Schema(readOnly = true, description = "")
  @Valid
  public Map<String, V3SiriStopsRefsDictionary> getDirectionRefs() {
    return directionRefs;
  }

  public void setDirectionRefs(Map<String, V3SiriStopsRefsDictionary> directionRefs) {
    this.directionRefs = directionRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDirectionRefsDictionary v3SiriDirectionRefsDictionary = (V3SiriDirectionRefsDictionary) o;
    return Objects.equals(this.directionRefs, v3SiriDirectionRefsDictionary.directionRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDirectionRefsDictionary {\n");
    
    sb.append("    directionRefs: ").append(toIndentedString(directionRefs)).append("\n");
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
