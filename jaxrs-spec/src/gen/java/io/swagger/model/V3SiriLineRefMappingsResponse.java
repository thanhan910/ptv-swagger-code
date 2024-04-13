package io.swagger.model;

import io.swagger.model.V3SiriLineRefDirectionRefsDictionary;
import io.swagger.model.V3Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriLineRefMappingsResponse   {

  private @Valid String mappingVersion = null;

  private @Valid Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs = new HashMap<String, V3SiriLineRefDirectionRefsDictionary>();

  private @Valid V3Status status = null;

  /**
   **/
  public V3SiriLineRefMappingsResponse mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping_version")

  public String getMappingVersion() {
    return mappingVersion;
  }
  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }

  /**
   **/
  public V3SiriLineRefMappingsResponse lineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line_refs")

  public Map<String, V3SiriLineRefDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }
  public void setLineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  /**
   **/
  public V3SiriLineRefMappingsResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

  public V3Status getStatus() {
    return status;
  }
  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefMappingsResponse v3SiriLineRefMappingsResponse = (V3SiriLineRefMappingsResponse) o;
    return Objects.equals(mappingVersion, v3SiriLineRefMappingsResponse.mappingVersion) &&
        Objects.equals(lineRefs, v3SiriLineRefMappingsResponse.lineRefs) &&
        Objects.equals(status, v3SiriLineRefMappingsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingVersion, lineRefs, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
