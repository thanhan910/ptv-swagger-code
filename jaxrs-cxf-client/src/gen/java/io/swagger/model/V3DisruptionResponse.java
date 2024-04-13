package io.swagger.model;

import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;

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

public class V3DisruptionResponse   {
  
  @Schema(description = "")
  private V3Disruption disruption = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Get disruption
   * @return disruption
  **/
  @JsonProperty("disruption")
  public V3Disruption getDisruption() {
    return disruption;
  }

  public void setDisruption(V3Disruption disruption) {
    this.disruption = disruption;
  }

  public V3DisruptionResponse disruption(V3Disruption disruption) {
    this.disruption = disruption;
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

  public V3DisruptionResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionResponse {\n");
    
    sb.append("    disruption: ").append(toIndentedString(disruption)).append("\n");
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
