package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3Disruption;
import io.swagger.server.api.model.V3Status;
import io.swagger.server.api.model.V3StopDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3StopResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3StopResponse   {
  private V3StopDetails stop = null;

  
  private Map<String, V3Disruption> disruptions = null;

  private V3Status status = null;

  public V3StopResponse stop(V3StopDetails stop) {
    this.stop = stop;
    return this;
  }

  /**
   * Get stop
   * @return stop
   **/
    public V3StopDetails getStop() {
    return stop;
  }

  public void setStop(V3StopDetails stop) {
    this.stop = stop;
  }

  public V3StopResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3StopResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
    if (this.disruptions == null) {
      this.disruptions = new HashMap<String, V3Disruption>();
    }
    this.disruptions.put(key, disruptionsItem);
    return this;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
   **/
    public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3StopResponse status(V3Status status) {
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
    V3StopResponse v3StopResponse = (V3StopResponse) o;
    return Objects.equals(this.stop, v3StopResponse.stop) &&
        Objects.equals(this.disruptions, v3StopResponse.disruptions) &&
        Objects.equals(this.status, v3StopResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stop, disruptions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopResponse {\n");
    
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
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
