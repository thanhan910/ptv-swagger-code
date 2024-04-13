package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3SiriDirectionRefsDictionary;
import io.swagger.server.api.model.V3Status;
import io.swagger.server.api.model.V3StopPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriReferenceDataMappingsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriReferenceDataMappingsResponse   {
  private String mappingVersion = null;

  
  private Map<String, V3SiriDirectionRefsDictionary> lineRefs = null;

  
  private Map<String, V3StopPoint> stopPointRefs = null;

  private V3Status status = null;

  public V3SiriReferenceDataMappingsResponse mappingVersion(String mappingVersion) {
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

  public V3SiriReferenceDataMappingsResponse lineRefs(Map<String, V3SiriDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  public V3SiriReferenceDataMappingsResponse putLineRefsItem(String key, V3SiriDirectionRefsDictionary lineRefsItem) {
    if (this.lineRefs == null) {
      this.lineRefs = new HashMap<String, V3SiriDirectionRefsDictionary>();
    }
    this.lineRefs.put(key, lineRefsItem);
    return this;
  }

  /**
   * SIRI LineRef
   * @return lineRefs
   **/
    public Map<String, V3SiriDirectionRefsDictionary> getLineRefs() {
    return lineRefs;
  }

  public void setLineRefs(Map<String, V3SiriDirectionRefsDictionary> lineRefs) {
    this.lineRefs = lineRefs;
  }

  public V3SiriReferenceDataMappingsResponse stopPointRefs(Map<String, V3StopPoint> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
    return this;
  }

  public V3SiriReferenceDataMappingsResponse putStopPointRefsItem(String key, V3StopPoint stopPointRefsItem) {
    if (this.stopPointRefs == null) {
      this.stopPointRefs = new HashMap<String, V3StopPoint>();
    }
    this.stopPointRefs.put(key, stopPointRefsItem);
    return this;
  }

  /**
   * Get stopPointRefs
   * @return stopPointRefs
   **/
    public Map<String, V3StopPoint> getStopPointRefs() {
    return stopPointRefs;
  }

  public void setStopPointRefs(Map<String, V3StopPoint> stopPointRefs) {
    this.stopPointRefs = stopPointRefs;
  }

  public V3SiriReferenceDataMappingsResponse status(V3Status status) {
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
    V3SiriReferenceDataMappingsResponse v3SiriReferenceDataMappingsResponse = (V3SiriReferenceDataMappingsResponse) o;
    return Objects.equals(this.mappingVersion, v3SiriReferenceDataMappingsResponse.mappingVersion) &&
        Objects.equals(this.lineRefs, v3SiriReferenceDataMappingsResponse.lineRefs) &&
        Objects.equals(this.stopPointRefs, v3SiriReferenceDataMappingsResponse.stopPointRefs) &&
        Objects.equals(this.status, v3SiriReferenceDataMappingsResponse.status);
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
