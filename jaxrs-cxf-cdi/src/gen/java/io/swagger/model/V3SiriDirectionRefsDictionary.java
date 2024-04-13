package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriStopsRefsDictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3SiriDirectionRefsDictionary   {
  private Map<String, V3SiriStopsRefsDictionary> directionRefs = new HashMap<String, V3SiriStopsRefsDictionary>();

  /**
   **/
  public V3SiriDirectionRefsDictionary directionRefs(Map<String, V3SiriStopsRefsDictionary> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("direction_refs")
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
    return Objects.equals(directionRefs, v3SiriDirectionRefsDictionary.directionRefs);
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
