package io.swagger.model;

import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class V3StopResponse   {
  
  @Schema(description = "")
  private V3StopDetails stop = null;
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
 /**
   * Disruption information applicable to relevant routes or stops  
  **/
  private Map<String, V3Disruption> disruptions = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Get stop
   * @return stop
  **/
  @JsonProperty("stop")
  public V3StopDetails getStop() {
    return stop;
  }

  public void setStop(V3StopDetails stop) {
    this.stop = stop;
  }

  public V3StopResponse stop(V3StopDetails stop) {
    this.stop = stop;
    return this;
  }

 /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
  **/
  @JsonProperty("disruptions")
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3StopResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3StopResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
    this.disruptions.put(key, disruptionsItem);
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

  public V3StopResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
