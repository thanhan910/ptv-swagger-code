package io.swagger.model;

import io.swagger.model.V3SiriLineRef;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriLineRefsRequest   {

  private @Valid List<V3SiriLineRef> lineRefs = new ArrayList<V3SiriLineRef>();

  private @Valid String mappingVersion = null;

  /**
   **/
  public V3SiriLineRefsRequest lineRefs(List<V3SiriLineRef> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("line_refs")

  public List<V3SiriLineRef> getLineRefs() {
    return lineRefs;
  }
  public void setLineRefs(List<V3SiriLineRef> lineRefs) {
    this.lineRefs = lineRefs;
  }

  /**
   * DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load
   **/
  public V3SiriLineRefsRequest mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load")
  @JsonProperty("mapping_version")
  @NotNull

  public String getMappingVersion() {
    return mappingVersion;
  }
  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefsRequest v3SiriLineRefsRequest = (V3SiriLineRefsRequest) o;
    return Objects.equals(lineRefs, v3SiriLineRefsRequest.lineRefs) &&
        Objects.equals(mappingVersion, v3SiriLineRefsRequest.mappingVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRefs, mappingVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefsRequest {\n");
    
    sb.append("    lineRefs: ").append(toIndentedString(lineRefs)).append("\n");
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
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
