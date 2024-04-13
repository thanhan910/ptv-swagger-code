package io.swagger.model;

import io.swagger.model.V3DisruptionMode;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

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

public class V3DisruptionModesResponse   {
  
  @Schema(description = "Transport mode identifiers")
 /**
   * Transport mode identifiers  
  **/
  private List<V3DisruptionMode> disruptionModes = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Transport mode identifiers
   * @return disruptionModes
  **/
  @JsonProperty("disruption_modes")
  public List<V3DisruptionMode> getDisruptionModes() {
    return disruptionModes;
  }

  public void setDisruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
  }

  public V3DisruptionModesResponse disruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
    return this;
  }

  public V3DisruptionModesResponse addDisruptionModesItem(V3DisruptionMode disruptionModesItem) {
    this.disruptionModes.add(disruptionModesItem);
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

  public V3DisruptionModesResponse status(V3Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionModesResponse {\n");
    
    sb.append("    disruptionModes: ").append(toIndentedString(disruptionModes)).append("\n");
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
