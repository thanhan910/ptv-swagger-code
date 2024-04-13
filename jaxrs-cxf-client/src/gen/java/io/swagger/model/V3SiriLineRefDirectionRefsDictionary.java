package io.swagger.model;

import io.swagger.model.V3SiriReferenceDataDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class V3SiriLineRefDirectionRefsDictionary   {
  
  @Schema(description = "")
  private Map<String, List<V3SiriReferenceDataDetail>> directionRefs = null;
  
  @Schema(description = "")
  private Map<String, String> unmatchedDirectionRefs = null;
 /**
   * Get directionRefs
   * @return directionRefs
  **/
  @JsonProperty("direction_refs")
  public Map<String, List<V3SiriReferenceDataDetail>> getDirectionRefs() {
    return directionRefs;
  }

  public void setDirectionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
  }

  public V3SiriLineRefDirectionRefsDictionary directionRefs(Map<String, List<V3SiriReferenceDataDetail>> directionRefs) {
    this.directionRefs = directionRefs;
    return this;
  }

  public V3SiriLineRefDirectionRefsDictionary putDirectionRefsItem(String key, List<V3SiriReferenceDataDetail> directionRefsItem) {
    this.directionRefs.put(key, directionRefsItem);
    return this;
  }

 /**
   * Get unmatchedDirectionRefs
   * @return unmatchedDirectionRefs
  **/
  @JsonProperty("unmatched_direction_refs")
  public Map<String, String> getUnmatchedDirectionRefs() {
    return unmatchedDirectionRefs;
  }

  public void setUnmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
  }

  public V3SiriLineRefDirectionRefsDictionary unmatchedDirectionRefs(Map<String, String> unmatchedDirectionRefs) {
    this.unmatchedDirectionRefs = unmatchedDirectionRefs;
    return this;
  }

  public V3SiriLineRefDirectionRefsDictionary putUnmatchedDirectionRefsItem(String key, String unmatchedDirectionRefsItem) {
    this.unmatchedDirectionRefs.put(key, unmatchedDirectionRefsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
