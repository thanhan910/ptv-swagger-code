package io.swagger.model;

import io.swagger.model.V3Status;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3GenerateDivaMappingResponse   {

  private @Valid String mappingVersion = null;

  private @Valid V3Status status = null;

  /**
   **/
  public V3GenerateDivaMappingResponse mappingVersion(String mappingVersion) {
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
  public V3GenerateDivaMappingResponse status(V3Status status) {
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
    V3GenerateDivaMappingResponse v3GenerateDivaMappingResponse = (V3GenerateDivaMappingResponse) o;
    return Objects.equals(mappingVersion, v3GenerateDivaMappingResponse.mappingVersion) &&
        Objects.equals(status, v3GenerateDivaMappingResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingVersion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3GenerateDivaMappingResponse {\n");
    
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
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
