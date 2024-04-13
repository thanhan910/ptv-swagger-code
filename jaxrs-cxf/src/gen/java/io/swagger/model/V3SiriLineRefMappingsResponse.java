package io.swagger.model;

import io.swagger.model.V3SiriLineRefDirectionRefsDictionary;
import io.swagger.model.V3Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

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

public class V3SiriLineRefMappingsResponse   {
  
  @Schema(description = "")
  private String mappingVersion = null;
  
  @Schema(description = "")
  private Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs = null;
  
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
   * Get lineRefs
   * @return lineRefs
  **/
  @JsonProperty("line_refs")
  public Map<String, V3SiriLineRefDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }

  public void setLineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  public V3SiriLineRefMappingsResponse lineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  public V3SiriLineRefMappingsResponse putLineRefsItem(String key, V3SiriLineRefDirectionRefsDictionary lineRefsItem) {
    this.lineRefs.put(key, lineRefsItem);
    return this;
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

  public V3SiriLineRefMappingsResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefMappingsResponse {\n");
    
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
    sb.append("    lineRefs: ").append(toIndentedString(lineRefs)).append("\n");
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
