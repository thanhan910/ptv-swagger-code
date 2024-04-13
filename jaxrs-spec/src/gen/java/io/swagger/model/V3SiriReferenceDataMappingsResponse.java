package io.swagger.model;

import io.swagger.model.V3SiriDirectionRefsDictionary;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3SiriReferenceDataMappingsResponse   {

  private @Valid String mappingVersion = null;

  private @Valid Map<String, V3SiriDirectionRefsDictionary> lineRefs = new HashMap<String, V3SiriDirectionRefsDictionary>();

  private @Valid Map<String, V3StopPoint> stopPointRefs = new HashMap<String, V3StopPoint>();

  private @Valid V3Status status = null;

  /**
   **/
  public V3SiriReferenceDataMappingsResponse mappingVersion(String mappingVersion) {
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
   * SIRI LineRef
   **/
  public V3SiriReferenceDataMappingsResponse lineRefs(Map<String, V3SiriDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  
  @ApiModelProperty(value = "SIRI LineRef")
  @JsonProperty("line_refs")

  public Map<String, V3SiriDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }
  public void setLineRefs(Map<String, V3SiriDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  /**
   **/
  public V3SiriReferenceDataMappingsResponse stopPointRefs(Map<String, V3StopPoint> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stop_point_refs")

  public Map<String, V3StopPoint> getStopPointRefs() {
    return stopPointRefs;
  }
  public void setStopPointRefs(Map<String, V3StopPoint> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  /**
   **/
  public V3SiriReferenceDataMappingsResponse status(V3Status status) {
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
    V3SiriReferenceDataMappingsResponse v3SiriReferenceDataMappingsResponse = (V3SiriReferenceDataMappingsResponse) o;
    return Objects.equals(mappingVersion, v3SiriReferenceDataMappingsResponse.mappingVersion) &&
        Objects.equals(lineRefs, v3SiriReferenceDataMappingsResponse.lineRefs) &&
        Objects.equals(stopPointRefs, v3SiriReferenceDataMappingsResponse.stopPointRefs) &&
        Objects.equals(status, v3SiriReferenceDataMappingsResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingVersion, lineRefs, stopPointRefs, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
