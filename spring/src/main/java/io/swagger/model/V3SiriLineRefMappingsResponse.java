package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3SiriLineRefDirectionRefsDictionary;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriLineRefMappingsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3SiriLineRefMappingsResponse   {
  @JsonProperty("mapping_version")
  private String mappingVersion = null;

  @JsonProperty("line_refs")
  @Valid
  private Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3SiriLineRefMappingsResponse mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  /**
   * Get mappingVersion
   * @return mappingVersion
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
    public String getMappingVersion() {
    return mappingVersion;
  }

  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }

  public V3SiriLineRefMappingsResponse lineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  public V3SiriLineRefMappingsResponse putLineRefsItem(String key, V3SiriLineRefDirectionRefsDictionary lineRefsItem) {
    if (this.lineRefs == null) {
      this.lineRefs = new HashMap<String, V3SiriLineRefDirectionRefsDictionary>();
    }
    this.lineRefs.put(key, lineRefsItem);
    return this;
  }

  /**
   * Get lineRefs
   * @return lineRefs
   **/
  @Schema(description = "")
      @Valid
    public Map<String, V3SiriLineRefDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }

  public void setLineRefs(Map<String, V3SiriLineRefDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  public V3SiriLineRefMappingsResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    @Valid
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
    return Objects.equals(this.mappingVersion, v3SiriLineRefMappingsResponse.mappingVersion) &&
        Objects.equals(this.lineRefs, v3SiriLineRefMappingsResponse.lineRefs) &&
        Objects.equals(this.status, v3SiriLineRefMappingsResponse.status);
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
