package io.swagger.model;

import io.swagger.model.V3SiriDirectionRefsDictionary;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopPoint;
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

public class V3SiriReferenceDataMappingsResponse   {
  
  @Schema(description = "")
  private String mappingVersion = null;
  
  @Schema(description = "SIRI LineRef")
 /**
   * SIRI LineRef  
  **/
  private Map<String, V3SiriDirectionRefsDictionary> lineRefs = null;
  
  @Schema(description = "")
  private Map<String, V3StopPoint> stopPointRefs = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Get mappingVersion
   * @return mappingVersion
  **/
  @JsonProperty("mapping_version")
  public String getMappingVersion() {
    return mappingVersion;
  }


 /**
   * SIRI LineRef
   * @return lineRefs
  **/
  @JsonProperty("line_refs")
  public Map<String, V3SiriDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }


 /**
   * Get stopPointRefs
   * @return stopPointRefs
  **/
  @JsonProperty("stop_point_refs")
  public Map<String, V3StopPoint> getStopPointRefs() {
    return stopPointRefs;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }

  public V3SiriReferenceDataMappingsResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriReferenceDataMappingsResponse {\n");
    
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
    sb.append("    lineRefs: ").append(toIndentedString(lineRefs)).append("\n");
    sb.append("    stopPointRefs: ").append(toIndentedString(stopPointRefs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
