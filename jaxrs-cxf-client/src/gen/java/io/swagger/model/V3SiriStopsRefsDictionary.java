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

public class V3SiriStopsRefsDictionary   {
  
  @Schema(description = "")
  private Map<String, V3SiriReferenceDataDetail> stopPointRefs = null;
  
  @Schema(description = "")
  private Map<String, String> unmatchedStopPointRefs = null;
 /**
   * Get stopPointRefs
   * @return stopPointRefs
  **/
  @JsonProperty("stop_point_refs")
  public Map<String, V3SiriReferenceDataDetail> getStopPointRefs() {
    return stopPointRefs;
  }


 /**
   * Get unmatchedStopPointRefs
   * @return unmatchedStopPointRefs
  **/
  @JsonProperty("unmatched_stop_point_refs")
  public Map<String, String> getUnmatchedStopPointRefs() {
    return unmatchedStopPointRefs;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
