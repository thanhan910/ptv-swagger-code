package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriDirectionRefsDictionary;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopPoint;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3SiriReferenceDataMappingsResponse   {
  private String mappingVersion = null;  private Map<String, V3SiriDirectionRefsDictionary> lineRefs = new HashMap<String, V3SiriDirectionRefsDictionary>();  private Map<String, V3StopPoint> stopPointRefs = new HashMap<String, V3StopPoint>();  private V3Status status = null;

  /**
   **/
  
  @Schema(description = "")
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
  
  @Schema(description = "SIRI LineRef")
  @JsonProperty("line_refs")
  public Map<String, V3SiriDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }
  public void setLineRefs(Map<String, V3SiriDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_point_refs")
  public Map<String, V3StopPoint> getStopPointRefs() {
    return stopPointRefs;
  }
  public void setStopPointRefs(Map<String, V3StopPoint> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  /**
   **/
  
  @Schema(description = "")
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
