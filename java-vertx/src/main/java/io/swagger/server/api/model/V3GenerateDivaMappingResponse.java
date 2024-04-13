package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3Status;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3GenerateDivaMappingResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3GenerateDivaMappingResponse   {
  private String mappingVersion = null;

  private V3Status status = null;

  public V3GenerateDivaMappingResponse mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  /**
   * Get mappingVersion
   * @return mappingVersion
   **/
    public String getMappingVersion() {
    return mappingVersion;
  }

  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }

  public V3GenerateDivaMappingResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
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
    return Objects.equals(this.mappingVersion, v3GenerateDivaMappingResponse.mappingVersion) &&
        Objects.equals(this.status, v3GenerateDivaMappingResponse.status);
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
